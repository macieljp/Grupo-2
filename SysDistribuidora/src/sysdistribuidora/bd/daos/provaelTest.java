/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdistribuidora.bd.daos;

import sysdistribuidora.bd.beans.Cliente;

/**
 *
 * @author Tayly
 */
public class provaelTest {
        
    public static void main(String[] args) throws Exception {
        DaoCliente dc = new DaoCliente();
        
       Cliente c = new Cliente();
       
       
       
       c.setNome("Tayly");
        c.setCpf("1111111111");
        System.out.println("BEFORE INSERT:" + c);   
        dc.persist(c);
        System.out.println("INSERT:" + c);   
        
        c.setNome(c.getNome() + "zzz");
        dc.persist(c);
        System.out.println("UPDATE:" + c);   
        c = dc.retrive(2);
        System.out.println("RETRIEVE:" + c);   
        
        
        for(Cliente c1: dc.list()){
            System.out.println("LIST:" + c1);   
        }
    
    }
    
}
   

