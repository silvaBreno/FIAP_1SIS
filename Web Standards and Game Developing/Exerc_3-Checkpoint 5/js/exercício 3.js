const FORÇA = [];
const AGILIDADE = [];
const DANO = [];
let XP = [];
let CLASSIFICAÇÃO = '';

FORÇA.push(Math.floor(Math.random()*10));
AGILIDADE.push(Math.floor(Math.random()*10));
DANO.push(Math.floor((Math.random()*10)+1));

XP = (FORÇA*AGILIDADE)/DANO; 

if(XP <= 9.0){
    CLASSIFICAÇÃO = 'PÉSSIMO';
}else if(XP <= 18.0){
    CLASSIFICAÇÃO = 'RUIM';
} else if(XP <= 27.0){
    CLASSIFICAÇÃO = 'NORMAL';
}else if(XP <= 36.0){
    CLASSIFICAÇÃO = 'BOM';
}else {
    CLASSIFICAÇÃO = 'ÓTIMO';
}

console.log(`FORÇA =  ${FORÇA} / AGILIDADE = ${AGILIDADE} / DANO = ${DANO} / XP OBTIDO =  ${XP} / CLASSIFICAÇÃO = ${CLASSIFICAÇÃO}`);
