package classes;

public class Login_Cliente extends Login_Pai {

    private String tipoPlano;

    public void setid(int id) {
        this.id = id;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public void settelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setenderoco(String endereco) {
        this.endereco = endereco;
    }
    
    public Login_Cliente (){
    }
    
    public Login_Cliente(String tipoPlano){
    this.tipoPlano = tipoPlano;
    }
    
    

    public String gettipoPlano() {
        return tipoPlano;
    }

    public void settipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
