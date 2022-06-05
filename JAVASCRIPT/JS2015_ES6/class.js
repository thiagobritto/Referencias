/**
 * Classes JavaScript
 * Classes JavaScript são modelos para objetos javascript
 * Use a palavra chave class para criar uma classe
 * Sempre adicione um metodo chamado constructor()
 */

class Car{
  constructor(name, year){
    this.name = name
    this.year = year
  }
}

// O exemplo cria uma classe chamada "car".
// A classe tem duar propriedades iniciais "nome" e "ano".
// Uma classe javascrpt não é um objeto.
// É um modelo para um objeto javascript

/**
 * Usando uma classe
 * Quando você tem uma classe, você pode usar a classe para criar objetos
 */

const myCar1 = new Car("Ford", 2014)
const myCar2 = new Car("Audi", 2019)

console.log(myCar1, myCar2);