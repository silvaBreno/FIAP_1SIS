
let string = 'JavaScript é uma linguagem de programação fantástica, estudem por favor!!!!!!';
console.log(string);

//propriedade de tamanho da string;
console.log(`Tamanho da string = ${string.length}`);

//propriedade de letras maiusculas
console.log(`${string.toUpperCase()}`);

//propriedade de letras minusculas
console.log(`${string.toLowerCase()}`);

//o que tem em um determinada posicao na string
console.log(`${string.charAt(4)}`);
console.log(`${string[3]}`);

//buscar uma substring - (valor inicial - valor final)
console.log(`${string.substring(3,8)}`);

//procurar caracter - ele retorna apenas o primeiro que ele encontra
console.log(`${string.indexOf('a')}`);
console.log(`${string.indexOf('Z')}`);

//separar string por caracter
//se passar um valor ele retorna como a quantidade de elementos do Array -> ex? string.split('', 4)
let stringSeparada = string.split(' ');
console.log(stringSeparada);