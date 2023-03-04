import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoExe6
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String frase = new String();
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		
		try {
			File arquivo = new File("C:\\FIAP2\\frase.txt");
			FileWriter escritor = new FileWriter(arquivo);
			escritor.write(frase);
			
			escritor.close();
		}
		catch (IOException e)
		{
			System.out.println("Exceção na operação de escrita");
			System.out.println("mensagem: " + e.getMessage());
		}
		
		
		teclado.close();
	}

}
