# Mysql

## Instalação no Linux

```bash
# Instalando o mysql-server
sudo apt install mysql-server
```

```bash
# Modifica as configurações padrão
sudo mysql_secure_installation
```

```sql
-- Verifica metodo de autenticação
SELECT user, authentication_string, plugin, host FROM mysql.user;
```

```sql
-- Altera senha para usuário root
ALTER USER 'root'@'localhost' IDENTIFIED WITH caching_sha2_password BY 'Password#123';
```

```bash
# Agora para acessar
sudo mysql -u root -p
```

## Gerenciamento

```bash
# Exibe o status do serviço
sudo systemctl status mysql
```

```bash
# Inicia o serviço
sudo systemctl start mysql
```

```bash
# Para o serviço
sudo systemctl stop mysql
```

```bash
# Reinicia o serviço
sudo systemctl restart mysql
```

```bash
# Abilita a inicialização do serviço junto com o systema
sudo systemctl enable mysql
```

```bash
# Desabilita a inicialização do serviço junto com o systema
sudo systemctl disable mysql
```

## DUMP

```bash
# DUMP database
mysqldump -u <usuario> -p<senha> db_name > db_dump.sql
```

```bash
# DUMP table
mysqldump -u <usuario> -p<senha> db_name tb_name > tb_dump.sql
```

```bash
# Restaurar um DUMP
mysql -u <usuario> -p<senha> < dump.sql
```
