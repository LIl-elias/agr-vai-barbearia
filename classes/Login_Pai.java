/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


public class Login_Pai {

    protected int id;
    protected String nome;
    protected String cpf;
    protected int telefone;
    protected String email;
    protected String endereco;
    
    //contrutor vazio
    public Login_Pai (){
    
    }

    // Construtor da classe Pai
    public Login_Pai(int id, String nome, String cpf, int telefone,
            String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Retorna o id
    public int getid(){
     return id;
    }
    
    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    // Retorna o telefone do cliente
    public int getTelefone() {
        return telefone;
    }

    // Retorna o e-mail do cliente
    public String getEmail() {
        return email;
    }

    // Retorna o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    /* Retorna o tipo de plano escolhido
    public String getTipoPlano() {
        return tipoPlano;

    }
*/
    
}

