import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ArquivoExe4
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\FIAP2\\temp.txt");
		long tamanho, atualizacao;
		
		if (arquivo.exists()){
			System.out.println("arquivo existe e: ");
			tamanho = arquivo.length();
			System.out.println("tamanho: " + tamanho + " bytes");
			atualizacao = arquivo.lastModified();
			System.out.println("atualização feita em: " + atualizacao);
			
			Date data = new Date(atualizacao); // utilizando util.date
			System.out.println("atualização feita em: " + data);
			
			SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println("atualização feita em: " + dataFormatada.format(data));			
		}
		
		else {
			System.out.println("arquivo não existe!!!!");
		}
	}

}
