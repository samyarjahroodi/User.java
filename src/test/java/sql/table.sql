create table if not exists public.users
(
    id serial primary key ,
    firstname varchar (50)not null ,
    lastname varchar (50)not null ,
    password varchar (50)not null
);