package br.fiap.mensagem;

import br.fiap.cliente.Cliente;

public class Mensagem {
	
	Cliente cliente;
	String msg;
	
	
	public Mensagem(Cliente cliente, String msg) {
		super();
		this.cliente = cliente;
		this.msg = msg;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
