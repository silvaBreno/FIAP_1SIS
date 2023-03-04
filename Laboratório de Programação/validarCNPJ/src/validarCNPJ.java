import java.util.Scanner;

	//teste1: 11444777000161
	//teste2: 11222333000181

	//teste: 11.444.777/0001-61 (11444777000161)
	//teste: 11.222.333/0001-81 (11222333000181)
	//Itaú: 17.192.451/0001-70 (17192451000170)
	//XP: 02.332.886/0001-04 (02332886000104)

public class validarCNPJ
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String CNPJ = new String();
		int DV1c, DV1i, DV2c = 0, DV2i;
		int tamanho, i, soma, peso, resto;
		
		
		System.out.print("Informe o CNPJ que deseja validar (sem ./-): ");
		CNPJ = teclado.nextLine();
		tamanho = CNPJ.length() - 2;

		 DV1i = Character.digit(CNPJ.charAt(tamanho), 10);
		 DV2i = Character.digit(CNPJ.charAt(tamanho+1), 10);

		 soma = 0;
		 peso = 5;
		 for (i = 0; i < tamanho; i++)
		 	{
			 	soma = soma + peso * Character.digit(CNPJ.charAt(i), 10);

			 	peso--;
			 	
			 	if (peso == 1)
			 		peso = 9;
		 	}

		 	resto = soma % 11;
		
		 	if (resto < 2)
		 		DV1c = 0;
		 	else
		 		DV1c = 11 - resto;

		 		soma = 0;
		 		peso = 6;
		 		
		 		
		for (i = 0; i < tamanho+1; i++)
			{
				soma = soma + peso * Character.digit(CNPJ.charAt(i), 10);

				peso--;
				
				if (peso == 1)
					peso = 9;
			}

		 	resto = soma % 11;
		 	
		 	if (resto < 2)
		 		DV2c = 0;
		 	else
		 		DV2c = 11 - resto;

		if (DV1c == DV1i && DV2c == DV2i)
			System.out.println("CNPJ VÁLIDO!");
			else
				System.out.println("CNPJ INVÁLIDO!");

		 teclado.close();
	}

}
