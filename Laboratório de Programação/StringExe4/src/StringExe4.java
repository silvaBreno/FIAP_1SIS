import java.util.Scanner;

public class StringExe4
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int i, espacos, tamanho;
		String frase;
		String fraseOut = "";
		
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine().toUpperCase();
		tamanho = frase.length();
		
		espacos = 0;
		for (i = 0; i < tamanho; i++)
			if (frase.charAt(i) == ' ')
				espacos++;
		
		String frase2x[] = new String[espacos+1];
		frase2x = frase.split(" ");
		
		for(i = 0; i < frase2x.length; i++)
			fraseOut = fraseOut + frase2x[i] + " " + frase2x[i] + " ";
			
		System.out.println("frase  : " + frase);
		System.out.println("frase2x: " + fraseOut.trim());
		
		
		teclado.close();
	}

}
