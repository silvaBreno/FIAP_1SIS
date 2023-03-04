import java.io.File;

public class ArquivoExe5 
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\FIAP2\\temp.txt");
		
		if (arquivo.exists()) {
			if (arquivo.delete())
				System.out.println("arquivo <temp.txt> excluído com SUCESSO!!!");
			else
				System.out.println("não foi possível excluir o arquivo <temp.txt>");
		}
		else {
			System.out.println("arquivo <temp.txt> não existe");
		}
		

	}

}
