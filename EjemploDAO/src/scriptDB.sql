CREATE TABLE departamento(
	clave VARCHAR(10) PRIMARY KEY NOT NULL,
	nombre VARCHAR(30) NOT NULL
);


CREATE TABLE persona)(
	clave VARCHAR(10) PRIMARY KEY NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	telefono VARCHAR(10),
	direccion VARCHAR(30),
	clave_departamento VARCHAR(10) REFERENCES departamento(clave)
 );