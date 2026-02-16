//movie.mjs

import mysql from "mysql2/promise";

// Configuración de conexión usando variables de entorno para mayor seguridad
const config = {
  host: process.env.DB_HOST || "localhost",
  user: process.env.DB_USER || "root",
  password: process.env.DB_PASSWORD || "",
  database: process.env.DB_NAME || "moviesdb",
  port: process.env.DB_PORT || 3306,
};

// Creamos la conexión (usando await en el top-level permitido por ES Modules)
const connection = await mysql.createConnection(config);

export class MovieModel {
  static async getAll({ genre }) {
    try {
      if (genre) {
        const lowerGenre = genre.toLowerCase();

        // 1. Buscamos el ID del género para asegurar que existe
        const [genres] = await connection.query(
          "SELECT id, name FROM genre WHERE LOWER(name) = ?",
          [lowerGenre],
        );

        if (genres.length === 0) return [];

        // 2. Traemos las películas usando un JOIN en la tabla intermedia (Muchos a Muchos)
        // Usamos BIN_TO_UUID porque el ID en MySQL se guarda como binario(16) por rendimiento
        const genreId = genres[0].id;
        const [rows] = await connection.query(
          `SELECT m.title, m.year, m.director, m.duration, m.poster, m.rate, BIN_TO_UUID(m.id) id 
           FROM movie m
           JOIN movie_genres mg ON m.id = mg.movie_id
           WHERE mg.genre_id = ?`,
          [genreId],
        );
        return rows;
      }

      // Si no hay género, traemos todas las películas
      const [rows] = await connection.query(
        "SELECT title, year, director, duration, poster, rate, BIN_TO_UUID(id) id FROM movie",
      );
      return rows;
    } catch (error) {
      console.error("Database error in getAll:", error.message);
      throw new Error("Error retrieving movies from database");
    }
  }

  static async getById(id) {
    try {
      // Convertimos el UUID de texto a BINARIO para que MySQL pueda encontrarlo
      const [rows] = await connection.query(
        `SELECT title, year, director, duration, poster, rate, BIN_TO_UUID(id) id 
         FROM movie WHERE id = UUID_TO_BIN(?)`,
        [id],
      );

      if (rows.length === 0) return null;
      return rows[0];
    } catch (error) {
      console.error("Database error in getById:", error.message);
      throw new Error("Error retrieving movie from database");
    }
  }

  static async create(movieData) {
    try {
      const { title, year, director, duration, poster, rate } = movieData;

      // Generamos un UUID nuevo directamente en MySQL
      const [[{ uuid: uuidValue }]] = await connection.query(
        "SELECT UUID() AS uuid",
      );

      // Insertamos convirtiendo el UUID string a binario
      await connection.query(
        "INSERT INTO movie (id, title, year, director, duration, poster, rate) VALUES (UUID_TO_BIN(?), ?, ?, ?, ?, ?, ?)",
        [uuidValue, title, year, director, duration, poster, rate],
      );

      // Retornamos la película recién creada para confirmar el registro
      return await this.getById(uuidValue);
    } catch (error) {
      console.error("Database error in create:", error.message);
      throw new Error("Error creating movie in database");
    }
  }

  static async update(id, updateData) {
    try {
      const currentMovie = await this.getById(id);
      if (!currentMovie) return false;

      // Lógica de "Mezcla": Si el dato no viene en el update, mantenemos el actual
      const updatedData = {
        title: updateData.title ?? currentMovie.title,
        year: updateData.year ?? currentMovie.year,
        director: updateData.director ?? currentMovie.director,
        duration: updateData.duration ?? currentMovie.duration,
        poster: updateData.poster ?? currentMovie.poster,
        rate: updateData.rate ?? currentMovie.rate,
      };

      await connection.query(
        "UPDATE movie SET title = ?, year = ?, director = ?, duration = ?, poster = ?, rate = ? WHERE id = UUID_TO_BIN(?)",
        [
          updatedData.title,
          updatedData.year,
          updatedData.director,
          updatedData.duration,
          updatedData.poster,
          updatedData.rate,
          id,
        ],
      );

      return await this.getById(id);
    } catch (error) {
      console.error("Database error in update:", error.message);
      throw new Error("Error updating movie in database");
    }
  }

  static async delete(id) {
    try {
      // El resultado contiene 'affectedRows' para saber si realmente se borró algo
      const [result] = await connection.query(
        "DELETE FROM movie WHERE id = UUID_TO_BIN(?)",
        [id],
      );
      return result.affectedRows;
    } catch (error) {
      console.error("Database error in delete:", error.message);
      throw new Error("Error deleting movie from database");
    }
  }
}
