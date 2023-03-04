import java.util.Random;

public class MatrizExe1
{

	public static void main(String[] args) 
	{
		int M [][] = new int [2][2] ;
		int R [][] = new int [2][2] ;
		int i, j, MAIOR; 
		Random r = new Random();
		
		for (i = 0; i < M.length; i++)        // supondo que i representa a linha
			for(j = 0; j < M[0].length; j++) // M[0].lenght para dizer: Estando na linha coluna/linha
				M [i][j] = r.nextInt(10)+1; // se coloco 10 como limite ele me gera de 0 a 9, somo 1 para n pegar o 0, sabendo que 0 multiplicado por 0 n é interessante nesse caso;
		
		MAIOR = M[0][0];  // uso como referencia a primeira casa apenas
		for (i = 0; i < M.length; i++)
			for(j = 0; j < M[0].length; j++)
				if(M[i][j] > MAIOR)  // se aquela posicao do i e j for o maior numero, eu considero ela sendo meu maior valor atribuindo a linha abaixo;
					MAIOR = M[i][j];
		
		for (i = 0; i < R.length; i++)
			for(j = 0; j < R[0].length; j++)
			   R[i][j] = MAIOR*M[i][j];
		
		System.out.println("M[][]: ");
		for (i = 0; i < M.length; i++)  // usando essa estrutura para varrer as linhas
		{
			for(j = 0; j < M[0].length; j++) // usando essa estrutura para varrer as colunas. Estando posicionado em uma determinada linha, coloco em uma estrutura de repeticao que vai varrer as colunas ela vai montar/printar a linha e pula uma linha
				System.out.print("\t" + M[i][j]);
			
			System.out.println();
			
		}
		
		System.out.println("-------------------------------------");
		System.out.println("R[][]: ");
		for (i = 0; i < R.length; i++) 
		{
			for(j = 0; j < R[0].length; j++) 
				System.out.print("\t" + R[i][j]);
			
			System.out.println();
			
		}	
	}

}
