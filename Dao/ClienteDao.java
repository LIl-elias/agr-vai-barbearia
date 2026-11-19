/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DataBase.Conexao;

import classes.Login_Cliente;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

public class ClienteDao {

    // MÉTODO PARA CADASTRAR UM CLIENTE NO BANCO DE DADOS
// Retorna true se o cadastro for realizado e false se ocorrer algum erro.
    public boolean cadastrar(Login_Cliente Ronaldo) {

        // Cria o comando SQL para inserir um novo cliente na tabela cliente.
        // Os sinais de interrogação (?) representam os valores que serão preenchidos posteriormente.
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, endereco, tipo_plano) VALUES (?, ?, ?, ?, ?, ?)";

        // Abre a conexão com o banco de dados.
        // O PreparedStatement prepara o comando SQL para receber os valores.
        // O try-with-resources fecha automaticamente a conexão e o comando ao terminar.
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, Ronaldo.getNome());

            stmt.setString(2, Ronaldo.getCpf());

            stmt.setInt(3, Ronaldo.getTelefone());

            stmt.setString(4, Ronaldo.getEmail());

            stmt.setString(5, Ronaldo.getEndereco());

            stmt.setString(6, Ronaldo.getTipoPlano());

            // Executa o comando SQL no banco de dados.
            // executeUpdate() é utilizado em operações de INSERT, UPDATE e DELETE.
            stmt.executeUpdate();

            // Retorna true indicando que o cadastro foi executado com sucesso.
            return true;

            // Captura possíveis erros que acontecem durante a operação com o banco.
        } catch (SQLException e) {

            // Exibe no console a mensagem de erro retornada pelo banco de dados.
            System.out.println("Erro ao cadastrar: " + e.getMessage());

            // Retorna false indicando que o cadastro não foi realizado.
            return false;
        }
    }
// MÉTODO PARA CONSULTAR E LISTAR TODOS OS CLIENTES CADASTRADOS
// Retorna uma lista contendo objetos da classe Cliente.

    public List<Login_Cliente> listar() {

        // Cria uma lista vazia para armazenar os clientes encontrados no banco.
        List<Login_Cliente> lista = new ArrayList<>();

        // Cria o comando SQL para buscar os dados dos clientes.
        // ORDER BY id organiza os resultados pelo identificador do cliente.
        String sql = "SELECT id, nome, cpf, telefone, email, endereco, tipo_plano FROM cliente ORDER BY id";

        // Abre a conexão com o banco de dados.
        // Prepara o comando SQL e executa a consulta.
        // O ResultSet recebe os registros retornados pelo SELECT.
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            // Percorre os registros retornados pelo banco de dados.
            // rs.next() avança para o próximo registro.
            // Enquanto houver registros, o laço continuará executando.
            while (rs.next()) {

                // Cria um novo objeto da classe Cliente para armazenar os dados de um registro.
                Login_Cliente cliente = new Login_Cliente();

                // Recupera o valor da coluna id e atribui ao atributo id do objeto.
                cliente.setid(rs.getInt("id"));

                // Recupera o nome do banco e atribui ao atributo nome do objeto.
                cliente.setnome(rs.getString("nome"));

                // Recupera o CPF do banco e atribui ao atributo cpf do objeto.
                cliente.setcpf(rs.getString("cpf"));

                // Recupera a idade do banco e atribui ao atributo idade do objeto.
                cliente.settelefone(rs.getInt("telefone"));

                cliente.setemail(rs.getString("email"));

                cliente.setendereco(rs.getString("endereco"));

                // Adiciona o objeto Cliente preenchido dentro da lista.
                lista.add(cliente);
            }

            // Captura possíveis erros durante a consulta dos dados.
        } catch (SQLException e) {

            // Exibe no console a mensagem de erro.
            System.out.println("Erro ao listar: " + e.getMessage());
        }

        // Retorna a lista contendo os clientes encontrados.
        return lista;
    }
