
public class ValidaCPF 
{

	public static void main(String[] args)
	{
		int CPF[] = {0, 6, 6, 3, 2, 1, 1, 4, 8, 4, 9};
		int i, peso, soma, resto, dv1i, dv1c;
		
		dv1i = 4;
		peso = 10; 
		soma = 0;
		
		for (i= 0; i < 9; i++)
		{
			soma =  soma + peso * CPF[i];
			peso--;
		}
		
		resto = soma % 11;
		if (resto <2)
			dv1c = 0;
		else 
			dv1c = 11 - resto; 
		
		if ((dv1c == )
	}

}
