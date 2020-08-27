create sequence seq_produto;

create table produto(
    produtoid bigint primary key,
    nome varchar(100),
    marcaid bigint,
    codigo_barra varchar(200),
    unidade_medida varchar(20),
    constraint fk_produto_marca foreign key(marcaid) references marca(marcaid)
);