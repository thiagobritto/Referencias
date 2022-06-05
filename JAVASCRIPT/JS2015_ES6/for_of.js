/**
 * A instrução js for/of faz um loop pelos valores de um obijeto iterável
 * for/of permite fazer um loop sobre estrutura de dados que são iteráveis como, Arrays, Strings, Maps, NodeLists e muito mais
*/

const cars = ["BMW", "Volvo"]
let text = ""

for (let x of cars){
  text += x + " "
}

console.log('Cars: ', text);

// x - "variável" - Para cada iteração o valor da próxima propriedade é atribuída à variável. A variável pode ser declarada com const let ou var

// cars - "iterável" - um objeto que tem propriedades iteráveis.

{
  /**
   * loop sobre uma string
   */

  let leguage = "Javascript"
  let text = ""

  for (let x of leguage){
    text += x + " "
  }

  console.log('leguage: ', text);
}