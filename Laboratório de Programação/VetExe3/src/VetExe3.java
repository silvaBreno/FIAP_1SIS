import java.util.Scanner;

public class VetExe3
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		Random r = new Random ();
		int i;
		int face[] = { 0,0,0,0,0,0 };
		int dado[] = new int [10];
		

		
		for (i = 0; i < dado.length; i++)
		{
			System.out.print("Informe o valor do dado no " + (i+1) + " lance: ");
			dado[i] = teclado.nextInt();
		}
		
	    System.out.print("dado[]= ");
	    for (i = 0; i < dado.length; i++)
		System.out.print(dado[i] + " , ");
			
			System.out.println();
			
	    for (i=0; i < dado.length; i++)
	    {
	    	switch (dado[i])
	    	{
	            case 1:
		        face[0]++;
		        break;
		        case 2:
				face[1]++;
				break;
	        case 3:
				face[2]++;
				break;
	        case 4:
				face[3]++;
				break;
	        case 5:
				face[4]++;
				break;
	        case 6:
				face[5]++;
				break;
			default:
				System.out.println("valor do dado inválido!!");
	    	}
				
	    }
	    
	    for (i = 0; i < face.length; i++)
	    	System.out.println("Face" + (i+1) + ": " + face[i]);
	    
       teclado.close();
	}

}
