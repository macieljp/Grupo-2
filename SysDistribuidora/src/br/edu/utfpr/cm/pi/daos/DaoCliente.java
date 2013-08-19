/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.bean.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class DaoCliente implements Dao<Cliente> {
    
    private static Cliente converteRsParaCliente (ResultSet rs) throws SQLException {
       
        Cliente c = new Cliente();
        c.setId(rs.getInt("id: "));
        c.setNome(rs.getString("Nome: "));
        c.setCpf(rs.getString("Cpf: "));
        //c.setEndereco(rs.getString("Endereço: "));
        c.setdNascimento(rs.getDate("Data de Nascimento: "));
        
        return c;
      }
    
  @Override

   
    public String toString() {
        return "DaoCliente{" + '}';
    }
  
     public Cliente retrieve(int id) throws SQLException, Exception {
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Cliente WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Cliente c = converteRsParaCliente(rs);
       
        return c;
    }
  
    private static void update(Cliente c) throws SQLException, Exception{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement
                ("UPDATE Cliente SET nome = ?, cpf = ? WHERE id = ?");
        pst.setString(1, c.getNome());
        pst.setString(2, c.getCpf());
        pst.setInt(3, c.getId());
        pst.execute();
    }
  
    //@Override
    public void delete(Cliente c) throws SQLException, Exception{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Cliente WHERE id = " + c.getId());
    }
    
     // @Override
    public List<Cliente> list() throws SQLException, Exception{
        List<Cliente> Cliente = new ArrayList<Cliente>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Pessoa");
        
        while(rs.next()){
            Cliente p = converteRsParaCliente(rs);
            Cliente.add(p);
        }
        
        return Cliente;
    }

    @Override
    public void persist(Cliente o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente retrive(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastrarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void alterarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}