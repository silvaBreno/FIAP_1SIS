import java.util.Scanner;

public class Costureiras 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int i, ID, idade, IDjovem, idadeJovem, IDvelha, idadeVelha;
		
		IDjovem = 0;
		idadeJovem = 0;
		IDvelha = 0;
		idadeVelha = 0;
		
		for (i = 0; i < 5; i++)
		{
			System.out.print("Informe o ID da " + (i+1) + " costureira: ");
			ID = teclado.nextInt();
			System.out.print("Informe a idade da " + (i+1) + " costureira: ");
			idade = teclado.nextInt();
			
			//referencia
			if (i == 0)
			{
				idadeJovem = idade;
				IDjovem = ID;
				idadeVelha = idade;
				IDvelha = ID; 
			}
			else
			{
				if (idade < idadeJovem)
				{
					idadeJovem = idade;
					IDjovem = ID;
				}
				if (idade > idadeVelha)
				{
					idadeVelha = idade;
					IDvelha = ID;
				}
			}
		}
		
		System.out.println();
		System.out.println("costureira +jovem: " + idadeJovem + " anos, ID = " + IDjovem);
		System.out.println("costureira +velha: " + idadeVelha + " anos, ID = " + IDvelha);
		
        teclado.close(); 
	}

}
