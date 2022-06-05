# .tar

.tar = aglutinador
.gz = tipo de compactação
.bz2 = é outro tipo de compactação

- Extraindo o arquivo.tar.gz

`~$ tar xzvf nomeDoArquivo.tar.gz`

- Extraindo o arquivo.tar.gz em

`~$ tar xzvf nomeDoArquivo.tar.gz -C /diretorio`

> O `-C` permite escolher o local onde extrair/compactar o arquivo

- Extraindo o arquivo.tar.bz2

`~$ tar xjvf nomeDoArquivo.tar.bz2`

- Compactando arquivos.tar.gz

`~$ tar czvf nomeDoArquivo.tar.gz /diretorio_a_compactar`

## xzvf | xjvf | czvf | cjvf

- x - significa extrair o arquivo
- c - significa compactar o arquivo
- z - significa extrair/compactar o arquivo no formato .gz ou .gzip
- j - significa extrair/compactar o arquivo no formato .bz2
- v - 'verbolze' para verificar a extração/compactação dos arquivos
- f - indica que o resultado sera file (arquivo)
