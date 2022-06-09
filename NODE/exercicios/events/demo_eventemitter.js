/**
 * O Node.js é perfeito para aplicativos orientados a eventos.
 */

/**
 * Módulo de eventos
 * 
 * O Node.js tem um módulo integrado, chamado "Events", onde você pode criar, disparar e ouvir seus próprios eventos.
 * 
 * Para incluir o módulo de Eventos integrado, use o método require(). 
 * Além disso, todas as propriedades e métodos de eventos são uma instância de um objeto EventEmitter.
 * Para poder acessar essas propriedades e métodos, crie um objeto EventEmitter:
 * 
 */

var events = require('events');
var eventEmitter = new events.EventEmitter();

/**
 * O objeto EventEmitter
 * 
 * Você pode atribuir manipuladores de eventos aos seus próprios eventos com o objeto EventEmitter.
 * No exemplo abaixo criamos uma função que será executada quando um evento "scream" for acionado.
 * Para disparar um evento, use o método emit().
 */

//Create an event handler:
var myEventHandler = function () {
  console.log('I hear a scream!');
}

//Assign the event handler to an event:
eventEmitter.on('scream', myEventHandler);

//Fire the 'scream' event:
eventEmitter.emit('scream');
