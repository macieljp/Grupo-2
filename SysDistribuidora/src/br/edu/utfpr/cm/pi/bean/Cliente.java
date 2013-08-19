package br.edu.utfpr.cm.pi.bean;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tayly
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Date dNascimento = Calendar.getInstance().getTime();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    
    public Date getdNascimento() {
        return dNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

    public void setdNascimento(Date dNascimento) {
        this.dNascimento = dNascimento;
    }
    
 @Override
 
  public String toString(){
 
    return "Pessoa {" + "id: " + id + 
                    "nome: " + nome+
                    "cpf:  " + cpf+
                    "endereco: "+endereco+
                    "Data de Nascimento: " +dNascimento+ "}";
 }
 
}
