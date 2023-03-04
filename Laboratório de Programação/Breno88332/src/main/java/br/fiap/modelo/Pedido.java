package br.fiap.modelo;

import java.util.Date;

public class Pedido {
	private Integer idPedido;
	private String nomeContato;
	private String enderecoContato;
	private Date data;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEnderecoContato() {
		return enderecoContato;
	}

	public void setEnderecoContato(String enderecoContato) {
		this.enderecoContato = enderecoContato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
