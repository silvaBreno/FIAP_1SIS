//Objeto Math;
let numero = 789.654321123456;
console.log(numero, typeof numero);
console.log(`------------------------------`);

// arredondar números
// arrendondar para o próximo número inteiro
//reparar que ele exibe o arredondadmento apenas naquela linha!! ELE NÃO CARREGA O ARREDONDAMENTO
console.log(Math.ceil(numero));
console.log(numero);
console.log(`------------------------------`);

//arrendondar para o próprio numero inteiro - sem casas decimais
console.log(Math.floor(numero));
console.log(numero);
console.log(`------------------------------`);

// arredonda conforme o valor decimal 
// valor decimal entre 0 e 49 - retorna o próprio inteiro 
// valor decimal entre 50 e 99 - retorna o próximo numero inteiro
console.log(Math.round(numero));
console.log(numero);
console.log(`------------------------------`);

//Checkpoint 5
//Sorteia número entre 0 e 1 = 0.56445646
let numeroSorteado = Math.random();
console.log(numeroSorteado);

//Definir uma escala de valores = Usando a matemática
numeroSorteado = Math.random()*100;
console.log(numeroSorteado);
console.log(`------------------------------`);

//checkpouint 5
//numero inteiro
numeroSorteado = Math.floor(Math.random()*100);
console.log(numeroSorteado);
console.log(`------------------------------`);

//Objeto Array(), por boas praticas declaramos como constante
const pessoas = ['Eu', 'Tu', 'Ele','Nós','Vós','Eles', '2', '#','&','*','9'];
console.log(pessoas, typeof pessoas);
console.log(pessoas);
console.log(pessoas[2]);
console.table(pessoas);
console.log(`------------------------------`);

//Duvida da aula
//const h2 = document.querySelector('h2');
//h2.textContent = 'Exemplo';
//console.log(h2);


//Continuando - Checkpoint 5
//inserção do último índice do Array
pessoas.push('Darth Vader');
pessoas.push('Obi Wan');
console.table(pessoas);
console.log(`------------------------------`);

//retira o último indice = APAGA MESMO (NAO CONSIGO RECUPERAR A INFORMAÇÃO)
pessoas.pop(); // retirou o Obi Wan
//ele vai retirar e guardar na variável
let retirado = pessoas.pop(); // retirou o Darth Vader
console.table(pessoas);
console.log(retirado);
console.log(`------------------------------`);

//inserir no primeiro índice
pessoas.unshift('R2-D2');
pessoas.unshift('BB-8');
console.table(pessoas);
console.log(`------------------------------`);

//remover o primeiro índice
pessoas.shift();
console.table(pessoas);
console.log(`------------------------------`);

retirado = pessoas.shift();
console.table(pessoas);
console.log(retirado);
console.log(`------------------------------`);

//excluir e/ou inserir em qualquer posição do Array()
//splice()
console.table(pessoas);
console.log(`------------------------------`);

//Excluir - indice inicial + quantidade de exclusões
pessoas.splice(2,2);
console.table(pessoas);
console.log(`------------------------------`);

//inserir = indice inicial + quantidade de exclusoes +
//os novos valores
pessoas.splice(2,0,'Ele','Nós','Eu mesmo', 'Vocês', 'Todo mundo', 'Todos juntos', 'Mais gente', 'The Beatles');
console.table(pessoas);
console.log(`------------------------------`);

//o metodo delete ele mantem a posicao, por exemplo nesse caso, o index 3 que é do nós fica vazio!! Ele não redefine as posicoes igual ao splice. Se vc olhar no navegador na linha 105 vai aparecer o index 3 como vazio(empty)
//delete pessoas[3];
//console.table(pessoas);
//console.log(pessoas);

//checkpoint 5
const numeros = [];
let total = 0;
//sortear 10 números e colocar em um Array
for (let i = 0; i<=9; i++){
    numeros.push(Math.floor(Math.random()*20));
    total+=numeros[i];
}

console.log(numeros);
console.log(total);

//Checkpoint5
//Sortear 3 pessoas do array pessoas
for(let i = 0; i <=2; i++) {
    let pessoaSorteada = Math.floor(Math.random()*12);
    console.log(pessoas[pessoaSorteada]);
};


// console.log(pessoaSorteada); 














