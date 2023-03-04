import java.io.File;

public class ArquivoExe1
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\BrenoJava\\temp.txt");
		File diretorio = new File("C:\\BrenoJava");
		
		if(arquivo.exists())
		{
			System.out.println("O arquivo temp.txt existe fisicamente.");
			
			if (arquivo.canRead())
			{
				System.out.println("O arquivo temp.txt pode ser lido.");
			}
			else 
			{
				System.out.println("O arquivo temp.txt NAO pode ser lido.");
			}
			
			if (arquivo.canWrite())
			{
				System.out.println("O arquivo temp.txt pode ser escrito.");
			}
			else 
			{
				System.out.println("O arquivo temp.txt NAO pode ser escrito.");
			}
			
			if (arquivo.canExecute())
			{
				System.out.println("O arquivo temp.txt pode ser executado.");
			}
			else 
			{
				System.out.println("O arquivo temp.txt NAO pode ser executado.");
			}
			
				
		}
		else
		{
			System.out.println("O arquivo temp.txt NAO existe fisicamente.");
			
			if(arquivo.isDirectory())
			{
				System.out.println("O arquivo faz referencia a um diretório.");
			}
			
			else
			{
				System.out.println("O arquivo NAO faz referencia a um diretório.");
			}
		}
	}

}
