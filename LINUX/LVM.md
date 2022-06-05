# LVM - Logical Volume Manager

> O LVM cria um grande "disco virtual"
> formado por discos físicos, permitindo
> o gerenciamento de volumes lógicos.

## PV Phisical Volume

> O vulume fisico e tipicamente o HD, mas
> pode ser também qualquer outro dispositivo
> que o Linux reconheça como unidade de
> armazenamento

## VG - Volume Group

> O grupo de volumes, é o disco virtual formado
> pelos dispositivos físicos (HDs)

## LV - Logical Volume

> O equivalente a uma partição de disco
> em um sistema não-LVM

## Configuração

Imspecionar os discos

`~$ sudo fdisk -l | less`

Detalha o uso do disco por partições

`~$ df -h`

Mostra a quantidade de dispositivos fisicos instalados

`~$ pvdisplay`

Pegamos o nome do grupo de volumes

`~$ vgdisplay`

Para  sabermos quanto volumes logicos

`~$ lvdisplay`

### Preparando disco no formato LVM

Vamos preparar o disco `/dev/sdb`

`~$ fdisk /dev/sdb`

> precione `m` para ajuda
> precione `n` para adicionar uma nova partição
> precione `p` para criar uma partição primaria
> precione `?` para definir o numero da partição (entre '1-4')
> precione `enter` para selecionar o setor de disco inicial como padrão
> precione `enter` para selecionar o setor de disco final como padrão

    Partição criada!

> precione `m` para ajuda
> precione `w` para salvar e sair

    Tabela de partições alterada!

Vamos criar o sistema LVM

`~$ fdisk /dev/sdb`

> precione `m` para ajuda
> precione `t` para alterar um tipo de partição
> precione `L` para mostrar todos os tipos de partição possiveis (sistema de arquivos)
> precione `?` digite o código hexadecimal do sistema de arquivos - '8e' Linux LVM
> precione `w` para salvar e sair

    Partição alterada!

### Criando um novo volume fisico

Imspecionar os discos para ver o dispositivo (Device) Linux LVM

`~$ sudo fdisk -l | less`

Criamos um novo volume fisico

`~$ pvcreate /dev/sdb1`

Veremos que agora tem 2 volumes fisicos

`~$ pvdisplay`

Veremos que ainda não foi adicionado o espaço do segundo volume fisico no grupo de volumes

`~$ vgdisplay`

Adiciona o dispositivo ao grupo de volume (`~$ vgdisplay` para ver o nome do grupo)

`~$ vgextend nome-do-grupo-de-volume /dev/sdb1`

Veremos que agora foi adicionado o espaço do segundo volume fisico no grupo de volumes

`~$ vgdisplay`

### Alocando mais espaço para um diretorio

Observamos o diretorio que necessita de mais espaço

`~$ df -h`

Para saber o caminho (LV path) do diretorio a ser alocado mais espaço

`~$ lvdisplay | less`
