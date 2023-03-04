// criamos a função
function primeiraMensagem() {
    // corpo da função
    console.log(`Olá, eu sou uma função!!!!`);    
    console.log(`Estou sendo chamada!!!!`);    
}
// chamada da função
primeiraMensagem();

// parâmetros para a função ----------- turma é meu parametro
function segundaMensagem(turma){
    console.log(`Olá ${turma}, sou uma função!!!`);
}

// na chamada da funcao - argumento 
segundaMensagem('1SIS');
segundaMensagem(34212);
segundaMensagem(true);

// funções com retorno
function multiplicaValores(valor1, valor2){
    const resultado = valor1*valor2;
    return resultado;
}

console.log(`Multiplicando 5 x 5 = ${multiplicaValores(5,5)}`);
console.log(`Multiplicando 5 x 5 = ${multiplicaValores(5,15)}`);
console.log(`Multiplicando 5 x 5 = ${multiplicaValores(5,25)}`);
console.log(`Multiplicando 5 x 5 = ${multiplicaValores(5,35)}`);

let multiplica = multiplicaValores(8,9);
console.log(multiplica);

multiplica*=10;
console.log(multiplica);

//funções anônimas
const media = function(nota1, nota2){
    //const resultado = (n1 + n2)/2;
    //return resultado;

    //posso usar a funcao anterior, mas segundo o professor vamos encontrar com mais facilidade a funcao abaixo;

    return (nota1+nota2)/2;
}

console.log(`Média = ${media(8,9)}`);


//Arrow Function ou Função Flecha
//os parametros vem na frente!!! Ele vai entender que o fato de vc ter colocar a seta, significa q vc chamou uma função
const mediaFiap = (notaPrimeiroSemestre=0, notaSegundoSemestre=0) =>{

    return (notaPrimeiroSemestre*0.4 + notaSegundoSemestre*0.6);
}

console.log(`Média Web = ${mediaFiap(8,9)}`);
console.log(`Média Algoritmos = ${mediaFiap(7,7)}`);
//toFixed - ele vai setar quantas casas decimais vc quer;
console.log(`Média Resolução = ${mediaFiap(6,7).toFixed(1)}`);
console.log(`Média Circuitos = ${mediaFiap(6,8)}`);



