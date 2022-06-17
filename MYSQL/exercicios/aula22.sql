
-- 1º sub query: selesione idpessoa de tb_pessoas onde desnome comece com j
-- 2º query: delete de tb_pessoas onde idpessoa esteja nesta lista(sub query)
DELETE FROM tb_pessoas WHERE idpessoa IN(
  SELECT idpessoa FROM tb_pessoas WHERE desnome LIKE 'j%'
);

-- IN(), 'traga todos que o nome ou o codigo esteja nesta lista'