
public class Busca {
	
	public static int buscaBinaria (int X, int numeros[])
	{
		int inicio, meio, fim;
		inicio = 0;
		fim = numeros.length-1;
		
		while(inicio <= fim)
		{
			meio = (inicio + fim) / 2;
			if (X == numeros[meio])
				return meio;
			if (X < numeros[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
				
		return -1;
	}
	
	public static int buscaBinaria (String Y, String palavras[])
	{
		int inicio, meio, fim;
		inicio = 0;
		fim = palavras.length-1;
		
		while(inicio <= fim)
		{
			meio = (inicio + fim) / 2;
			if (palavras[meio].equalsIgnoreCase(Y))
				return meio;
			if (palavras[meio].compareToIgnoreCase(Y) > 0 ) {
				fim = meio - 1;
			}
			else
				inicio = meio + 1;
			
		}
		
		
		return -1;
	}
	
}