// MÉTODO PARA EXCLUIR UM CLIENTE DO BANCO DE DADOS.
// Recebe o ID do cliente que deverá ser excluído.
// Retorna true se algum registro for excluído e false caso contrário.

    public boolean excluir(int id) {

        // Cria o comando SQL para excluir um cliente da tabela.
        // O sinal de interrogação (?) será substituído pelo ID informado.
        String sql = "DELETE FROM cliente WHERE id = ?";

        // Abre a conexão com o banco de dados.
        // Prepara o comando SQL para receber o ID do cliente.
        try (Connection conn = ConexaoBD.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define o primeiro parâmetro (?) com o ID recebido pelo método.
            stmt.setInt(1, id);

            // Executa o comando DELETE no banco de dados.
            // executeUpdate() retorna a quantidade de registros afetados.
            // Se o resultado for maior que zero, significa que um cliente foi excluído.
            return stmt.executeUpdate() > 0;

            // Captura possíveis erros durante a exclusão.
        } catch (SQLException e) {

            // Exibe no console a mensagem de erro.
            System.out.println("Erro ao excluir: " + e.getMessage());

            // Retorna false indicando que ocorreu um erro na exclusão.
            return false;
        }
    }

// MÉTODO PARA PESQUISAR CLIENTES PELO NOME OU CPF
// Recebe um texto que será utilizado como critério de pesquisa.
// Retorna uma lista contendo os clientes encontrados.
    public List<Cliente> pesquisar(String pesquisa) {

        // Cria uma lista para armazenar os clientes encontrados.
        List<Cliente> lista = new ArrayList<>();

        // Cria o comando SQL para pesquisar pelo nome ou CPF.
        // O operador LIKE permite pesquisar parte do texto informado.
        String sql = "SELECT id, nome, cpf, idade FROM cliente "
                + "WHERE nome LIKE ? OR cpf LIKE ? ORDER BY id";

        // Abre a conexão com o banco de dados.
        // Prepara o comando SQL e executa a consulta.
        try (Connection conn = ConexaoBD.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define o primeiro parâmetro (?) para pesquisar pelo nome.
            stmt.setString(1, "%" + pesquisa + "%");

            // Define o segundo parâmetro (?) para pesquisar pelo CPF.
            stmt.setString(2, "%" + pesquisa + "%");

            // Executa a consulta e recebe os registros encontrados.
            try (ResultSet rs = stmt.executeQuery()) {

                // Percorre todos os registros encontrados.
                while (rs.next()) {

                    // Cria um novo objeto Cliente.
                    Cliente cliente = new Cliente();

                    // Recupera os dados do banco de dados.
                    cliente.setId(rs.getInt("id"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setIdade(rs.getInt("idade"));

                    // Adiciona o cliente na lista.
                    lista.add(cliente);
                }
            }

            // Captura possíveis erros durante a pesquisa.
        } catch (SQLException e) {

            // Exibe a mensagem de erro no console.
            System.out.println("Erro ao pesquisar: " + e.getMessage());
        }

        // Retorna a lista de clientes encontrados.
        return lista;
    }

    // MÉTODO PARA ALTERAR OS DADOS DE UM CLIENTE
    // Recebe um objeto Cliente com os novos dados.
    // Retorna true se a alteração for realizada com sucesso.
    public boolean alterar(Cliente cliente) {

        // Cria o comando SQL para atualizar os dados do cliente.
        // O ID identifica qual registro deverá ser alterado.
        String sql = "UPDATE cliente SET nome = ?, idade = ?, cpf = ? WHERE id = ?";

        // Abre a conexão com o banco de dados.
        // Prepara o comando SQL para receber os novos valores.
        try (Connection conn = ConexaoBD.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define o primeiro parâmetro (?) com o novo nome.
            stmt.setString(1, cliente.getNome());

            // Define o segundo parâmetro (?) com a nova idade.
            stmt.setInt(2, cliente.getIdade());

            // Define o terceiro parâmetro (?) com o novo CPF.
            stmt.setString(3, cliente.getCpf());

            // Define o quarto parâmetro (?) com o ID do cliente.
            stmt.setInt(4, cliente.getId());

            // Executa a alteração no banco de dados.
            // Retorna true se algum registro foi atualizado.
            return stmt.executeUpdate() > 0;

            // Captura possíveis erros durante a alteração.
        } catch (SQLException e) {

            // Exibe a mensagem de erro no console.
            System.out.println("Erro ao alterar: " + e.getMessage());

            // Retorna false indicando que a alteração não foi realizada.
            return false;
        }
    }

}
