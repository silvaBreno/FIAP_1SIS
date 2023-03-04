import java.util.Scanner;

public class EstruturaSequencialExercicio4 
{

	public static void main(String[] args) 
	{
		int lado, area, peri;
		Scanner teclado = new Scanner (System.in);
		
		lado> 0;
		
		System.out.print("Informe o lado do hexagono= ");
		lado = teclado.nextInt();
		
		area= (int) ((3*Math.sqrt(3)/2)*lado*lado);
		System.out.print("Área = " + area);
		
		peri= 6*lado
		System.out.print("Perimetro = " + peri);

		teclado.close();
	}

}

