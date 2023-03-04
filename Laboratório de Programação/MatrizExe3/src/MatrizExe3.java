import java.util.Random;

public class MatrizExe3 
{

	public static void main(String[] args)
	{
		int M[][] = new int [4][3];
        int R[][] = new int [4][3];
        int i, j, maior7;
        Random r = new Random();
        // a varial i e j usamos para passar por todas as linhas e colunas 
        
        for (i = 0; i < M.length; i++)
        	for (j = 0; j < M[0].length; j++)
        		M[i][j] = r.nextInt(10)+1; // (de 0 a 9)
        
        maior7 = 0; 
        for (i = 0; i < M.length; i++)
        	for (j = 0; j < M[0].length; j++)
        		if( M[i][j] > 7)
        		{
        			maior7++;
        			R[i][j] = 0;
        		}
        		else
        			R[i][j] = M[i][j];
        
        System.out.print("M[][]: ");
        for (i = 0; i < M.length; i++)
        {
        	for(j = 0; j < M[0].length; j++)
        		System.out.print("\t" + M[i][j]);
        	
        	System.out.println();
        }
        
        System.out.println();
        
        System.out.print("R[][]: ");
        for (i = 0; i < R.length; i++)
        {
        	for(j = 0; j < R[0].length; j++)
        		System.out.print("\t" + R[i][j]);
        	
        	System.out.println();
        }
        
        System.out.println("\nelementos > 7:  " + maior7);
	}

}
