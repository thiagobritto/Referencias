USE my_db;

-- Retorna quantas linhas ou registros retorna essa consulta
-- Se especificado uma coluna ela não contara os campos nulos
SELECT COUNT(*) AS total FROM tb_funcionarios;

-- converte o resultade em outro tipo de dado
SELECT nome, salario AS atual,
CONVERT(salerio * 1.1, DEC(10,2)) AS 'Salario com aumento de 10%'
FROM tb_funcionarios;
