// server.mjs (o el nombre que le hayas dado a este archivo de arranque)

// 1. Importamos la función que construye nuestra aplicación Express
import { createApp } from "./1.app.mjs";

/** * 2. Importamos el modelo específico que queremos usar.
 * En este caso, estás importando el modelo que apunta a tu base de datos (MySQL).
 * Si quisieras volver al JSON, solo tendrías que cambiar esta ruta:
 * import { MovieModel } from "./models/local-json/movie.mjs";
 */
import { MovieModel } from "./models/database/movie.mjs";

/**
 * 3. Ejecutamos la aplicación pasando el modelo.
 * Gracias a esta arquitectura, 'createApp' no sabe ni le importa qué hay
 * dentro de MovieModel, siempre que tenga los métodos getAll, getById, etc.
 */
createApp({ movieModel: MovieModel });
