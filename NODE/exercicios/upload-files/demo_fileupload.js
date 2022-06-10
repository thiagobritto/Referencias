/**
 * O Módulo Formidável
 * 
 * Existe um módulo muito bom para trabalhar com uploads de arquivos, chamado "Formidable".
 * O módulo Formidable pode ser baixado e instalado usando o NPM:
 * 
 * var formidable = require('formidable')
 */

/**
 * Fazer upload de arquivos
 * 
 * Agora você está pronto para criar uma página da Web em Node.js que permita ao usuário fazer upload de arquivos para seu computador:
 */

/** 
 * Etapa 1: criar um formulário de upload
 * Crie um arquivo Node.js que grave um formulário HTML, com um campo de upload:
 */

/**
 * Etapa 2: analisar o arquivo enviado
 * Inclua o módulo Formidable para poder analisar o arquivo carregado assim que chegar ao servidor.
 * Quando o arquivo é carregado e analisado, ele é colocado em uma pasta temporária em seu computador.
 */

/**
 * Etapa 3: salve o arquivo
 * Quando um arquivo é carregado com sucesso no servidor, ele é colocado em uma pasta temporária.
 * O caminho para este diretório pode ser encontrado no objeto "files", passado como terceiro argumento na parse()função callback do método.
 * Para mover o arquivo para a pasta de sua escolha, use o módulo File System e renomeie o arquivo:
 */

var http = require('http');
var formidable = require('formidable');
var fs = require('fs');

http.createServer(function (req, res) {
  if (req.url == '/fileupload') {
    var form = new formidable.IncomingForm();
    form.parse(req, function (err, fields, files) {
      var oldpath = files.filetoupload.filepath;
      var newpath = './uploads/' + files.filetoupload.originalFilename;
      fs.rename(oldpath, newpath, function (err) {
        if (err) throw err;
        res.write('File uploaded and moved!');
        res.end();
      });
    });
  } else {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write('<form action="fileupload" method="post" enctype="multipart/form-data">');
    res.write('<input type="file" name="filetoupload"><br>');
    res.write('<input type="submit">');
    res.write('</form>');
    return res.end();
  }
}).listen(8080);
