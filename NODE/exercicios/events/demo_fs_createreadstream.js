/**
 * Eventos no Node.js
 * 
 * Cada ação em um computador é um evento. Como quando uma conexão é feita ou um arquivo é aberto
 * Objetos em Node.js podem disparar eventos, como o objeto readStream dispara eventos ao abrir e fechar um arquivo:
 */

var fs = require('fs');
var rs = fs.createReadStream('./demofile.txt');

rs.on('open', function () {
  console.log('The file is open');
});