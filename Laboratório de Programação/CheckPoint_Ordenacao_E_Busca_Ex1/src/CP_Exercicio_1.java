import java.util.Scanner;

public class CP_Exercicio_1
{
	public static final int NUMEROS = 1;
	public static final int PALAVRAS = 2;
	public static final int SAIR = 3;
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		int opcao, quantidade, i;
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
							}
						break;
						
					case PALAVRAS:
							{
								System.out.println("Ordenar Palavras");
								System.out.print("Quantas palavras deseja ordenar: ");
								quantidade = teclado.nextInt();
								
								
								String palavras[] = new String[quantidade];
							
					
								
								teclado.nextLine(); 
								
								for(i = 0; i < quantidade; i++)
								{
									System.out.print("Digite a " + (i + 1) + "ª palavra: ");
									palavras[0] = teclado.nextLine().toUpperCase(); 
									
								}
								
			
								System.out.print("Palavras Inseridas: ");
								for(i = 0; i < palavras.length; i++) 
									{
										System.out.print(palavras[i] + ", ");
									}
								
										
								Ordenacao.bolha(palavras);
								
															
								System.out.print("\nPalavras Ordenadas: ");
								for(i = 0; i < palavras.length; i++)
								{
									System.out.print(i != palavras.length-1? palavras[i] + ", " : palavras[i] + ".");
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
				System.out.println("!!! Exceção !!!");
				System.out.println("Mensagem: " + e.getMessage());
				e.printStackTrace(System.out);
				}
		}while(!sair);
		
		teclado.close();


	}

}
