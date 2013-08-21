/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Entity;

/**
 *
 * @author TAYLY
 */

    
    /**
     *
     */
    @Entity
   
    public class GrupodeProduto implements  Serializable {

    @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)  
   
    @OneToOne
    private int id;
    
    @Column
    private String descricao;
    
    @Column
    private int unidade;
    
    @OneToMany    
    private Produto produto;
    
  
    private String classificacao;

        public int getId() {
            return id;
        }

        public String getDescricao() {
            return descricao;
        }

        public int getUnidade() {
            return unidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public String getClassificacao() {
            return classificacao;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setUnidade(int unidade) {
            this.unidade = unidade;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
        }

        public void setClassificacao(String classificacao) {
            this.classificacao = classificacao;
        }
    
    
    @Override
 
  public String toString(){
 
    return "Pessoa {" + "id: " + id + 
                    "Descrição: " + descricao+
                    "Unidade:  " + unidade+
                    "Produto: "+produto+
                    "Classificação: " +classificacao+ "}";
        }
    }
