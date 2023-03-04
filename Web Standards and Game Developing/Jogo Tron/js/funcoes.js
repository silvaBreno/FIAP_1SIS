let player1Ganhou = false;
let player2Ganhou = false;

let colisaoContador = 0;

const player1Barra = document.querySelector(`#barra-player1`);
const player2Barra = document.querySelector(`#barra-player2`);

(function () {
  const cnv = document.querySelector('#canvas');
  const ctx = cnv.getContext('2d');
  const img_1 = new Image(0, 0);
  const img_2 = new Image(0, 0);
  const img_3 = new Image(0, 0);

  img_1.src = './images/tie-fighter.png';
  img_2.src = './images/death-star.png';
  img_3.src = './images/x-wing.png';

  let player1moverEsquerda = false;
  let player1moverCima = false;
  let player1moverDireita = false;
  let player1moverBaixo = false;

  let player2moverEsquerda = false;
  let player2moverCima = false;
  let player2moverDireita = false;
  let player2moverBaixo = false;

  const quadrados = [];

  let player1;
  let obstaculo;
  let player2;

  function inicializa() {
    quadrados.splice(0);
    colisaoContador = 0;
    player1 = new Quadrado(50, 20, 100, 100, 1, 5, 100);
    quadrados.push(player1);

    obstaculo = new Quadrado(150, 220, 110, 110, 2, 0, 0);
    quadrados.push(obstaculo);

    player2 = new Quadrado(850, 380, 100, 90, 3, 5, 100);
    quadrados.push(player2);

    atualizaPlacar();
  }
  inicializa();

  window.addEventListener('keydown', function (bananinha) {
    const key = bananinha.key;
    switch (key) {
      case 'ArrowLeft':
        player1moverEsquerda = true;
        break;
      case 'ArrowUp':
        player1moverCima = true;
        break;
      case 'ArrowRight':
        player1moverDireita = true;
        break;
      case 'ArrowDown':
        player1moverBaixo = true;
        break;
      case 'a':
        player2moverEsquerda = true;
        break;
      case 'w':
        player2moverCima = true;
        break;
      case 'd':
        player2moverDireita = true;
        break;
      case 's':
        player2moverBaixo = true;
        break;
    }
  });

  window.addEventListener('keyup', (e) => {
    const key = e.key;
    switch (key) {
      case 'ArrowLeft':
        player1moverEsquerda = false;
        break;
      case 'ArrowUp':
        player1moverCima = false;
        break;
      case 'ArrowRight':
        player1moverDireita = false;
        break;
      case 'ArrowDown':
        player1moverBaixo = false;
        break;
      case 'a':
        player2moverEsquerda = false;
        break;
      case 'w':
        player2moverCima = false;
        break;
      case 'd':
        player2moverDireita = false;
        break;
      case 's':
        player2moverBaixo = false;
        break;
    }
  });

  function moverQuadrados() {
    if (player1moverEsquerda && !player1moverDireita) {
      player1.posX -= player1.velocidade;
    }
    if (player1moverDireita && !player1moverEsquerda) {
      player1.posX += player1.velocidade;
    }
    if (player1moverCima && !player1moverBaixo) {
      player1.posY -= player1.velocidade;
    }
    if (player1moverBaixo && !player1moverCima) {
      player1.posY += player1.velocidade;
    }
    if (player2moverEsquerda && !player2moverDireita) {
      player2.posX -= player2.velocidade;
    }
    if (player2moverDireita && !player2moverEsquerda) {
      player2.posX += player2.velocidade;
    }
    if (player2moverCima && !player2moverBaixo) {
      player2.posY -= player2.velocidade;
    }
    if (player2moverBaixo && !player2moverCima) {
      player2.posY += player2.velocidade;
    }

    player1.posX = Math.max(0, Math.min(cnv.width - player1.width, player1.posX));
    player1.posY = Math.max(0, Math.min(cnv.height - player1.height, player1.posY));
    player2.posX = Math.max(0, Math.min(cnv.width - player2.width, player2.posX));
    player2.posY = Math.max(0, Math.min(cnv.height - player2.height, player2.posY));
  }

  function exibirQuadrados() {
    ctx.clearRect(0, 0, cnv.width, cnv.height);
    for (const i in quadrados) {
      const spr = quadrados[i];
      if (spr.id === 1) {
        ctx.drawImage(img_1, spr.posX, spr.posY, spr.width, spr.height);
      }
      if (spr.id === 2) {
        ctx.drawImage(img_2, spr.posX, spr.posY, spr.width, spr.height);
      }
      if (spr.id === 3) {
        ctx.drawImage(img_3, spr.posX, spr.posY, spr.width, spr.height);
      }
    }
  }

  function colisao(objeto1, objeto2) {
    if ((objeto1.posX + objeto1.width >= objeto2.posX && objeto1.posX <= objeto2.posX + objeto2.width) &&
      (objeto1.posY + objeto1.height >= objeto2.posY && objeto1.posY <= objeto2.posY + objeto2.height)) {
      retirarVida(objeto1);
      retirarVida(objeto2);
      colisaoContador++;
      atualizaPlacar();
      return true;
    }
    return false;
  }

  function detectarColisao() {
    colisao(player1, player2);
    colisao(player1, obstaculo);
    colisao(player2, obstaculo);
  }

  function atualizaPlacar() {
    player1Barra.style.width = `${player1.life}%`;
    player1Barra.textContent = `${player1.life.toFixed(0)}%`;
    player2Barra.style.width = `${player2.life}%`;
    player2Barra.textContent = `${player2.life.toFixed(0)}%`;
  }

  function verificaVencedor() {
    if (player1.life < player2.life && colisaoContador === 5) {
      player2Ganhou = true;
    } else if (player2.life < player1.life && colisaoContador === 5) {
      player1Ganhou = true;
    }
  }

  function retirarVida(objeto) {
    objeto.life -= Math.random() * 20;
    if (objeto.life < 0) {
      objeto.life = 0;
    }
    objeto.posX = objeto.initialPosX;
    objeto.posY = objeto.initialPosY;
  }

  function exibirResultado() {
    Swal.fire({
      title: `Player ${player1Ganhou ? '1' : '2'} ganhou`,
      imageUrl: `./images/giphy-winner.gif`,
      imageWidth: 250,
      imageHeight: 250,
      imageAlt: 'Custom image',
      confirmButtonText: 'Tentar Novamente',
      background: '#fff url(https://sweetalert2.github.io/images/trees.png)',
      backdrop: `
      rgba(0,0,123,0.4)
      url("https://sweetalert2.github.io/images/nyan-cat.gif")
      left top
      no-repeat
      `
    }).then((result) => {
      if (result.isConfirmed) {
        inicializa();
        player1Ganhou = false;
        player2Ganhou = false;
        atualizarTela();
      }
    })
  }

  function atualizarTela() {
    moverQuadrados();
    exibirQuadrados();
    detectarColisao();
    verificaVencedor();
    if (!player1Ganhou && !player2Ganhou) {
      window.requestAnimationFrame(atualizarTela, cnv);
    } else {
      exibirResultado();
    }
  }
  atualizarTela();
}());