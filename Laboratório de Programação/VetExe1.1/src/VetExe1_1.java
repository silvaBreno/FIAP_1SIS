import java.util.Scanner;

public class VetExe1_1
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int i, j;
		int vetA[] = new int[5];
		int vetB[] = new int[5];
		int vetI[] = new int[10];

		// preencher o vetor A:
		for(i = 0; i < 5; i++)
		{
		System.out.print("vetA[], " + (i+1) + "� elemento= ");
		vetA[i] = teclado.nextInt();
		}



		// preencher o vetor B
		for(i = 0; i < 5; i++)
		{
		System.out.print("vetB[], " + (i+1) + "� elemento= ");
		vetB[i] = teclado.nextInt();
		}


		teclado.close();

		// montar o vetor I
		j = 0;
		for(i = 0; i < 5; i++)
		{
		vetI[j] = vetA[i];
		j++;
		vetI[j] = vetB[i];
		j++;
		}

		System.out.println();
		System.out.print("vetA[]= ");
		for(i = 0; i < 5; i++)
		System.out.print(vetA[i] + ", ");


		System.out.println();
		System.out.print("vetB[]= ");
		for(i = 0; i < 5; i++)
		System.out.print(vetB[i] + ", ");

		System.out.println();
		System.out.print("vetI[]= ");
		for(i = 0; i < 10; i++)
		System.out.print(vetI[i] + ", ");


	}

}
