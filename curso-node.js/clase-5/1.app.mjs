// //1.app.mjs

import express from "express";
// Importamos la función fábrica del router
import { createMovieRouter } from "./routes/movies.mjs";
// Importamos la lógica de seguridad CORS
import { middlewareCors } from "./middlewares/cors.mjs";

/**
 * createApp: Función fábrica que inicializa el servidor.
 * @param {Object} movieModel - El modelo (JSON o MySQL) que se inyectará
 * a lo largo de toda la jerarquía de la aplicación.
 */
export const createApp = ({ movieModel }) => {
  const app = express();

  /** * Middleware de parseo de JSON:
   * Convierte los buffers de datos entrantes en objetos JavaScript accesibles en req.body.
   */
  app.use(express.json());

  /**
   * Seguridad básica:
   * Oculta que el servidor corre bajo Express para no dar información
   * sobre posibles vulnerabilidades conocidas de la versión.
   */
  app.disable("x-Powered-by");

  /**
   * Middleware de CORS:
   * Se ejecuta antes de las rutas para validar orígenes permitidos
   * y manejar las peticiones 'preflight' (OPTIONS).
   */
  app.use(middlewareCors);

  /**
   * Inyección del Modelo en las Rutas:
   * Pasamos el 'movieModel' recibido a la fábrica de rutas.
   * De esta forma, el router podrá pasárselo al controlador.
   */
  app.use("/movies", createMovieRouter({ movieModel }));

  /**
   * Configuración y arranque:
   * Usamos variables de entorno para el puerto, ideal para despliegues en la nube.
   */
  const PORT = process.env.PORT ?? 3000;

  app.listen(PORT, () => {
    console.log(`Server is running on port http://localhost:${PORT}`);
  });
};
