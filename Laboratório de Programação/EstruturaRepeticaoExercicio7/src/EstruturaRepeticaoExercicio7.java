import java.util.Scanner;

public class EstruturaRepeticaoExercicio7 
{

	public static void main(String[] args)
	{
		int i;
		Scanner teclado = new Scanner(System.in);
		
		int vetA[] = new int [5];
		int vetB[] = new int [5];
		
		for (i = 0; i < 5; i++)
		{
			System.out.print("vetA[]: Informe o " + (i+1) + "° elemento: ");
			vetA[i] = teclado.nextInt();
			System.out.print("vetB[]: Informe o " + (i+1) + "° elemento: ");
			vetB[i] = teclado.nextInt();
		}
		System.out.print("vetA[]= ");
		for (i = 0; i < 5; i++)
			System.out.print(vetA[i] + ", ");
		System.out.print("vetB[]= ");
		for (i = 0; i < 5; i++)
			System.out.print(vetB[i] + ", ");
		
		/*
		int N, i;
		boolean primo; 
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor de N (N>1): ");
		N = teclado.nextInt();
		
		//assuma que o número N seja primo
		primo = true;
		
		// para i iniciando em 2 (pq n precisa iniciar no =1), até o numero N, indo de 1 em 1
		for (i = 2; i < N; i++)
			if (N % i == 0)
			{
				primo = false;
		        break;
			}
		
		System.out.println("i= " + i);
		
		if (primo == true)
			System.out.print("O número " + N + " É um número primo.");
		else
			System.out.print("O número " + N + " Não É um número primo.");

		teclado.close();
		*/
	}
}
