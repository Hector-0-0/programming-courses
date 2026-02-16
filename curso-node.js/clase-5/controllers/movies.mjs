//movies.mjs

// Importamos las validaciones de esquema (Zod)
import { validateMovie, validatePartialMovie } from "../schemas/movies.mjs";

/**
 * MovieController: Ahora funciona mediante INYECCIÓN DE DEPENDENCIAS.
 * Ya no depende de una importación fija del modelo, sino que lo recibe al ser instanciado.
 */
export class MovieController {
  /**
   * El constructor recibe el modelo. Esto permite que el controlador sea testeable
   * y flexible a diferentes orígenes de datos (JSON, MySQL, etc.).
   */
  constructor({ movieModel }) {
    this.movieModel = movieModel;
  }

  /**
   * USAMOS ARROW FUNCTIONS:
   * Al definir los métodos como flecha (getAll = async ...), aseguramos que el contexto
   * de 'this' siempre apunte a la instancia del controlador, evitando errores al pasar
   * los métodos como referencia en el Router.
   */

  getAll = async (req, res) => {
    const { genre } = req.query;
    // Usamos el modelo inyectado
    const peliculas = await this.movieModel.getAll({ genre });
    res.json(peliculas);
  };

  getById = async (req, res) => {
    const { id } = req.params;
    const movie = await this.movieModel.getById(id);

    if (movie) return res.json(movie);
    res.status(404).json({ message: "Movie not found" });
  };

  create = async (req, res) => {
    const validationResult = validateMovie(req.body);

    if (!validationResult.success) {
      return res.status(400).json({ errors: validationResult.error.errors });
    }

    const newMovie = await this.movieModel.create(validationResult.data);
    res.status(201).json(newMovie);
  };

  update = async (req, res) => {
    const result = validatePartialMovie(req.body);

    if (!result.success) {
      return res.status(400).json({ errors: result.error.errors });
    }

    const { id } = req.params;
    const updatedMovie = await this.movieModel.update(id, result.data);

    // Manejo de error si el modelo devuelve false al no encontrar la película
    if (updatedMovie === false) {
      return res.status(404).json({ message: "Movie not found" });
    }

    return res.json(updatedMovie);
  };

  delete = async (req, res) => {
    const { id } = req.params;
    try {
      await this.movieModel.delete(id);
      return res.status(204).send();
    } catch (error) {
      return res.status(404).json({ message: error.message });
    }
  };
}
