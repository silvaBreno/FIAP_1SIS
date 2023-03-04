import java.util.Scanner;

public class CheckPoint_Exercício_3 
{

	public static void main(String[] args)
    {
		int erro;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o código de status HTTP desejado para mais informações: ");
		erro = teclado.nextInt();
		
		switch (erro)
		{
		    case 400:
		    	System.out.println("Requisição inválida: Pedido não pôde ser processado devido à sintaxe incorreta.");
		    	break;
		    case 403:
		    	System.out.println("Proibido: Pedido reconhecido pelo servidor, mas este recusa-se a executá-lo.");
		    	break;
		    case 404:
		    	System.out.println("Não encontrado: Recurso requisitado não foi encontrado.");
		    	break;
		    case 408:
		    	System.out.println("Tempo de requisição esgotado: Servidor sofreu timeout ao aguardar pela solicitação.");
		    	break;
		    case 500:
		    	System.out.println("Erro interno do servidor: Indica um erro do servidor ao processar a solicitação.");
		    	break;
		    case 501:
		    	System.out.println("Não implementado: Servidor não suporta a funcionalidade ativada.");
		    	break;
		    case 503:
		    	System.out.println("Serviço indisponível: Servidor está em manutenção ou sobrecarregado.");
		    	break;
		    default:
	             System.out.print("Consulte a página https://tools.ietf.org/html/rfc2616");	 
	             break;
		}
		teclado.close();
	}

}
