-- Tabla de ambitos
INSERT INTO ambito (id, nombre) VALUES ('1', 'Reserva');
INSERT INTO ambito (id, nombre) VALUES ('2', 'Espacio físico');

-- Tabla de estados
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('1', 'Pendiente', 'Rojo', '1');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('2', 'Aprobada', 'Amarillo', '1');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('3', 'Rechazada', 'Verde', '1');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('4', 'Cancelada', 'Azul', '1');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('5', 'Finalizada', 'Naranja', '1');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('6', 'Disponible', 'Rosa', '2');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('7', 'Ocupado', 'Marrón', '2');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('8', 'Inhabilitado', 'Gris', '2');
INSERT INTO estado (id, nombre, color, ambito_id) VALUES ('9', 'Habilitado', 'Dorado', '2');

-- Tabla de roles
INSERT INTO rol (id, nombre, descripcion, color) VALUES ('1', 'Docente', 'Docente de la facultad', 'Rojo');
INSERT INTO rol (id, nombre, descripcion, color) VALUES ('2', 'Estudiante', 'Estudiante de la facultad', 'Azul');
INSERT INTO rol (id, nombre, descripcion, color) VALUES ('3', 'Administrador', 'Administrador del sistema', 'Verde');


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
INSERT INTO recurso (id, nombre, descripcion) VALUES ('15', 'Proyector', 'Proyector generico');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('16', 'Impresora', 'Impresora láser');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('17', 'Pizarra magnética', 'Pizarra magnética negra');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('18', 'Silla ergonómica', 'Silla ergonómica ajustable');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('19', 'Escáner', 'Escáner de alta resolución');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('20', 'Mesa plegable', 'Mesa plegable de plástico');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('21', 'Proyector 4K', 'Proyector 4K de última generación');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('22', 'Pizarra de corcho', 'Pizarra de corcho para notas');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('23', 'Computadora iMac', 'Apple iMac Pro');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('24', 'Atril', 'Atril de metal ajustable');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('25', 'Mesa de conferencia', 'Mesa de conferencia para reuniones');

-- Tabla de espacios físicos
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('1', 'SUM', 'Salón de usos múltiples', '300', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('2', 'Lab 1', 'Laboratorio de ala 1', '30', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('3', 'Auditorio', 'Auditorio principal', '500', '8');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('4', 'Aula 101', 'Aula de primer año', '40', '8');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('5', 'Biblioteca', 'Biblioteca central', '200', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('6', 'Sala de reuniones', 'Sala de reuniones ejecutivas', '12', '8');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('7', 'Gimnasio', 'Gimnasio universitario', '100', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('8', 'Sala de conferencias', 'Sala de conferencias para eventos', '150', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('9', 'Aula 201', 'Aula de segundo año', '45', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('10', 'Laboratorio de Química', 'Laboratorio de Química avanzada', '20', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('11', 'Aula 301', 'Aula de tercer año', '50', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('12', 'Sala de descanso', 'Sala de descanso para estudiantes', '25', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('13', 'Sala de exposiciones', 'Sala de exposiciones de arte', '80', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('14', 'Estudio de música', 'Estudio de grabación de música', '5', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('15', 'Sala de ensayo', 'Sala de ensayo de teatro', '15', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('16', 'Laboratorio de Física', 'Laboratorio de Física avanzada', '25', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('17', 'Aula 401', 'Aula de cuarto año', '35', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('18', 'Sala de estudio', 'Sala de estudio silenciosa', '50', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('19', 'Sala de descanso 2', 'Sala de descanso adicional', '15', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('20', 'Estudio de fotografía', 'Estudio de fotografía profesional', '10', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('21', 'Sala de ensayo 2', 'Sala de ensayo de música', '8', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('22', 'Aula 501', 'Aula de quinto año', '30', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('23', 'Sala de conferencias 2', 'Sala de conferencias amplia', '200', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('24', 'Aula 601', 'Aula de sexto año', '25', '9');
INSERT INTO espacio_fisico (id, nombre, descripcion, capacidad, estado_id) VALUES ('25', 'Sala de exposiciones 2', 'Sala de exposiciones de arte adicional', '100', '9');

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
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('16', '6');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('17', '9');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('18', '4');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('19', '10');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('20', '12');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('21', '13');
INSERT INTO espacio_fisico_recursos (espacio_fisico_id, recursos_id) VALUES ('22', '17');


-- Tabla de solicitantes
INSERT INTO solicitante (id, nombre, apellido, legajo, nro_telefono, email, rol_id) VALUES ('1', 'Juan', 'Pérez', '12345', '5555555555', 'juanperez@example.com', '1');
INSERT INTO solicitante (id, nombre, apellido, legajo, nro_telefono, email, rol_id) VALUES ('2', 'María', 'González', '98765', '4444444444', 'mariagonzalez@example.com', '1');
INSERT INTO solicitante (id, nombre, apellido, legajo, nro_telefono, email, rol_id) VALUES ('3', 'Luis', 'Martínez', '54321', '6666666666', 'luismartinez@example.com', '2');
INSERT INTO solicitante (id, nombre, apellido, legajo, nro_telefono, email, rol_id) VALUES ('4', 'Ana', 'López', '24680', '7777777777', 'analorez@example.com', '2');
INSERT INTO solicitante (id, nombre, apellido, legajo, nro_telefono, email, rol_id) VALUES ('5', 'Pedro', 'Sánchez', '13579', '8888888888', 'pedrosanchez@example.com', '3');

-- Tabla de reservas
INSERT INTO reserva (id, fecha_hora_creacion_reserva, fecha_hora_inicio_reserva, fecha_hora_fin_reserva, comentario, motivo_reserva, motivo_rechazo, cantidad_personas, solicitante_id, espacio_fisico_id, estado_id) VALUES ('1', '2023-05-21 10:00:00', '2023-05-21 10:00:00', '2023-05-21 12:00:00', 'Comentario 1', 'Motivo reserva 1', '', '10', '1', '1', '1');
INSERT INTO reserva (id, fecha_hora_creacion_reserva, fecha_hora_inicio_reserva, fecha_hora_fin_reserva, comentario, motivo_reserva, motivo_rechazo, cantidad_personas, solicitante_id, espacio_fisico_id, estado_id) VALUES ('2', '2023-05-21 11:32:02', '2023-05-21 14:00:00', '2023-05-21 15:00:00', 'Comentario 2', 'Motivo reserva 2', '', '10', '1', '2', '1');

-- Tabla de relación entre reservas y recursos
INSERT INTO reserva_recursos_solicitados (reserva_id, recursos_solicitados_id) VALUES ('1', '1');
INSERT INTO reserva_recursos_solicitados (reserva_id, recursos_solicitados_id) VALUES ('2', '3');