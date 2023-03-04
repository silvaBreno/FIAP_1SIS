import java.util.Scanner;

public class SelecaoMultiplaEx3 
{

	public static void main(String[] args) 
	{
		int lado, base, altura, raio;
		char opcao;
		double area;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite (Q) para Quadrado");
		System.out.println("Digite (T) para Tri�ngulo");
		System.out.println("Digite (C) para C�rculo");
		System.out.print("opcao = ");
		opcao = (char)(teclado.nextLine().charAt(0));
		
		switch (opcao)
		{
		
		  case 'Q':  case 'q': 
			  System.out.print("Informe o lado do Quadrado: ");
			  lado = teclado.nextInt();
			  area = Math.pow(lado, 2);
			  System.out.print("area (Q)= " + area);
			  break;
		  case 'T':  case 't': 
			  System.out.print("Informe o valor da base do Tri�ngulo: ");
			  base = teclado.nextInt();
			  System.out.print("Informe o valor da altura do Tri�ngulo: ");
			  altura = teclado.nextInt();
			  //area = (base * altura)/ 2; -> se eu nao comentar double na frente o resultado de 5x5/2 vai dar 12 ao inves de 12,5
			  area = (double)(base * altura)/ 2;
			  System.out.print("area (T)= " + area);
			  break;	
		  case 'C':  case 'c': 
			  System.out.print("Informe o raio do C�rculo: ");
			  raio = teclado.nextInt();
			  area = Math.pow(raio, 2)*Math.PI;
			  System.out.print("area (C)= " + area);
			  break;
		  default:
             System.out.print("opcao INV�LIDA");	 
             break;
			
		
		}
		
		
		teclado.close();
	}

}
