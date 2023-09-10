create table if not exists public.users
(
    id serial primary key ,
    firstName varchar (50)not null ,
    lastName varchar (50)not null ,
    password varchar (50)not null,
    userName varchar (50)not null
);