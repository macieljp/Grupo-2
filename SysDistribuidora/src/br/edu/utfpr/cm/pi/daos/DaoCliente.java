/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.api.Filter;
import br.edu.utfpr.cm.pi.entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class DaoCliente implements Dao<Cliente> {
    
      private static Cliente converteRsParaCliente(ResultSet rs) throws SQLException {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        c.setCpf(rs.getString("cpf"));
        
        c.setdataNascimento(rs.getDate("dataNascimento"));
        c.setEndereco(new DaoEndereco().retrieve(rs.getInt("endereco")) );
        return c;
    }

    @Override
    public void persist(Cliente c) throws SQLException{
        if(c.getId()==0)
            insert(c);
        else
            update(c);
    }
    
    private static void insert(Cliente c ) throws SQLException{
        PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Pessoa (nome, cpf, dataNascimento, endereco) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, c.getNome());
        pst.setString(2, c.getCpf());
        pst.setDate(3, new Date(c.getdataNascimento().getTime()));

        /* CASCATEAR as associações*/
        if(c.getEndereco()!= null){
            new DaoEndereco().persist(c.getEndereco());
            pst.setInt(4, c.getEndereco().getId());
        }else{
            pst.setObject(4, null);
            /* ou */
            pst.setNull(4, Types.INTEGER);
        }

        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        c.setId(rs.getInt(1));
        
    }
    
    //@Override
   
    public Cliente retrieve(int id) throws SQLException{
        Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Pessoa WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Cliente c = converteRsParaCliente(rs);
       
        return c;
    }

    private static void update(Cliente c) throws SQLException{
        PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement("UPDATE Pessoa SET nome = ?, cpf = ?, datanascimento = ?, endereco = ? WHERE id = ?");
        pst.setString(1, c.getNome());
        pst.setString(2, c.getCpf());
        pst.setDate(3, new Date(c.getdataNascimento().getTime()));

        /* CASCATEAR as associações*/
        if(c.getEndereco()!= null){
            new DaoEndereco().persist(c.getEndereco());
            pst.setInt(4, c.getEndereco().getId());
        }else{
            pst.setObject(4, null);
            /* ou */
            pst.setNull(4, Types.INTEGER);
        }
        
        pst.setInt(3, c.getId());
        pst.execute();
    }
    
    //@Override
   
    public void delete(Cliente c) throws SQLException{
        Connection con = br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnectionTransactrion();
        delete(c, con);                                
        con.commit();
    }
    
    //@Override
    
    public void delete(Cliente c , Connection con) throws SQLException{
        
        Statement st =  con.createStatement();                                
        st.execute("DELETE FROM Pessoa WHERE id = " + c.getId());

        /* CASCATEANDO as dependências */
        new DaoEndereco().delete(c.getEndereco(), con);
        
    }
    
    //@Override
    
    public List<Cliente> list(String whereClause, String orderClause) throws SQLException{
        List<Cliente> enderecos = new ArrayList<Cliente>();
        
        Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Pessoa" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
           Cliente c = converteRsParaCliente(rs);
            enderecos.add(c);
        }
        
        return enderecos;
    }
    
    //@Override
    
    public List<Cliente> list(Filter... filters) throws SQLException{
        
        List<Cliente> Clientes = new ArrayList<Cliente>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Cliente");
        }else{
            String sql = "SELECT * FROM Cliente WHERE ";
            
            for(Filter f : filters){
                System.out.println(f);
                
                switch(f.getOperator()){
                    
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
            }
            PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs =  pst.executeQuery();
        }
        
        /* Converte o ResultSet da query para uma lista de objetos */
//        while(rs.next()){
//            Cliente c  = converteRsParaCliente(rs);
//            c.add(c);
//           
//        }
//        
//        return clientes;
//    }
//    
    public static void main(String[] args) throws SQLException, Exception {
        Connection con = br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnectionTransactrion();
           Cliente c = new DaoCliente().list().get(0);
            System.out.println(c);
            new DaoCliente().delete(c, con);
        con.commit();

       Cliente c2 = new DaoCliente().list().get(0);
        System.out.println(c2);
        new DaoCliente().delete(c2);
        
        c2.getEndereco().getLogradouro().concat("").intern().charAt(1);
    }

    @Override
    public Cliente retrive(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> list() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

