import java.util.Random;

public class Vet_Exe1v2
{
	public static void main(String[] args)
	{
		int i;
		Random r = new Random();
		int vetA[] = new int[10];
		int vetB[] = new int[10];
		int vetI[] = new int[20];

		for (i = 0; i < vetA.length; i++)
		{
			vetA[i] = r.nextInt(10)+1;
			vetI[2*i] = vetA[i];

			vetB[i] = r.nextInt(10)+1;
			vetI[2*i+1] = vetB[i];
		}

		System.out.print("\nvetA[]= ");
		for (i = 0; i < vetA.length; i++)
			System.out.print(vetA[i] + ", " );

		System.out.print("\nvetB[]= ");
		for (i = 0; i < vetB.length; i++)
			System.out.print(vetB[i] + ", " );

		System.out.print("\nvetI[]= ");
		for (i = 0; i < vetI.length; i++)
			System.out.print(vetI[i] + ", " );
	}
}
