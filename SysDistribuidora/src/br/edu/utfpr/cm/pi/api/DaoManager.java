/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.api;

import br.edu.utfpr.cm.pi.daos.DaoCliente;
import br.edu.utfpr.cm.pi.daos.DaoEndereco;
import br.edu.utfpr.cm.pi.entidades.Cliente;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author TAYLY
 */
public class DaoManager {
    
     private static final Map<Class, Dao> daos = new HashMap<Class, Dao>();
    
    static{

        daos.put(Cliente.class, (Dao) new DaoCliente());
        daos.put(Endereco.class, (Dao) new DaoEndereco());
    }
    

    private static Dao obtemDao(Class co) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return daos.get(co);
    }

    public static void persist(Object o) throws Exception {
        Dao daoObject = obtemDao(o.getClass());
        
        daoObject.persist(o);
    }

    public void delete(Object o) throws Exception {
        Dao daoObject = obtemDao(o.getClass());
        
        daoObject.delete(o);
    }

    public Object retrieve(Class tipoObjeto, int id) throws Exception {
        Dao daoObject = obtemDao(tipoObjeto);
        
        return daoObject.retrieve(id);
    }

    public List list(Class tipoObjeto) throws Exception {
        Dao daoObject = obtemDao(tipoObjeto);
        
        return daoObject.list();
    }    
}


