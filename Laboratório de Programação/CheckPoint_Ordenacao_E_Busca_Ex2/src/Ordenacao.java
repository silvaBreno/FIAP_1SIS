
public class Ordenacao {

	public static void bolha(int numeros[]) 
	{
		int N, i, j, aux;
		N = numeros.length;
				
		for(i = 0; i < N-1; i++) 
			for(j = 0; j < (N-1)-i; j++)
				if(numeros[j] > numeros[j+1])
			{
				aux = numeros[j];
				numeros[j] = numeros[j+1];
				numeros[j+1] = aux;
			}
		
	}
	
	public static void bolha(String palavras[])
	{
		int N, i, j;
		String aux;
		N = palavras.length;
		for(i = 0; i < N-1; i++) 
			for(j = 0; j < (N-1)-i; j++)
				
								
				if(palavras[j].compareTo(palavras[j+1]) > 0)
				{
					aux = palavras[j];
					palavras[j] = palavras[j+1];
					palavras[j+1] = aux;
				}
		}
}
