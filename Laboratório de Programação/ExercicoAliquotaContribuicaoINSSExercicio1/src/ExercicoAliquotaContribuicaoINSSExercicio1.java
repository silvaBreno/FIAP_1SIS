import java.util.Scanner;

public class ExercicoAliquotaContribuicaoINSSExercicio1
{

	public static void main(String[] args) 
	{
		
		double INSS, salBruto;
		INSS = 751.99;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.print("Informe seu salário bruto: ");
		salBruto = teclado.nextDouble();
		
		
		if (salBruto <= 1100.00)
			INSS = salBruto * 0.075;
		
		else
			if ((salBruto >= 1100.01) && (salBruto <= 2203.48))
				INSS = salBruto * 0.09;
			 
			    
			else
				if ((salBruto >= 2203.49) && (salBruto <= 3305.22))
				INSS = salBruto * 0.12;
		
				else
					if ((salBruto >= 3305.23) && (salBruto <= 6433.57))
						INSS = salBruto * 0.14;
					else
						if (salBruto >= 6433.58) 
							INSS = INSS;
		
		System.out.print("INSS = " + INSS);

		teclado.close();
	}

}
