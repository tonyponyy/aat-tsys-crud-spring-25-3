
CREATE TABLE almacenes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    lugar VARCHAR(250),
    capacidad INT
);
CREATE TABLE cajas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    contenido VARCHAR(250),
    valor int,
    almacen INT,
    FOREIGN KEY (almacen) REFERENCES almacenes(id)
);
INSERT INTO almacenes (lugar,capacidad) VALUES
    ('Varsobia',12000),
    ('Campo claro',12000),
    ('La rapita',12000);
   
INSERT INTO cajas (contenido,valor,almacen) VALUES
    ('clavos',200,1),
    ('madera',200,1),
   ('rosquillas',200,3),
    ('leña',200,2);
