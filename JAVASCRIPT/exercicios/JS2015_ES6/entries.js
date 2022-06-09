/**
 * O método entries() retorna um objeto array iterator com pares chave/valor.
 * O métode entries() não altera a matriz original
 */
const fruits = ["Banana", "Orange", "Apple", "Mango"]
const f = fruits.entries()

for(let x of f){
  console.log(x);
}
