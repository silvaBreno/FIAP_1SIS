import java.io.File;

public class ArquivoExe2
{

	public static void main(String[] args) 
	{
		File diretorio = new File("C:\\FIAP\\2021\\1SIS");
		
		if(diretorio.mkdirs()) {
			
			System.out.println("pasta <C:\\FIAP> criada com SUCESSO!");
		}
		else {
			System.out.println("ERRO ao criar a pasta <C:\\FIAP2>...");
		}

	}

}
