USE my_db;

-- AAAA-MM-DD, AAAA/MM/DD, AAAA.MM.DD ou AAAAMMDD.
SELECT * tb_funcionarios WHERE cadastro > '2016-01-01';
SELECT * tb_funcionarios WHERE cadastro > '2016/01/01';
SELECT * tb_funcionarios WHERE cadastro > '2016.01.01';
SELECT * tb_funcionarios WHERE cadastro > '20160101';

-- CURRENT_DATE() pega a data atual diretamento de servidor de banco de dados.
UPDATE tb_funcionarios SET admossao = CURRENT_DATE() WHERE id = 1;

-- DATE_ADD('AAAA-MM-DD', INTERVAL 30 DAY) adiciona um intervalo ou praso em dias
UPDATE tb_funcionarios SET admossao = DATE_ADD(CURRENT_DATE(), INTERVAL 60 DAY) WHERE id = 2;

-- seleciona a diferença entre duas datas
SELECT DATEDIFF(admissao, CURRENT_DATE()) AS diferenca FROM tb_funcionarios WHERE id = 2;

-- seleciona tudo de tb_funcionarios onde o mes de admissão for 2
SELECT * FROM tb_funcionarios WHERE MONTH(admissao) = 2;