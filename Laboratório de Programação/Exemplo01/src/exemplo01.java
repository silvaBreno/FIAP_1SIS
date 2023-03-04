import java.util.Scanner;

public class exemplo01
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int [5];
		int i;
				
		for(i = 0; i < vetor.length; i++) {
		System.out.print("Informe os valores que preenchem o vetor: ");
		vetor[i] = teclado.nextInt();
		}
		
		
		
		System.out.print("O vetor informado é = ");
		
		for(i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + ", ");
		}		
		
				
		teclado.close();
	}

}
