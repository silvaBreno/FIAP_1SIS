import java.util.Scanner;

public class StringExe3versao2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String PALAVRA;
		StringBuffer ARVALAP = new StringBuffer();
		
		System.out.print("Digite uma palavra: ");
		PALAVRA = teclado.nextLine().toUpperCase(); //RECEBO A PALAVRA e converto tudo para minusculo
		ARVALAP.append(PALAVRA); // atribui plavra para arvalap por ser stringbuffer
		System.out.println("teste1: " + ARVALAP.toString());
		ARVALAP.reverse(); // so tenho o metodo reverse na classe stringbuffer
		System.out.println("teste2: " + ARVALAP.toString());
		
		if(PALAVRA.equals(ARVALAP.toString()) == true)  //converto ARVALAP para string pois um é stringbuffer e a outra é string;
			System.out.println("A palavra \"" + PALAVRA +  "\" É palíndrome!");
		else
			System.out.println("A palavra " + PALAVRA + " NÃO É palíndrome!");
		
		teclado.close();
	}

}
