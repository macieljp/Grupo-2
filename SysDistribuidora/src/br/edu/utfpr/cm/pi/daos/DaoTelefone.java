/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.edu.utfpr.cm.pi.entidades.Cliente;
import br.edu.utfpr.cm.pi.entidades.Telefone;


  
/**
 *
 * @author Tayly
 */
public class DaoTelefone implements Dao<Telefone>{
  
    private static Telefone converteRsParaTelefone(ResultSet rs) throws SQLException {
       
             Telefone t = new Telefone();
       
             t.setnumero(rs.getString("Numero"));
       
        return t;
    }
   
       @Override
    public void persist(Telefone t) throws SQLException, Exception{
        if(t.getId()==0)
            insert(t);
        else
            update(t);
    } 
       
        private void insert(Telefone t) throws SQLException, Exception{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement
                ("INSERT INTO Telefone(id,numero) VALUES(?,?,)", Statement.RETURN_GENERATED_KEYS);
      
        pst.setInt(1,t.getId());
        pst.setString(1, t.getnumero());
       
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        t.setId(rs.getInt(1));
    }
    
        //Override
       public Telefone retrieve(int id) throws SQLException, Exception{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Telefone WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Telefone t = converteRsParaTelefone(rs);
       
        return t;
    }

    public void update(Telefone t) throws SQLException, Exception{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE Teelfone SET numero = ?");
       
        pst.setInt(1,t.getId());
        pst.setString(2, t.getnumero());
        
        pst.execute();
    }
    
    @Override
    
    public void delete(Telefone t) throws SQLException, Exception{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Telefone WHERE id = " + t.getId());
    }
    
    @Override
   
    public List<Telefone> list() throws SQLException, Exception{
        List<Telefone> Telefones = new ArrayList<Telefone>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Telefone");
        
        while(rs.next()){
           Telefone p = converteRsParaTelefone(rs);
           
           Telefones.add(p);
        
          
        }
        
        return Telefones;
    }
    
    
    public static void main(String[] args) throws SQLException, Exception {
        List ends = new DaoTelefone().list();
        
        for(Object e: ends){
            System.out.println(" : " + e);
        }
 
        
        
        
         //Teste
      
        Cliente c = new Cliente();
        c.setCpf("2872654654");
        c.setNome("Tayly");

       Telefone tel = new Telefone();
       
       tel.setnumero("Numero");
       
      
        //c.setEndereco(end);
       
        
        new DaoCliente().persist(c);

       Telefone telefone = new Telefone();
      
       tel.setnumero("9826");
       
       new DaoTelefone().persist(tel);
        
   
   }

   

    @Override
    public Telefone retrive(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  
}   