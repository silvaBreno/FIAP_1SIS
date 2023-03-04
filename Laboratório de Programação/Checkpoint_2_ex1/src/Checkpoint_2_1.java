
public class Checkpoint_2_1 
{

	public static void main(String[] args)
	{
		int hip, ct1, ct2, trio;
		
		trio=0;
		
		for(hip = 1; hip <= 100; hip++)
			for(ct1 = 1; ct1 <= hip; ct1++)
				for(ct2 = 1; ct2 <= hip; ct2++)
			
		// hip = 5, ct = 1 ct2 = 1
		// hip = 5, ct = 1 ct2 = 2
		// hip = 5, ct = 1 ct2 = 3
		// hip = 5, ct = 1 ct2 = 4
		// hip = 5, ct = 1 ct2 = 5
					
		// hip = 5, ct = 2 ct2 = 1
		// hip = 5, ct = 2 ct2 = 2
		// hip = 5, ct = 2 ct2 = 3
		// hip = 5, ct = 2 ct2 = 4
		// hip = 5, ct = 2 ct2 = 5
			
					if(Math.pow(hip, 2) == Math.pow(ct1, 2) + Math.pow(ct2, 2))
						if( ct1 > ct2 ) // isso eh para considerar a parte dos distintos e n ser possivel ser 4,3 e 3,4
						{
							trio++;
							System.out.printf("%2d%s", trio, "º trio pitagórico: ");
							System.out.printf("%3d%s%3d%s%3d\n", hip, "  ", ct1, "  ", ct2);					
						}
	}

}
