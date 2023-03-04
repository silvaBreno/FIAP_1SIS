
public class Checkpoint_2_2 
{

	public static void main(String[] args)
	{
		int  contador, N, i, soma;
	    int vetPerfeitos [] = new int [3];
		
		contador = 0;
		N = 1;
		
		while (contador < 3)
		{
			soma = 0;
			for (i = 1; i < N; i++)
				if (N % i == 0)
					soma = soma +i;
			
			if (soma == N)
			{
				vetPerfeitos[contador] = N;
				contador++;
			}
			
			N++;
		}
		
		System.out.println("Os três primeiros números perfeitos são: \n");
		for (i = 0; i < vetPerfeitos.length; i++)
			System.out.print("\t" + vetPerfeitos[i]);

	}

}
