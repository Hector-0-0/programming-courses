-- 1. CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE IF NOT EXISTS primera;
USE primera;

-- 2. CREACIÓN DE TABLAS (Basado en tablas.sql y zerofill.sql)
-- Tabla 'padre' que contiene los datos de las personas
CREATE TABLE persona (
    dni CHAR(8) NOT NULL,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    PRIMARY KEY (dni) -- Definimos la clave primaria
);

-- Tabla 'hija' que se relaciona con persona
CREATE TABLE documentos (
    codigo INT(5) ZEROFILL AUTO_INCREMENT, -- Uso de ZEROFILL y AUTO_INCREMENT
    titulo VARCHAR(30) NOT NULL,
    autor_dni CHAR(8), -- Esta será nuestra columna de unión (Foreign Key)
    PRIMARY KEY (codigo),
    FOREIGN KEY (autor_dni) REFERENCES persona(dni) -- Crea el vínculo entre tablas
);

-- 3. INSERCIÓN DE DATOS DE PRUEBA
INSERT INTO persona (dni, nombre, apellido) 
VALUES 
    ('11111111', 'juan', 'perez'),
    ('22222222', 'ana', 'gomez'),
    ('33333333', 'luis', 'martinez');

INSERT INTO documentos (titulo, autor_dni) 
VALUES 
    ('manual sql', '11111111'),
    ('guia joins', '11111111'),
    ('intro redes', '22222222'),
    ('borrador', NULL); -- Documento sin autor para probar el RIGHT JOIN

-- 4. EJEMPLOS DE JOIN (En minúsculas como pediste)

-- INNER JOIN: Solo muestra registros con coincidencia en AMBAS tablas
-- (Solo personas que tienen documentos)
SELECT p.nombre, p.apellido, d.titulo, d.codigo
FROM persona p
INNER JOIN documentos d ON p.dni = d.autor_dni;

-- LEFT JOIN: Todas las personas (izquierda), tengan o no documentos
-- (Luis Martinez aparecerá aunque no tenga libros registrados)
SELECT p.nombre, d.titulo
FROM persona p
LEFT JOIN documentos d ON p.dni = d.autor_dni;

-- RIGHT JOIN: Todos los documentos (derecha), tengan o no autor
-- (El 'borrador' aparecerá aunque no tenga un DNI asociado)
SELECT p.nombre, d.titulo
FROM persona p
RIGHT JOIN documentos d ON p.dni = d.autor_dni;