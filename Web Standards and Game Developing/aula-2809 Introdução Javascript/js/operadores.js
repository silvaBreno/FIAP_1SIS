let primeiroValor = 13;
let segundoValor = 8;

console.log(primeiroValor, segundoValor);

//operadores aritmétiocos
console.log(`${primeiroValor} + ${segundoValor} = ${primeiroValor + segundoValor}`);
console.log(`${primeiroValor} - ${segundoValor} = ${primeiroValor - segundoValor}`);
console.log(`${primeiroValor} * ${segundoValor} = ${primeiroValor * segundoValor}`);
console.log(`${primeiroValor} / ${segundoValor} = ${primeiroValor / segundoValor}`);
console.log(`${primeiroValor} % ${segundoValor} = ${primeiroValor % segundoValor}`);
// ** potencia = asteristico 
console.log(`${primeiroValor} ** ${segundoValor} = ${primeiroValor ** segundoValor}`);

console.log(`------------------------------------`);

//Operadores Relacionais
let resultado = (primeiroValor > segundoValor);
console.log(`${primeiroValor} > ${segundoValor} = ${resultado}`);

resultado = (primeiroValor < segundoValor);
console.log(`${primeiroValor} < ${segundoValor} = ${resultado}`);

resultado = (primeiroValor >= segundoValor);
console.log(`${primeiroValor} >= ${segundoValor} = ${resultado}`);

resultado = (primeiroValor <= segundoValor);
console.log(`${primeiroValor} <= ${segundoValor} = ${resultado}`);

primeiroValor = 100; 
segundoValor = '100';

console.log(primeiroValor, typeof primeiroValor);
console.log(primeiroValor, typeof segundoValor);
console.log(resultado, typeof resultado);

//PARA NÃO USAR ==
resultado = (primeiroValor == segundoValor);
console.log(`${primeiroValor} == ${segundoValor} = ${resultado}`);

//PARA NÃO USAR !=
resultado = (primeiroValor != segundoValor);
console.log(`${primeiroValor} != ${segundoValor} = ${resultado}`);

//USAR SEMPRE PARA COMPARAR VALORES EM JS
resultado = (primeiroValor === segundoValor);
console.log(`${primeiroValor} === ${segundoValor} = ${resultado}`);

resultado = (primeiroValor !== segundoValor);
console.log(`${primeiroValor} !== ${segundoValor} = ${resultado}`);

console.log(`------------------------------------`);

//Operadores Lógicos
//E (&&) OU(||) NAO(!)

primeiroValor = 25;
segundoValor = 45;

resultado = ((primeiroValor > 20 )||(segundoValor < 40));
console.log(`((${primeiroValor} > 20 )|| ${segundoValor} < 40)) = ${resultado}`);

resultado = ((primeiroValor > 20 ) && (segundoValor < 40));
console.log(`((${primeiroValor} > 20 ) && ${segundoValor} < 40)) = ${resultado}`);

resultado = !((primeiroValor > 20 ) && (segundoValor < 40));
console.log(`!((${primeiroValor} > 20 ) && ${segundoValor} < 40)) = ${resultado}`);

console.log(`------------------------------------`);

//Operadores Unitarios e Atribuicao 

console.log(primeiroValor, segundoValor);

primeiroValor++;
segundoValor--;
console.log(primeiroValor, segundoValor);

primeiroValor-=15;
segundoValor+=10;
console.log(primeiroValor, segundoValor);



let x = 7;
let y = 9;
let w; 

console.log(x,y);


w = (x != 7);
console.log(w);

w = (x != y);

console.log(w);
