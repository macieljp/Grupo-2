/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.api.Filter;
import br.edu.utfpr.cm.pi.api.Operator;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAYLY
 */

    public class DaoEndereco implements br.edu.utfpr.cm.pi.api.Dao<Endereco>{

    private static Endereco converteRsParaEndereco(ResultSet rs) throws SQLException {
        Endereco e = new Endereco();
        e.setId(rs.getInt("id"));
        e.setLogradouro(rs.getString("logradouro"));
        e.setNumero(rs.getInt("numero"));
        e.setComplemento(rs.getString("complemento"));
        return e;
    }

    @Override
    public void persist(Endereco e) throws SQLException{
        if(e.getId()==0)
            insert(e);
        else
            update(e);
    }
    
    private void insert(Endereco e) throws SQLException{
        PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Endereco (logradouro, numero, complemento) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, e.getLogradouro());
        pst.setInt(2, e.getNumero());
        pst.setString(3, e.getComplemento());
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        e.setId(rs.getInt(1));
    }
    
    @Override
    public Endereco retrieve(int id) throws SQLException{
        Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Endereco WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Endereco p = converteRsParaEndereco(rs);
       
        return p;
    }

    public void update(Endereco e) throws SQLException{
        PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement("UPDATE Endereco SET logradouro = ?, numero = ?, complemento = ? WHERE id = ?");
        pst.setString(1, e.getLogradouro());
        pst.setInt(2, e.getNumero());
        pst.setString(3, e.getComplemento());
        pst.setInt(4, e.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Endereco e) throws SQLException{
        delete(e, br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection());
    }
    
    @Override
    public void delete(Endereco e, Connection con) throws SQLException{
        Statement st =  con.createStatement();                                
        st.execute("DELETE FROM Endereco WHERE id = " + e.getId());
    }
    
    @Override
    public List<Endereco> list(String whereClause, String orderClause) throws SQLException{
        List<Endereco> enderecos = new ArrayList<Endereco>();
        
        Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Endereco" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Endereco p = converteRsParaEndereco(rs);
            enderecos.add(p);
        }
        
        return enderecos;
    }
    
    @Override
    public List<Endereco> list(Filter... filters) throws SQLException{
        
        List<Endereco> Enderecos = new ArrayList<Endereco>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Endereco");
        }else{
            String sql = "SELECT * FROM Endereco WHERE ";
            
            for(int i = 0; i < filters.length; i++){
                Filter f = filters[i];
                System.out.println(f);
                
                switch(f.getOperator()){
                    
                    case IS_NOT_NULL: sql += f.getAttribute() + " IS NOT NULL"; break;
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%?" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='?" + f.getValue()+ "'"; break;
                    case MORE_THAN: sql += f.getAttribute() + ">?'" + f.getValue()+ "'"; break;
                    case MORE_THAN_EQUAL: sql += f.getAttribute() + ">=?'" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
                
                /* No ultimo elemento não se coloca o operador AND */
                if(i < filters.length -1){
                    sql += " AND ";
                }
            }
            PreparedStatement pst =  br.edu.utfpr.cm.pi.api.ConnectionFactory.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs =  pst.executeQuery();
        }
        
        /* Converte o ResultSet da query para uma lista de objetos */
        while(rs.next()){
            Endereco p = converteRsParaEndereco(rs);
            Enderecos.add(p);
        }
        
        return Enderecos;
    }
    
    public static void main(String[] args) throws SQLException {
        String luc = String.format("O aluno %30s tirou uma nota %05d e gicou com media %.2f", "Lucio", 10, 8.5);
        System.out.println(luc);
        
        
        
        /* Teste do método list(String)*/
        List ends = new DaoEndereco().list(null, "id");
        for(Object e: ends){
            System.out.println("->" + e);
        }
        
        /* Teste do método list(Fiter)*/
        List ends2 = new DaoEndereco().list(new Filter
                ("logradouro",Operator.LIKE, "Log"), new Filter("id", Operator.MORE_THAN, 28));
        for(Object e: ends2){
            System.out.println("XXXXXXXXXXXXXXXXXX>" + e);
        }
        


//        Pessoa p = new Pessoa();
//        p.setCpf("123123654654");
//        p.setNome("Luciooooooooooooo");
//
//        Endereco end = new Endereco();
//        end.setLogradouro("Log");
//        p.setEndereco(end);
//        
//        new DaoPessoa().persist(p);
//
//        Endereco ende = new Endereco();
//        end.setLogradouro("Log23");
//        new DaoEndereco().persist(ende);
//    }

    }
}
