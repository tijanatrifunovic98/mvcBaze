/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.Cena;
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
public class RepositoryDbCena implements Repository<Cena, String> {

    @Override
    public void add(Cena param) throws Exception {
        try {
            String sql = "INSERT INTO \"Cena\" (\"sifraProizvoda\",\"sifraCene\",\"vrednost\",\"sifraPDV\") VALUES (?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getSifraProizvoda());
            statement.setLong(2, param.getSifraCene());
            statement.setDouble(3, param.getVrednost());
            statement.setLong(4, param.getSifraPDV());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert cena DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(Cena param) throws Exception {
        try {
            String sql = "UPDATE \"Cena\" SET \"vrednost\"=?,\"sifraPDV\"=?,\"nazivProizvoda\"=? WHERE \"sifraProizvoda\"=? AND \"sifraCene\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(4, param.getSifraProizvoda());
            preparedStatement.setLong(5, param.getSifraCene());

            preparedStatement.setDouble(1, param.getVrednost());
            preparedStatement.setLong(2, param.getSifraPDV());
            preparedStatement.setString(3, param.getNazivProizvoda());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Cena can not be updated!");
        }
    }

    @Override
    public void delete(Cena param) throws Exception {
        try {
            String sql = "DELETE FROM \"Cena\" WHERE \"sifraProizvoda\"=" + param.getSifraCene() + "AND SIFRACENE=" + param.getSifraCene();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Cena can not be deleted!");
        }
    }

    @Override
    public List<Cena> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"Cena\"";

            System.out.println(sql);
            List<Cena> listCena = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Cena cena = new Cena();
                cena.setSifraProizvoda(rs.getLong("sifraProizvoda"));
                cena.setSifraCene(rs.getLong("sifraCene"));
                cena.setVrednost(rs.getDouble("vrednost"));
                cena.setSifraPDV(rs.getLong("sifraPDV"));
                cena.setNazivProizvoda(rs.getString("nazivProizvoda"));
                listCena.add(cena);

            }
            rs.close();
            statement.close();

            return listCena;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Cene error!\n" + e.getMessage());
        }
    }

    @Override
    public void saveSaDatumom(Cena param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(Cena param) throws Exception {
        try {
            String sql = "UPDATE \"Cena\" SET \"vrednost\"=?,\"sifraPDV\"=?,\"nazivProizvoda\"=? WHERE \"sifraProizvoda\"=? AND \"sifraCene\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(4, param.getSifraProizvoda());
            preparedStatement.setLong(5, param.getSifraCene());

            preparedStatement.setDouble(1, param.getVrednost());
            preparedStatement.setLong(2, param.getSifraPDV());
            preparedStatement.setString(3, param.getNazivProizvoda());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Cena can not be updated!");
        }
    }

    @Override
    public Cena get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

}
