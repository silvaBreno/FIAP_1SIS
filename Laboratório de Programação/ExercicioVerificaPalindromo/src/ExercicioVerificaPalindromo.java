import java.util.Scanner;

public class ExercicioVerificaPalindromo 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int direta, reversa, numero, resto;
		
		System.out.print("Informe o número inteiro: ");
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
			System.out.println("\nO número " + direta + " é palindrome");
		}
		
		else {
			System.out.println("\nO número " + direta + " não é palindrome");
		}
		

		teclado.close();
	}

}
