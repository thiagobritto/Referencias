/**
 * Criar arquivo
 * 
 * O método fs.writeFile() substitui o arquivo e o conteúdo especificados, se existir. Se o arquivo não existir, um novo arquivo, contendo o conteúdo especificado, será criado:
 */

var fs = require('fs')

// Crie um novo arquivo usando o método writeFile():

fs.writeFile('../mynewfile3.txt', 'Hello content2!', err => {
  if (err) throw err
  console.log('saved!');
})