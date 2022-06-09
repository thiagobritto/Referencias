/**
 * Uma promessa é um objeto javascript que vincula "Código de produção" e "Código de consumo".
 * "Produzir código" pode levar algum tempo e "Consumir código" deve aguardar o resultado 
 */

const myPromise = new Promise(function(myResove, myReject){
  setTimeout(function(){myResove('I love you!!')}, 3000)
})

myPromise.then(function(value){
  console.log(value);
})

console.log('fim');