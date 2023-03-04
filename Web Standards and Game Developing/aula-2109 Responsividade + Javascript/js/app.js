//console - executar comando JS - passar valores - verificar o que ele processou
//EXIBIR ERROS
console.log('Olá, sou JavaScript');
console.log('Sua mensagem');

//variáveis JS NÃO TEM TIPO - TIPAGEM AUTOMÁTICA

let nomeUsuario = 'Fulano de Tal';
let idadeUsuario =  35;
let noite = true;

// exibindo variáveis
console.log(nomeUsuario);
console.log(idadeUsuario);
console.log(noite);

//exibir tipo da variável typeof
console.log(typeof nomeUsuario, nomeUsuario);
console.log(typeof idadeUsuario, idadeUsuario);
console.log(typeof(noite), noite);

// NÃO FAZEMOS ISSO EM JS 
console.log('Olá eu sou o ' + nomeUsuario + ' é noite: ' + noite );

// template String usamos 2 crases ``
console.log(`Oi eu sou o ${nomeUsuario} eu tenho 
${idadeUsuario} anos. Sou um dev. `);




