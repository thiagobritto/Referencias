# PHP

## Criando diretorios virtuais com apache

Na pasta onde fica o apache va até `*/apache2/conf/httpd.conf`, e adicione:

```nano
<VirtualHost *:80>
    ServerAdmin user@user.com
    DocumentRoot "/home/user/dir"
    ServerName teste.com
    <Directory "/home/user/dir">
        Order allow,deny
        Allow from all
        Require all granted
    </Directory>
</VirtualHost>
```

Após as alterações salve o arquivo é vamos até `/etc/hosts` para sobrescrevemos o endereço para a propria maquina adicionando a linha:

```nano
127.0.0.1   teste.com
```

O segundo passo para sobreescrita do endereço, no desenvolvimento.
