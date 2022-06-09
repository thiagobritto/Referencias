/**
 * Criar arquivos
 * 
 * O método fs.appendFile() anexa o conteúdo especificado a um arquivo. Se o arquivo não existir, o arquivo será criado:
 */

var fs = require('fs')

// Crie um novo arquivo usando o método appendFile():

fs.appendFile('../mynewfile1.txt', 'Outher content! 2 \n', err => {
  if (err) throw err
  console.log('saved!');
})