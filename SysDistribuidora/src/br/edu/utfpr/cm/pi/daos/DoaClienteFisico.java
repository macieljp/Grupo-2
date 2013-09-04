/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author TAYLY
 */
public class DaoClienteFisico extends DaoGenerics<ClienteFisico> {

    
        super.alvo = ClienteFisico.class;
    }

    public List<ClienteFisico> obterNome(String nome) {
        List<ClienteFisico> lista = null;
        if (nome != null || !"".equals(nome)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where nome LIKE '"
                    + nome + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<ClienteFisico> obterRg(String rg) {
        List<ClienteFisico> lista = null;
        if (rg != null || !"".equals(rg)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where rg LIKE '"
                    + rg + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<ClienteFisico> obterCpf(String cpf) {
        List<ClienteFisico> lista = null;
        if (cpf != null || !"".equals(cpf)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where cpf LIKE '"
                    + cpf + "%'");
            lista = query.list();
        }
        return lista;
    }
}
