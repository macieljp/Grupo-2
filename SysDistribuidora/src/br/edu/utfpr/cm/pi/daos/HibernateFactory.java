/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TAYLY
 */

    public class HibernateFactory {

    private static EntityManager entityManager = null;

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
            map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
            map.put("hibernate.connection.user", "aluno");
            map.put("hibernate.connection.password", "aluno");

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);

            entityManager = emf.createEntityManager();

        }

        return entityManager;
    }
}


