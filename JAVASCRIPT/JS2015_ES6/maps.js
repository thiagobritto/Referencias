/**
 * ser capaz de usar um objeto como chave é um importante recurso do Mapa
 */

// criando objetos

const apples = {name: 'Apples'}
const bananas = {name: 'Bananas'}
const oranges = {name: 'Oranges'}

// criando um novo mapa

const fruits = new Map()

// adicionando novos elemento para o mapa

fruits.set(apples, 500)
fruits.set(bananas, 300)
fruits.set(oranges, 200)

console.log(fruits);