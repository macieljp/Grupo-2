/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.conexao.TransactionManager;

import br.edu.utfpr.cm.pi.api.Dao;
import br.edu.utfpr.cm.pi.util.Util;
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

    protected Session session;
    protected Transaction transaction;
    protected Class alvo;

    //@Override
    public void persistir(T o) {
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
            System.err.println("Ocorreu um erro ao persistir o objeto.\n" + e.fillInStackTrace());
        } finally {

            TransactionUtil.fecharSessao(session);
        }
    }

    @Override
    public void remover(T o) {
       session.delete(o);
       session.flush();
        try {

            session = TransactionUtil.obterSessao();
            transaction = TransactionUtil.iniciarTransacao(session);
            session.delete(o);
            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            Util.dispayMsg("Ocorreu um erro ao remover o objeto.\n" + e.fillInStackTrace());
           System.err.println("Ocorreu um erro ao persistir o objeto.\n" + e.fillInStackTrace());
        } finally {

            TransactionUtil.fecharSessao(session);
        }
    }

   // @Override
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

   // @Override
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