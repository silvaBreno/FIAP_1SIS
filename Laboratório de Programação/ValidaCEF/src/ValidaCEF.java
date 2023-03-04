
public class ValidaCEF
{

	public static void main(String[] args) 
	{
		int CEF [] = {2, 0, 0, 4, 0, 0, 1, 0, 0, 0, 0, 0, 4, 4, 8, 6};
		int i, peso, soma, DVi, DVc;
		
		DVi = CEF[CEF.length-1];
		peso = 8;
		soma = 0;
		for (i = 0; i < CEF.length-1; i++ )
		{
			/*mult = peso * CEF [I]; portando substituindo*/
			/*soma = soma + mult;*/
			
			soma = soma + peso* CEF [i];
			
			peso--;
			if (peso == 1)
				peso = 9;
			
		}
		
		
		DVc = (10* soma) % 11;
		
		if (DVc == 10)
			DVc = 0;
		
		if (DVi == DVc)
			System.out.println("agencia.c/c CEF VÁLIDA!");
		else
			System.out.println("agencia.c/c CEF INVÁLIDA!");
			
	}

}
