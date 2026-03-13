-- 1. CREACIÓN DE LA BASE DE DATOS Y TABLAS
CREATE DATABASE IF NOT EXISTS primera;
USE primera;

-- Tabla principal de documentos (basada en tu archivo zerofill.sql)
CREATE TABLE IF NOT EXISTS documentos (
    codigo INT(5) ZEROFILL AUTO_INCREMENT,
    titulo VARCHAR(30) NOT NULL,
    autor VARCHAR(30),
    fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (codigo)
);

-- Tabla de auditoría (para guardar los movimientos automáticamente)
CREATE TABLE IF NOT EXISTS log_documentos (
    id_log INT AUTO_INCREMENT,
    codigo_doc INT,
    accion VARCHAR(50),
    fecha DATETIME,
    PRIMARY KEY (id_log)
);

-- 2. DEFINICIÓN DE TRIGGERS
-- Cambiamos el delimitador para que MySQL no se confunda con los ';' internos
DELIMITER //

-- TRIGGER 1: Antes de insertar, poner el título en MAYÚSCULAS
-- Así mantienes el orden sin importar cómo lo escriba el usuario
CREATE TRIGGER tr_mayusculas_titulo
BEFORE INSERT ON documentos
FOR EACH ROW
BEGIN
    SET NEW.titulo = UPPER(NEW.titulo);
END //

-- TRIGGER 2: Después de insertar, guardar un registro en la tabla LOG
-- Útil para saber cuándo se creó cada documento exactamente
CREATE TRIGGER tr_log_insercion
AFTER INSERT ON documentos
FOR EACH ROW
BEGIN
    INSERT INTO log_documentos (codigo_doc, accion, fecha)
    VALUES (NEW.codigo, 'registro creado', NOW());
END //

-- TRIGGER 3: Antes de borrar, respaldar qué se borró
-- Como en tu lógica de borrar_registros.sql, pero automatizado
CREATE TRIGGER tr_log_borrado
BEFORE DELETE ON documentos
FOR EACH ROW
BEGIN
    INSERT INTO log_documentos (codigo_doc, accion, fecha)
    VALUES (OLD.codigo, CONCAT('eliminado: ', OLD.titulo), NOW());
END //

-- Restauramos el delimitador estándar
DELIMITER ;

-- 3. PRUEBA DEL FUNCIONAMIENTO
-- Insertamos datos (en minúscula para probar el Trigger 1)
INSERT INTO documentos (titulo, autor) 
VALUES ('mi primer libro', 'jose'), ('segundo paso', 'juan');

-- Verificamos que el título se cambió a mayúsculas automáticamente
SELECT * FROM documentos;

-- Verificamos que el log se llenó solo (Trigger 2)
SELECT * FROM log_documentos;

-- Borramos un registro para probar el Trigger 3
DELETE FROM documentos WHERE codigo = 00001;

-- Verificamos el respaldo en el log
SELECT * FROM log_documentos;