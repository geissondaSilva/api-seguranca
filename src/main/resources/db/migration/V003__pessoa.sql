create sequence seq_pessoa;

create table pessoa(
    pessoaid bigint primary key,
    nome varchar(100),
    cpf varchar(20),
    telefone varchar(20),
    celular varchar(20),
    rg varchar(20),
    nascimento timestamp,
    peso numeric(4,2),
    altura numeric(4,2)
);