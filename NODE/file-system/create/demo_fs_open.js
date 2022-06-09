/**
 * Criar arquivos
 * 
 * O método fs.open() recebe um "flag" como segundo argumento, se o sinalizador for "w" para "escrever", o arquivo especificado será aberto para gravação. Se o arquivo não existir, um arquivo vazio será criado:
 */

var fs = require('fs')

// Crie um novo arquivo vazio usando o método open():

fs.open('../mynewfile2.txt', 'w', (err, file) => {
  if(err) throw err
  console.log('saved!');
})