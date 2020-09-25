create sequence seq_imovel;

create table imovel(
    imovelid bigint primary key,
    endereco varchar(100),
    comodos bigint,
    quartos bigint,
    vagas bigint,
    banheiros bigint,
    suites bigint,
    complementos varchar(200),
    aluguel numeric(10,2),
    condominio numeric(10,2)
);