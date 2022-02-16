/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.PravnoLice;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import repository.Repository;
import repository.db.DbConnectionFactory;

/**
 *
 * @author trifu
 */
public class RepositoryDbPravnoLice implements Repository <PravnoLice, String>{

    @Override
    public void connect() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disconnect() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(PravnoLice param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(PravnoLice param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PravnoLice param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PravnoLice> getAll() throws Exception {
         try {
            String sql = "SELECT \"PIB\",\"naziv\",\"telefon\",\"adresa\",\"tekuciRacun\" FROM \"PravnoLice\"";
            System.out.println(sql);
            List<PravnoLice> listPravnoLice = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PravnoLice pl= new PravnoLice();
                pl.setPIB(rs.getLong("PIB"));
                pl.setNaziv(rs.getString("naziv"));
                pl.setTelefon(rs.getString("telefon"));
                pl.setAdresa(rs.getString("adresa"));
                pl.setTelefon(rs.getString("tekuciRacun"));
                listPravnoLice.add(pl);

            }
            rs.close();
            statement.close();

            return listPravnoLice;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Pravna Lica error!\n" + e.getMessage());
        }
    }

    @Override
    public PravnoLice get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(PravnoLice param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(PravnoLice param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
