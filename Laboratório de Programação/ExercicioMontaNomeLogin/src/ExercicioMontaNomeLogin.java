import java.util.Scanner;
import java.util.Random;

public class ExercicioMontaNomeLogin
{
	public static final int SENHA = 12;
	public static final int ALFABETO = 26;
	public static final int DIGITOS = 10;
	public static final int ESPECIAIS = 23;	
	public static final int SIMBOLOS = 4;
	public static void main(String[] args)
	{

		Scanner teclado = new Scanner (System.in);
		String nomeCompleto = new String();
		String nomeCompletoMinusculo = new String();
		StringBuffer login = new StringBuffer();
		String nomes[] = new String[1];
		String senha = new String();
		
		
		System.out.print("Informe o nome completo para gerar seu login: ");
		nomeCompleto = teclado.nextLine();
		nomeCompletoMinusculo = nomeCompleto.toLowerCase();
		
		String letraInicial = nomeCompletoMinusculo.substring(0,1);
		System.out.print("Letra: " + letraInicial);
		
		
		
		nomes = nomeCompletoMinusculo.split(" "); // nomes[0] = "rosalind"
												  // nomes[1] = "elsie"
												  // nomes[2] = "franklin"		 
		login.append(nomes[0].charAt(0));
		if (nomes.length > 2) {
			login.append(nomes[1].charAt(0));
		}
		
		login.append(nomes[nomes.length-1]);
		
		senha = gerarSenha();
		
		System.out.println("\n\n");
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("Login: " + login);
		System.out.println("Senha: " + senha);
		
		teclado.close();
	}

	public static String gerarSenha() 
	{
		String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
		String digitos = "0123456789";
		String especiais = "!@#$%&*{[()]}-+=^~<>:;,.";
		String senha = new String();
		Random r = new Random();
		int N, i;
		int LT, lt, dg, es;



		LT = SENHA/SIMBOLOS;
		lt = LT;
		dg = LT;
		es = LT;



		for (i = 0; i < SENHA; i++)
		{
			switch (r.nextInt(SIMBOLOS))
			{
			case 0:
				if (LT > 0)
				{
					N = r.nextInt(ALFABETO);
					senha = senha + LETRAS.charAt(N);
					LT--;
				}
				else
					i--;
				break;



			case 1:
				if (lt > 0)
				{
					N = r.nextInt(ALFABETO);
					senha = senha + letras.charAt(N);
					lt--;
				}
				else
					i--;
				break;



			case 2:
				if (dg > 0)
				{
					N = r.nextInt(DIGITOS);
					senha = senha + digitos.charAt(N);
					dg--;
				}
				else
					i--;
				break;



			case 3:
				if (es > 0)
				{
					N = r.nextInt(ESPECIAIS);
					senha = senha + especiais.charAt(N);
					es--;
				}
				else
					i--;
				break;



			default:
				break;
			}
		}
		
		
		return(senha);
	}
}
