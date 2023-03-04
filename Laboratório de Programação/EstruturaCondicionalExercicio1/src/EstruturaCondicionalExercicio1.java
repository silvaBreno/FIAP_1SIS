import java.util.Scanner;

public class EstruturaCondicionalExercicio1 
{

	public static void main(String[] args) 
	{
		double MS1, MS2, MA;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe MS1= ");
		MS1 = teclado.nextFloat();
		System.out.print("Informe MS2= ");
		MS2 = teclado.nextFloat();
		MA = (0.4*MS1) + (0.6*MS2);
		System.out.println("média= "+ MA);
		
		//descricao da situacao do aluno: 
		
		if (MA >=6)
		{
			System.out.print("O aluno está aprovado");
		}
		else 	
			if (MA >= 4)
			System.out.print("nao desista");
			else
			{
				System.out.println("O aluno estará reprovado");
				System.out.print("Xiii... foi mau...");
			}
		teclado.close();
	}
}
