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
    
     @ManyToMany
    private int numero;
    
     @OneToOne
    private int ddd;

    
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

    public int getNumero() {
        return numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
     @Override
    public String toString() {
        return "Endereco{" + "id=" + id +
                ",numero=" + numero + 
                ", ddd=" + ddd +'}';
    }
    
}
