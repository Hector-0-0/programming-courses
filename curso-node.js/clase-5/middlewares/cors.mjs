//cors.mjs

/**
 * Lista blanca (Whitelist) de dominios permitidos.
 * Es crucial incluir aquí los puertos de tus entornos de desarrollo (Vite, Live Server, etc.)
 */
const ACEPTED_ORIGINS = [
  "http://localhost:60458", // Puerto dinámico de VS Code Live Server
  "http://localhost:3000", // Puerto base de Node.js
  "http://localhost:8080", // Puerto estándar para frameworks como Vue o Angular
];

/**
 * middlewareCors: Actúa como el filtro de seguridad para las peticiones cruzadas.
 */
export const middlewareCors = (req, res, next) => {
  // Obtenemos el origen (quién hace la petición).
  // Nota: Si la petición es del mismo servidor o una herramienta como Postman, origin será undefined.
  const origin = req.headers.origin;

  // Verificamos si el origen está en nuestra lista blanca.
  // También podríamos añadir 'if (!origin)' para permitir peticiones locales/herramientas de testing.
  if (ACEPTED_ORIGINS.includes(origin) || !origin) {
    // 1. Especificamos qué origen tiene permiso para leer la respuesta.
    // Usamos el origen dinámico en lugar de "*" para mayor seguridad.
    res.setHeader("Access-Control-Allow-Origin", origin ?? "*");

    // 2. Definimos los métodos permitidos.
    // Es vital incluir OPTIONS para que el navegador pueda hacer el "preflight check".
    res.setHeader(
      "Access-Control-Allow-Methods",
      "GET, POST, PATCH, OPTIONS, DELETE",
    );

    // 3. Indicamos qué cabeceras personalizadas puede enviar el cliente.
    // Sin "Content-Type", el cliente no podría enviarte JSON en el body.
    res.setHeader("Access-Control-Allow-Headers", "Content-Type");
  }

  // IMPORTANTE: next() permite que la petición siga su camino hacia los Routers.
  next();
};
