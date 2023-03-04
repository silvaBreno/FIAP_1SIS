import java.util.Scanner;

public class GlobalSolution_SistemaCadastro
{
	public static final int CADASTRAR = 1;
	public static final int BOVINO = 1;
	public static final int RELATORIO = 2;
	public static final int SUINO = 2;
	public static final int PESQUISA = 3;
	public static final int CAPRINO = 3;
	public static final int SAIR = 4;
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		int opcao, opcaoCadastros;
		boolean sair = false;
		
		do {
			System.out.print("\n\nBem vindo ao sistema de cadastro de animais: ");
			System.out.print("\n1 - Cadastrar");
			System.out.print("\n2 - Relatório");
			System.out.print("\n3 - Pesquisa");
			System.out.print("\nInforme sua opção: ");
			
			try
			{
				opcao = teclado.nextInt();
			
	
		
				switch(opcao) 
				{
				    case CADASTRAR:
							{
								System.out.print("\nO que deseja cadastrar: ");
								System.out.print("\n1 - Bovino");
								System.out.print("\n2 - Suíno");
								System.out.print("\n3 - Caprino");
								System.out.print("\nInforme sua opção: ");
								opcaoCadastros = teclado.nextInt();
								
								
								switch(opcaoCadastros) {
													case BOVINO:{														
														String cadastros[] = new String[3];
														
														System.out.println("\nCadastro de Bovinos: ");
														System.out.print("Informe a raça do animal: ");
														cadastros[0] = teclado.nextLine().toUpperCase(); 
														
														
														teclado.nextLine();														
														System.out.print("\nInforme o peso(kg) do animal: ");
														cadastros[1] = teclado.nextLine();
														
														System.out.print("\nInforme a idade do animal: ");
														cadastros[2] = teclado.nextLine();
										
														System.out.print("Cadastro do animal finalizado");
														
													}	
													   break;
													   
													case SUINO:{
														String cadastros[] = new String[3];
														
														System.out.println("\nCadastro de Suinos: ");
														System.out.print("Informe a raça do animal: ");
														cadastros[0] = teclado.nextLine().toUpperCase(); 
														
														
														teclado.nextLine();														
														System.out.print("\nInforme o peso(kg) do animal: ");
														cadastros[1] = teclado.nextLine();
														
														System.out.print("\nInforme a idade do animal: ");
														cadastros[2] = teclado.nextLine();
										
														System.out.print("Cadastro do animal completo finalizado");
													}	
													break;
													
													case CAPRINO:{
														String cadastros[] = new String[3];
														
														System.out.println("\nCadastro de Caprinos: ");
														System.out.print("Informe a raça do animal: ");
														cadastros[0] = teclado.nextLine().toUpperCase(); 
														
														
														teclado.nextLine();														
														System.out.print("\nInforme o peso(kg) do animal: ");
														cadastros[1] = teclado.nextLine();
														
														System.out.print("\nInforme a idade do animal: ");
														cadastros[2] = teclado.nextLine();
										
														System.out.print("Cadastro do animal completo finalizado");
													}	
													break;
								
								
								}
								
							}
						break;
						
					case RELATORIO:
							{
								
							
							}
						break;
						
					case PESQUISA:
							{
								sair = true;
								System.out.println("Execução Encerrada.");
							}
						break;
						
					case SAIR:
					{
						sair = true;
						System.out.println("Execução Encerrada.");
					}
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
