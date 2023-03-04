import java.util.Scanner;

public class EstruturaRepeticaoExercicio23
{

	public static void main(String[] args)
	{
		int opcao;
		boolean sair = false;
		Scanner teclado = new Scanner(System.in);
		
		do
		{ //identacao
		System.out.println("Digite (1) para exibir o valor de pi.");
		System.out.println("Digite (2) para exibir o valor de e.");
		System.out.println("Digite (3) para exibir o valor de pi.");
		System.out.print("opção=");
		opcao = teclado.nextInt();
		
		switch (opcao)
		{
			case 1:
				System.out.println("pi= "+ Math.PI);
				break;
			case 2:
				System.out.println("e= "+ Math.E);
				break;
			case 3:
				System.out.println("execução encerrada");
				break;
			default:
			System.out.println("Opção INVÁLIDA!");
				
	
		}
		} while (sair == false);
		teclado.close();
	}

}
