import java.util.Scanner;

public class StringExe1 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String frase;
		String FRASE;
		int i, conta_vogais, tamanho;
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		
		FRASE = frase.toUpperCase();
		tamanho = frase.length();
		
		conta_vogais = 0;
		for (i = 0; i < tamanho; i++)
		{
			if(FRASE.charAt(i) == 'A' || 
			   FRASE.charAt(i) == 'E' || 
			   FRASE.charAt(i) == 'I' || 
		       FRASE.charAt(i) == 'O' || 
		       FRASE.charAt(i) == 'U')
				conta_vogais++;
		}
		
		System.out.println("\nA frase: \"" + frase + "\" tem " + conta_vogais + " vogais");
		
		teclado.close();
	}

}
