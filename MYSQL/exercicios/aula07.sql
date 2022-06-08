DROP DATABASE banco;

CREATE DATABASE my_banco;

USE my_banco;

CREATE TABLE tb_funcionarios(
  id INT,
  nome VARCHAR(100),
  salerio DECIMAL(10,2),
  admissao DATE,
  sexo ENUM('F', 'M'),
  cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAP()
);

INSERT INTO tb_funcionarios VALUES(1, 'nome do fonc', 4200.99, '2022-06-07', 'M', NULL);

DESCRIBE tb_funcionarios;

SELECT * FROM tb_funcionarios;
