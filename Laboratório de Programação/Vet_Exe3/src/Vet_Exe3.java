import java.util.Random;

public class Vet_Exe3
{
	public static void main(String[] args)
	{
		int i;
		int dado[] = new int[10];
		int face[] = {0, 0, 0, 0, 0, 0};
		Random r = new Random();

		for (i = 0; i < dado.length; i++)
			dado[i] = r.nextInt(6)+1;

		for (i = 0; i < dado.length; i++)
			face[dado[i]-1]++; 

		System.out.print("dado[]= ");
		for (i = 0; i < dado.length; i++)
			System.out.print(dado[i] + ", ");

		System.out.println();
		for (i = 0; i < face.length; i++)
			System.out.println("face" + (i+1) + "= " + face[i]);
	}

}
