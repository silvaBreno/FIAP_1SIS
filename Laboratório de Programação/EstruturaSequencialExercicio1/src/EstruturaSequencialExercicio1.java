import java.util.Scanner;

public class EstruturaSequencialExercicio1 
{
	public static void main(String[] args)
	{
       int A, B, C, soma;
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Informe o valor de A: ");
       A = teclado.nextInt();
       //Entrada do Valor A na tela
       
       System.out.print("Informe o valor de B: ");
       B = teclado.nextInt();
       //Entrada do valor B na tela
       
       System.out.print("Informe o valor de C: ");
       C = teclado.nextInt();
       //Entrada do valor C na tela
    
       soma = A + B + C;
       System.out.println("Soma= " + soma);
       
       teclado.close();
	}
}
