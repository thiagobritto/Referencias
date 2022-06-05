# Server DHCP - passo a passo

- instalando o servidor DHCP

`~$ sudo apt install isc-dhcp-server`

criamos um beckup do arquivo de configurações DHCP

`~$ sudo cp /etc/dhcp/dhcpd.conf /etc/dhcp/dhcpd.conf.bkp`

- removemos o arquivo

`~$ sudo rm /etc/dhcp/dhcpd.conf`

- criamos um novo arquivo

`~$ sudo nano /etc/dhcp/dhcpd.conf`

```nano

ddns-update-style none;

athoritative;

log-facilty local7;

subnet 172.16.0.0 netmask 255.255.255.0 [
    range 172.16.0.10 172.16.0.50;
    option subnet-mask 255.255.255.0;
    option broadcast-anddress 172.16.0.255;
    # tempo para o servidor verificar se a maquina esta ativa
    default-lease-time 86400;
    # maior tempo que o servidor aceita para que "esse" ip seja alocado na mesma maquina
    max-lease-time 604800;
]
```

- checa se o arquivo esta configurado corretamente

`~$ sudo dhcpd -t`

- mostrar o endereço ip desta maquina

`~$ sudo ip addr show`

- vamos informar a identificação da placa de rede

`~$ sudo nano -c /etc/default/isc-dhcp-server`

```nano
INTERFACESv4="enp0s3"
INTERFACESv6=""
```

- vamos definir o ip do servidor

`~$ sudo nano -c /etc/network/interfaces`

```nano
# informa que essa interface de rede é carregada automaticamente ao ligarmos a maquina
allow-hotplug enp0s3
# permite que determinemos se essa interface de rede vai receber IP dinamicamente | staticamente
# iface enp0s3 inet dhcp
iface enp0s3 inet static
address 172.16.0.2
network 172.16.0.0
netmask 255.255.255.0
broadcast 172.16.0.255
```

- vamos derrubar (desativar) a interface

`~$ sudo ifdown enp0s3`

- vamos subir (ativar) a interface

`~$ sudo ifup enp0s3`

- vamos ver o status do servidor

`~$ sudo systemctl status isc-dhcp-server`

- vamos subir o servidor DHCP

`~$ sudo systemctl start isc-dhcp-server`

## Após a configuração

- vamos ver o status dos serciços de rede

`~$ sudo systemctl status networking`

- vamos verificar os logs do servidor DHCP

`~$ sudo cat /var/lib/dhcp/dhcpd.leases`
