import java.util.Scanner;

public class ExercicoAliquotaContribuicaoINSSExercicio2 
{

	public static void main(String[] args) 
	{
		double INSS, salBruto, difSal;
		
		
        Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe seu salário bruto: ");
		salBruto = teclado.nextDouble();
		
		if (salBruto <= 1100.00)
			INSS = salBruto * 0.075;
		
		else
			if ((salBruto >= 1100.01) && (salBruto <= 2203.48))
				INSS = (1100.00 * 0.075) + ((salBruto - 1100.00) * 0.09);
				
			else
				//essa linha nao fica tao precisa quanto as demais verificar se existe algum erro de arredondamento - Perguntar para o professor;
				if ((salBruto >= 2203.49) && (salBruto <= 3305.22))
					INSS = (1100.00 * 0.075) + ((2203.48 - 1100.00) * 0.090) + ((salBruto - 2203.48) * 0.12); 
				else
					if ((salBruto >= 3305.23) && (salBruto <= 6433.57))
						INSS = (1100.00 * 0.075) + ((2203.48 - 1100.00) * 0.090) + ((3305.22 - 2203.48) * 0.120) + ((salBruto - 3305.22) * 0.140);
					else
						INSS = 751.99;
						
		 System.out.println("Salario Bruto = " + salBruto);
		 System.out.println("Contribuição INSS = " + INSS);   
		 
		 difSal = salBruto - INSS;
		 
		 System.out.println("Diferenca entre Salário Bruto e Contribuição INSS = " + difSal);
		   
		 teclado.close();   		
	}

}
