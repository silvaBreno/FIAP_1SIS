import java.util.Scanner;

public class SelecaoMultiplaEx2 
{

	public static void main(String[] args) 
	{
		int opcao, lado, base, altura, raio;
		double area;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite (1) para Quadrado");
		System.out.println("Digite (2) para Triângulo");
		System.out.println("Digite (3) para Círculo");
		System.out.print("opcao = ");
		opcao = teclado.nextInt();
		
		switch (opcao)
		{
		
		  case 1: 
			  System.out.print("Informe o lado do Quadrado: ");
			  lado = teclado.nextInt();
			  area = Math.pow(lado, 2);
			  System.out.print("area (Q)= " + area);
			  break;
		  case 2:
			  System.out.print("Informe o valor da base do Triângulo: ");
			  base = teclado.nextInt();
			  System.out.print("Informe o valor da altura do Triângulo: ");
			  altura = teclado.nextInt();
			  //area = (base * altura)/ 2; -> se eu nao comentar double na frente o resultado de 5x5/2 vai dar 12 ao inves de 12,5
			  area = (double)(base * altura)/ 2;
			  System.out.print("area (T)= " + area);
			  break;	
		  case 3: 
			  System.out.print("Informe o raio do Círculo: ");
			  raio = teclado.nextInt();
			  area = Math.pow(raio, 2)*Math.PI;
			  System.out.print("area (C)= " + area);
			  break;
		  default:
             System.out.print("opcao INVÁLIDA");	 
             break;
			
		
		}
		
		
		teclado.close();
	}

}
