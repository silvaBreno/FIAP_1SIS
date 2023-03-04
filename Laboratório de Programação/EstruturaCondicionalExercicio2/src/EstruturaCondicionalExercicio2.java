import java.util.Scanner;

public class EstruturaCondicionalExercicio2 
{

	public static void main(String[] args) 
	{
		int A, B, C, min, max, med ;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe o valor de A: ");
		A = teclado.nextInt();
		
		System.out.print("Informe o valor de B: ");
		B = teclado.nextInt();
		
		System.out.print("Informe o valor de C: ");
		C = teclado.nextInt();
		
		//caso eu queira responder de forma rapida:
		
		min = Math.min(A, Math.min(B, C)); 
	    max = Math.max(A, Math.min(B, C));
	    med = A + B + C - min - max;
	    System.out.print("ordem: " + min + ", " + med + ", " + max);
	    
		
		//descricao problema:
		
		if ((A < B) && (A < C ))
			if (B < C)
			System.out.print("ordem: " + A + ", " + B + ", " + C);
			else
			System.out.print("ordem: " + A + ", " + C + ", " + B);	
		
		if ((B < A) && (B < C ))
			if (A < C)
			System.out.print("ordem: " + B + ", " + A + ", " + C);
			else
				System.out.print("ordem: " + B + ", " + C + ", " + A);	
		
		if ((C < A) && (C < B ))
			if (A < B)
			System.out.print("ordem: " + C + ", " + A + ", " + B);
			else
				System.out.print("ordem: " + C + ", " + B + ", " + A);	
		
		teclado.close(); 

	}

}
