import java.util.Scanner;

public class MetProgEstruturadaExe2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[5];
		int i ;
				
		for(i = 0; i < vetor.length; i++) {
			System.out.print("Entre com o valor da " + (1+i) + "ª posição: ");
			vetor[i] = teclado.nextInt();
		}
		
		System.out.println();
		System.out.print("vetor[antes]: ");
		for (i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + ", ");
		
		
		retornaQuadrados(vetor);
		
		System.out.println();
		System.out.print("\nvetor[depois]: ");
		
		for(i = 0; i < vetor.length; i++) 
		{
			System.out.print( vetor[i] + ", ");
		}
		
		teclado.close();
	}
	
	public static void retornaQuadrados (int[] vet)
	{
		int i;
		
		for (i = 0; i< vet.length; i++) 
		{
			vet[i] = vet[i]*vet[i];
			
				
		}
				
	}
		
		
	 
	
	
}
