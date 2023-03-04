function mensagem(){
    alert(`Olá você me chamou!!!`);
}

//mensagem();

// Queremos que a função seja executada através de algum evento tenha disparado pelo usuário
// Eventos = abrir /ou fechar janela - mover o Mouse
// dar um click - dar um duplo click - passar mouse sobre algum elemento - pressionam a tecla - soltam a tecla
// Aplicar eventos à uma função, para isso temos: 

// 1-pegar o elemento html que queremos atribuir o evento
// 2-definir um escutador de eventos 
// 3-definir qual o evento desejado
// 4- chamar a função desejada

//-------------1-----------------------2------------3--------4
document.querySelector(`#btn-1`).addEventListener(`click`,mensagem);
document.querySelector(`#btn-2`).addEventListener(`dblclick`,mensagem);
document.getElementById(`btn-3`).addEventListener(`mouseover`,mensagem);
document.getElementById(`btn-4`).addEventListener(`mouseout`,mensagem);