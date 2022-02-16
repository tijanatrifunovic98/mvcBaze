/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.PravnoLice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author trifu
 */
public class RepositoryDbPravnoLiceView2 implements DbRepository<PravnoLice, String> {

    @Override
    public void add(PravnoLice param) throws Exception {
        try {
            String sql = "INSERT INTO PRAVNOLICE_VIEW2 (PIBO,NAZIV,PIBD,TELEFON,ADRESA,TEKUCIRACUN) VALUES (?,?,?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getPIB());
            statement.setString(2, param.getNaziv());
            statement.setLong(3, param.getPIB());
            statement.setString(4, param.getTelefon());
            statement.setString(5, param.getAdresa());
            statement.setString(6, param.getTekuciRacun());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert pravnoLice_view2 DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(PravnoLice param) throws Exception {
        try {
            String sql = "UPDATE PRAVNOLICE_VIEW2 SET NAZIV=?,TELEFON=?,ADRESA=?,TEKUCIRACUN=? WHERE PIBO=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(5, param.getPIB());
            preparedStatement.setString(1, param.getNaziv());
            preparedStatement.setString(2, param.getTelefon());
            preparedStatement.setString(3, param.getAdresa());
            preparedStatement.setString(4, param.getTekuciRacun());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("PRAVNOLICE_VIEW2 can not be updated!");
        }
    }

    @Override
    public void delete(PravnoLice param) throws Exception {
        try {
            String sql = "DELETE FROM PRAVNOLICE_VIEW2 WHERE pibd=" + param.getPIB()+ "AND pibo="+param.getPIB();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("PRAVNOLICE_VIEW2 can not be deleted!");
        }
    }

    @Override
    public List<PravnoLice> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
