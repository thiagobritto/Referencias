/**
 * O tipo de simbolo
 * Um simbolo javascript é um tipo de dados primitivo como Number, String e Boolean
 * Ele representa um identificador exclusivo "oculto" que nenhum outro codigo pode acessar acidentalmente
 * Por exemplo, se diferentes codificadores quiserem adicionar uma propriedade person.id a um objeto pessoa pertencente a um codigo de terceiro, eles podem misturar os valores uns dos outros
 * Usando Symbol() para criar identificadores exclusivos, resolve este problema
 */

const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue",
}

let id = Symbol('id')
person[id] = 140353

console.log(person[id]);

// Os sibolos são sempre unicos
// Se você criar dois simbolos com a mesma descrição, eles terão valores diferentes

console.log(
  Symbol('id') == Symbol('id') // isso retorna false
);