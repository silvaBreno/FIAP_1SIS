import java.util.Random;
import java.util.Scanner;

public class GlbSolSem2 {

	public static final int DESLOCAMENTO_CIFRA = 3;

	public static final int CADASTRAR = 1;
	public static final int RELATORIO = 2;
	public static final int PESQUISA = 3;
	public static final int SAIR = 4;

	public static final int BOVINO = 1;
	public static final int SUINO = 2;
	public static final int CAPRINO = 3;

	public static final int TAM_MAX = 99999;
	public static final int TAMANHO_ALFABETO = 26;

	public static class Animal {
		public int tipo;
		public String codigo;
		public String raca;
		public double peso;
		public int idade;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao, contadorAnimal = 0;
		boolean sair = false;
		Animal animais[] = new Animal[TAM_MAX];

		do {
			System.out.print("Bem vindo ao sistema de cadastro de animais: ");
			System.out.print("\n1 - Cadastrar");
			System.out.print("\n2 - Relatório");
			System.out.print("\n3 - Pesquisa");
			System.out.print("\n4 - Sair");
			System.out.print("\nInforme sua opção: ");

			try {
				opcao = teclado.nextInt();

				switch (opcao) {
				case CADASTRAR:
					animais[contadorAnimal] = cadastraAnimal(teclado, animais, contadorAnimal);
					contadorAnimal++;
					break;
				case RELATORIO:
					exibeRelatorio(animais, contadorAnimal);
					break;
				case PESQUISA:
					trataPesquisa(animais, contadorAnimal, teclado);
					break;
				case SAIR:
					sair = true;
					System.out.println("Execução Encerrada.");
					break;
				default:
					System.out.print("Opção INVÁLIDA! Tente Novamente...");
				}
			} catch (Exception e) {
				System.out.println("!!! Exceção !!!");
				System.out.println("Mensagem: " + e.getMessage());
				e.printStackTrace(System.out);
			}

		} while (!sair);

		teclado.close();
	}

	public static Animal cadastraAnimal(Scanner teclado, Animal animais[], int contadorAnimal) {
		int tipoAnimal;
		Animal animal = new Animal();
		boolean tipoInvalido = true;

		do {
			System.out.print("\nQual o tipo do animal: ");
			System.out.print("\n1 - Bovino");
			System.out.print("\n2 - Suíno");
			System.out.print("\n3 - Caprino");
			System.out.print("\nTipo: ");
			tipoAnimal = teclado.nextInt();

			tipoInvalido = tipoAnimal != BOVINO && tipoAnimal != CAPRINO && tipoAnimal != SUINO;
			if (tipoInvalido) {
				System.out.println("O tipo informado é inválido.");
			}
		} while (tipoInvalido);

		teclado.nextLine();
		System.out.println("Cadastro de animal: ");
		animal.tipo = tipoAnimal;
		System.out.print("Informe a raça: ");
		animal.raca = teclado.nextLine();
		System.out.print("Informe o peso(kg): ");
		animal.peso = teclado.nextDouble();
		System.out.print("Informe a idade: ");
		animal.idade = teclado.nextInt();
		animal.codigo = geraCodigo(tipoAnimal, animais, contadorAnimal);
		System.out.println("Cadastro do animal " + animal.codigo + " (de código criptografado "
				+ deslocarLetras(animal.codigo, true) + ") " + "finalizado.\n");

		return animal;
	}

	public static String geraCodigo(int tipoAnimal, Animal animais[], int contadorAnimal) {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		String codigo;
		int i, aleatoria;
		boolean codigoRepetido = false;

		do {
			codigo = new String();

			if (tipoAnimal == BOVINO) {
				codigo += "BO";
			} else if (tipoAnimal == SUINO) {
				codigo += "SU";
			} else {
				codigo += "CA";
			}

			for (i = 0; i < 3; ++i) {
				aleatoria = r.nextInt(letras.length());
				codigo += letras.charAt(aleatoria);
			}

			for (i = 0; i < contadorAnimal; ++i) {
				if (animais[i].codigo == codigo) {
					codigoRepetido = true;
					break;
				}
			}
		} while (codigoRepetido);

		return codigo;
	}

	public static void exibeRelatorio(Animal animais[], int contadorAnimal) {
		int i;

		System.out.println("\n-------------Relatório-------------\n");
		for (i = 0; i < contadorAnimal; ++i) {
			exibeDados(animais[i]);
			System.out.println("-----------------------------------");
		}
		System.out.println();
	}

	public static void exibeDados(Animal animal) {
		System.out.print("Tipo: ");
		switch (animal.tipo) {
		case BOVINO:
			System.out.print("Bovino");
			break;
		case SUINO:
			System.out.print("Suíno");
			break;
		case CAPRINO:
			System.out.print("Caprino");
			break;
		}
		System.out.print("\nCódigo: " + animal.codigo);
		System.out.print("\nCódigo criptografado: " + deslocarLetras(animal.codigo, true));
		System.out.print("\nRaça: " + animal.raca);
		System.out.print("\nIdade: " + animal.idade);
		System.out.println("\nPeso: " + animal.peso + " kg");
	}

	public static String deslocarLetras(String texto, Boolean direita) {
		int i, valorASCII;
		char[] caracteres = texto.toCharArray();
		String cifra = new String();

		for (i = 0; i < caracteres.length; ++i) {
			valorASCII = caracteres[i] + (direita ? DESLOCAMENTO_CIFRA : DESLOCAMENTO_CIFRA * -1);
			if (valorASCII >= 91) {
				valorASCII -= TAMANHO_ALFABETO;
			}
			if (valorASCII <= 64) {
				valorASCII += TAMANHO_ALFABETO;
			}
			cifra += (char) valorASCII;
		}

		return cifra;
	}

	public static int pesquisa(String crypt, Animal animais[], int contadorAnimal) {
		int i;
		String codigoBuscado = deslocarLetras(crypt, false);

		for (i = 0; i < contadorAnimal; ++i) {
			if (codigoBuscado.equals(animais[i].codigo)) {
				return i;
			}
		}

		return -1;
	}

	public static void trataPesquisa(Animal animais[], int contadorAnimal, Scanner teclado) {
		String crypt;

		System.out.println("\n-------------Pesquisa--------------\n");

		teclado.nextLine();
		System.out.print("Informe o código criptografado a ser pesquisado: ");
		crypt = teclado.nextLine();

		int posicaoAnimal = pesquisa(crypt, animais, contadorAnimal);

		if (posicaoAnimal == -1) {
			System.out.println("O animal não está cadastrado.");
		} else {
			System.out.println("Dados do animal pesquisado:");
			exibeDados(animais[posicaoAnimal]);
			System.out.println();
		}
	}

}
