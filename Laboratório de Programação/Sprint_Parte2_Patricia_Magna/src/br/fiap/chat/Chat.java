package br.fiap.chat;

import java.util.Scanner;

import br.fiap.cliente.Cliente;
import br.fiap.filaMensagens.FilaMensagens;
import br.fiap.mensagem.Mensagem;

public class Chat {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);
		FilaMensagens fila = new FilaMensagens();
		fila.init();
		Cliente clientes[] = new Cliente[10];
		
		
		int n = 0;
		int opcao;

		do {
			System.out.println(" \n 0 - Para sair do sistema ");
			System.out.println(" 1 - Para enviar mensagem pelo chat");
			System.out.println(" 2 - Ler e responder mensagem de chat ");
			System.out.print(" Digite op??o: ");
			opcao = le.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Finalizado o atendimento");
				break;
				
				
			case 1:
				System.out.print("Digite seu id: ");
				int id = le.nextInt();
				int i;

				boolean achou = false;
				i = 0;
				while (i < n && !achou) {
					if (clientes[i].getId() == id)
						achou = true;
					else
						i++;
				}
				if (!achou) {
					System.out.println("Fazendo o cadastro deste id...");
					System.out.print("Digite seu nome: ");
					String nome = le.next();
					Cliente cli = new Cliente(id, nome);
					clientes[n] = cli;
					n++;
				}
				System.out.println("Digite mensagem a ser enviada: ");
				le.nextLine();
				String msg = le.nextLine();
				Mensagem m = new Mensagem(clientes[i], msg);
				fila.enqueue(m);
				break;
				
				
			case 2:
				if (!fila.isEmpty()) {
					m = fila.dequeue();

					System.out.println("\nEnviado pelo cliente:\n" + m.getCliente());
					System.out.println("\tMensagem: " + m.getMsg());
				} else
					System.out.println("\nN?o h? mensagens na fila");
				break;

			default:
				System.out.println("Op??o inv?lida!");
			}
		} while (opcao != 0);
	
		le.close();
	}

}
