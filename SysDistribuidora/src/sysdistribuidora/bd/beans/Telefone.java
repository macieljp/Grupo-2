/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdistribuidora.bd.beans;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tayly
 */
public class Telefone {
   
    private Integer id;
    private String numero;
 
    public Integer getId() {
        return id;
    }

   
    public String getnumero() {
        return numero;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setnumero(String numero){
        this.numero = numero;
    }
   

    
 @Override
 
  public String toString(){
 
    return "Telefone {" + "id: " + id +"Numero do telefone: " +numero+ "}";
    }
 
}


