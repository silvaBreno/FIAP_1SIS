import java.util.Random;

public class subCadeias1SISExe1 {
	public static final int ALFABETO = 26;
	public static final int LETRAS = 7;

	public static void main(String[] args) {
		String cadeia = new String();
		int tamanho, i, contador, max, posicao, p;

		cadeia = gerarCadeia();
		tamanho = cadeia.length();

		max = 0;
		contador = 1;
		posicao = 0;
		p = 0;
		for (i = 0; i < tamanho - 1; i++) {
			if (cadeia.charAt(i) == cadeia.charAt(i + 1))
				contador++;
			else {
				if (contador > max) {
					max = contador;
					posicao = p;
				}

				p = i + 1;
				contador = 1;
			}
		}

		if (contador > max) {
			max = contador;
			posicao = p;
		}

		System.out.println();
		System.out.println("cadeia: " + cadeia);
		System.out.print("\nMAIOR sequência " + max + " caracteres, ");
		for (i = posicao; i < posicao + max; i++)
			System.out.print(cadeia.charAt(i));
	}

	public static String gerarCadeia() {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		String cadeia = new String();
		int i, j, letra, N;
		int quantidades[] = new int[LETRAS];
		Random r = new Random();

		for (i = 0; i < LETRAS; i++) {
			quantidades[i] = r.nextInt(10) + 1;
			for (j = 0; j < i; j++)
				if (quantidades[j] == quantidades[i]) {
					i--;
					break;
				}
		}

		for (i = 0; i < LETRAS; i++) {
			letra = r.nextInt(ALFABETO);
			N = quantidades[i];
			for (j = 0; j < N; j++)
				cadeia = cadeia + letras.charAt(letra);
		}

		return cadeia;
	}
}