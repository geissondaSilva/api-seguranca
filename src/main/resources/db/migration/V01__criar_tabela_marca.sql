create sequence seq_marca;

CREATE TABLE marca(
	marcaid BIGINT primary key,
	nome VARCHAR(50) NOT NULL
);