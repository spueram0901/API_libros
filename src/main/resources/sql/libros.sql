drop database if exists libros;
create database libros;
use libros;

CREATE TABLE saga (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      nombre VARCHAR(100),
                      autor VARCHAR(100),
                      genero VARCHAR(50),
                      fecha_inicio DATE
);

CREATE TABLE libro (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       titulo VARCHAR(100),
                       numero_entrega INT,
                       fecha_publicacion DATE,
                       saga_id BIGINT,
                       FOREIGN KEY (saga_id) REFERENCES saga(id)
);


-- -----------------------------
-- INSERTAR Sagas
-- -----------------------------

INSERT INTO saga (nombre, autor, genero, fecha_inicio)
VALUES
    ('Crónicas de Fuego', 'Laura Martínez', 'Fantasía', '2015-03-10'),
    ('Misterios de la Ciudad', 'Carlos López', 'Misterio', '2018-07-22'),
    ('Viaje al Infinito', 'Ana Torres', 'Ciencia Ficción', '2020-01-15'),
    ('Reinos Ocultos', 'Sofía Rivera', 'Fantasía', '2016-09-05'),
    ('Detectives del Tiempo', 'Miguel Sánchez', 'Misterio', '2019-04-11'),
    ('Odisea Galáctica', 'Paula Gómez', 'Ciencia Ficción', '2021-02-20');

-- -----------------------------
-- INSERTAR Libros
-- -----------------------------

-- Libros de "Crónicas de Fuego" (id=1)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('El despertar del dragón', 1, '2015-03-10', 1),
    ('El reino de las sombras', 2, '2016-05-12', 1),
    ('La última batalla', 3, '2017-08-01', 1),
    ('El legado de los magos', 4, '2018-10-20', 1);

-- Libros de "Misterios de la Ciudad" (id=2)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('El caso del reloj roto', 1, '2018-07-22', 2),
    ('Sombras en el callejón', 2, '2019-02-10', 2),
    ('El misterio del puente', 3, '2020-06-05', 2);

-- Libros de "Viaje al Infinito" (id=3)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('Horizonte estelar', 1, '2020-01-15', 3),
    ('Nebulosa oscura', 2, '2021-03-18', 3),
    ('Agujeros de tiempo', 3, '2022-07-22', 3);

-- Libros de "Reinos Ocultos" (id=4)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('El bosque prohibido', 1, '2016-09-05', 4),
    ('La torre encantada', 2, '2017-11-11', 4),
    ('El hechizo perdido', 3, '2018-12-20', 4);

-- Libros de "Detectives del Tiempo" (id=5)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('El reloj del ayer', 1, '2019-04-11', 5),
    ('Viaje al pasado', 2, '2020-01-30', 5);

-- Libros de "Odisea Galáctica" (id=6)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('Estrella fugitiva', 1, '2021-02-20', 6),
    ('Planeta en llamas', 2, '2022-05-18', 6),
    ('Colisión cósmica', 3, '2023-08-12', 6);

-- Libros independientes (no pertenecen a ninguna saga)
INSERT INTO libro (titulo, numero_entrega, fecha_publicacion, saga_id)
VALUES
    ('Cuentos del bosque', NULL, '2019-09-01', NULL),
    ('Historias del pasado', NULL, '2021-11-20', NULL),
    ('Relatos del futuro', NULL, '2020-04-15', NULL),
    ('Misterios olvidados', NULL, '2018-12-01', NULL),
    ('Crónicas urbanas', NULL, '2022-03-10', NULL);

select * from saga s
                  right join libro b on b.saga_id = s.id;

