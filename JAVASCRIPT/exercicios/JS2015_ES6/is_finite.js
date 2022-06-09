/**
 * O método global isFinite() retorna false se o argumento for infiniity ou NaN
 * caso contrario retorna true
 */

console.log(
  isFinite(10/0), // retorna false
  isFinite(10/1)  // retorna true
)
