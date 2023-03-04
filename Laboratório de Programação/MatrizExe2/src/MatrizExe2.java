import java.util.Random;

public class MatrizExe2
{

	public static void main(String[] args) 
	{
		int M[][] = new int [3][4];
        int R[][] = new int [3][4];
        int vet[] = { 0, 0, 0};
        int i, j;
        Random r = new Random();
        
        for (i = 0; i < M.length; i++)
        	for (j = 0; j < M[0].length; j++)
        		M[i][j] = r.nextInt(7)+1;
        
        for (i = 0; i < M.length; i++)
        	for (j = 0; j < M[0].length; j++)
        		vet[i] = vet[i] + M[i][j];
        
        for (i = 0; i < M.length; i++)
        	for (j = 0; j < M[0].length; j++)
        		R[i][j] = M[i][j] * vet[i];
        //
        
        System.out.print("M[][]: ");
        for (i = 0; i < M.length; i++)
        {
        	for(j = 0; j < M[0].length; j++)
        		System.out.print("\t" + M[i][j]);
        	
        	System.out.println();
        }    
        
        
        System.out.print("\nR[][]: ");
        for (i = 0; i < R.length; i++)
        {
        	for(j = 0; j < R[0].length; j++)
        		System.out.print("\t" + R[i][j]);
        	
        	System.out.println();
        }
        

	}

}
