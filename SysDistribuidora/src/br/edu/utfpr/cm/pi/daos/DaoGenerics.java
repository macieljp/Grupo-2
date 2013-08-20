/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;


import java.util.List;
import javax.persistence.Query;
import javax.transaction.TransactionManager;
import org.hibernate.Session;

/**
 *
 * @author TAYLY
 */

    
    public class DaoGenerics<T> implements Dao<T> {

    protected Session session = TransactionManager.getCurrentSession();
    protected Class alvo;

    @Override
    public void persistir(T o) {
        session.saveOrUpdate(o);
        session.flush();
    }

    @Override
    public void remover(T o) {
        session.delete(o);
        session.flush();
    }

    @Override
    public T obterPorId(int id) {
        T objeto = null;
        if (id > 0) {
            Query select = (Query) session.createQuery("From " + alvo.getSimpleName() + " where id = " + id);
            objeto = (T) select.uniqueResult();
        }
        return objeto;
    }

    @Override
    public List<T> listar(String filtro) {
        List<T> lista = null;
        if (filtro != null) {
            Query query = (Query) session.createQuery("FROM " + alvo.getSimpleName() + " WHERE nome LIKE '%" + filtro + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<T> listar() {
        List<T> lista = null;
        Query query = (Query) session.createQuery("FROM " + alvo.getSimpleName());
        lista = query.list();
        return lista;
    }
    
  
    public List<T> listar2(String filtro) {
        List<T> lista = null;
        if (filtro != null) {
            Query query = (Query) session.createQuery("FROM " + alvo.getSimpleName() +  filtro );
            lista = query.list();
        }
        return lista;
    }
}

    
