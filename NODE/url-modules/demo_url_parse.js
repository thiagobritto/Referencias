/**
 * O módulo de URL integrado
 * 
 * O módulo URL divide um endereço da web em partes legíveis.
 * Para incluir o módulo URL, use o método require():
 * O método url.parse() retorna um objeto URL com cada parte do endereço como propriedades:
 */

var url = require('url')

var adr = 'http://localhost:8080/default.htm?year=2017&month=february';
var q = url.parse(adr, true);

console.log(q.host); //returns 'localhost:8080'
console.log(q.pathname); //returns '/default.htm'
console.log(q.search); //returns '?year=2017&month=february'

var qdata = q.query; //returns an object: { year: 2017, month: 'february' }
console.log(qdata.month); //returns 'february'
