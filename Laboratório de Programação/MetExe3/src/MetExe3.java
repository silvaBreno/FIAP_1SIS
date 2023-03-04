import java.util.Scanner;

public class MetExe3 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
				int A,B, C, soma;
		
		System.out.print("Informe o valor de A: ");
		A = entrada.nextInt();
		System.out.print("Informe o valor de B: ");
		B = entrada.nextInt();
		System.out.print("Informe o valor de C: ");
		C = entrada.nextInt();
		
		soma = somaMultiplos(A, B, C);
		System.out.println("Soma dos Múltiplos de A em [B, C]= " + soma);

		entrada.close();
	}
	
	public static int somaMultiplos(int A, int B, int C)
	{
		int soma, i;
		
		soma = 0;
		for(i = B; i <= C; i++)
			if (i % A == 0)
				soma = soma + i;
		
		return soma;
	}

	
}
