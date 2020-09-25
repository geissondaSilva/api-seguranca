create sequence seq_veiculo;

create table veiculo(
    veiculoid bigint primary key,
    placa varchar(10),
    modelo varchar(100),
    ano bigint,
    airbag boolean,
    abs boolean,
    ar boolean,
    gasolina boolean,
    etanol boolean,
    eletrico boolean
);