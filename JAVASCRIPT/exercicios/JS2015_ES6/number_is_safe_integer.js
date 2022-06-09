/**
 * Um inteiro seguro é um inteiro que pode ser representado exatamente como um número de precisão dupla.
 * O método Number.isSafeInteger() retorna true se o argumento for um inteiro seguro.
 */

console.log(
  Number.isSafeInteger(10),   // retorna true
  Number.isSafeInteger(12345678901234567890)  // retorna false
);

// Inteiros seguros são todos os inteiros de -(2^53 - 1) a +(2^53 - 1).
// Isto é seguro: 9007199254740991. Isto não é seguro: 9007199254740992.