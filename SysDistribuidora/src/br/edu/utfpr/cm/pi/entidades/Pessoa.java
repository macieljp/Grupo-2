/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Entity;

/**
 *
 * @author TAYLY
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Endereco endereco;
    private String email;
    @Temporal(TemporalType.DATE)
   
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.endereco);
        hash = 53 * hash + Objects.hashCode(this.email);
       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }

       
        return true;
    }

    public Pessoa() {
    }

    public Pessoa(Integer id, Endereco endereco, String email) {
        this.id = id;
        this.endereco = endereco;
        this.email = email;

       
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", endereco=" + endereco + ", email=" + email+ '}';
    }
}

    

