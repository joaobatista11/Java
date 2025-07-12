create database baralho_bd
default character set utf8mb4
default collate utf8mb4_general_ci;

create table baralho_jogador(
id integer primary key auto_increment,
carta varchar(20),
valor tinyint(2)
)default charset = utf8mb4;

create table baralho_adversario(
id integer primary key auto_increment,
carta varchar(20),
valor tinyint(2)
)default charset = utf8mb4;

select * from baralho_jogador;

select sum(valor) from baralho_jogador;