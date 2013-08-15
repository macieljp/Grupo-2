/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdistribuidora.bd.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tayly
 */
public class DriverManager {
    
 public static void main(String[] args) throws SQLException {
        
     
        java.sql.DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno", "aluno", "aluno");
        
        con.setAutoCommit(false);
       
        Statement st =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);                                
        st.execute("SELECT * FROM cliente");
        ResultSet rs = st.getResultSet();
        
        System.out.println("TYPE=" +rs.getType());
        
        while(rs.next()){
            for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                if(rs.getMetaData().getColumnName(i).equals("nome")){
                    rs.updateObject(i, rs.getObject(i) + "xx");
                }
                System.out.print(rs.getMetaData().getColumnLabel(i) + "=" + rs.getObject(i) + " ,  ");
            }
            rs.updateRow();
            System.out.println("");
        }

        con.commit();
    }
}
   

