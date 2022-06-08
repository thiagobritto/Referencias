
-- unsigned - Não permite numeros negativos
-- signed - Permite numeros negativos

-- # Numeros inteiros

-- tinyint 1 Bytes   | -128 á 128
-- smallint 2 Bytes  | -32768 á 32768
-- mediumint 3 Bytes | -8388608 á 8388608
-- int 4 Bytes       | -2147483648 á 2147483648
-- bigint 8 Bytes    | -9223372036854775808 á 9223372036854775808

-- Se, tinyint unsigned - não permitirá valores negativos será somente de 0 a 255

-- int unsigned zerofill
-- int signed

-- # Numéricos de Ponto Fixo

-- decimal(10,2) 4 Bytes
-- decimal(12,2) 5 Bytes
-- decimal(18,6) 6 Bytes
-- decimal(30,10) 9 Bytes
-- decimal(65,30) 16 Bytes

-- # Data e Hora

-- Date 3 Bytes
-- Time 3 Bytes
-- DateTime 8 Bytes
-- TimeStamp 4 Bytes
-- Year 1 Byte

-- # Text

-- Char(10) 10 Bytes
-- Varchar(10) 1 a 10 Bytes
-- Text 1 a 65535 Bytes
-- Enum 1 ou 2 Bytes

-- Varchar depende do conteúdo.