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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String RazaoSocial;
    @Column
    private int NomeFantasia;
    @Column
    private String contato;

    // public Endereco (int id , String logradouro,int numero,String bairro,String complemento,String cidade,String Uf,String cep,String telefone);
    public int getId() {
        return id;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public int getNomeFantasia() {
        return NomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public void setNomeFantasia(int NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {

        return "Pessoa {" + "id: " + id
                + "Razão Social: " + RazaoSocial
                + "Nome Fantasisa:  " + NomeFantasia
                + "Contato: " + contato + "}";


    }
}

