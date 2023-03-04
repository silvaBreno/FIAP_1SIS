import java.util.Scanner;

public class SelecaoMultiplaEx1
{

		public static void main(String[] args) 
		{
			
			int opcao;
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Digite (2) para exibir o número de Euler.");
			System.out.println("Digite (3) para exibir o número de pi");
			System.out.print("opcao= ");
			opcao = teclado.nextInt();
			
			switch (opcao)
			{
			   case 2:
				  System.out.println("e = " + Math.E);
				  break;
			   case 3:
				  System.out.println("pi = " + Math.PI);
				  break;
			   default:
	               System.out.println("opcao INVÁLIDA");	 
	               break;
			}
			
			teclado.close();
		}
	}
