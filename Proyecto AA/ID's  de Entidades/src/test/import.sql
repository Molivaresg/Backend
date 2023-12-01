INSERT INTO  user (username, password, enabled, nombre, apellido, email) VALUES ('Carl_43', '2086325', 1, 'Carlos', 'Galindo', 'carlos43@hotmail.com');
INSERT INTO  user (username, password, enabled, nombre, apellido, email) VALUES ('FrankiSan', '2023215', 1, 'Francisco', 'Sanchez', 'frankiSan567@hotmail.com');

INSERT INTO roles (nombre)VALUES ('ROLE_USER');
INSERT INTO roles (nombre)VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (1,1);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,1);
