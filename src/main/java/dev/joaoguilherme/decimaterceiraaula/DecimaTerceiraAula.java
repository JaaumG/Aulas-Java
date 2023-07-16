package dev.joaoguilherme.decimaterceiraaula;

import java.sql.*;

public class DecimaTerceiraAula {
	public static void main(String[] args) {
		/*
		Conexão com o banco de dados

		Ao se conectar com o banco de dados, Utilizaremos da interface Connection, que é uma interface do pacote java.sql
		Para se conectar com o banco de dados, utilizaremos o método estático getConnection da classe DriverManager, que é uma classe do pacote java.sql,
		informando o endereço do banco de dados, o usuário e a senha.

		A classe DriverManager é responsável por gerenciar os drivers de conexão com o banco de dados.

		Perceba que a interface Connection implementa a interface AutoCloseable, logo podemos
		utilizar do try-with-resources para fechar a conexão com o banco de dados.

		Exemplo:
		 */

		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "root")){

		}catch (SQLException e) {
			System.out.println("Falha ao conectar ao banco de dados.");
		}

		/*
		Perceba que o método getConnection lança uma exceção do tipo SQLException, que é uma exceção verificada, logo, devemos tratar a exceção.

		A exceção pode correr se a senha, se o usuario, ou até mesmo o endereço do banco de dados estiverem incorretos.
		Isso é impossível do código prever, por isso não gera erros de compilação.

		Se a conexão com o banco de dados for bem estabelecida, podemos realizar operações no banco de dados.

		Essas operações são feitas em SQL, para enviar seu código SQL para o banco de dados, utilizaremos da interface Statement, que é uma interface do pacote java.sql.

		Para obter uma instância de Statement, utilizaremos o método createStatement da interface Connection.
		 */

		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "root")){
			//Primeiro criaremos uma tabela no banco de dados com SQL
			Statement statement = connection.createStatement(); //Criando o Statement
			String sql = "CREATE TABLE IF NOT EXISTS alunos (id INT PRIMARY KEY AUTO_INCREMENT, nome VARCHAR(255) NOT NULL, idade INT NOT NULL);";
			statement.execute(sql); //Executando o SQL

			//Ao executar o SQL há duas possibilidades, ou o SQL foi executado com sucesso, ou ocorreu um erro.
			//Novamente a necessidade do try-catch

			//Agora vamos inserir um aluno na tabela

			sql = "INSERT INTO alunos (nome, idade) VALUES ('João Guilherme', 21);";
			statement.execute(sql);

			//Quando finalizarmos nossas operações, devemos fechar o Statement

			statement.close();

			//O Statement também implementa a interface AutoCloseable, logo podemos utilizar do try-with-resources para fechar o Statement

		}catch (SQLException e) {
			System.out.println("Falha ao conectar ao banco de dados.");
		}

		/*
		Em outras situações podemos querer escrever um SQL e depois informar os valores
		que serão utilizados no SQL, para isso utilizaremos da interface PreparedStatement,
		 */

		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "root")){
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO alunos (nome, idade) VALUES (?, ?);"); //Perceba que diferente do sql convencional
			//Nós não informamos os valores, e sim um ? para cada valor que será informado.
			preparedStatement.setString(1, "João Guilherme"); //Primeiro ? será substituido pelo valor "João Guilherme"
			preparedStatement.setInt(2, 21); //Segundo ? será substituido pelo valor 21

			preparedStatement.execute(); //Executando o SQL

			preparedStatement.close(); //Fechando o PreparedStatement

		}catch (SQLException e){
			System.out.println("Falha ao conectar ao banco de dados.");
		}

	}




}
