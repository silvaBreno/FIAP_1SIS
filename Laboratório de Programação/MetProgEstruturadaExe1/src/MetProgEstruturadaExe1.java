import java.util.Scanner;

public class MetProgEstruturadaExe1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		int resultado;

		System.out.print("Informe o número: ");
		numero = teclado.nextInt();
		
		resultado = numeroPRIMO(numero);
		
		if (resultado == 0)
			System.out.print("O número " + numero + " informado é um número primo");
		else
			System.out.print("O número " + numero + " informado, não é primo. O número primo mais próximo deste valor, é " + resultado + ".");
		
		teclado.close();
	}

	
	public static int numeroPRIMO(int numero)
	{
	
		int i, primoINFERIOR, primoSUPERIOR;
		
		primoINFERIOR = 0;
		primoSUPERIOR = 0;
		
		
		if (Primo(numero) == true)
			
			return 0;
		else
		{
			for ( i = numero+1; i <= Integer.MAX_VALUE; i++)
				  if (Primo(i) == true) 
				  {
					  primoSUPERIOR = i;
					  break;
				  }
			  for ( i = numero-1; i > 1 ; i--)
				  if (Primo(i) == true) 
				  {
					  primoINFERIOR = i;
					  break;
				  }
			  
			  if ((primoSUPERIOR - numero) < (numero = primoINFERIOR))
					return primoSUPERIOR;
				else
					return primoINFERIOR;		
			
			
		}
		
	}
		
	public static boolean Primo(int numero)
		{
			int i;
			
			for (i = 2; i < numero; i++)
				if (numero % i == 0) {
					return false;
				}
			return true;
		}
		
	
}
	
