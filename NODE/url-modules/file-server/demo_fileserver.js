/**
 * Servidor de arquivos Node.js
 * 
 * Crie um arquivo Node.js que abra o arquivo solicitado e retorne o conteúdo ao cliente. 
 * Se algo der errado, lance um erro 404:
 */

var http = require('http')
var url = require('url')
var fs = require('fs')

http.createServer((req, res) => {
  var q = url.parse(req.url, true);
  var filename = "." + q.pathname;
  fs.readFile(filename, (err, data) => {
    if (err) {
      res.writeHead(404, {'Content-Type': 'text/html'});
      return res.end("404 Not Found");
    } 
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
  });
}).listen(8080, () => {
  console.log('running...');
});