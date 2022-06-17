-- INNER JOIN, 'junto com', 'tem que ter nas duas'

-- selecione tudo juntando a tabela a com a tabela b
SELECT * 
FROM tb_funcionarios a
INNER JOIN tb_pessoas b ON a.idpessoa = b.idpessoa;

-- para usar o USING() a coluna tem que ter o mesmo nome nas duas tabelas
SELECT * 
FROM tb_funcionarios
INNER JOIN tb_pessoas USING(idpessoa);

INSERT INTO tb_pessoas VALUES(NULL, 'Glaucio', NULL);

SELECT * FROM tb_pessoas;

-- LEFT JOIN, 'tudo da tabela do lado esquerdo'

-- só quero o left 'a' junto com a tabela b
SELECT * 
FROM tb_pessoas a
LEFT JOIN tb_funcionarios b ON a.idpessoa = b.idpessoa;

-- RIGHT JOIN, 'tudo da tabela do lado direito'

-- só quero o right 'b' junto com a tabela a
SELECT * 
FROM tb_pessoas a
RIGHT JOIN tb_funcionarios b ON a.idpessoa = b.idpessoa;