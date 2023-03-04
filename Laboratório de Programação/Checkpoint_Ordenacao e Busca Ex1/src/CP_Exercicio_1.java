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
			System.out.print("\n1 - Números Inteiros");
			System.out.print("\n2 - Palavras");
			System.out.print("\n3 - Sair");
			System.out.print("\nInforme sua opção: ");
			
			try
			{
				opcao = teclado.nextInt();
				
				switch(opcao) 
				{
				    case NUMEROS:
							{
								System.out.println("Ordenar Números: ");
								System.out.print("Quantos nºs deseja ordenar: ");
								quantidade = teclado.nextInt();
								
								int numeros[] = new int[quantidade];
								
								for(i = 0; i < numeros.length; i++)
								{
									System.out.print("Informe o " + (i+1) + "º número: ");
									numeros[i] = teclado.nextInt(); 
								}
								
								System.out.print("Números Inseridos: ");
						        for(i = 0; i < numeros.length; i++) 
								    {
									System.out.print(numeros[i] + ", ");
									}
								
								Ordenacao.bolha(numeros);
								
								System.out.print("\nNúmeros Ordenados: ");
									for(i = 0; i < numeros.length; i++)
									{
										System.out.print(i != numeros.length-1? numeros[i] + ", " : numeros[i] + ".");
									}
									
								System.out.print("\n\nInforme o número que deseja pesquisar: ");
								X = teclado.nextInt();
								
								posicao = Busca.buscaBinaria(X, numeros);
								
								if (posicao != -1)
								{
									System.out.println("O número " + X + " está na posição " + (posicao+1));
								}
								else {
									System.out.println("O número " + X + " não está na relação.");
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
									System.out.print("Digite a " + (i + 1) + "ª palavra: ");
									palavras[i] = teclado.nextLine().toUpperCase(); 
								}
								
								//imprimir o vetor criado
								
								System.out.print("Palavras Inseridas: ");
								for(i = 0; i < palavras.length; i++) 
									{
										System.out.print(palavras[i] + ", ");
									}
								
								// inserir o método da outra classe
								
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
									System.out.println("A palavra " + Y + " está na posição " + (posicao+1));
								}
								else {
									System.out.println("A palavra " + Y + " não está na relação.");
								}
								
								
							}
						break;
						
					case SAIR:
							{
								sair = true;
								System.out.println("Execução Encerrada.");
							}
						break;
						
					default:
							{
								System.out.print("Opção INVÁLIDA! Tente Novamente...");	
							}
				}
			}	
			
			catch(Exception e)
				{
				System.out.println("!!! Exeção !!!");
				System.out.println("Mensagem: " + e.getMessage());
				e.printStackTrace(System.out);
				}
		}while(!sair);
		
		teclado.close();


	}

}
