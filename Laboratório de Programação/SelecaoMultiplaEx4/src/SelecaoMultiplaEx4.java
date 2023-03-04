import java.util.Scanner;
import java.text.DecimalFormat; 

public class SelecaoMultiplaEx4
{

	public static void main(String[] args)
	{
		int mes, ano, diasFev;
		
		
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formato;
		formato = new DecimalFormat("00"); 
		
		System.out.print("Informe o mes (mm): ");
		mes = teclado.nextInt();
		System.out.print("Digite o ano (aaaa): ");
		ano = teclado.nextInt();
		System.out.println("");
		
		switch (mes)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:  
			System.out.println(formato.format(mes) + "/" + ano + " tem 31 dias");
			break;
		case 2:
			//assume que nao seja ano bissexto
			diasFev = 28;
			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
			//sim
			diasFev = 29;
			System.out.println(formato.format(mes) + "/" + ano + " tem " + diasFev + " dias");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(formato.format(mes) + "/" + ano + " tem 30 dias ");
		default:
			System.out.print("opcao INVÁLIDA");	 
            break;
		}	

		teclado.close();
	}

}
