import java.util.Scanner;

public class CP_Exercicio_1
{
	public static final int NUMEROS = 1;
	public static final int PALAVRAS = 2;
	public static final int SAIR = 3;
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int opcao, quantidade, i, X, posicao;
		String Y = new String();
		boolean sair = false;
		
		do {
			System.out.print("\n\nO que deseja ordenar: ");
			System.out.print("\n1 - N�meros Inteiros");
			System.out.print("\n2 - Palavras");
			System.out.print("\n3 - Sair");
			System.out.print("\nInforme sua op��o: ");
			
			try
			{
				opcao = teclado.nextInt();
				
				switch(opcao) 
				{
				    case NUMEROS:
							{
								System.out.println("Ordenar N�meros: ");
								System.out.print("Quantos n�s deseja ordenar: ");
								quantidade = teclado.nextInt();
								
								int numeros[] = new int[quantidade];
								
								for(i = 0; i < numeros.length; i++)
								{
									System.out.print("Informe o " + (i+1) + "� n�mero: ");
									numeros[i] = teclado.nextInt(); 
								}
								
								System.out.print("N�meros Inseridos: ");
						        for(i = 0; i < numeros.length; i++) 
								    {
									System.out.print(numeros[i] + ", ");
									}
								
								Ordenacao.bolha(numeros);
								
								System.out.print("\nN�meros Ordenados: ");
									for(i = 0; i < numeros.length; i++)
									{
										System.out.print(i != numeros.length-1? numeros[i] + ", " : numeros[i] + ".");
									}
									
								System.out.print("\n\nInforme o n�mero que deseja pesquisar: ");
								X = teclado.nextInt();
								
								posicao = Busca.buscaBinaria(X, numeros);
								
								if (posicao != -1)
								{
									System.out.println("O n�mero " + X + " est� na posi��o " + (posicao+1));
								}
								else {
									System.out.println("O n�mero " + X + " n�o est� na rela��o.");
								}
							}
						break;
						
					case PALAVRAS:
							{
								System.out.println("Ordenar Palavras");
								System.out.print("Quantas palavras deseja ordenar: ");
								quantidade = teclado.nextInt();
								
								//declarar a string e converter em um vetor
								
								String palavras[] = new String[quantidade];
							
								//fazer um for para ele adicionar as palavras que informei anteriormente
								
								teclado.nextLine(); 
								
								for(i = 0; i < quantidade; i++)
								{
									System.out.print("Digite a " + (i + 1) + "� palavra: ");
									palavras[i] = teclado.nextLine().toUpperCase(); 
								}
								
								//imprimir o vetor criado
								
								System.out.print("Palavras Inseridas: ");
								for(i = 0; i < palavras.length; i++) 
									{
										System.out.print(palavras[i] + ", ");
									}
								
								// inserir o m�todo da outra classe
								
								Ordenacao.bolha(palavras);
								
								// imprimir o vetor palavras ordenado;
								
								System.out.print("\nPalavras Ordenadas: ");
								for(i = 0; i < palavras.length; i++)
								{
									System.out.print(i != palavras.length-1? palavras[i] + ", " : palavras[i] + ".");
								}
								
								System.out.print("\n\nInforme a palavra que deseja pesquisar:");
								Y = teclado.nextLine().toUpperCase();
								
								
								posicao = Busca.buscaBinaria(Y, palavras);
								
								if (posicao != -1)
								{
									System.out.println("A palavra " + Y + " est� na posi��o " + (posicao+1));
								}
								else {
									System.out.println("A palavra " + Y + " n�o est� na rela��o.");
								}
								
								
							}
						break;
						
					case SAIR:
							{
								sair = true;
								System.out.println("Execu��o Encerrada.");
							}
						break;
						
					default:
							{
								System.out.print("Op��o INV�LIDA! Tente Novamente...");	
							}
				}
			}	
			
			catch(Exception e)
				{
				System.out.println("!!! Exe��o !!!");
				System.out.println("Mensagem: " + e.getMessage());
				e.printStackTrace(System.out);
				}
		}while(!sair);
		
		teclado.close();


	}

}
