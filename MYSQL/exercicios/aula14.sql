-- operadores de busca
USE my_db;

-- selecione tudo de tb_funcionarios onde nome contenha a letra 'a'
-- '%a%' não importa com que letra começa ou termina desde que contenha a letra 'a' 
SELECT * FROM tb_funcionarios WHERE nome LIKE '%a%';

-- selecione tudo de tb_funcionarios onde nome comece com 'a'
SELECT * FROM tb_funcionarios WHERE nome LIKE 'a%';

-- selecione tudo de tb_funcionarios onde nome não comece com 'a'
SELECT * FROM tb_funcionarios WHERE nome NOT LIKE 'a%';

-- selecione tudo de tb_funcionarios onde nome termine com a letra 'a'
SELECT * FROM tb_funcionarios WHERE nome LIKE '%a';

-- selecione tudo de tb_funcionarios onde nome tem 'a' na terceira letra 
SELECT * FROM tb_funcionarios WHERE nome LIKE '__a%';


-- selecione tudo de tb_funcionarios onde salario esteja entre 1000 e 2000 
SELECT * FROM tb_funcionarios WHERE salario BETWEEN 1000 AND 2000;

-- selecione tudo de tb_funcionarios onde salario não esteja entre 1000 e 2000 
SELECT * FROM tb_funcionarios WHERE salario NOT BETWEEN 1000 AND 2000;

-- selecione tudo de tb_funcionarios onde nome corresponda com codigo fonetioco de Luis
-- COUNDEX retorna Luis ou Luiz ...
SELECT * FROM tb_funcionarios WHERE SOUNDEX(nome) = SOUNDEX('Luis');
