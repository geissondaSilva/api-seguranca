create sequence seq_local;

create table local(
    localid bigint primary key,
    nome varchar(100),
    estacionamento boolean,
    banheiro boolean,
    endereco varchar(150),
    latitude numeric(20,10),
    longitude numeric(20,10),
    complemento varchar(500)
);