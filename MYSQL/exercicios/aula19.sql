-- delete da tabela tb_funcionarios onde id = 1
DELETE FROM tb_funcionarios WHERE id = 1;

-- inicie uma tranzação
START TRANSACTION;

-- delete os dados da tabela tb_pessoas
DELETE FROM tb_pessoas;

-- verifique se os dados foram apagado
SELECT * FROM tb_pessoas;

-- desfaz tudo para antes do inicio da tranzação
ROLLBACK;

-- verifique que os dados voutaram
SELECT * FROM tb_pessoas;

-- OU

-- confirma a tranzação
COMMIT;

-- verifique que os dados foram apagados permanentemente
SELECT * FROM tb_pessoas;

-- ao inserir um novo registro verifique que o id continua de onde poarou
INSERT INTO tb_pessoas VALUES(NULL, 'José', 'M');

-- verifique que o id continua de onde poarou
SELECT * FROM tb_pessoas;

-- tem o mesmo efeito do delete sem where, porem redefine a estrutura da tabela
TRUNCATE TABLE tb_pessoas;

-- verifique que agora o id começa do 1...
SELECT * FROM tb_pessoas;