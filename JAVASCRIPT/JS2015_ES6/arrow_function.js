/**
 * As funções de seta permitem uma sintaxe curta para escrever expressões de função
 * Você não precisa das palavras-chaves function, return nem das {chaves}
 */

// ES5

var x = function(x, y){
  return x * y
}

//ES6

const x = (x, y) => x * y

// funções de seta não têm seu próprio this, elas não são adequadas para definir métodos de objetos
// as funções de seta não são içadas, portanto elas devem ser definidas antes de serem usadas
// usar const e mais seguro do que usar var, porque uma expreção de função e sempre um valor constante

/**
 * Você so pode omitir a palavra chave return e as {chaves} se a função for uma unica instrução. Por isso, deve ser um bom hábito mantê-los sempre
 */

{
  const x = (x, y) => { return x * y }
}