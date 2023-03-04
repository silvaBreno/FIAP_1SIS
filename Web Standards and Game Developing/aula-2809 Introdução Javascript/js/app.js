console.log('Olá');

//criando variáveis
let usuario = 'Fulano de Tal';
let dataNascimento = '02/11/1980';
let logado = true

//fazendo exibição
console.log(usuario, dataNascimento, logado);

console.log('Nome do usuario: '+ usuario);

//Template String
console.log(`Nome usuário ${usuario} data nascimento ${dataNascimento} usuario logado ${logado}`);

usuario = 'Eu mesmo';
console.log(usuario);

//Erro pois é uma constante
//dataNascimento = '05/12/1989';

var noite = true;
console.log(noite, typeof noite);

for(let i = 0; i <= 10; i++){
    console.log(i);

    if(i == 5){
        var j = i;
        console.log(`Valor de j = ${j} `);
    }
}

let i = 100;
console.log(`Valor final de i = ${i}`);
console.log(`Valor final do j = ${j}`);

i = 10000;
console.log(`Valor final de i = ${i}`);
