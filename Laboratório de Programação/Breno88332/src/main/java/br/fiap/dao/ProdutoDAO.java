package br.fiap.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.dao.conexao.Conexao;
import br.fiap.modelo.Categoria;
import br.fiap.modelo.Produto;

public class ProdutoDAO extends DAO {
	public List<Produto> listar(){
		List<Produto> lista = new ArrayList<Produto>();
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		Produto produto;
		Categoria categoria;
		
		sql = "";
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()){
				categoria = new Categoria();
				categoria.setNomeCategoria(rs.getString(""));
				produto = new Produto();
				produto.setNomeProduto(rs.getString(""));
				produto.setDescricaoProduto(rs.getString(""));
				produto.setPreco(rs.getDouble(""));
				produto.setCategoria(categoria);
				lista.add(produto);
			}
			ps.close();
			conexao.desconectar();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void inserir(Produto produto) {
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		sql = "";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, produto.getCategoria().getIdCategoria());
			ps.setString(2, produto.getNomeProduto());
			ps.setString(3, produto.getDescricaoProduto());
			ps.setDouble(4, produto.getPreco());
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			System.out.println("Erro ao inserir produto\n" + e);
		}
	}
}
