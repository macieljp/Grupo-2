/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.conexao.TransactionManager;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author TAYLY
 */
public class DaoGenerics<T> implements Dao<T> {

    protected Session session;
    protected Class alvo;
    
    public DaoGenerics(Class alvo){
        this.alvo = alvo;
        this.session = TransactionManager.getCurrentSession();
    }  

    @Override
    public void persist(T o) {
        session = TransactionManager.getCurrentSession(); 
        session.saveOrUpdate(o);
    }

    @Override
    public void delete(T o) {
        session = TransactionManager.getCurrentSession(); 
        session.delete(o);

    }

    @Override
    public T retrive(int id) {
        Object objeto = new Object();
        session = TransactionManager.getCurrentSession();

        objeto = (T) session.createQuery("FROM " + alvo.getSimpleName() + " WHERE id='" + id + "'").uniqueResult();

        return (T) objeto;
    }

    @Override
    public List<T> list() {
        List<T> objetos = new ArrayList<T>();
        session = TransactionManager.getCurrentSession();

        objetos = session.createQuery("FROM " + alvo.getSimpleName()).list();
        session.flush();
        return objetos;
    }

    public List<T> listarComFiltro(String filtro) {
       if(filtro == null || filtro.isEmpty()){
            return list();
        }        
        List<T> objetos = new ArrayList<T>();
        session = TransactionManager.getCurrentSession();   
        
        objetos = session.createQuery("FROM "+ alvo.getSimpleName() +" WHERE " + filtro).list();
        session.flush();
        return objetos;
    }
}
