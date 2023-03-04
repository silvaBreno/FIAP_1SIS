import java.util.Scanner;

public class CheckPoint_Exercicio_1 
{

	public static void main(String[] args)
	{
		double a, b, c, soma__catetos, raiz_soma_catetos;
		boolean condiçao_existencia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sabendo que a² = b² + c², sendo o valor de 'a' o maior valor, e os valores de 'b' e 'c' sendo os catetos.");
		System.out.print("Informe o valor de a (hipotenusa): ");
		a = teclado.nextDouble();
		
		System.out.print("Informe o valor de b: ");
		b = teclado.nextDouble();
				
		System.out.print("Informe o valor de c: ");
		c = teclado.nextDouble();
		
		soma__catetos = (  ( Math.pow(b, 2) + Math.pow(c, 2))  );
		
		System.out.println("soma dos catetos = " + soma__catetos);
		
		raiz_soma_catetos = Math.sqrt(soma__catetos);
		
		System.out.println("Raiz Soma Catetos = " + raiz_soma_catetos);
		
		condiçao_existencia = ( (a == raiz_soma_catetos) && (a > b) && (a > c) && ( b != c) );
		
		if (condiçao_existencia == true)
		{
			System.out.print("É um terno pitagórico");
		}
		else
			System.out.print("Não é um terno pitagórico");
			
		teclado.close();
	}
	
}

