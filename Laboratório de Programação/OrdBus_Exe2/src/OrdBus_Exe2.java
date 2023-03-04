
public class OrdBus_Exe2 
{

	public static void main(String[] args) 
	{
		String vetPalavras[] = {"AG" , "AA", "B", "AB", "AW", "AC", "X", "BRENO", "BRE", "BRU", "BX"};
		int i;
		
		bolha(vetPalavras);
		
		System.out.print("vetPalavras[i]= ");	
		for (i = 0; i < vetPalavras.length; i++) {
			System.out.print(vetPalavras[i] + ", ");
		}	
	}

	public static void bolha(String palavras[])
	{
		int N, i, j;
		String aux;
		N = palavras.length;
		for(i = 0; i < N-1; i++) 
			for(j = 0; j < (N-1)-i; j++)
				
				// não posso usar essa estrutura pq é String if(palavras[j] > palavras[j+1])
					
				if(palavras[j].compareTo(palavras[j+1]) > 0)
				{
					aux = palavras[j];
					palavras[j] = palavras[j+1];
					palavras[j+1] = aux;
				}
			
	}
		
	
	
}
