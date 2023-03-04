import java.util.Scanner;

public class CP_ManipulaçãoCadeias_Exe2
{

	public static void main(String[] args)
	 {
			Scanner teclado = new Scanner(System.in);
			String frase = new String();
			int i, tamanho;
			
			
			System.out.print("Digite uma frase: ");
			frase= teclado.nextLine();
			tamanho = frase.length();
			char Frase [] = frase.toCharArray();
			
			for(i = 0; i < tamanho; i++)
			{
				if (i == 0)
					Frase[i] = Character.toUpperCase(Frase[i]);
				if (Frase[i] == ' ')
					Frase[i+1] = Character.toUpperCase(Frase[i+1]);
			}
			
		
			System.out.println("\nfrase: " + frase);
			System.out.print("Frase: ");
			for(i = 0; i < tamanho; i++)
				System.out.print(Frase[i]);

			teclado.close();
		

	}
}
