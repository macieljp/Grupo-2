/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Tayly
 */
public class ConnectionFactory {
    
    /**
     *
     */
    public static final String JDBC_URL="jdbc:mysql://localhost:3306/aluno?user=aluno&password=aluno";
    
    public static Connection prepareConnection() throws Exception {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
        
    }
    
}
