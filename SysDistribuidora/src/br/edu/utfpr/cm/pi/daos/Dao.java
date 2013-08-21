/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.util.List;

/**
 *
 * @author Tayly
 */
interface Dao <T> {
    void persist(T o ) ;
    void delete (T o ) throws Exception;
    T retrive (int id ) throws Exception;
    List <T> list() throws  Exception;
    
}
