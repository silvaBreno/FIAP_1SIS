//botão e evento sincronizados
document.querySelector(`#insereConteudo`).addEventListener(`click`, function () {

    //pegar o que foi digitado - NAO ESQUECER QUE O CONTEUDO DIGITADO FINA NO VALUE
    const novosDados = document.querySelector(`#novosDados`).value;

    //vou recuperar a diov que receberá os dados digitados
    const pegaDiv = document.querySelector(`#novaTag`);

    //criar uma tag h2 no JS
    const novoH2 = document.createElement(`h2`);

    //atribuir ao elemento h2(criado) o texto que foi digitados
    novoH2.textContent = novosDados

    //posso colocar classe CSS
    novoH2.classList.add(`bg-primary`, `text-light`, `p-5`)

    // atribuir o novoH2 à pegaDiv(div do html)
    pegaDiv.appendChild(novoH2);

})