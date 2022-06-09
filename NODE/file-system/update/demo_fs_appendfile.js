/**
 * Atualizar arquivos
 * 
 * O método fs.appendFile() anexa o conteúdo especificado no final do arquivo especificado:
 */

var fs = require('fs')

// Anexar "This is my text." ao final do arquivo "mynewfile1.txt":

fs.appendFile('../mynewfile1.txt', 'This is my text.', function(err){
  if (err) throw err
  console.log('Updated!');
})
