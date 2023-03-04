import java.text.DecimalFormat;
import java.util.Scanner;

public class EstruturaRepeticaoExercicio4
{

	public static void main(String[] args) 
	{
		int N, fat, i;
		Scanner teclado = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat ("R$ ###,###,###.00");
		
		System.out.print("Informe o valor de N:");
		N = teclado.nextInt();
		
		fat = 1;
		for(i = N; i >= 1; i--)
			// o i é uma variavel de controle, nesse caso usamos para o programa saber aonde precisa parar!
		{
			fat = fat*i;
		}
		System.out.println("N!= " + formatador.format(fat));
		System.out.println("N! = " + fat);
		
       teclado.close();
      
       
	}

}
