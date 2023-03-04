import java.util.Random;

public class MatrizExe4 
{

	public static void main(String[] args)
	{
		int M[][] = new int [4][5];
		int i, j, menor, MINMAX, linhaMINMAX, colunaMINMAX;
		Random r = new Random();
		
		 for (i = 0; i < M.length; i++)
	        	for (j = 0; j < M[0].length; j++)
	        		M[i][j] = r.nextInt(15)+1;
		 
		 menor = M[0][0]; //assumo como hipotese que o menor elemento seja o item da linha 0 e coluna 0
		 linhaMINMAX = 0;
		 for (i = 0; i < M.length; i++)
	        	for (j = 0; j < M[0].length; j++)
	        		if(M[i][j] < menor) 
	        		{
	        			menor = M[i][j];
	        			linhaMINMAX = i;	        			
	        		}
		 
		 MINMAX = M[linhaMINMAX][0];
		 colunaMINMAX = 0;
		 for (j = 0; j < M[0].length; j++)
			 if (M[linhaMINMAX][j] > MINMAX)
			 {
				 MINMAX = M[linhaMINMAX][j];
				 colunaMINMAX = j;
			 }
			 
			 
		 System.out.print("M[][]: ");
	        for (i = 0; i < M.length; i++)
	        {
	        	for(j = 0; j < M[0].length; j++)
	        		System.out.print("\t" + M[i][j]);
	        	
	        	System.out.println();
	        }    

	        System.out.print("MINMAX = " + MINMAX);
	        System.out.print(" (" + linhaMINMAX + ", ");
	        System.out.print(colunaMINMAX+")");
	}

}
