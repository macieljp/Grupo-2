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

/**
 *
 * @author TAYLY
 */

    public class Produto implements  Serializable {

    @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @Column
    
     private int id;
    @Column
    private String nome;
    @Column
    private String descricao;
   
    @Column
    private String contato;
}
