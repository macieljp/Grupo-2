/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.conexao;

import br.edu.utfpr.cm.pi.entidades.Cidade;
import br.edu.utfpr.cm.pi.entidades.ClienteFisico;
import br.edu.utfpr.cm.pi.entidades.ClienteJuridico;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import br.edu.utfpr.cm.pi.entidades.Estado;
import br.edu.utfpr.cm.pi.entidades.Fisico;
import br.edu.utfpr.cm.pi.entidades.Funcionario;
import br.edu.utfpr.cm.pi.entidades.Juridico;
import br.edu.utfpr.cm.pi.entidades.Pessoa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author TAYLY
 */
public class HibernateConfiguration {
    
       private static AnnotationConfiguration cfg = null;
    private static SessionFactory sessionFactory = null;
    private static String pass;
    private static String user;

    public static Session openConnect() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/sysDistribuidora");
            cfg.setProperty("hibernate.connection.username", user);
            cfg.setProperty("hibernate.connection.password", pass);
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.format_sql", "true");
            cfg.setProperty("hibernate.hbm2ddl.auto", "update");

            cfg.addAnnotatedClass(Endereco.class);
            cfg.addAnnotatedClass(Fisico.class);
            cfg.addAnnotatedClass(Juridico.class);
            cfg.addAnnotatedClass(Pessoa.class);
            cfg.addAnnotatedClass(ClienteFisico.class);
            cfg.addAnnotatedClass(ClienteJuridico.class);
            cfg.addAnnotatedClass(Cidade.class);
            cfg.addAnnotatedClass(Estado.class);
            cfg.addAnnotatedClass(Funcionario.class);
            //cfg.addAnnotatedClass(OrdemVenda.class);


            sessionFactory = cfg.buildSessionFactory();

        }
        return sessionFactory.openSession();
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        HibernateConfiguration.pass = pass;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        HibernateConfiguration.user = user;
    }

    public static void criarSchema() {
        openConnect().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }
}


