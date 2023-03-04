package br.fiap.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.fiap.cliente.Cliente;
import br.fiap.produto.CartaoDeCredito;
import br.fiap.produto.Financiamento;
import br.fiap.produto.Produto;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		
		Scanner teclado = new Scanner(System.in);
		
		// cartao de credito -> Cliente, numero, saldo
		// Cliente -> nome, cpf
		
		for(int i = 0; i < 4; i++) {
			
			Produto[] item = new Produto[4];			
			String nome, cpf;
			int numero;
			double saldo;
			
			System.out.print("Informe o nome do cliente: ");
			nome = teclado.nextLine();
			
			System.out.print("Informe o CPF do cliente: ");
			cpf = teclado.nextLine();
			
			System.out.print("Informe o numero do cliente: ");
			numero = teclado.nextInt();
			
			System.out.print("Informe o saldo do cliente: ");
			saldo = teclado.nextDouble();
			
			teclado.nextLine();
			
			item[i] = new CartaoDeCredito(new Cliente(nome, cpf), numero, saldo);
			lista.add(item[i]);
			
		}
		
		
		dadosCartaoDeCredito(lista);
		
		teclado.close();
	}

	private static void dadosCartaoDeCredito(ArrayList<Produto> lista) {
		
		System.out.println("Dados do Cartao de Crédidto: \n");
		
		for(Produto p : lista) {
			if (p instanceof CartaoDeCredito) {
				System.out.println(p);
			}
		}
	}
	
}
