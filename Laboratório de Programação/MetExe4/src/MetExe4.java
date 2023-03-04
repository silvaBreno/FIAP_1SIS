public class MetExe4 
{

	public static void main(String[] args) 
	{	
		int i;
		int vetor [] = new int[4];
		vetor = perfeitos(); 
		
		System.out.println("Os três primeiros números perfeitos são:");
		for(i = 0; i < vetor.length; i++)
			System.out.print( vetor[i] + ", ");
	}
	
	public static int[] perfeitos()
	{
		int vetor [] = new int[4];
		int contador, N, soma, i;
		
		contador = 0;
		N = 1;
		while (contador < 4)
		{
			soma = 0; 
			for (i = 1; i < N; i++)
				if (N % i == 0)
					soma = soma + i;
			if(soma == N)
			{
				vetor[contador] = N;
				contador++;
			}
			
			N++;
		
		}	
		
		return vetor; 
	}
	
}
