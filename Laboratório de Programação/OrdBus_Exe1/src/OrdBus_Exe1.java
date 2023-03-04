import java.util.Scanner;

public class OrdBus_Exe1 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int vetNumeros[] = { 17, 83, 67, 23, 13, 41, 59, 37, 11, 19};
		int i, posicao, X;
		
		bolha(vetNumeros);
		
		System.out.print("vetNumeros[i]= ");	
	for (i = 0; i < vetNumeros.length; i++) {
		System.out.print(vetNumeros[i] + ", ");
	}
		
		System.out.print("\n\nInforme o número que deseja pesquisar: ");
		X = teclado.nextInt(); 
	
		//posicao = buscaLinear(X, vetNumeros);
		posicao = buscaBinaria(X, vetNumeros);
		if (posicao != -1)
		{
			System.out.println("O número " + X + " está na posição " + posicao);
		}
		else {
			System.out.println("O número " + X + " não está na relação.");
		}
		
		
		
		teclado.close();
	}
	
	public static void bolha(int numeros[]) 
	{
		int N, i, j, aux;
		N = numeros.length;
		//duas estruturas de repeticao, uma controlada pelo i e outra controlada pelo j
	
		
		for(i = 0; i < N-1; i++) 
			for(j = 0; j < (N-1)-i; j++)
				if(numeros[j] > numeros[j+1])
			{
					//para n perder o valor, usamos o aux para salvar o valor
				aux = numeros[j];
				numeros[j] = numeros[j+1];
				numeros[j+1] = aux;
			}
		
	}
	
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
	
	public static int buscaLinear(int X, int numeros[])
	{
		int i;
		int posicao = -1;
		
		for(i = 0; i < numeros.length; i++) {
			if(numeros[i] == X) 
			{
				return i;
			}  
		return posicao;
	}
	}

}
