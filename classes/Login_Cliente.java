package classes;

public class Login_Cliente extends Login_Pai {

    private String TipoPlano;

    public void setid(int id) {
        this.id = id;
    }

    public void setnome(String Nome) {
        this.Nome = Nome;
    }

    public void setcpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void settelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public void setemail(String Email) {
        this.Email = Email;
    }

    public void setenderoco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public Login_Cliente (){
    }
    
    public Login_Cliente(String TipoPlano){
    this.TipoPlano = TipoPlano;
    }
    
    

    public String getTipoPlano() {
        return TipoPlano;
    }

    public void settipoPlano(String TipoPlano) {
        this.TipoPlano = TipoPlano;
    }
}
