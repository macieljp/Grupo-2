/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
 *
 * @author TAYLY
 */
//@Table(name="tabelaEndereco")
@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String RazaoSocial;
    @Column
    private String NomeFantasia;
    @Column
    private String contato;
    @Column
    private String cnpj;
    
    @Column
    private String telefone;
    

    // public Endereco (int id , String logradouro,int numero,String bairro,String complemento,String cidade,String Uf,String cep,String telefone);
    public Integer getId() {
        return id;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public String getContato() {
        return contato;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    
    
    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "id=" + id + ", RazaoSocial=" + RazaoSocial + ", NomeFantasia=" + NomeFantasia + ", contato=" + contato + ", cnpj=" + cnpj + ", telefone=" + telefone + '}';
    }
    
    

    
    
    
}

