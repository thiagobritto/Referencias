# Inspeção e Monitoramento

## Hardware

### O diretorio `/proc` é onde ficam as informações referentes ao hardware

Mostra informações referentes ao precessador

`~$ sudo cat /proc/cpuinfo | less`

Mostra informações sobre o kernel e a distro

`~$ sudo cat /proc/version | less`

Especifica a verção do kernel

`~$ sudo umane -a`

Lista informações sobre os dispositivos pci

`~$ sudo lspci`

Lista mais informações referenta ao adaptador especificado (00:03.0)

`~$ sudo lspci -s 00:03.0 -v`

Lista todos os modulos que estão instalados

`~$ sudo lsmod | less`

Lista os dispositivos usb

`~$ sudo lsusb`

Mostra o uso dos recursos

`~$ sudo uptime`

Mostra o uso de memoriao total em MB

`~$ sudo free -m -t`

Exibe o usi de disco por partição

`~$ sudo df -h`

Monitor de recursos

`~$ sudo top`

## Logs

### O diretorio `/var` é onde ficam os logs e os seviços

Mostra todas as mensagem do sistema

`~$ sudo cat /var/log/messages`

Mostra todos os logs do sistema em tempo real

`~$ sudo tail -f /var/log/syslog`

> `tail` exibe as 10 ultimas linhas de um arquivo `-f` para exibir em tempo real
