# Montar pendrive ou HD Externo

- Criamos os arquivos para montagem

`~$ mkdir /mnt/pendrive /mnt/hd_externo`

- Lista os discos e informações importantes sobre

`~$ fdisk -l`

- Montando o pendrive

`~$ mount /dev/sdb1 /mnt/pendrive`

- Para desmontar

`~$ umount /dev/sdb1`

## HD

- Para sistema de arquivos ntfs precisa-se baixar o driver

`~$ apt install ntfs-3g`

- Montando o HD Externo

`~$ mount -t ntfs-3g /dev/sdc1 /mnt/hd_externo`

- Para desmontar

`~$ umount /dev/sdc1`
