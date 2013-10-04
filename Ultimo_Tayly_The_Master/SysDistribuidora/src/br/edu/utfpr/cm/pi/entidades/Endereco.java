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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



/**
 *
 * @author Tayly
 */
@Entity
public class Endereco implements  Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) 
    @Column
     private Integer id;
    @Column
    private String logradouro;
    @Column
    private String numero;
    @Column
    private String bairro;
    @Column
    private String complemento;
    
    
    @OneToOne
    private Cidade cidade;   
    @Column
    private String cep;
    private String tipo;
    
    private String telefone;
    
    private String celular;
    
    private String email;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

   

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    
    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", cidade=" + cidade + ", cep=" + cep + ", tipo=" + tipo + '}';
    }


   
    

  
    
}

    
    
    
    
    
    
    
 