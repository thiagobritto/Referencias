/**
 * O método findIndex() retorna o índice do primeiro elemento da matriz que passa em uma função de teste.
 */

// Este exemplo encontra o índice do primeiro elemento que é maior que 18:
const numbers = [4, 9, 16, 25, 29];
let first = numbers.findIndex(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}

// Observe que a função recebe 3 agumentos

// O valor do item
// O indice de itens
// A matriz em si

console.log(first);