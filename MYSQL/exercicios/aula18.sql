-- update 
UPDATE tb_funcionarios 
SET salario = 3000
WHERE id = 5;

SELECT * FROM tb_funcionarios WHERE id = 5;

UPDATE tb_funcionarios 
SET salario = 4000, admissao = '2015-12-20'
WHERE id = 6;

SELECT * FROM tb_funcionarios WHERE id = 6;