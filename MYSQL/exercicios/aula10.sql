USE my_banco;

SELECT * FROM tb_funcionarios;

-- almenta em 10% o salario de todos da tabela tb_funcionarios
UPDATE tb_funcionarios SET salario = salario * 1.10;

-- deleta todos da tabela tb_funcionarios
DELETE FROM tb_funcionarios;