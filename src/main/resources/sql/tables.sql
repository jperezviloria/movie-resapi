CREATE DATABASE cineDB;

USE cineDB;

CREATE TABLE movie(
                      id INT NOT NULL IDENTITY (1,1),
                      name_movie VARCHAR(80) NOT NULL,
                      price_movie INT NOT NULL,
                      category_movie VARCHAR(80) NOT NULL,
                      PRIMARY KEY (id)
)

CREATE TABLE local(
                      id INT IDENTITY (1,1),
                      location VARCHAR(80) NOT NULL,
                      PRIMARY KEY (id)
)
CREATE TABLE ticket(
                       id INT NOT NULL IDENTITY (1,1),
                       id_local INT NOT NULL,
                       id_movie INT NOT NULL,
                       PRIMARY KEY (id),
                       FOREIGN KEY (id_local) REFERENCES local(id),
                       FOREIGN KEY (id_movie) REFERENCES movie (id)
)

CREATE PROCEDURE saveLocal
@Location VARCHAR(80)
AS
BEGIN
    INSERT INTO
        local (location)
    VALUES (
               @Location
           )
end

EXEC saveLocal @Location = "San Telmo"


SELECT COUNT(id_local) FROM cineDB.dbo.ticket WHERE id_local = 4

SELECT COUNT(id_movie) FROM cineDB.dbo.ticket WHERE id_movie = 2
