/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.api;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TAYLY
 */

    public class TransactionManager {
    
    static Session session = null;
    static Transaction transaction = null;
    
    public static void beginTransaction(){
        if(transaction != null){
            throw new RuntimeException("JÃ¡ existe uma transaÃ§Ã£o iniciada.");
        }
        session = HibernateConfiguration.openConnect();
        transaction = session.beginTransaction();        
    }
    
    public static void commit(){
        if(transaction == null){
            throw new RuntimeException("Erro tentando executar commit() sem antes ter executado beginTrans()..");
        }
        transaction.commit();
        closeCurrentSession();
        
    }
    
    public static void rollback(){
        if(transaction == null){
            throw new RuntimeException("Erro tentando executar rollback() sem antes ter executado beginTrans()..");
        }
        transaction.rollback();        
        closeCurrentSession();
    }
    
    public static Session getCurrentSession(){
        /*Automatizando a criaÃ§Ã£o da transaÃ§Ã£o.*/
        if(session == null){
            Session session2 = HibernateConfiguration.openConnect();           
           // System.out.println("========================="+session2.getFlushMode());
            session2.setFlushMode(FlushMode.ALWAYS);            
            return session2; 
        }
        return session;        
    }
    
    
    public  static void closeCurrentSession(){
        session.flush();
        session.close();
        transaction = null;
        session = null;
    }  
}


