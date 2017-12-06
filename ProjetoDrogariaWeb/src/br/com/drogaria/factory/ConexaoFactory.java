package br.com.drogaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "1463";
	private static final String URL = "jdbc:mysql://localhost:3306/drogaria";

	public static Connection conectar() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

		return conexao;
	}
	
	public static void main (String[] arg){
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("Conex�o realizada com sucesso !");
		} catch (SQLException ex) {
			System.out.println("N�o foi possivel realizar a conex�o !");
			ex.printStackTrace();
		}
	}
}