/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.Proizvod;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import repository.Repository;
import repository.db.DbConnectionFactory;

/**
 *
 * @author trifu
 */
public class RepositoryDbProizvod implements Repository<Proizvod, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();

    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(Proizvod param) throws Exception {
        try {
            String sql = "INSERT INTO \"Proizvod\" (\"sifraProizvoda\",\"nazivProizvoda\",\"zapremina\",\"opis\",\"sifraTipaProizvoda\",\"JedinicaMere\") VALUES (?,?,?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getSifraProizvoda());
            statement.setString(2, param.getNazivProizvoda());
            statement.setDouble(3, param.getZapremina());
            statement.setString(4, param.getOpis());
            statement.setLong(5, param.getTipProizvoda());
            statement.setString(6, param.getJedMereStr());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert proizvod DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(Proizvod param) throws Exception {
        try {
            String sql = "UPDATE \"Proizvod\" SET \"nazivProizvoda\"=?,\"zapremina\"=?,\"opis\"=?,\"sifraTipaProizvoda\"=?,\"JedinicaMere\"=? WHERE \"sifraProizvoda\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(6, param.getSifraProizvoda());
            preparedStatement.setString(1, param.getNazivProizvoda());
            preparedStatement.setDouble(2, param.getZapremina());
            preparedStatement.setString(3, param.getOpis());
            preparedStatement.setLong(4, param.getTipProizvoda());
            preparedStatement.setString(5, param.getJedMereStr());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Proizvod can not be updated!");
        }
    }

    @Override
    public void delete(Proizvod param) throws Exception {
        try {
            String sql = "DELETE FROM \"Proizvod\" WHERE \"sifraProizvoda\"=" + param.getSifraProizvoda();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Proizvod can not be deleted!");
        }
    }

    @Override
    public List<Proizvod> getAll() throws Exception {
        try {

            String sql = "SELECT * FROM \"Proizvod\"";
            System.out.println(sql);
            List<Proizvod> listaProizvoda = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Proizvod proizvod = new Proizvod();
                proizvod.setSifraProizvoda(rs.getLong("sifraProizvoda"));
                proizvod.setNazivProizvoda(rs.getString("nazivProizvoda"));
                proizvod.setZapremina(rs.getDouble("zapremina"));
                proizvod.setOpis(rs.getString("opis"));
                proizvod.setTipProizvoda(rs.getLong("sifraTipaProizvoda"));
                proizvod.setJedMereStr(rs.getString("JedinicaMere"));
                listaProizvoda.add(proizvod);

            }
            rs.close();
            statement.close();

            return listaProizvoda;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Proizvodi error!\n" + e.getMessage());
        }
    }

    @Override
    public Proizvod get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(Proizvod param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(Proizvod param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
