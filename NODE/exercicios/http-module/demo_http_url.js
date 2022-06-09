/**
 * Leia a string de consulta
 * A função passada para o http.createServer() tem um reqargumento que representa a solicitação do cliente, como um objeto (objeto http.IncomingMessage).
 * Este objeto tem uma propriedade chamada "url" que contém a parte da url que vem depois do nome do domínio:
 */

var http = require('http')

var app = http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.write(req.url);
  res.end();
})

app.listen(8080, ()=> {
  console.log('running...');
})