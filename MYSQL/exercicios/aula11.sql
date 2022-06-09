-- comando insert

-- insert posicional
INSERT INTO tb_pessoas VALUES(1, 'João', 'M');

-- insert declarativo
INSERT INTO tb_pessoas (sexo, nome) VALUES ('F', 'Maria');

-- insert com mais de um registro
INSERT INTO tb_pessoas (nome, sexo) VALUES
('Divanei', 'M'),
('Luiz', 'M'),
('Djalma', 'M'),
('Tatiane', 'F'),
('Cristiane', 'F'),
('Jaqueline', 'F');

-- copiar dados de uma tabela para outra
INSERT INTO tb_funcionarios
SELECT id, nome, 1200, CURRENT_DATE(), sexo, NULL FROM tb_pessoas;

