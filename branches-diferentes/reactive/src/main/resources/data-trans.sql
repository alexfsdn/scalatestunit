drop table if exists livro CASCADE;

 create table LIVRO (
    id varchar(255) not null,
    nome varchar (255),
    capa_dura bit,
    numero_paginas int,
    nome_da_editora varchar(255),
    primary key (login)
);