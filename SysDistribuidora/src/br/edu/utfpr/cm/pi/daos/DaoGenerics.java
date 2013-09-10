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
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TAYLY
 */

    
    public class DaoGenerics<T> implements Dao<T> {

    protected Session session = TransactionManager.getCurrentSession();
    protected Transaction transaction;
    protected Class alvo;

    @Override
    public void persist(T o) {
        session.saveOrUpdate(o);
        session.flush();
    
     try {

            session = TransactionUtil.obterSessao();
            transaction = TransactionUtil.iniciarTransacao(session);
            session.saveOrUpdate(o);
            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            Util.dispayMsg("Ocorreu um erro ao persistir o objeto.\n" + e.fillInStackTrace());
//            System.err.println("Ocorreu um erro ao persistir o objeto.\n" + e.fillInStackTrace());
        } finally {

            TransactionUtil.fecharSessao(session);
        }
    
     @Override
    public void remover(T o) {
//        session.delete(o);
//        session.flush();
        try {

            session = TransactionUtil.obterSessao();
            transaction = TransactionUtil.iniciarTransacao(session);
            session.delete(o);
            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            Util.dispayMsg("Ocorreu um erro ao remover o objeto.\n" + e.fillInStackTrace());
//            System.err.println("Ocorreu um erro ao persistir o objeto.\n" + e.fillInStackTrace());
        } finally {

            TransactionUtil.fecharSessao(session);
        }
    }

    @Override
    public T obterPorId(int id) {

        org.hibernate.Query select = null;
        T objeto = null;
        try {

            session = TransactionUtil.obterSessao();
            transaction = TransactionUtil.iniciarTransacao(session);
            if (id > 0) {

                select = session.createQuery("From " + alvo.getSimpleName() + " where id = " + id);
                objeto = (T) select.uniqueResult();

            }
        } catch (Exception e) {

            transaction.rollback();
            e.printStackTrace();
        } finally {

            session.close();
            return objeto;
        }
    }

    @Override
    public List<T> listar(String filtro) {

        List<T> lista = null;
        org.hibernate.Query query = null;

        try {

            session = TransactionUtil.obterSessao();
            transaction = TransactionUtil.iniciarTransacao(session);
            if (filtro != null) {
                query = session.createQuery("FROM " + alvo.getSimpleName() + " WHERE nome LIKE '%" + filtro + "%'");
                lista = query.list();
            }
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            return lista;
        }
    }
}
    
   
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

    
