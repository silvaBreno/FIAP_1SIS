import java.util.Scanner;

public class Vet_Exe2
{
	public static void main(String[] args)
	{
		int i, opcao;
		float vetR[] = new float[5];
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < vetR.length; i++)
		{
			System.out.print("vetR[]: " + (i+1) + "º elemento: ");
			vetR[i] = teclado.nextFloat();
		}

		System.out.print("=1,direta / !1,reversa: ");
		opcao = teclado.nextInt();
		System.out.print("vetR[]= ");
		if (opcao == 1)
			for (i = 0; i < vetR.length; i++)
				System.out.print(vetR[i] + " / ");
		else
			for (i = vetR.length-1; i >= 0; i--)
				System.out.print(vetR[i] + " / ");

		teclado.close();
	}
}
