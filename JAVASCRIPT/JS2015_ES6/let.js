/**
 * a palavra 'let' permite declarar uma variavel com escopo de bloco
 */

var x  = 10
// aqui x é 10

console.log(x);

{
  let x = 2
  // aqui x é 2

  console.log(x);
}

// aqui x é 10
console.log(x);