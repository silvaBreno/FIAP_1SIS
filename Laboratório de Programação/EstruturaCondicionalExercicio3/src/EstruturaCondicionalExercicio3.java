import java.util.Scanner;

public class EstruturaCondicionalExercicio3 
{

	public static void main(String[] args) 
	{
		int A, B, C;
		boolean cd1, cd2, cd3;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe o valor de A: ");
		A = teclado.nextInt();
		
		System.out.print("Informe o valor de B: ");
		B = teclado.nextInt();
		
		System.out.print("Informe o valor de C: ");
		C = teclado.nextInt();
		
		cd1 = (Math.abs(B-C) < A )  && (A < B + C);
		cd2 = (Math.abs(A-C) < B )  && (B < A + C);
		cd3 = (Math.abs(B-A) < C )  && (C < B + C);
		
		if (cd1 && cd2 && cd3)
		{
			System.out.print("\nÉ um triângulo: ");
			if((A == B) && (B == C))
			   System.out.print("O triângulo é equilátero.");
			   else
				   if((A != B) && (B != C) && (A != C))
					   System.out.print("O triângulo é escaleno."); 
				   else
					   System.out.print("O triângulo é isósceles.");
		}
		else
			System.out.print("\nNão é um triângulo: ");
            
        teclado.close();   
	}
}
