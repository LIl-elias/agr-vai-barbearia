package classes;

public class Login_Cliente extends Login_Pai {

    protected String tipoPlano;

    public Login_Cliente(String nome, String cpf, String telefone, String email, String endereco) {
        super(nome, cpf, telefone, email, endereco);
    }

}