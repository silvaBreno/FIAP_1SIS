import java.util.Scanner;

public class EstruturaSequencialExercicio4 
{

	public static void main(String[] args) 
	{
		int lado, perimetro;
		float area;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Infomre o lado do hex�gono: ");
		lado = entrada.nextInt();
		area = (float)(3 * Math.sqrt(3) * Math.pow(lado, 2)/ 2);
		perimetro = 6 * lado;
		System.out.println("�rea= "+ area);
		System.out.println("per�metro= "+ perimetro);
		entrada.close();
     
	}

}
