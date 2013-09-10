/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.api;

import br.edu.utfpr.cm.pi.entidades.Cliente;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import br.edu.utfpr.cm.pi.entidades.Fornecedor;
import br.edu.utfpr.cm.pi.entidades.GrupodeProduto;
import br.edu.utfpr.cm.pi.entidades.Produto;
import br.edu.utfpr.cm.pi.entidades.Telefone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tool.hbm2ddl.SchemaExport;


/**
 *
 * @author TAYLY
 */
public class HibernateConfiguration {

    private static AnnotationConfiguration cfg;
    private static SessionFactory sessionFactory;
    
    private static String usuarioBase = "root";// seu nome de usuario da base de dados aqui
    private static String senhaBase = "tayly";// sua seha de usuario da base de dados aqui
    private static String baseDados = "tayly";// o nome da sua base de dados aqui
    private static String host = "localhost:3306";

    public static Session openConect() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.username", usuarioBase);
            cfg.setProperty("hibernate.connection.password", senhaBase);
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://"+host +"/"+baseDados);
            
            
            cfg.addAnnotatedClass(Cliente.class);
            cfg.addAnnotatedClass(Endereco.class);
            cfg.addAnnotatedClass(Fornecedor.class);
            cfg.addAnnotatedClass(GrupodeProduto.class);
            cfg.addAnnotatedClass(Produto.class);
            cfg.addAnnotatedClass(Telefone.class);
            
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.connection.autocommit", "true");

                       
            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static void criarSchema() {
        openConect().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }
    
    public static List<Object> runHQLQuery(String hql){
        Session session = TransactionManager.getCurrentSession();
        return session.createQuery(hql).list();
    }

    public static String getSenhaBase() {
        return senhaBase;
    }

    public static void setSenhaBase(String senhaBase) {
        HibernateConfiguration.senhaBase = senhaBase;
    }

    public static String getUsuarioBase() {
        return usuarioBase;
    }

    public static void setUsuarioBase(String usuarioBase) {
        HibernateConfiguration.usuarioBase = usuarioBase;
    }

    public static String getBaseDados() {
        return baseDados;
    }

    public static void setBaseDados(String baseDados) {
        HibernateConfiguration.baseDados = baseDados;
    }
    
    
    public static ArrayList<Class> getEntityClasses() {
        ArrayList<Class> classes = new ArrayList<Class>();

        if (cfg == null) {
            openConect();
        }
        
        Iterator i = cfg.getClassMappings();
        while(i.hasNext()) {
            classes.add(((PersistentClass)i.next()).getMappedClass());
        }
        return classes;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        HibernateConfiguration.host = host;
    }
    
}

    
