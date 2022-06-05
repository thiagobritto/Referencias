/**
 * O metodo keys() retorna um objeto array iterator com as chaves de um array
 */

const fruits = ['Banana', 'Orange', 'Apple', 'Mango']
const keys = fruits.keys()

let text = ""
for (let x of keys){
  text += x + "\n"
}

console.log(text);