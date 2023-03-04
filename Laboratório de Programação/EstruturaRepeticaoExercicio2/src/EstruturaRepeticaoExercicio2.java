import java.util.Scanner;

public class EstruturaRepeticaoExercicio2 
{

	public static void main(String[] args) 
	{
		int N;
		Scanner teclado = new Scanner(System.in);
		
		//E && OU 
		
		do
		{
		System.out.print("Informe o valor de N (N>0): ");
		N = teclado.nextInt();
		} while (N <=0);
		
		
		System.out.println("N= " + N);
		teclado.close();

	}

}
