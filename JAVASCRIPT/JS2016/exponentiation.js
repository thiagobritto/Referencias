/**
 * O operador de exponenciação (**) eleva o primeiro operando à potência do segundo operando
 */

let x = 5
let z = x ** 2

console.log(
  "** ",
  z // retorna 25
)

// x ** y produz o mesmo resultado que Math.pow(x, y)

{
  let x = 5
  let z = Math.pow(x, 2)

  console.log(
    "Math.pow() ",
    z // retorna 25
  )
}