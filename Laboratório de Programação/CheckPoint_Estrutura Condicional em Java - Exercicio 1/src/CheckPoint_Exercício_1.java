import java.util.Scanner;

public class CheckPoint_Exercício_1 

{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		double INSS, salBruto;
		double salLiquido, salPosINSS,impRenda;
		
		System.out.print("Informe seu salário (R$): ");
		salBruto = teclado.nextDouble();
		
		//cálculo do INSS
		
		if (salBruto <= 1100.00)
			INSS = salBruto * 0.075;
		else
			if ((salBruto >= 1100.01) && (salBruto <= 2203.48))
				INSS = (1100.00 * 0.075) + ((salBruto - 1100.00) * 0.09);	
			else
				if ((salBruto >= 2203.49) && (salBruto <= 3305.22))
					INSS = (1100.00 * 0.075) + ((2203.48 - 1100.00) * 0.090) + ((salBruto - 2203.48) * 0.12); 
				else
					if ((salBruto >= 3305.23) && (salBruto <= 6433.57))
						INSS = (1100.00 * 0.075) + ((2203.48 - 1100.00) * 0.090) + ((3305.22 - 2203.48) * 0.120) + ((salBruto - 3305.22) * 0.140);
					else
						INSS = 751.99;
		
						
		 System.out.printf("Salário Bruto de R$ %4.2f", salBruto);
		 System.out.printf("\nContribuição INSS de R$ %3.2f", INSS);   
		 System.out.printf("\nSalário Pós INSS de R$ %4.2f", (salBruto - INSS));
		   
		 salPosINSS = salBruto - INSS;
		 
		//Cálculo Imposto de Renda
		 
		 if (salPosINSS <= 1903.98)
			 impRenda = 0.0;
		 else
			 if ((salPosINSS >= 1903.99) && (salPosINSS <= 2826.65))
				 impRenda = salPosINSS * 0.075 - 142.80;
			 else
				 if ((salPosINSS >= 2826.66) && (salPosINSS <= 3751.05))
					 impRenda = salPosINSS * 0.15 - 354.80;
				 else
					 if ((salPosINSS >= 3751.06) && (salPosINSS <= 4664.68))
						 impRenda = salPosINSS * 0.225 - 636.13;
					 else
							 impRenda = salPosINSS * 0.275 - 869.36;
		 
		  salLiquido = salPosINSS - impRenda; 
		 
		  System.out.printf("\nImposto Retido na Fonte R$ %4.2f", impRenda);
			 System.out.printf("\nSalário Líquido de R$ %5.2f", salLiquido); 
					 
		 teclado.close();   		
	}

}