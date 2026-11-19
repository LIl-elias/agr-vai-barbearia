package classes;

public class Cliente extends ClasseBasse {

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
    
    public Cliente (){
    }
    
    public Cliente(String TipoPlano){
    this.TipoPlano = TipoPlano;
    }
    
    

    public String getTipoPlano() {
        return TipoPlano;
    }

    public void settipoPlano(String TipoPlano) {
        this.TipoPlano = TipoPlano;
    }
    
    // comandos feitos pelo netBeans para fazer o codigo funcionar

    public void setendereco(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void settipo_plano(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
