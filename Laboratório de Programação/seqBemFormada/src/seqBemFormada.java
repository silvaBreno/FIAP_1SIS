import java.util.Scanner;

//  { ( [ ( [ ( [ [ [ ( ) ] ] ] ) ] ) ] ) } = BEM FORMADA
//  { ( [ ( [ ( [ [ [ ( ) ] ] ] ) ] ) ] } } = MAL FORMADA

public class seqBemFormada
{
	static char simbolos[] = new char[64];
	static int gElementos = 0;
	
	public static void main(String[] args)
	{
		//entrada > processamento > sa�da
		Scanner teclado = new Scanner(System.in);
		String sequencia = new String();
		boolean seqOK = true;
		int tamanho, i;
		
		System.out.print("Informe uma sequ�ncia: ");
		sequencia = teclado.nextLine();
		tamanho = sequencia.length();		
		//processamento
		
		for (i = 0; i < tamanho; i++) 
		{
			switch(sequencia.charAt(i))
			{
				case ')':
					if (simbolosVazio() == true)
					{
						seqOK = false;
						break;
					}
					
					if (removeSimbolo() != '(') 
					{
						seqOK = false;
						break;
					}
						
					
					break;
				
				case ']':
					if (simbolosVazio() == true)
					{
						seqOK = false;
						break;
					}
					
					if (removeSimbolo() != '[') 
					{
						seqOK = false;
						break;
					}
				
					break;	
					
				case '}':
					if (simbolosVazio() == true)
					{
						seqOK = false;
						break;
					}
					
					if (removeSimbolo() != '{') 
					{
						seqOK = false;
						break;
					}
					
					break;
					
				default :
					if(sequencia.charAt(i) != ' ')
						insereSimbolo(sequencia.charAt(i));
					
					break;
			
			}
		}
		
		
		//se seqOK == true, teremos uma sequencia bem formada
		if (seqOK == true)
		{
			System.out.print("\nSequ�ncia BEM formada! ");
		}
		else 
		{
			System.out.print("\nSequ�ncia MALformada! ");
		}
		
		
		teclado.close();
	}
	
	public static boolean simbolosVazio()
	{
		if (gElementos ==0 )
			return true;
		else
			return false;
	}
	public static void insereSimbolo(char simbolo)
	{
		simbolos[gElementos++] = simbolo;
		//gElementos++;
		
	}	
	
	public static char removeSimbolo()
	{
		//gElementos--;
		return simbolos[--gElementos];
	}
}

