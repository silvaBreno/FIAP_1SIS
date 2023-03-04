import java.io.File;

public class ArquivoExe3
{

	public static void main(String[] args) 
	{
		File arqo = new File ("C:\\FIAP\\fiap.txt");
		File dest = new File ("C:\\FIAP2\\temp.txt");

		
		if(arqo.renameTo(dest)) {
			System.out.println("comando rename executado com sucesso");
		}
			else 
			{
				System.out.println("ERRO ao executar o comando rename");
				
		}
	}

}
