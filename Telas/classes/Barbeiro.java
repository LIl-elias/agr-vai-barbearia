/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Barbeiro extends ClasseBasse {

    private String especialidade;

    public void setid(int id) {
        this.id = id;
    }

    public void setnome(String nome) {
        this.Nome = nome;
    }

    public void setcpf(String cpf) {
        this.Cpf = cpf;
    }

    public void settelefone(int telefone) {
        this.Telefone = telefone;
    }

    public void setemail(String email) {
        this.Email = email;
    }

    public void setenderoco(String endereco) {
        this.Endereco = endereco;
    }
    
    public Barbeiro (){
    }
    
    public Barbeiro(String tipoPlano){
    this.especialidade = especialidade;
    }
    
    

    public String gettipoPlano() {
        return especialidade;
    }

    public void settipoPlano(String tipoPlano) {
        this.especialidade = tipoPlano;
    }
}