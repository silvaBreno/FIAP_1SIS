import java.util.Random;

public class Checkpoint_2_3 
{

	public static void main(String[] args) 
	{
		int X [] = new int [10];
		int Y [] = new int [10];
		int U [] = new int [20];
		Random r = new Random ();
		int i, j, e;
		boolean uniao;
		
		for (i = 0; i < X.length; i++)
		{
			X[i] = r.nextInt(8);
			Y[i] = r.nextInt(8)+4;
		}
		
		e = 0;
		U [e] = X[0];
		e++;
		
		for(i = 1; i < X.length; i++)
		{
			uniao = true;
			for(j = 0; j < e; j++)	
				if (U[j] == X[i])
				{
					uniao = false;
					break;
				}
			if(uniao == true)
			{
				U[e] = X[i];
				e++;
			}
		}	
		for(i = 0; i < Y.length; i++)
		{
			uniao = true; 
			for(j = 0; j < e; j++)	
				if (U[j] == Y[i])
				{
					uniao = false;
					break;
				}
			if(uniao == true)
			{
				U[e] = Y[i];
				e++;
			}
			
		}
		
		System.out.print("X[] = { ");
		for (i = 0; i < X.length; i++)
			System.out.printf("%2d%s", X[i], ", ");
			System.out.println("}");
			
		System.out.print("Y[] = { ");
		for (i = 0; i < Y.length; i++)
			System.out.printf("%2d%s",Y[i], ", ");
			System.out.println("}");
		
		System.out.println("----------------------------------------------------");
		System.out.print("U[] = { ");
		for (i = 0; i < e; i++)
			System.out.printf("%2d%s",U[i], ", ");
			System.out.print("}");
	
	}
	
}
