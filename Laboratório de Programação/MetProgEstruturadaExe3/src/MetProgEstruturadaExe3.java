import java.util.Random;


public class MetProgEstruturadaExe3
{

	public static void main(String[] args)
	{
		int vetor[] = new int [5];
		int i;
		
		vetor = retornaDistintos ();
		
		System.out.print("vetor[distintos]: ");
		for (i = 0; i < vetor.length; i++)
		System.out.print(vetor[i] + ", ");
		
	}

	public static int[] retornaDistintos ( )
	{
	
		int i, j;
		int vetorDistintos[] = new int [5];
		Random r = new Random();
	
		for (i = 0; i < vetorDistintos.length; i++)
		{
			vetorDistintos[i] = r.nextInt(10);
			for(j = 0; j < i; j++)
				if (vetorDistintos[i] == vetorDistintos[j])
				{
					i--;
					break;
				}
		}
			
		return vetorDistintos;
			
	}
	
}
