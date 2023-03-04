import java.util.Scanner;

public class Sprt1 {

	public final static int FRENTE = 1;
	public final static int DIREITA = 2;
	public final static int BAIXO = 3;
	public final static int ESQUERDA = 4;

	public static void main(String[] args) {
		int direcao, distancia, comando = 1;
		boolean comandoValido = false, missaoAbortada = false;
		Scanner in = new Scanner(System.in);

		System.out.println("- Para ir para FRENTE digite o número 1");
		System.out.println("- Para ir para DIREITA digite o número 2");
		System.out.println("- Para ir para BAIXO digite o número 3");
		System.out.println("- Para ir para ESQUERDA digite o número 4");

		while (!comandoValido) {
			System.out.println("\n" + comando + "° comando");
			System.out.print("Digite a direção: ");
			direcao = in.nextInt();
			System.out.print("Digite a distância: ");
			distancia = in.nextInt();
			comandoValido = (direcao == FRENTE || direcao == DIREITA || direcao == BAIXO || direcao == ESQUERDA)
					&& (distancia > 0);

			if (comandoValido) {
				comando++;
				if (direcao == FRENTE && distancia == 7) {
					System.out.println("Comando bem sucedido!");
					comandoValido = false;
					while (!comandoValido) {
						System.out.println("\n" + comando + "° comando");
						System.out.print("Digite a direção: ");
						direcao = in.nextInt();
						System.out.print("Digite a distância: ");
						distancia = in.nextInt();
						comandoValido = (direcao == FRENTE || direcao == DIREITA || direcao == BAIXO
								|| direcao == ESQUERDA) && (distancia > 0);

						if (comandoValido) {
							comando++;
							if (direcao == DIREITA && distancia == 11) {
								System.out.println("Comando bem sucedido!");
								comandoValido = false;
								while (!comandoValido) {
									System.out.println("\n" + comando + "° comando");
									System.out.print("Digite a direção: ");
									direcao = in.nextInt();
									System.out.print("Digite a distância: ");
									distancia = in.nextInt();
									comandoValido = (direcao == FRENTE || direcao == DIREITA || direcao == BAIXO
											|| direcao == ESQUERDA) && (distancia > 0);

									if (comandoValido) {
										comando++;
										if (direcao == FRENTE && distancia == 8) {
											System.out.println("Comando bem sucedido!");
											comandoValido = false;
											while (!comandoValido) {
												System.out.println("\n" + comando + "° comando");
												System.out.print("Digite a direção: ");
												direcao = in.nextInt();
												System.out.print("Digite a distância: ");
												distancia = in.nextInt();
												comandoValido = (direcao == FRENTE || direcao == DIREITA
														|| direcao == BAIXO || direcao == ESQUERDA) && (distancia > 0);

												if (comandoValido) {
													comando++;
													if (direcao == ESQUERDA && distancia == 12) {
														System.out.println("Comando bem sucedido!");
														comandoValido = false;
														while (!comandoValido) {
															System.out.println("\n" + comando + "° comando");
															System.out.print("Digite a direção: ");
															direcao = in.nextInt();
															System.out.print("Digite a distância: ");
															distancia = in.nextInt();
															comandoValido = (direcao == FRENTE || direcao == DIREITA
																	|| direcao == BAIXO || direcao == ESQUERDA)
																	&& (distancia > 0);

															if (comandoValido) {
																comando++;
																if (direcao == FRENTE && distancia == 8) {
																	System.out.println("Missão bem sucedida!");
																} else {
																	missaoAbortada = true;
																}
															}
														}
													} else {
														missaoAbortada = true;
													}
												}
											}
										} else {
											missaoAbortada = true;
										}
									}
								}
							} else {
								missaoAbortada = true;
							}
						}
					}
				} else {
					missaoAbortada = true;
				}
			}
		}

		if (missaoAbortada) {
			System.out.println("Missão abortada!");
		}

		in.close();
	}

}
