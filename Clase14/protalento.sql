drop database if exists protalento;
create database if not exists protalento;
use protalento;

create table if not exists usuarios (
	correo varchar(100) not null primary key,
	clave varchar(100) not null
);

-- inyeccion SQL
select * from usuarios where correo = 'user1@gmail.com' or ''=''