# PostgreSQL

## Ex: Procedure

```plpgsql
CREATE OR REPLACE PROCEDURE LOW_STOCK(par_product BIGINT, par_amount DECIMAL) LANGUAGE PLPGSQL AS $$
DECLARE
	stock DECIMAL;
BEGIN
	SELECT pro_stock FROM product WHERE id_product = par_product INTO stock;
	IF par_amount > stock THEN
		RAISE EXCEPTION 'Produto (%) quantidade (%)', par_product, stock  
		USING HINT = 'verificar se a disponibilidade do produto.';
	ELSE
		UPDATE product SET pro_stock = (pro_stock - par_amount) WHERE id_product = par_product; 
	END IF;
END $$;

```

## Ex: Trigger

```plpgsql
-- DECLARE TRIGGER FUNCTION -> fn_atualizar_estoque
CREATE OR REPLACE FUNCTION fn_atualizar_estoque() RETURNS TRIGGER AS $$
DECLARE
	qtde decimal(10,3);
BEGIN		
	SELECT qtd FROM produto WHERE id_produto = NEW.id_produto into qtde;
	IF OLD.qtd IS NULL THEN
		-- RAISE EXCEPTION 'INSERT';
		IF qtde < NEW.qtd THEN
			RAISE EXCEPTION 'Quantidade indisponivel';
		ELSE 
			UPDATE produto SET qtd = qtd - NEW.qtd WHERE id_produto = NEW.id_produto;
		END IF;
	ELSIF NEW.qtd IS NULL THEN
		--RAISE EXCEPTION 'DELETE OLD: %, ID: %', OLD.qtd, OLD.id_produto;
		UPDATE produto SET qtd = (qtd + OLD.qtd) WHERE id_produto = OLD.id_produto;
		RETURN OLD;
	ELSE
		-- RAISE EXCEPTION 'UPDATE';
		IF qtde < (OLD.qtd - NEW.qtd) THEN
			RAISE EXCEPTION 'Quantidade indisponivel';
		ELSE 
			UPDATE produto SET qtd = qtd + (OLD.qtd - NEW.qtd) WHERE id_produto = NEW.id_produto;
		END IF;
	END IF;
	RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- CREATE TRIGGER
CREATE OR REPLACE TRIGGER 
	tg_atualizar_estoque 
BEFORE INSERT OR UPDATE OR DELETE ON 
	venda_produto 
FOR EACH ROW EXECUTE PROCEDURE 
	fn_atualizar_estoque();
```