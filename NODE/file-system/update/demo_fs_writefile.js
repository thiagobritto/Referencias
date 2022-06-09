/**
 * Atualizar arquivos
 * 
 * O método fs.writeFile() substitui o arquivo e o conteúdo especificados:
 */

var fs = require('fs')

// Substitua o conteúdo do arquivo "mynewfile3.txt":

fs.writeFile('../mynewfile3.txt', 'This is my text.', function (err) {
  if (err) throw err
  console.log('Updated!');
})

