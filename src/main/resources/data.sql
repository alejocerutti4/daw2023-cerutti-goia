INSERT INTO recurso (id, nombre, descripcion) VALUES ('1','Proyector','Proyector marca sony');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('2','Pizarra','Color verde');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('3','Computadora','Lenovo ThinkPad T14');

INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('1','SUM','Salon de usos multiples','300');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('2','Lab 1','Laboratorio de ala 1','30');

INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('1','1');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('2','3');