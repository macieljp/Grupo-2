package br.edu.utfpr.cm.pi.entidades;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;


/**
 *
 * @author Tayly
 */

@Entity
public class Cliente {
    @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @Column
    private int id;
    private String nome;
    private String cpf;
    
    @OneToOne
    private Endereco endereco;
    
    private Date dataNascimento = Calendar.getInstance().getTime();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    
    public Date getdataNascimento() {
        return dataNascimento;
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

    

    public void setdataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
 @Override
 
  public String toString(){
 
    return "Pessoa {" + "id: " + id + 
                    "nome: " + nome+
                    "cpf:  " + cpf+
                    "endereco: "+endereco+
                    "Data de Nascimento: " +dataNascimento+ "}";
 }
 
}
