package exemplo;

public class Exemplo {

	public static void main(String[] args)
	{
		// A=2 B=7, soma = 2 + 4 + 6, mult = 3 * 5 * 7
		
		for (inicial;final;++)

		int i; 
	// estrutura de repetição com teste no início
		i = 0;
		while(i < 3) 
		{
			System.out.println("i (while)= " + i);
			i++; // operador incremento i++, igual fazer i=i+1
		}
		
	// estrutura de repetição com teste no final
		i = 0;
		do
		{
			System.out.println("i (do while)= " + i);
			i++;
		} while (i <3);
		
		// estrutura de repetição com variável de controle
		
		for(i = 0; i < 3; i++)
			System.out.println("i (for)= " + i);

		System.out.println("\nfim do programa");
	}

}
