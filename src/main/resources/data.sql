-- Tabla de recursos
INSERT INTO recurso (id, nombre, descripcion) VALUES ('1', 'Proyector', 'Proyector marca Sony');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('2', 'Pizarra', 'Color verde');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('3', 'Computadora', 'Lenovo ThinkPad T14');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('4', 'Silla', 'Silla de oficina');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('5', 'Mesa', 'Mesa rectangular');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('6', 'Escritorio', 'Escritorio de madera');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('7', 'Cañón', 'Cañón de proyección');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('8', 'Pizarra magnética', 'Pizarra magnética blanca');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('9', 'Computadora portátil', 'HP EliteBook 840 G7');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('10', 'Mesa redonda', 'Mesa redonda de vidrio');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('11', 'Sofá', 'Sofá de cuero');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('12', 'Proyector HD', 'Proyector HD marca Epson');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('13', 'Pizarra interactiva', 'Pizarra interactiva SMART Board');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('14', 'Computadora de escritorio', 'Dell OptiPlex 3070');

-- Tabla de espacios físicos
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('1', 'SUM', 'Salón de usos múltiples', '300');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('2', 'Lab 1', 'Laboratorio de ala 1', '30');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('3', 'Auditorio', 'Auditorio principal', '500');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('4', 'Aula 101', 'Aula de primer año', '40');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('5', 'Biblioteca', 'Biblioteca central', '200');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('6', 'Sala de reuniones', 'Sala de reuniones ejecutivas', '12');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('7', 'Gimnasio', 'Gimnasio universitario', '100');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('8', 'Sala de conferencias', 'Sala de conferencias para eventos', '150');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('9', 'Aula 201', 'Aula de segundo año', '45');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('10', 'Laboratorio de Química', 'Laboratorio de Química avanzada', '20');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('11', 'Aula 301', 'Aula de tercer año', '50');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('12', 'Sala de descanso', 'Sala de descanso para estudiantes', '25');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('13', 'Sala de exposiciones', 'Sala de exposiciones de arte', '80');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('14', 'Estudio de música', 'Estudio de grabación de música', '5');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad) VALUES ('15', 'Sala de ensayo', 'Sala de ensayo de teatro', '15');

-- Tabla de relación entre espacios físicos y recursos
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('1', '1');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('2', '3');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('3', '7');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('4', '5');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('5', '2');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('6', '6');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('7', '4');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('8', '8');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('9', '9');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('10', '10');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('11', '11');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('12', '12');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('13', '13');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('14', '14');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('15', '14');
