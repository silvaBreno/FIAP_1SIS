import java.util.Scanner;

public class CheckPoint_Exercício_2
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		 
		double peso, solOral = 0 ;
		
		System.out.print("Informe seu peso (kg): ");
		peso = teclado.nextDouble();
		
		//Início das Regras
		
		if (peso <= 5.00)
			System.out.println("Contraindicado para crianças com menos de 5kg");
		else
			if ((peso >= 5.01) && (peso <= 8.00))
				solOral = 2.50;
				else
					if ((peso >= 8.01) && (peso <= 15.00))
						solOral = 5.00;
					else
						if ((peso >= 15.01) && (peso <= 23.00))
							solOral = 7.50;
						else
							if ((peso >= 23.01) && (peso <= 30.00))
								solOral = 10.00;
							else
								if ((peso >= 30.01) && (peso <= 45.00))
									solOral = 15.00;
								else
									if ((peso >= 45.01) && (peso <= 53.00))
										solOral = 17.50;
									else
										System.out.println("Dosagem de USO ADULTO");
		                                 
		                            
		
		System.out.print("Para crianças de " + peso + "(kg) a dose recomendada é: " + solOral + "(ml)");
		
		 teclado.close();   
	}

}
