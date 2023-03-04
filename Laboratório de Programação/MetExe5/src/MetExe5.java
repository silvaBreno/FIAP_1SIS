public class MetExe5 
{

	public static void main(String[] args) 
	{
		int vetor[] = {1, -2, 3, 4, -5};
		int i;
		
		System.out.print("vetor[antes]: ");
		for (i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + ", ");
		
		zeraNegativos(vetor);
		
		System.out.println();
		System.out.print("vetor[depois]: ");
		for (i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + ", ");
		
		

	}

	public static void zeraNegativos(int vet[])
	  {
		int i;
		
		for(i = 0; i < vet.length; i++)
			if(vet[i] < 0)
				vet[i] = 0;
		
	  }
}
