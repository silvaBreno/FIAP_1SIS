import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoExe7
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String frase = new String();
		int caractere;
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		
		////aprendendo a como escrever o arquivo
		try {
			File arquivoW = new File("C:\\FIAP2\\arq_char.txt");
			FileWriter escritor = new FileWriter(arquivoW, true);
			escritor.write(frase);
			escritor.flush();
			escritor.close();
		}
		catch (IOException eW)
		{
			System.out.println("Exceção na operação de escrita");
			System.out.println("mensagem: " + eW.getMessage());
		}
		
		//aprendendo a como ler o arquivo
		try  //R = Reading e W= writing
		{
			File arquivoR = new File("C:\\FIAP2\\arq_char.txt");
			FileReader leitor = new FileReader(arquivoR);
			
			System.out.print("conteudo de arq_char.txt: ");
			caractere = leitor.read();
			//fim do arquivo: EOF= -1
			while (caractere != -1)
			{
				System.out.print((char)caractere);
				caractere = leitor.read();
			}
			leitor.close();
		}
		
		catch (IOException eR)
		{
			System.out.println("Exceção na operação de escrita");
			System.out.println("mensagem: " + eR.getMessage());
			
		}
		
		
		teclado.close();
	}

}
