import java.util.Scanner;

public class CheckPoint_Exerc�cio_3 
{

	public static void main(String[] args)
    {
		int erro;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o c�digo de status HTTP desejado para mais informa��es: ");
		erro = teclado.nextInt();
		
		switch (erro)
		{
		    case 400:
		    	System.out.println("Requisi��o inv�lida: Pedido n�o p�de ser processado devido � sintaxe incorreta.");
		    	break;
		    case 403:
		    	System.out.println("Proibido: Pedido reconhecido pelo servidor, mas este recusa-se a execut�-lo.");
		    	break;
		    case 404:
		    	System.out.println("N�o encontrado: Recurso requisitado n�o foi encontrado.");
		    	break;
		    case 408:
		    	System.out.println("Tempo de requisi��o esgotado: Servidor sofreu timeout ao aguardar pela solicita��o.");
		    	break;
		    case 500:
		    	System.out.println("Erro interno do servidor: Indica um erro do servidor ao processar a solicita��o.");
		    	break;
		    case 501:
		    	System.out.println("N�o implementado: Servidor n�o suporta a funcionalidade ativada.");
		    	break;
		    case 503:
		    	System.out.println("Servi�o indispon�vel: Servidor est� em manuten��o ou sobrecarregado.");
		    	break;
		    default:
	             System.out.print("Consulte a p�gina https://tools.ietf.org/html/rfc2616");	 
	             break;
		}
		teclado.close();
	}

}
