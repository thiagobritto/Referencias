# Anotações

## Arquitetura Linux

A pasta `/bin` ficam todos os comandos.

A pasta `/dev` estão todos os dispositivos.

A pasta `/etc` ficam as configurações da maquina.

A pasta `/usr` ficam os programas instalados.

A pasta `/home` ficam as pasta do usuário.

A pasta `/tem` ficam arquivos temporarios.

A pasta `/root` ficam arquivos do root.

A pasta `/sbin` ficam programas executaveis de uso exclusivo do root.

A pasta `/var` ficam arquivos de tamanho variaveis como logs e cache de sistema.

A pasta `/proc` ficam arquivos que trazem informações sobre o sistema. Como `~cat /proc/cpuinfo` que traz informações do processador.

## Aplicativos mais conhecidos

__gParted__ para particiona discos

__Synaptk__ instalador de pacotes

__htop__ analizador de processos

__TimeShift__ ferramenta de beckup

__Inkscape__ inlustrator - (similar ao corel draw)

## Terminal

```bash
# Para atualizar todos os pacotes
# Utilizamos -u para exibir uma lista de tudo
sudo apt -u full-upgrade
```

```bash
# Remove o pacote e tudo que tem haver com ele
sudo apt purge *nomeDoPacote
```

```bash
# Instala pacotes de dependencias necessarias
sudo apt install -f
```

```bash
# Remove novos pacotes
sudo apt remove nomeDoPacote
```

```bash
# Instala novos pacotes instalados via dpkg
sudo dpkg --install nomeDoPacote.deb
```

```bash
# Remove pacotes instalados via dpkg
sudo dpkg --remove nomeDoPacote
```

```bash
# Limpa o cache de instalação dos pacotes
sudo apt clean
```

```bash
# Limpa pacotes que não estão em uso
sudo apt autoremove

```

```bash
# Faz um beckup de um arquivo
sudo cp nomeDoArquivo.ex nomeDoArquivo.ex.bkp
```

```bash
# Apresenta as interfaces de rede
ip a
```

```bash
# Lista os servidores DNS
systemd-resolve --status
```

```bash
# Checa as configurações feitas em /etc/netplan/
sudo netplan try
```

```bash
# Aplica as configurações feitas em /etc/netplan/
sudo netplan apply
```

```bash
# lista o connteudo do diretorios
ls
```

```bash
# lista o connteudo do diretorios de forma -Recurciva - diretorios è sub-diretorios
ls -R
```

```bash
# lista o connteudo dos diretorios de forma longa --long
ls -l
```

```bash
# lista o connteudo dos diretorios de forma longa legivel para humanos
ls -l -h
```

```bash
# lista todos os connteudo dos diretorios --all
ls -a
```

```bash
# lista todos os connteudo dos diretorios de forma longa
ls -la
```

```bash
# lista todos os connteudo dos diretorios de forma longa legivel para humanos
ls -lah
```

```bash
# lista todos os connteudo dos diretorios de forma -Recurciva -longa
ls -Rla
```

```bash
# direciona para o diretorio do usuário
cd ~
```

```bash
# direciona para o diretorio raiz
cd /
```

```bash
# mostra o caminho do diretorio
pwd
```

```bash
# cria um diretorio
mkdir nomeDoDiretorio
```

```bash
# cria um diretorio e se não existir o caminho ele cria ar pasta subsequentes
mkdir -p nomeDoDiretorio1/nomeDoDiretorio3/nomeDoDiretorio3\ com\ espaço/
```

```bash
# cria um arquivo
touch nomeDoArquivo.txt
```

```bash
# ajuda com o comando
mkdir|touch|ls|cd --help
```

```bash
# manual do comando
man mkdir|touch|ls|cd
```

```bash
# lista os comandos
history
```

```bash
# repete o comandos da lista com o numero 10
!10
```

```bash
# abre o arquivo para edição no nano editor de texto
nano arquivo.txt
```

```bash
# abre o arquivo para leitura com a saida padrão
cat arquivo.txt
```

```bash
# remove um diretorio
rmdir nomeDoDiretorio
```

```bash
# remove um arquivo
rm arquivo.txt
```

```bash
# remove tudo de forma -recurciva -forçando
rm -rf diretorio/
```

```bash
# remove è acima de 4 arquivos ele pergunta sé tem certesa da ação
rm -I diretorio/
```

```bash
# define um apelidio para o comando rm com -I (só vale enquanto o terminal estiver abertos)
alias rm="/bin/rm -I"
```

```bash
# lista tudo que termine com '.pdf' e qualquer coisa antes
ls /etc/*.pdf
```

```bash
# lista tudo que tenha 'x', qualquer coisa antes e qualquer coisa depois
ls /etc/*x*
```

```bash
# lista tudo que tenha 'as', dois caracteres antes e qualquer coisa depois
ls /etc/??as*
```

```bash
# lista tudo que comece com 'f', o secundo caractere entre 'a - i' e qualque coisa depois
ls /etc/f[a-i]*
```

```bash
# lista tudo que comece com 'f', o secundo caractere entre 'a - c' e 'e', e qualque coisa depois
ls /etc/f[a-c,e]*
```

```bash
# lista tudo que a segunda e a terceira letra seja 'am' ou 'ul', e qualque coisa depois
ls /etc/?{am, ul}*
```

```bash
# mostra todos a definição de todas as portas de rede que o sistema usa
cat /etc/services
```

```bash
# mostra todos a definição de todas as portas de rede que o sistema usa - modo paginaçãp
less /etc/services
```

```bash
# copia o arquivo para o diretorio
cp arquivo.txt diretorio/
```

```bash
# move o arquivo para o diretorio
mv arquivo.txt diretorio/
```

```bash
# move o diretorio1 para diretorio2 - forma de renomear diretorios e arquivos
mv diretorio1/ diretorio2/
```

```bash
# Sobre a destribuição e verção do kernel
hostnamectl
```

```bash
# Mais detalhes
uname -a
```

```bash
# reinicia o serviço
systemctl restart networking
```

```bash
# compacta o path /home/user/[a-z,A-Z,Á]*
tar czvf homeUserBackup_29042022.tar.gz /home/user/[a-z,A-Z,Á]*
```

```bash
# Lista todos os serviços ativos
sudo systemctl list-unit-files --type=service | grep enabled
```
