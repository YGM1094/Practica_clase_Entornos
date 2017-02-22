SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS new_table;
DROP TABLE IF EXISTS Articulo;
DROP TABLE IF EXISTS Pedido;
DROP TABLE IF EXISTS Cliente;




/* Create Tables */

CREATE TABLE Articulo
(
	Num_Serie int NOT NULL,
	Nombre varchar(20),
	Proveedor varchar(20),
	PRIMARY KEY (Num_Serie),
	UNIQUE (Num_Serie)
);


CREATE TABLE Cliente
(
	DNI varchar(9) NOT NULL,
	Nombre varchar(10),
	Apellido varchar(20),
	PRIMARY KEY (DNI),
	UNIQUE (DNI)
);


CREATE TABLE new_table
(
	Num_Serie int NOT NULL,
	Fecha date NOT NULL,
	UNIQUE (Num_Serie),
	UNIQUE (Fecha)
);


CREATE TABLE Pedido
(
	Fecha date NOT NULL,
	Cantidad int,
	Precio_total double,
	DNI varchar(9) NOT NULL,
	PRIMARY KEY (Fecha),
	UNIQUE (Fecha),
	UNIQUE (DNI)
);



/* Create Foreign Keys */

ALTER TABLE new_table
	ADD FOREIGN KEY (Num_Serie)
	REFERENCES Articulo (Num_Serie)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Pedido
	ADD FOREIGN KEY (DNI)
	REFERENCES Cliente (DNI)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
	ADD FOREIGN KEY (Fecha)
	REFERENCES Pedido (Fecha)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



