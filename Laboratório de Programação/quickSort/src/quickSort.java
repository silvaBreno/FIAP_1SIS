import java.util.Random;

public class quickSort
{
	public static final int ORDEM = 5;
	public static final int LIMITE_INF = 1000;
	public static final int LIMITE_SUP = 9000;
	public static void main(String[] args)
	{
		Random r = new Random();
		int i;
		int vetor[] = new int [ORDEM];
		
		for( i = 0; i < ORDEM; i++)
		{
			vetor[i] = r.nextInt(LIMITE_SUP)+LIMITE_INF;
		}
		
		for( i = 0; i < ORDEM; i++)
		{
			System.out.print(vetor[i] + ", ");
		}
		
		quickSort1(vetor, 0, ORDEM);
		
		System.out.print("\n");
		for( i = 0; i < ORDEM; i++)
		{
			System.out.print(vetor[i] + ", ");
		}

	}

	public static void quickSort1(int vetor[], int inicio, int fim) 
	{
		int i, j, pivo, aux;
		
		i = inicio;
		j = fim - 1;
		
		pivo = vetor[(inicio+fim)/2];
		
		while(i <= j) 
		{
			while(vetor[i] < pivo && i < fim) 
			{
				i++;
				
			}
			
			while(vetor[j] > pivo && j > inicio) 
			{
				j--;
				
			}
				
			if ( i <= j)
			{
			aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
			i++;
			j--;
			}
			
			if (j > inicio) 
			{
				quickSort1(vetor, inicio, j+1);
			}
			
			if (i < fim) 
			{
				quickSort1(vetor, i, fim);
			}
		}
	}
}
