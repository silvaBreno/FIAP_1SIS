import java.util.Scanner;

//{ ( [ ( [ ( [ [ [ ( ) ] ] ] ) ] ) ] ) } BEM formada
//{ ( [ ( [ ( [ [ [ ( ) ] ] ] ) ] ) ] ] } MALformada
public class seqBemFormadaOtimizado
{

		static char pilha[] = new char[64];
		static int gElementos = 0;



		public static void main(String[] args)
		{
		Scanner teclado = new Scanner(System.in);
		String sequencia = new String();
		boolean seqOK = true;
		int tamanho, i;



		System.out.print("Informe uma sequência: ");
		sequencia = teclado.nextLine();
		tamanho = sequencia.length();

		for (i = 0; i < tamanho; i++)
		{
		switch (sequencia.charAt(i))
		{
		case ')':
		if (pilhaVazia() == true || removePilha() != '(')
		{
		seqOK = false;
		break;
		}



		break;



		case ']':
		if (pilhaVazia() == true || removePilha() != '[')
		{
		seqOK = false;
		break;
		}



		break;



		case '}':
		if (pilhaVazia() == true || removePilha() != '{')
		{
		seqOK = false;
		break;
		}



		break;



		default:
		if (sequencia.charAt(i) != ' ')
		inserePilha(sequencia.charAt(i));
		}
		}



		if (seqOK == true)
		System.out.println("\nSequência BEM formada!");
		else
		System.out.println("\nSequência MALformada!");



		teclado.close();
		}



		public static boolean pilhaVazia()
		{
		if (gElementos == 0)
		return true;
		else
		return false;
		}



		public static void inserePilha(char simbolo)
		{
		pilha[gElementos++] = simbolo;
		//gElementos++;
		}



		public static char removePilha()
		{
		//gElementos--;
		return pilha[--gElementos];
		}
		
}
