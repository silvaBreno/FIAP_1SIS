const vetor = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',      'L','M', 'N', 'O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '&', '*'];

let senha = 0;
let senhaAleatoria = '';

for(let i = 0; i <= 19 ; i++) {
    senha = Math.floor(Math.random()*vetor.length);
    senhaAleatoria += vetor[senha]; 
}

console.log(`Senha aleatória = ${senhaAleatoria}`);
