import java.util.Scanner;

public class EstruturaSequencialExercicio3 
{

	public static void main(String[] args)
	{
		double raio, �rea;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o raio da circunferencia: ");
		raio = entrada.nextDouble();
		//entrada do valor do raio
		
		�rea = raio*raio*Math.PI;
		
		System.out.print("�rea = " + �rea);
		
		entrada.close();

	}

}
