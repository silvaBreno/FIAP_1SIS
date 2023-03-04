import java.util.Scanner;

public class StringExe5
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		String nome = new String();
		StringBuffer nomeREF = new StringBuffer();
		String NOMES[] = new String[1];
		int i;
		
		System.out.print("Informe o nome do(a) autor(a): ");
		nome = teclado.nextLine().toUpperCase();
		NOMES = nome.split(" "); // Denise Cristina Gomes Marques = tamanho 4 e o elemento 3, portanto oq sempre querendo é o tamanho do vetor menos 1
		
		System.out.println("\nO nome inserido foi: " + nome);
		//
		
		nomeREF.append(NOMES[NOMES.length-1]); // Tem tamanho 3, mas quero o elemento 2
		System.out.println("\nnomeREF: " + nomeREF.toString());
		
		nomeREF.append(", ");
		
		for(i = 0; i < NOMES.length-1; i++) 
		{
			nomeREF.append(NOMES[i].charAt(1));
			nomeREF.append(". ");
		}
		
		
		System.out.println("\nnomeREF: " + nomeREF.toString());
		// metodo trim eh utilizado para remover o espaco em branco no final;
		teclado.close();
		

	} 

}
