import java.util.Scanner;

public class Vet_Exe1
{
	public static void main(String[] args)
	{
		int i;
		Scanner teclado = new Scanner(System.in);
		int vetA[] = new int[5];
		int vetB[] = new int[5];
		int vetI[] = new int[10];

		for (i = 0; i < vetA.length; i++)
		{
			System.out.print("vetA[], " + (i+1) + "º elemento: ");
			vetA[i] = teclado.nextInt();
			vetI[2*i] = vetA[i];

			System.out.print("vetB[], " + (i+1) + "º elemento: ");
			vetB[i] = teclado.nextInt();
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

		teclado.close();
	}
}
