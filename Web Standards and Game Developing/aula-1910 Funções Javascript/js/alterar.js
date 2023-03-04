// pegar o botao e criar um função para substituir o texto

document.querySelector(`#alterarConteudo`).addEventListener(`click`,() => {
    
    //recuperar o id dados pois é onde o usuario escreveu 
    // quando pegamos um elemento do html ele pega tudo do elemento
    // para pegar o que foi digitado use .value
    const novosDados = document.querySelector(`#dados`).value;
    //utilizei o console.log aqui apenas para verificar oq ele estava pegando quando estava sem o .value (no caso ele estava pegando o input e não oq estava contido dentro dele)
    //console.log(novosDados);

    //passar conteudo digitado para a div
    document.querySelector(`#conteudo`).textContent = novosDados;

})


