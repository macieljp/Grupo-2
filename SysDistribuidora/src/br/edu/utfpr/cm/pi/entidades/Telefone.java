/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author TAYLY
 */
public class Telefone {
     @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)  
    
     @OneToOne
     private int id;
    
    
    private String numero;
    

    
     /**
     *
     * @param id
     * @param numero
     * @param ddd
     */
    //public Telefone (int id ,int numero,int ddd);
     
     public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    
     
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + '}';
    }

  
    
}
