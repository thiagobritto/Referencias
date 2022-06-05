/**
 * Valores de parametros padrão
 * O ES6 permite que os parâmetros de função tenhão valores padrão
 */

function myFunction(x, y = 10){
  // y é 10 se não for passado ou se for undefined
  return x + y
}