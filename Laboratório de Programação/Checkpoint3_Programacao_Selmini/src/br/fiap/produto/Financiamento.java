package br.fiap.produto;

import br.fiap.cliente.Cliente;

public class Financiamento extends Produto {

	private double valorFinanciado;
	private int totalDeParcelas;
	

	public Financiamento(Cliente cliente, double valorFinanciado, int totalDeParcelas) {
		super(cliente);
		this.valorFinanciado = valorFinanciado;
		this.totalDeParcelas = totalDeParcelas;
	}



	@Override
	public String toString() {
		
		String aux = super.getCliente().toString();
		aux += "Valor Financiado: " + valorFinanciado + "\n";
		aux += "Total De Parcelas: " + totalDeParcelas + "\n";
		
		return aux;
	}
	
	
	
}
