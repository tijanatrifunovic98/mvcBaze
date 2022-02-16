/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.PravnoLice;
import domain.StavkaPonude;
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
public class RepositoryDbStavkaPonude implements Repository<StavkaPonude, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(StavkaPonude param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(StavkaPonude param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(StavkaPonude param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StavkaPonude> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"StavkaRacuna\"";

            System.out.println(sql);
            List<StavkaPonude> listStavkaPonude = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                StavkaPonude sp = new StavkaPonude();
                sp.setRedniBrojStavke(rs.getLong("redniBrojStavke"));
                sp.setSifraPonude(rs.getLong("sifraPonude"));
                sp.setSifraProizvoda(rs.getLong("sifraProizvoda"));

                listStavkaPonude.add(sp);

            }
            rs.close();
            statement.close();

            return listStavkaPonude;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Stavke ponude error!\n" + e.getMessage());
        }
    }

    @Override
    public StavkaPonude get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(StavkaPonude param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(StavkaPonude param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
