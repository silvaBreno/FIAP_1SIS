  
public class ValidarITAU
{
	public static void main(String[] args)
	{
		int ITAU[] = {2, 5, 4, 5, 0, 2, 3, 6, 6, 1};
		int i, peso, mult, soma, resto, DVi, DVc;

		DVi = ITAU[ITAU.length-1];

		peso = 2;
		soma = 0;
		for (i = 0; i < ITAU.length-1; i++)
		{
		mult = peso * ITAU[i];
		if (mult > 9)
		mult = mult - 9;



		soma = soma + mult;



		peso--;
		if (peso == 0)
		peso = 2;
		}



		resto = soma % 10;
		if (resto > 0)
		DVc = 10 - resto;
		else
		DVc = 0;



		if (DVc == DVi)
		System.out.println("agência.c/c ITAÚ VÁLIDA!");
		else
		System.out.println("agência.c/c ITAÚ INVÁLIDA!");
	}

}
