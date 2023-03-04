import java.util.Scanner;

public class StringExe2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		String FRASE;
		int i, tamanho;
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		FRASE = frase.toUpperCase();
		char crypt[] = frase.toCharArray();
		
		tamanho = FRASE.length();
				
		for(i = 0; i < tamanho; i++) 
		{
			if (FRASE.charAt(i) == 'A' ||
				FRASE.charAt(i) == 'E' ||
				FRASE.charAt(i) == 'I' ||
				FRASE.charAt(i) == 'O' ||
				FRASE.charAt(i) == 'U')
				crypt[i]= '*';
		}
		
		System.out.println("frase: " + frase);
		System.out.print("crypt: ");	
		for(i = 0; i < tamanho; i++)
			System.out.print(crypt[i]);
		
		teclado.close();
	}

}
