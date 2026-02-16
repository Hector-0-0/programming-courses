//schemas/movies.mjs

// Importamos zod, una librería de declaración y validación de esquemas TypeScript-first
import z from "zod";

/**
 * movieSchema: El "contrato" que deben cumplir tus datos.
 * Zod no solo valida tipos (string, number), sino también lógica (url, min, max).
 */
const movieSchema = z.object({
  // Validación de texto con mensaje de error personalizado
  title: z.string({
    invalid_type_error: "Title must be a string",
  }),

  // .optional() permite que el campo no venga en el JSON (o sea undefined)
  rate: z.number().max(10).min(0).optional(),

  // .int() asegura que no aceptemos decimales para el año o la duración
  year: z.number().int().min(1900).max(2024),

  director: z.string(),

  duration: z.number().int().positive(),

  // .url() es genial para validar que el poster sea una dirección web real
  poster: z.string().url({
    message: "Poster must be a string and a valid URL",
  }),

  /**
   * z.enum: Crea una lista cerrada de valores permitidos.
   * Si el usuario envía "Anime", Zod lanzará un error porque no está en la lista.
   */
  genre: z
    .array(
      z.enum([
        "Action",
        "Adventure",
        "Crime",
        "Comedy",
        "Drama",
        "Horror",
        "Sci-Fi",
      ]),
    )
    .nonempty({ message: "Genre must be a non-empty array of valid genres" }),
});

/**
 * validateMovie: Se usa para el método POST (creación).
 * Revisa que TODO el objeto cumpla con el esquema.
 * Usamos .safeParse() para que no lance una excepción (error),
 * sino que devuelva un objeto con { success: true/false }.
 */
export function validateMovie(input) {
  return movieSchema.safeParse(input);
}

/**
 * validatePartialMovie: Se usa para el método PATCH (actualización).
 * .partial() convierte todas las propiedades del esquema en opcionales.
 * Esto permite que el usuario envíe SOLO el 'title' o SOLO el 'year'
 * sin que Zod se queje de que faltan los demás campos.
 */
export function validatePartialMovie(input) {
  return movieSchema.partial().safeParse(input);
}
