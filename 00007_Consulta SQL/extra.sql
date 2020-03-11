CREATE TABLE bibliotecas (id_biblioteca INTEGER PRIMARY KEY, localidad TEXT);

CREATE TABLE libros (id_libro INTEGER PRIMARY KEY, 
  titulo TEXT, 
  autor TEXT,
  cantidad_reservas INTEGER,
  id_biblioteca INTEGER,
  FOREIGN KEY (id_biblioteca) REFERENCES bibliotecas(id_biblioteca));

INSERT INTO bibliotecas VALUES
(1, "San Luis"), 
(2, "CABA"),
(3, "Gral Las Heras");


INSERT INTO libros VALUES 
(1, "fundacion", "Isaac Asimov", 500, 1),
(2, "farenheit 451", "Ray Bradbury", 37, 1),
(3, "un mundo feliz", "Aldous Huxley", 200, 1),
(4, "1984", "George Orwell", 101, 2),
(5, "odessa", "Frederick Forsyth", 55, 3);

