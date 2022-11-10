CREATE DATABASE  IF NOT EXISTS `ud24`;
USE `ud24`;


DROP TABLE IF EXISTS `empleados`;
CREATE TABLE `empleados` (
  `id` long NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `trabajo` varchar(255) NOT NULL,
  `sueldo` int,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `empleados` VALUES ('Carlos Sanchez','Informatico'),('Marc Gasol','Deportista'),('Jose Marin','Informatico'),('Joan Garcia','Doctor'),('Maria Muñoz','Administrativo');
