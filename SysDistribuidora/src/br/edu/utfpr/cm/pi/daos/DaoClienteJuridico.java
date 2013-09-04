/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.ClienteJuridico;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author TAYLY
 */
public class DaoClienteJuridico extends DaoGenerics<ClienteJuridico>{
    
     public DaoClienteJuridico() {
        super.alvo = ClienteJuridico.class;
    }

    public List<ClienteJuridico> obterRazao(String razao) {
        List<ClienteJuridico> lista = null;
        if (razao != null || !"".equals(razao)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where razaoSocial LIKE '"
                    + razao + "%'");
            lista = query.list();
        }
        return lista;
    }
    
}
