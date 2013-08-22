/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;


import br.edu.utfpr.cm.pi.entidades.Cliente;
import java.util.List;
  
    public class DaoCliente extends DaoGenerics<Cliente>{
    public DaoCliente() {
        super.alvo = Cliente.class;
    }

    public List<Cliente> listCliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
