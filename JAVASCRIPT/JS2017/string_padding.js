/**
 * O ECMAScript 2017 adicionou dois métodos String: padStart e padEnd para dar suporte ao preenchimento no inicio e no final de uma string
 */

let str = "5"
str = str.padStart(4, 0)

console.log(
  str // retorna 0005
)

{
  let str = "5"
  str = str.padEnd(4, 0)

  console.log(
    str // retorna 5000
  )
}

// O preenchimento de sequência de caracteres não é suportado no Internet Explore.
// FireFox e Safari foram os primeiros navegadores com suporte para preenchimento de string JavaScript 