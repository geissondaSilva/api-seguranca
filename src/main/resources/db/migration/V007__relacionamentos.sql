alter table veiculo add column pessoaid bigint;
alter table veiculo
    add constraint fk_veiculo_pessoa foreign key(pessoaid) references pessoa(pessoaid);

alter table imovel add column localid bigint;
alter table imovel
    add constraint fk_imovel_local foreign key(localid) references local(localid);

alter table veiculo add column marcaid bigint;
alter table veiculo
    add constraint fk_veiculo_marca foreign key(veiculoid) references marca(marcaid);