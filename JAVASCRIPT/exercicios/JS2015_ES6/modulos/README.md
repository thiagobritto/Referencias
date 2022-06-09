# Módulos

Os modulos JavaScript permitem que você divida seu codigo em arquivos separados.

Isso facilita a manutenção da base de código.

Os modulos JavaScript dependem das instruções `import` e `export`.

## Exportar

Você pode exportar uma função ou variável de qualquer arquivo.

Vamos criar um arquivo chamado `person.js` e preenchê-lo com as coisas que queremos exportar.

Existem dois tipos de exportação: Nomeado e padrão.

## Exportações nomeadas

Você pode criar exportações nomeadas de duas maneiras.

In-line individualmente, ou todas de uma vez na parte inferior.

### Em linha individualmente

`person.js`

```javascript
export const name = "John"
export const age = 40
```

### Tudo de uma vez na parte inferior

`person.js`

```javascript
const name = "John"
const age = 40

export {name, age}
```

## Exportação padrão

Vamos criar um arquivo chamado `message.js`, e usá-lo para demonstrar a exportação padrão.

Você só pode ter uma exportação padrão em um arquivo.

### Exemplo

`message.js`

```javascript
const message = () => {
  const name = "John"
  const age = 40
  return name + ' is ' + age + ' years old.'
}

export default message
```

## Importar

Você pode importar módulos de duas maneiras, com base no nome de exportação ou exportação padrão.

As exportações nomeadas são consumidas usando chaves.

As exportações padrão não são.

### Importar de exportações nomeadas

importe exportações nomeadas do arquivo person.js:

```javascript
import {name, age} from './person.js'
```

### Importar de exportações padrão

Importe uma exportação padrão de arquivo message.js:

```javascript
import message from './message.js'
```
