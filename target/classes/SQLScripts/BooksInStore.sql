CREATE DATABASE BooksInStore;
USE BooksInStore;
CREATE TABLE IF NOT EXISTS ActuallyInStore (
	ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	Nombre VARCHAR(100) NOT NULL,
    Autor VARCHAR(100) NOT NULL,
    Year INT(100) NOT NULL);