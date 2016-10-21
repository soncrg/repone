package br.com.testejdbc.teste;

import java.sql.Connection;

import br.com.testejdbc.dao.ConnectionFactory;

public class Teste {
	public static void main(String[] args) {
		try {
			ConnectionFactory fabrica = new ConnectionFactory();
			Connection conexao = fabrica.getConnection();
			System.out.println("Conexao aberta");
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
