import java.util.Scanner;

public class validarCNPJ_v2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String CNPJ = new String();
		int DV1c, DV1i, DV2c = 0, DV2i;
		int tamanho;
		
		
		System.out.print("Informe o CNPJ que deseja validar (sem ./-): ");
		CNPJ = teclado.nextLine();
		tamanho = CNPJ.length() - 2;

		 DV1i = Character.digit(CNPJ.charAt(tamanho), 10);
		 DV2i = Character.digit(CNPJ.charAt(tamanho+1), 10);
		
		 	DV1c = calculaDV(CNPJ,1);
		 	DV2c = calculaDV(CNPJ,2);
		 	

		if (DV1c == DV1i && DV2c == DV2i)
			System.out.println("CNPJ VÁLIDO!");
			else
				System.out.println("CNPJ INVÁLIDO!");

		 teclado.close();

	}
	
	public static int calculaDV(String CNPJ, int digito) 
	{
		int tamanho, i, soma, peso, resto;
		int DV = 0;
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
			
		return DV;
	}

}
