import java.util.Scanner;

public class StringExe3 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		int i, j;
		boolean palindrome = true;
		
		System.out.print("Digite uma palavra: ");
		frase = teclado.nextLine().toLowerCase(); 
		char palavra[] = frase.toCharArray();  // para converter a string em um vetor
		
		j = palavra.length - 1;
		for (i = 0; i < palavra.length; i++) 
		{
			if (palavra[i] != palavra [j])  // o i esta apontando a primeira palavra do vetor, utilizamos o j para varer do final para o come�o (literalmente o inverso do i)
			{									// aqui faz mais sentido fazer pela diferen�a! se a palavra for diferente ela deixa de ser palindrome essa que eh a ideia
				palindrome = false;
				break;
			}
			j--;
		}
		
		if(palindrome == true)
			System.out.println("A palavra \"" + frase +  "\" � pal�ndrome!");
		else
			System.out.println("A palavra " + frase + " N�O � pal�ndrome!");
		
		teclado.close();
	}

}
