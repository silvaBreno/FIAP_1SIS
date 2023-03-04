import java.util.Scanner;

public class MetExe2 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int x, y, soma;
		
		System.out.print("Informe o 1º número: ");
		x = entrada.nextInt();
		System.out.print("Informe o 2º número: ");
		y = entrada.nextInt();
		
		soma = soma_intervalo( x, y);
		System.out.println("soma do intervalo [" + x + "," + y + "]= " + soma);
		
        entrada.close();
	}

	public static int soma_intervalo(int a, int b)
	{
		int aux, soma, i;
		
		if (a > b)
		{
			aux =a;
			a = b;
			b = aux;
			
		}	
			
		soma = 0;
		for (i = a; i <= b; i++)
			soma = soma + i;
		
		return soma;
	}
	
}
