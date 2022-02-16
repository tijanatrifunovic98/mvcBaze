/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.PravnoLiceDetalji;
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
public class RepositoryDbPravnoLiceDetalji implements Repository<PravnoLiceDetalji, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();

    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();

    }

    @Override
    public void add(PravnoLiceDetalji param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(PravnoLiceDetalji param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PravnoLiceDetalji param) throws Exception {

    }

    @Override
    public List<PravnoLiceDetalji> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM PRAVNOLICEDETALJI";

            System.out.println(sql);
            List<PravnoLiceDetalji> listPravnoLiceDetalji = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PravnoLiceDetalji pld = new PravnoLiceDetalji();
                pld.setPIBD(rs.getLong("PIBD"));
                pld.setTelefon(rs.getString("telefon"));
                pld.setAdresa(rs.getString("adresa"));
                pld.setTekuciRacun(rs.getString("tekuciRacun"));
                pld.setPIBO(rs.getLong("PIBO"));

                listPravnoLiceDetalji.add(pld);

            }
            rs.close();
            statement.close();

            return listPravnoLiceDetalji;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Pravna Lica Detalji error!\n" + e.getMessage());
        }
    }

    @Override
    public PravnoLiceDetalji get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(PravnoLiceDetalji param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(PravnoLiceDetalji param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
