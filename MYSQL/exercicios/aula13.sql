-- WHERE; -> clausula
-- =, <>, !=, AND, OR; -> operadores

USE my_db;

SELECT * FROM tb_funcionarios WHERE sexo = 'M' AND salario > 1000;

UPDATE tb_funcionarios SET salario = salario * 1.4 WHERE id = 3;

SELECT * FROM tb_funcionarios WHERE sexo = 'F' AND salario > 1000;