
public class SelecaoMultiplaEx0 
{

	public static void main(String[] args) 
	{
		int opcao = 1;
		
		switch (opcao)
		{
		   case 1: case 3: case 5:
			System.out.println("opcao � �mpar");
			System.out.println("e= " + Math.E);
			break;
		   case 2: case 4: case 6:
			System.out.println("opcao � par");
			break;
		   default:
            System.out.println("opcao sem tratamento");	 
            break;
		}
	}
}
