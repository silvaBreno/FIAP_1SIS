package br.fiap.modelo;

public class PedidoDetalhe {
	private Integer idDetalhePedido;
	private Pedido pedido;
	private Produto produto;
	private int quantidade;
	private double total;
	
	public Integer getIdDetalhePedido() {
		return idDetalhePedido;
	}
	public void setIdDetalhePedido(Integer idDetalhePedido) {
		this.idDetalhePedido = idDetalhePedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
