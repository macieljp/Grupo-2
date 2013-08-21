/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.api;

import java.sql.Connection;
import java.util.List;
import br.edu.utfpr.cm.pi.api.Filter;

/**
 *
 * @author suporte
 */
public interface Dao<T> {
    public void persist(T o) ;
    public void delete(T o) ;
    public T retrieve(int id)  throws Exception;
    public List<T> list() ;
    public List<T> list(String filtro);
}
