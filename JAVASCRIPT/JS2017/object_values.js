/**
 * O método Object.values() é semelhante à Object.entries(), mas retorna uma matriz de dimensão unica dos valores do objeto.
 */

 const person = {
  firstName : "John",
  lastName : "Doe",
  age : 50,
  eyeColor : "blue"
}

console.log(
  Object.values(person)
)