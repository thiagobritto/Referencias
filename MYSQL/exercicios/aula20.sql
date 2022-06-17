DROP TABLE tb_pessoas;
DROP TABLE tb_funcionarios;

-- segundo a convenção usar o prefixo tb_ para tavelas, e nome no plural
CREATE TABLE tb_pessoas(
  idpessoa INT AUTO_INCREMENT NOT NULL,
  desnome VARCHAR(256) NOT NULL,
  dtcadastro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  CONSTRAINT pk_pessoas PRIMARY KEY (idpassoa)
) ENGINE = InnoDB;

CREATE TABLE tb_funcionarios(
  idfuncionario INT AUTO_INCREMENT NOT NULL,
  idpessoa INT NOT NULL,
  vlsalario DECIMAL(10,2) NOT NULL DEFAULT 1000.00,
  dtadmissao DATE NOT NULL,
  CONSTRAINT pk_funcionarios PRIMARY KEY (idfuncionario)
  CONSTRAINT fk_funcionarios_pessoas FOREIGN KEY (idpessoa) 
    REFERENCES tb_pessoas (idpessoa)
) ENGINE = InnoDB;

INSERT INTO tb_pessoas VALUES(NULL, 'João', NULL);

SELECT * FROM tb_pessoas;

INSERT INTO tb_funcionarios VALUES(NULL, 1, 5000, CURRENT_DATE());

SELECT * FROM tb_funcionarios;

-- se tentar inserir um registro cujo a chave estrangeira não exista na tb_pessoas
-- vai estourar um erro de foreign key disendo que falhou, garantindo a integridade da tabela
INSERT INTO tb_funcionarios VALUES(NULL, 2, 5000, CURRENT_DATE());
