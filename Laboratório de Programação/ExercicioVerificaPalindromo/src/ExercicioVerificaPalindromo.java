import java.util.Scanner;

public class ExercicioVerificaPalindromo 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int direta, reversa, numero, resto;
		
		System.out.print("Informe o n�mero inteiro: ");
		direta = teclado.nextInt();
		
		numero = direta;
		reversa = 0;
		
		while(numero > 0) 
		{
		resto = numero % 10;
		numero = numero /10;
		reversa = reversa*10 + resto;
		}
		
		if (direta == reversa) {
			System.out.println("\nO n�mero " + direta + " � palindrome");
		}
		
		else {
			System.out.println("\nO n�mero " + direta + " n�o � palindrome");
		}
		

		teclado.close();
	}

}
