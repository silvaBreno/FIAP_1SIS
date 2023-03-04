import java.util.Random;

public class secaoEspelho
{
	public static final int MINIM = 5;
	public static final int FAIXA = 10;
	public static void main(String[] args) 
	{
		int elementos,i,j,contador=0, max = 0;			
		Random r = new Random();
		
		elementos = r.nextInt(21)+MINIM; // numero de aleatorio de 0 a 20 
		int espelho[] = new int[elementos];
		
		for (i = 0; i < elementos; i++) 
		{
			espelho[i] = r.nextInt(FAIXA);// se faixa valer 10, vai gerar numeros aleatorios entre 0 e 9;
		}
		
		for (i = 0; i < elementos; i++) 
		{
			for (j = elementos -1; j >= 0; j--) 
				if(espelho[i] == espelho [j])
					contador++;
				else
					if(contador >0)
					{
						max = Math.max(contador, max);
						contador = 0;
					}
						
		}
		
		
		//ENTRADA > PROCESSAMENTO > SAÍDA
		
		System.out.print("espelho[]= {");
		for (i = 0; i < elementos; i++) {
			System.out.print(espelho[i] + ", ");
		}
		System.out.print("}\n\n");
	}

}
