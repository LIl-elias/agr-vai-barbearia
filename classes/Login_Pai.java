
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
    
    // Retorna o nome
    public String getNome() {
        return nome;
    }

    // Retorna o CPF
    public String getCpf() {
        return cpf;
    }

    // Retorna o telefonee
    public int getTelefone() {
        return telefone;
    }

    // Retorna o e-mail
    public String getEmail() {
        return email;
    }

    // Retorna o endereço
    public String getEndereco() {
        return endereco;
    }
    
}

