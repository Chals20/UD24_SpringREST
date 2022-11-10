DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
  id long NOT NULL AUTO_INCREMENT,
  nombre varchar(255) NOT NULL,
  trabajo varchar(255) NOT NULL,
  sueldo int,
  PRIMARY KEY (id)
);

INSERT INTO empleados(nombre,trabajo,sueldo) VALUES ('Carlos Sanchez','Informatico',2000),('Marc Gasol','Deportista',5000),('Jose Marin','Informatico',2000),('Joan Garcia','Doctor',2100),('Maria Muñoz','Administrativo',1600);
