//routes/movies.mjs

import Router from "express";
import { MovieController } from "../controllers/movies.mjs";

/**
 * createMovieRouter: Una función fábrica (factory function).
 * @param {Object} movieModel - El modelo de datos que queremos usar (JSON, MySQL, MongoDB, etc.)
 * @returns {Router} - Un router de Express configurado.
 */
export const createMovieRouter = ({ movieModel }) => {
  const moviesRouter = Router();

  /**
   * Inyectamos el modelo al controlador.
   * Aquí es donde sucede la magia: el controlador recibe las herramientas que necesita
   * para trabajar sin saber los detalles técnicos de la base de datos.
   */
  const movieController = new MovieController({ movieModel });

  // Definición de rutas:
  // Al usar movieController.getAll, estamos pasando la referencia de la función.
  // Como en el controlador usamos Arrow Functions, el 'this' no se pierde.

  // GET /movies - Listar (y filtrar)
  moviesRouter.get("/", movieController.getAll);

  // GET /movies/:id - Obtener una
  moviesRouter.get("/:id", movieController.getById);

  // POST /movies - Crear
  moviesRouter.post("/", movieController.create);

  // PATCH /movies/:id - Actualizar parcialmente
  moviesRouter.patch("/:id", movieController.update);

  // DELETE /movies/:id - Eliminar
  moviesRouter.delete("/:id", movieController.delete);

  // Devolvemos el router listo para ser usado por app.use()
  return moviesRouter;
};
