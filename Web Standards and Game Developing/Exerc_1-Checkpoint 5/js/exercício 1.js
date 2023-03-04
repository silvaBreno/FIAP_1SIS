console.log(`------------exercício 1-a ------------------`);

const vetorA = [];

for(let i = 0; i <= 19; i++){
    vetorA.push(Math.floor(Math.random()*100));
}

console.log(`vetorA[] = ${vetorA}`);
console.table(vetorA);

console.log(`------------exercício 1-b ------------------`);

const vetorB = [];

for(let i = 0; i <= 19; i++){
    vetorB.push(vetorA[i] * (-1));
}

console.log(`vetorB[] = ${vetorB}`);
console.table(vetorB);

console.log(`------------exercício 1-c ------------------`);

const vetorC = [];

for(let i = 0; i <= 19; i++){
    vetorC.push(vetorA[i] + 1);
}

console.log(`vetorC[] = ${vetorC}`);
console.table(vetorC);

console.log(`------------exercício 1-d ------------------`);

const vetorD = [];

for(let i = 0; i <= 19; i++){
    vetorD.push(vetorA[i] - 1);
}

console.log(`vetorD[] = ${vetorD}`);
console.table(vetorD);

console.log(`------------exercício 1-e ------------------`);

console.log(`vetorA[] Original = ${vetorA}`);

const vetorE = [];

for(let i = 0; i < vetorA.length; i++){
    
    if (vetorA[i] % 2 === 0){
        vetorE.push(vetorA[i]);
    }
}

console.log(`vetorE[] = ${vetorE}`);

console.log(`------------exercício 1-f ------------------`);

const vetorF = [];

for(let i = 0; i < vetorA.length; i++){
    
    if (vetorA[i] % 2 !== 0){
        vetorF.push(vetorA[i]);
    }
    
}
console.log(`vetorF[] = ${vetorF}`);

let total = 0;

for (let i = 0; i < vetorF.length; i++){
    total += vetorF[i];
}

console.log(`Soma Números Ímpares = ${total}`);