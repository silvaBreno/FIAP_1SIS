
// MONTA OS QUADRADOS(ROBÔS E OBSTÁCULOS)
const Quadrado = function (posX, posY, width, height, id, velocidade, life) {
    this.posX = posX;
    this.posY = posY;
    this.width = width;
    this.height = height;
    this.id = id;
    this.velocidade = velocidade;
    this.life = life;
    this.initialPosX = posX;
    this.initialPosY = posY;
}