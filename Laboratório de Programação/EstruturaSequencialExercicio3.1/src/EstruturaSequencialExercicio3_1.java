import java.util.Scanner;
public class EstruturaSequencialExercicio3_1 
{

	public static void main(String[] args) 
	{
		int raio;
		double area; 
		//float area;
		
		Scanner teclado = new Scanner (System.in);

		System.out.print("Informe o raio: ");
		raio = teclado.nextInt(); 
		area = Math.PI*Math.pow(raio, 2);
	    area = (float)(Math.PI*Math.pow(raio, 2));
	    //cast = engessar usar o (float)(x) para pedir que o resultado seja em dado em float e nao em double com uma quantidade enorme de casas 
	    System.out.println("área= "+ area);
	    System.out.println("\"área\"= "+ area);
		System.out.printf("\nárea= \t%.3f", area);
		//sequence escape = \n para pular a linha em print formatado
		System.out.printf("\nárea= \t%.2f", area);	
		System.out.printf("\nárea= \t%.1f", area);	
		System.out.printf("\nvalor= \t\t%03d", 3);	
		System.out.printf("\nvalor= \t\t%3d", 3);	
	    teclado.close();
		
	}

}
