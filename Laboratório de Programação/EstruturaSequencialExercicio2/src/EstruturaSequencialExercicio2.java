import java.util.Scanner;

public class EstruturaSequencialExercicio2 
{

	public static void main(String[] args) 
	{
		double nota1,nota2,media;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a 1a nota: ");
		nota1 = entrada.nextDouble();
		//nota1=

		System.out.print("Informe a 2a nota: ");
		nota2 = entrada.nextDouble();
		//nota2=

		media = (nota1 + nota2)/2;
		System.out.print("média = " + media);
		
		entrada.close();
	}

}
