import java.util.Scanner;

public class StringExe6
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		
		String frase;
		StringBuffer crypt = new StringBuffer();
		int tamanho, i, codigo;
		
		System.out.println("Digite uma frase: ");
		frase = teclado.nextLine().toUpperCase();
		tamanho = frase.length();
		
		System.out.println("\nA frase inserida foi: " + frase);
		
		for (i = 0; i < tamanho; i++) 
		{
			
		}
		
		System.out.println("\nfrase normal = " + frase);
		
		teclado.close();
		
	}

}
