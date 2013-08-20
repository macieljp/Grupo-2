/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.api;

import java.sql.Connection;
import java.util.List;
import javaapplication1.daos.api.Filter;

/**
 *
 * @author suporte
 */
public interface Dao<T> {
    void persist(T o)  throws Exception;
    void delete(T o)  throws Exception;
    void delete(T o, Connection con)  throws Exception;
    T retrieve(int id)  throws Exception;
    List<T> list(String whereClause, String orderClause)  throws Exception;
    List<T> list(Filter... filters)  throws Exception;
}
