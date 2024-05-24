-- TRIGGER FUNCTION fn_atualizar_estoque

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

-- TRIGGER

CREATE OR REPLACE TRIGGER 
	tg_atualizar_estoque 
BEFORE INSERT OR UPDATE OR DELETE ON 
	venda_produto 
FOR EACH ROW EXECUTE PROCEDURE 
	fn_atualizar_estoque();
