import java.util.Scanner;

public class EstruturaRepeticaoExercicio1
{

	public static void main(String[] args) 
	{
		int A, B, soma, mult,i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor de A:");
		A = teclado.nextInt();
		
		System.out.print("Informe o valor de B:");
		B = teclado.nextInt();
		
		soma = 0;
		mult = 1;
		
		for (i = A; i <= B; i++)
		{
			if (i % 2 == 0)
			soma = soma + i;  // operador somatória
			else 
		    mult = mult * i;  // operador multiplicação-produtória
		}
	
		System.out.println("soma = " + soma); // 2 + 4 + 6 =  12
		System.out.println("mult = " + mult); // 3 * 5 * 7 = 105
		
        teclado.close();
	}

}
