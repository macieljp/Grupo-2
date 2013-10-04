/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TAYLY
 */
public class Conexao {
    
    private static Connection conexaoJasper = null;
    private static Connection conexao = null;
    private static com.mysql.jdbc.Driver mysqlDriver;

    public static java.sql.Connection getConnection() throws SQLException {
        String conecaoMysql = "jdbc:mysql://localhost" + "/?user=" + HibernateConfiguration.getUsuarioBase()
                + "&password=" + HibernateConfiguration.getSenhaBase();
        if (conexao == null) {
            mysqlDriver = new com.mysql.jdbc.Driver();
            conexao = DriverManager.getConnection(conecaoMysql);
        }
        return conexao;
    }
    
    public static Connection getConnectionJasper() throws SQLException {

        String conecaoMysql = "jdbc:mysql://" + HibernateConfiguration.getHost() + "/" + HibernateConfiguration.getBaseDados()
                + "?user=" + HibernateConfiguration.getUsuarioBase()+ "&password=" + HibernateConfiguration.getSenhaBase();
        System.out.println(conecaoMysql);
        if (conexaoJasper == null) {
            mysqlDriver = new com.mysql.jdbc.Driver();
            conexaoJasper = DriverManager.getConnection(conecaoMysql);
        }
        return conexaoJasper;
    }
}


