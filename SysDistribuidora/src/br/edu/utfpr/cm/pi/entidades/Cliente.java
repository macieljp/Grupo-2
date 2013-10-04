package br.edu.utfpr.cm.pi.entidades;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Temporal;


 
/**
 *
 * @author Tayly
 */

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String tipo;
    
    @OneToOne
    private Endereco endereco;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataNascimento;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
    
    

    public String getCpf() {
        return cpf;
    }

    
  
    public String getTipo() {
        return tipo;
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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 @Override
 
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + '}';
    }
 
 }

