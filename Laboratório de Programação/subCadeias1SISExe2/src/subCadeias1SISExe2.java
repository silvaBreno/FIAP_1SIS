import java.util.Scanner;
import java.util.Random;

public class subCadeias1SISExe2
{

	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		String cadeia = new String();		
		String subSeq = new String();
		int vezes, tamCadeia, tamSubSeq, i, j;
		
		
		cadeia = gerarCadeia();
		tamCadeia = cadeia.length();
		System.out.print("Informe uma subsequência: ");
		subSeq = teclado.nextLine();
		tamSubSeq = subSeq.length();
		
		//processamento > saida
		vezes = 0;
		
		for (i = 0; i < tamCadeia-tamSubSeq; i++) 
		{
			for(j = 0; j < tamSubSeq; j++) 
			{
				if (subSeq.charAt(j) != cadeia.charAt(i+j))
					break;
				
				
			}
			if(j == tamSubSeq)
				vezes++;
		}
		
		System.out.println();
		System.out.println("cadeia:\t\t " + cadeia);
		System.out.println("subsequência:\t " + subSeq);
		System.out.println(" \t\t" + subSeq + " aparece " + vezes + " vez(es) na cadeia");
		
		teclado.close();
	}

	public static String gerarCadeia() 
	{
		String sequencias[] = {"abc", "xyz", "fgh", "rst", "ijk", "uvw"};
		String cadeia = new String();
		Random r = new Random();
		int N, i , e;
		
		N = r.nextInt(9)+5; // vai gerar um numero pseudoaleatorio entre 0 e 8
		
		for (i = 0; i < N; i++)
		{
			e = r.nextInt(sequencias.length);
			cadeia = cadeia + sequencias[e];
		}
		
		
		
		return cadeia;
		
		
	}
}
