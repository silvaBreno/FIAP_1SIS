package br.fiap.dao;

import java.sql.SQLException;

import br.fiap.dao.conexao.Conexao;
import br.fiap.modelo.Categoria;

public class CategoriaDAO extends DAO {
	public void alterar(String nome) {
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		sql= "update (nomeDaTabela) set NOME = ? where";
		try {
			ps = connection.prepareStatement(sql);
			ps.execute();
			ps.close();
			conexao.desconectar();
		}catch(SQLException e) {
			System.out.println("Erro ao alterar a categoria:\n" + e);
		}
	}
	public void inserir(Categoria categoria) {
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		sql = "insert into ... values()";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, categoria.getNomeCategoria());
			ps.execute();
			ps.close();
			conexao.desconectar();
		}catch(SQLException e) {
			System.out.println("Erro ao inserir categoria:\n" + e);
		}
	}
}
