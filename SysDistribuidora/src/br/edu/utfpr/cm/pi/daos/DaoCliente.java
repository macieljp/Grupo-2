/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;


import br.edu.utfpr.cm.pi.entidades.Cliente;
import java.util.List;
import org.hibernate.Query;
  
    public class DaoCliente extends DaoGenerics<Cliente>{
    public DaoCliente() {
        super.alvo = Cliente.class;
    }
 public List<Cliente> obterNome(String nome) {
        List<Cliente> lista = null;
        if (nome != null || !"".equals(nome)) {

            Query query = session.createQuery("From " + alvo.getSimpleName() + " where nome LIKE '%" + nome + "%'");
            lista = query.list();
        }
        return lista;
    }

    public Cliente obterCpf(String cpf) {
        Cliente objeto = null;
        if (cpf != null) {
            objeto = (Cliente) session.createQuery("From " + alvo.getSimpleName() + " where cpf = '" + cpf + "'").uniqueResult();
        }
        return objeto;
    }

    public List<Cliente> listCliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void persist(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Cliente> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
