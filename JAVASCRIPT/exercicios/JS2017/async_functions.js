/**
 * Espera um tempo limite
 */

async function myDisplay() {
  let myPromise = new Promise(function (resolve) {
    setTimeout(function () { resolve("I love You !!"); }, 3000);
  });

  console.log(
    await myPromise
  );
}

myDisplay()

// Chrome e FireFox foram os primeiros navegadores com suporte para funções JavaScript assincronas.