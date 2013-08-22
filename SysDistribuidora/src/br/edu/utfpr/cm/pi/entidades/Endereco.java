/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author Tayly
 */
@Entity
public class Endereco implements  Serializable {

    @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @Column
     private int id;
    @Column
    private String logradouro;
    @Column
    private int numero;
    @Column
    private String bairro;
    @Column
    private String complemento;
    @Column
    private String cidade;
    @Column
    private String Uf;
    @Column
    private String estado;
    @Column
    private String cep;
    
    
   // public Endereco (int id , String logradouro,int numero,String bairro,String complemento,String cidade,String Uf,String cep,String telefone);

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
   
     public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", cidade=" + cidade + ", Uf=" + Uf + ", estado=" + estado + ", cep=" + cep + '}';
    }

  
    
}

    
    
    
    
    
    
    
 