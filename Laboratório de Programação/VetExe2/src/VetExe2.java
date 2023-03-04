import java.util.Scanner;

public class VetExe2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int i, opcao;
		double vetR[] = new double [5];
		
		for(i = 0; i < vetR.length; i++)
		{
			System.out.print("Informe o " + (i+1) + " elemento do vetor: ");
			vetR[i] = teclado.nextDouble();
		}
		
		/*
		 para nao ter q fazer essa parte abaixo eu fiz linha de codigo de cima
		 
		 System.out.print("Informe o 1 elemento do vetor: ");
		vetR[0] = teclado.nextDouble();
		System.out.print("Informe o 2 elemento do vetor: ");
		vetR[1] = teclado.nextDouble();
		System.out.print("Informe o 3 elemento do vetor: ");
		vetR[2] = teclado.nextDouble();
		System.out.print("Informe o 4 elemento do vetor: ");
		vetR[3] = teclado.nextDouble();
		System.out.print("Informe o 5 elemento do vetor: ");
		vetR[4] = teclado.nextDouble();*/
		
		System.out.println("==1: direta / !=1: reversa");
		opcao = teclado.nextInt();
		
		if (opcao == 1)
		  for (i = 0; i < vetR.length; i++)
			System.out.println("vetR[" + i + "]= " + vetR[i]);
		
		
		else
		  for (i = 4; i >=0 ; i--)
			System.out.println("vetR[" + i + "]= " + vetR[i]);
		
		
				
       teclado.close();
	}

}
