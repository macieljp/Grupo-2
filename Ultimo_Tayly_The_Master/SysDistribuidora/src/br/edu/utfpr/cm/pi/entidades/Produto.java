/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author TAYLY
 */
    @Entity
    public class Produto implements  Serializable {    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)   
    private int id;
    private String nome;
    private Double valor;
    private Integer quantidade;
    @OneToOne
    private GrupodeProduto grupoDeProduto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public GrupodeProduto getGrupoDeProduto() {
        return grupoDeProduto;
    }

    public void setGrupoDeProduto(GrupodeProduto grupoDeProduto) {
        this.grupoDeProduto = grupoDeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
