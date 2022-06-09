/**
 * Node.js como servidor web
 */

var http = require('http')

var app = http.createServer((req, res) => {
  // Adicionar um cabeçalho HTTP
  // se a resposta de servidor HTTP deve ser exibida como HTML
  // você deve incluir um cabeçalho HTTP com o tipo de conteudo
  res.writeHead(200, { 'Content-Type': 'text/html' })
  res.write('Hello world')
  res.end()
})

app.listen(8080, () => {
  console.log('running..');
})