/**
 * Deletar arquivos
 * 
 * Para excluir um arquivo com o módulo File System, use o fs.unlink() método.
 * O método fs.unlink() exclui o arquivo especificado:
 */

var fs = require('fs')

// Excluir "mynewfile2.txt":

fs.unlink('../mynewfile2.txt', function(err){
  if(err) throw err
  console.log('File deleted!');
})
