/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.JedinicaMere;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author trifu
 */
public class RepositoryDbJedinicaMere implements DbRepository<JedinicaMere, String>{

    @Override
    public void add(JedinicaMere param) throws Exception {
  try {
            String sql="INSERT INTO \"JedinicaMere\" (\"sifraJediniceMere\",\"nazivJediniceMere\") VALUES (?,?)";           
            System.out.println(sql);
            Connection connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setLong(1, param.getSifraJediniceMere());
            statement.setString(2, param.getNazivJediniceMere());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert jedinice mere DB error: \n"+ex.getMessage());
        }    }

    @Override
    public void save(JedinicaMere param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(JedinicaMere param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JedinicaMere> getAll() throws Exception {
         try {
            String sql = "SELECT \"sifraJediniceMere\",\"nazivJediniceMere\" FROM \"JedinicaMere\"";
            System.out.println(sql);
            List<JedinicaMere> listJedinicaMere = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                JedinicaMere jm = new JedinicaMere();
                jm.setSifraJediniceMere(rs.getLong("sifraJediniceMere"));
                jm.setNazivJediniceMere(rs.getString("nazivJediniceMere"));
                listJedinicaMere.add(jm);

            }
            rs.close();
            statement.close();

            return listJedinicaMere;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Jedinice mere error!\n" + e.getMessage());
        }
    }


    @Override
    public void saveSaDatumom(JedinicaMere param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(JedinicaMere param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JedinicaMere get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
