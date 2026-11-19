
package classes;


public class ClasseBasse {

    protected int id;
    protected String Nome;
    protected String Cpf;
    protected int Telefone;
    protected String Email;
    protected String Endereco;
    
    //contrutor vazio
    public ClasseBasse (){
    
    }

    // Construtor da classe Pai
    public ClasseBasse(int id, String Nome, String Cpf, int Telefone,
            String Email, String Endereco) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco = Endereco;
    }

    // Retorna o id
    public int getid(){
     return id;
    }
    
    // Retorna o nome
    public String getNome() {
        return Nome;
    }

    // Retorna o CPF
    public String getCpf() {
        return Cpf;
    }

    // Retorna o telefonee
    public int getTelefone() {
        return Telefone;
    }

    // Retorna o e-mail
    public String getEmail() {
        return Email;
    }

    // Retorna o endereço
    public String getEndereco() {
        return Endereco;
    }
    
}

