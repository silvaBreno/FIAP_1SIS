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
		
		if(PALAVRA.equals(ARVALAP.toString()) == true)  //converto ARVALAP para string pois um � stringbuffer e a outra � string;
			System.out.println("A palavra \"" + PALAVRA +  "\" � pal�ndrome!");
		else
			System.out.println("A palavra " + PALAVRA + " N�O � pal�ndrome!");
		
		teclado.close();
	}

}
