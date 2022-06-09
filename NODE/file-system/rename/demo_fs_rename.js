/**
 * Renomear arquivos
 * 
 * Para renomear um arquivo com o módulo File System, use o método fs.rename().
 * O método fs.rename() renomeia o arquivo especificado:
 */

var fs = require('fs')

fs.rename('../mynewfile1.txt', '../myrenamefile.txt', function(err){
  if(err) throw err
  console.log('File Renamed!');
})