/**
 * ECMAScript 2017 adiciona um novo mẽtodo Object.entries() aos objetos
 * O mêtodo Object.entries() retorna uma matriz dos pares chave/valor em um objeto
 */

const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue",
}

console.log(
  "Object.entries() -> ",
  Object.entries(person)
)

/**
 * O Object.entries() simplifica o uso de objetos em loops
 */

const fruits = {Bananas: 300, Oranges: 200, Apples: 500}

let text = ""
for(let [fruit, value] of Object.entries(fruits)){
  text += fruit + ": " + value + " "
}

console.log(
  "loops -> ",
  text
);

/**
 * O Object.entries() também simplifica a conversão de objetos em mapas
 */

const myMap = new Map(Object.entries(fruits))

console.log(
  "maps -> ",
  myMap
)

// Chrome e Firefox foram os primeiros navegadores com suporte para Object.entries: