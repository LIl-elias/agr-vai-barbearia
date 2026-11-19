/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Login_Barbeiro extends Login_Pai {

    private String especialidade;

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
    
    public Login_Barbeiro (){
    }
    
    public Login_Barbeiro(String tipoPlano){
    this.especialidade = especialidade;
    }
    
    

    public String gettipoPlano() {
        return especialidade;
    }

    public void settipoPlano(String tipoPlano) {
        this.especialidade = tipoPlano;
    }
}