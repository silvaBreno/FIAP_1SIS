import java.io.File;

public class ArquivoExe5 
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\FIAP2\\temp.txt");
		
		if (arquivo.exists()) {
			if (arquivo.delete())
				System.out.println("arquivo <temp.txt> exclu�do com SUCESSO!!!");
			else
				System.out.println("n�o foi poss�vel excluir o arquivo <temp.txt>");
		}
		else {
			System.out.println("arquivo <temp.txt> n�o existe");
		}
		

	}

}
