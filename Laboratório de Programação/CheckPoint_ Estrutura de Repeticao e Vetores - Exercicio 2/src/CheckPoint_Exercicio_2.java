
public class CheckPoint_Exercicio_2 
{

	public static void main(String[] args) 
	{
		int nr=0, x=0, soma=0, a=0, cont = 0;
		int[] perfeito = new int[4];
		boolean flag = true;

		while (flag) {
			if (cont == perfeito.length) {
				flag = false;

				for (cont = 1; cont < perfeito.length; cont++) {
					System.out.println("Perfeito " + (cont) + ": "
							+ perfeito[cont]);
				}
				break;
			}

			for (a = 1; a <= (x/2); a++) {
				nr = x % a;
				if (nr == 0) {
					soma = soma + a;
				}
			}
			if (soma == x) {
				perfeito[cont] = x;
				cont++;
			}
			soma = 0;
			x++;
		
		
		
		}
	}

}
