-- selecione tudo de tb_funcionarios ordenando por nome
SELECT * FROM tb_funcionarios ORDER BY nome;

-- selecione tudo de tb_funcionarios ordenando por posição
SELECT * FROM tb_funcionarios ORDER BY 2;

-- selecione tudo de tb_funcionarios ordenando por salario de forma decendente e por nome acendente
SELECT * FROM tb_funcionarios ORDER BY salario DESC, nome ASC;

-- selecione tudo de tb_funcionarios ordenando por salario limitando de 0(inicio) a 3(final)
SELECT * FROM tb_funcionarios ORDER BY salario LIMIT 0, 3;

-- selecione tudo de tb_funcionarios 
-- onde ano de admissao = 2016 e mes = 5 
-- ordenando por salario 
-- limitando de 0(inicio) a 3(final)
SELECT * FROM tb_funcionarios 
WHERE YEAR(admissao) = 2016 AND MONTH(admissao) = 5
ORDER BY salario LIMIT 0, 3;
