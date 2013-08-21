/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;


import br.edu.utfpr.cm.pi.api.TransactionManager;
import br.edu.utfpr.cm.pi.api.Dao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author TAYLY
 */

    
    public class DaoGenerics<T> implements Dao<T> {

    protected Session session = TransactionManager.getCurrentSession();
    protected Class alvo;

    @Override
    public void persist(T o) {
        session.saveOrUpdate(o);
        session.flush();
    }

    @Override
    public void delete(T o) {
        session.delete(o);
        session.flush();
    }

    //@Override
    public T obterPorId(int id) {
        
       Object objeto = new Object();
        session = TransactionManager.getCurrentSession();
        
        objeto = (T) session.createQuery("FROM "+ alvo.getSimpleName() +" WHERE id='"+id+"'").uniqueResult();
        
        return (T) objeto;
        
    }

  
    @Override
    public List<T> list() {
       List<T> objetos = new ArrayList<T>();
        session = TransactionManager.getCurrentSession();        
        
        objetos = session.createQuery("FROM "+ alvo.getSimpleName()).list();        
        return objetos;
    }
    
  
    @Override
    public List<T> list(String filtro) {
       if(filtro == null || filtro.isEmpty()){
            return list();
        }        
        List<T> lista = new ArrayList<T>();
        session = TransactionManager.getCurrentSession();   
        
        lista = session.createQuery("FROM "+ alvo.getSimpleName() +" WHERE " + filtro).list();
               
        return lista;
    }

    

    @Override
    public T retrieve(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

    
