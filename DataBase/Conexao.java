
package DataBase;
    import java.sql.Connection;


import java.sql.DriverManager;

import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Conexao {


private static final String URL =
        "jdbc:mysql://localhost:3306/cadastro_clientes";

private static final String USUARIO = "root";

private static final String SENHA = "";

public static Connection getConexao() {

    try {

        Connection conexao = DriverManager.getConnection(
                URL,       // Endereço e nome do banco de dados.
                USUARIO,   // Usuário de acesso ao MySQL.
                SENHA      // Senha de acesso ao MySQL.
        );

        // Retorna a conexão estabelecida para quem chamou o método.
        return conexao;

    // Captura possíveis erros que podem ocorrer durante a conexão.
    } catch (SQLException erro) {

        // Exibe uma janela de mensagem informando que ocorreu
        // um problema ao tentar conectar com o banco de dados.
        JOptionPane.showMessageDialog(
                null, // Define que a janela não terá um componente pai.
                "Erro ao conectar com o banco de dados:\n"
                + erro.getMessage() // Apresenta a descrição do erro ocorrido.
        );

        // Retorna null indicando que não foi possível estabelecer a conexão.
        return null;
    }
}
}

