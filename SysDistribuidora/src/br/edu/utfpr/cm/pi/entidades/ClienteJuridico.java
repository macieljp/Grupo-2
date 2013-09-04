/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;

/**
 *
 * @author TAYLY
 */
@Entity
public class ClienteJuridico extends Juridico implements Serializable {

    public ClienteJuridico() {
    }

    public ClienteJuridico(String referencia1) {
        this.referencia1 = referencia1;
       
    }

    public ClienteJuridico(Integer id, Endereco endereco, String email) {
        super(id, endereco, email);
    }

    public ClienteJuridico(String razaoSocial, String cnpj, String responsavel, String inscricao) {
        super(razaoSocial, cnpj, responsavel, inscricao);
    }

    public ClienteJuridico(String referencia1,  Integer id, Endereco endereco, String email) {
        super(id, endereco, email);
        this.referencia1 = referencia1;
       
    }

    public ClienteJuridico(String referencia1, String razaoSocial, String cnpj, String responsavel, String inscricao) {
        super(razaoSocial, cnpj, responsavel, inscricao);
        this.referencia1 = referencia1;
       
    }

    public ClienteJuridico(String razaoSocial, String cnpj, String responsavel, String inscricao, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(razaoSocial, cnpj, responsavel, inscricao, id, endereco, email);
    }

    public ClienteJuridico(String referencia1, String razaoSocial, String cnpj, String responsavel, String inscricao, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(razaoSocial, cnpj, responsavel, inscricao, id, endereco, email);
        this.referencia1 = referencia1;
       
    }
    private String referencia1;
  

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    @Override
    public String toString() {
        return super.getRazaoSocial();
    }
}

    

