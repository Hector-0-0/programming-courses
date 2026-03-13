DROP DATABASE IF EXISTS twitter_db;

CREATE DATABASE twitter_db;

USE twitter_db;

DROP TABLE IF EXISTS users; 

CREATE TABLE users (
	user_id INT NOT NULL AUTO_INCREMENT,
    user_handle VARCHAR(50) NOT NULL UNIQUE,
    email_addres VARCHAR(50) NOT NULL UNIQUE,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    phonenumber CHAR(10) UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT (NOW()),
	follower_count INT NOT NULL DEFAULT 0,
    PRIMARY KEY (user_id)	
);

INSERT INTO users (user_handle, email_addres, first_name, last_name, phonenumber) VALUES 
    ('juan_perez', 'juan.perez@email.com', 'Juan', 'Pérez', '987654321'),
    ('maria_gomez', 'maria.gomez@email.com', 'María', 'Gómez', '912345678'),
    ('carlos_ruiz', 'carlos.ruiz@email.com', 'Carlos', 'Ruiz', '998877665'),
    ('ana_torres', 'ana.torres@email.com', 'Ana', 'Torres', '955443322'),
    ('pedro_lopez', 'pedro.lopez@email.com', 'Pedro', 'López', '966778899');
     
DROP TABLE IF EXISTS followers;

CREATE TABLE followers(
	follower_id INT NOT NULL,
    following_id INT NOT NULL,
	FOREIGN KEY (follower_id) REFERENCES users(user_id),
    FOREIGN KEY (following_id) REFERENCES users(user_id),
	PRIMARY KEY (follower_id, following_id)
);

ALTER TABLE followers ADD CONSTRAINT check_followe_id CHECK (follower_id<>following_id);

DROP TABLE IF EXISTS tweets;

CREATE TABLE tweets (
	tweet_id INT NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    tweet_text VARCHAR(200) NOT NULL,
    num_likes INT NOT NULL DEFAULT 0,
	num_comments INT NOT NULL DEFAULT 0,
	num_retweets INT NOT NULL DEFAULT 0,
    created_at TIMESTAMP NOT NULL DEFAULT (NOW()),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    PRIMARY KEY (tweet_id)
);

INSERT INTO tweets (user_id, tweet_text) VALUES
    (1, 'Mi primer tweet en esta red social! 🎉'),
    (2, 'Hoy aprendí MySQL y me encanta la base de datos'),
    (1, 'El clima está increíble hoy ☀️'),
    (3, 'Recomendaciones de libros para leer este mes?'),
    (4, 'Terminé mi proyecto final! 💪'),
    (2, 'Café y código, la mejor combinación ☕💻'),
    (5, 'Alguien más viendo la serie nueva?'),
    (3, 'Tips para ser más productivo trabajando desde casa'),
    (4, 'Feliz viernes a todos! 🎊'),
    (5, 'Mi playlist favorita para estudiar');


DROP TABLE IF EXISTS tweet_likes;

CREATE TABLE tweet_likes(
	user_id INT NOT NULL,
    tweet_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (tweet_id) REFERENCES tweets(tweet_id),
    PRIMARY KEY (user_id, tweet_id)
);

INSERT INTO tweet_likes (user_id, tweet_id) VALUES
	(1,2),
	(2,3),
	(3,4),
	(1,4),
	(2,4),
    (3,3),
    (1,3),
    (4,3);

DROP TRIGGER IF EXISTS increse_follower_count;

DELIMITER $$

CREATE TRIGGER increse_follower_count
	AFTER INSERT ON followers
    FOR EACH ROW
    BEGIN
		UPDATE users SET follower_count = follower_count + 1
        WHERE user_id = NEW.following_id;
	END $$

DELIMITER ;

INSERT INTO followers (follower_id, following_id) VALUES
	(1,2),
	(2,3),
	(3,4),
	(1,4),
	(2,4);


