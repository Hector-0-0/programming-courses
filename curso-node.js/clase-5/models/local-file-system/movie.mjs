//movies.mjs

// IMPORTANTE: Los JSON se importan como default.
// Usamos "with { type: 'json' }" (Import Attributes), el estándar moderno de ES Modules.
import peliculas from "../../movies.json" with { type: "json" };
import crypto from "node:crypto"; // Módulo nativo de Node.js para criptografía y generación de UUIDs

/**
 * MovieModel: Clase de la capa de datos.
 * Encapsula toda la interacción con el "almacenamiento".
 * Al usar métodos estáticos, la clase actúa como un contenedor de lógica global (Singleton-like).
 */
export class MovieModel {
  /**
   * Recupera la lista de películas.
   * @param {string} genre - Filtro opcional.
   * La firma del método recibe un objeto ({ genre }) para facilitar la expansión de filtros.
   */
  static async getAll({ genre }) {
    if (genre) {
      // Filtrado Insensitive: convertimos todo a minúsculas para evitar fallos por "Action" vs "action"
      return peliculas.filter((movie) =>
        movie.genre.some((g) => g.toLowerCase() === genre.toLowerCase()),
      );
    }
    return peliculas; // Si no hay filtros, devolvemos la referencia al array completo
  }

  /**
   * Busca una película por su identificador único (UUID).
   */
  static async getById(id) {
    const movie = peliculas.find((movie) => movie.id === id);
    // Control de flujo mediante excepciones: si no existe, lanzamos un Error
    // que deberá ser capturado por el controlador (try/catch).
    if (!movie) {
      throw new Error("Movie not found");
    }
    return movie;
  }

  /**
   * Crea un nuevo registro de película.
   * @param {Object} movieData - Objeto con los datos ya validados por Zod.
   */
  static async create(movieData) {
    const newMovie = {
      id: crypto.randomUUID(), // Genera un ID robusto de 36 caracteres (v4)
      ...movieData, // Técnica 'Spread': esparce las propiedades validadas dentro del nuevo objeto
    };

    // NOTA: peliculas es una referencia al JSON cargado en memoria.
    // Los cambios persistirán mientras el proceso de Node esté vivo.
    peliculas.push(newMovie);
    return newMovie;
  }

  /**
   * Actualización parcial (PATCH).
   * Solo modifica los campos que vienen en 'updateData'.
   */
  static async update(id, updateData) {
    const movieIndex = peliculas.findIndex((movie) => movie.id === id);

    if (movieIndex === -1) {
      throw new Error("Movie not found");
    }

    // Fusionamos (Merge): los valores en updateData sobreescriben a los originales
    const updatedMovie = {
      ...peliculas[movieIndex],
      ...updateData,
    };

    peliculas[movieIndex] = updatedMovie;
    return updatedMovie;
  }

  /**
   * Elimina el recurso del array de datos.
   */
  static async delete(id) {
    const movieIndex = peliculas.findIndex((movie) => movie.id === id);

    if (movieIndex === -1) {
      throw new Error("Movie not found");
    }

    // El método .splice() muta el array original eliminando el elemento en el índice dado
    peliculas.splice(movieIndex, 1);
    return true; // Indicamos éxito de la operación
  }
}
