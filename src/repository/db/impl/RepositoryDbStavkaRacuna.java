/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.StavkaRacuna;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class RepositoryDbStavkaRacuna implements Repository<StavkaRacuna, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(StavkaRacuna param) throws Exception {
        try {
            String sql = "INSERT INTO \"StavkaRacuna\" (\"redniBrojStavkeRacuna\",\"brojRacuna\",\"kolicina\",\"barkod\",\"ukupnaNaknada\",\"rabat\",\"prodajnaCenaSaRabatom\",\"poreskaOsnovica\","
                    + "\"sifraProizvoda\",\"redniBrojStavkePredracuna\",\"brojPredracuna\") VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getRedniBrojStavkeRacuna());
            statement.setLong(2, param.getSifraRacuna());
            statement.setInt(3, param.getKolicina());
            statement.setString(4, param.getBarkod());
            statement.setDouble(5, param.getUkupnaNaknada());
            statement.setDouble(6, param.getRabat());
            statement.setDouble(7, param.getProdajnaCenaSaRabatom());
            statement.setDouble(8, param.getPoreskaOsnovica());
            statement.setLong(9, param.getSifraProizvoda());
            statement.setLong(10, param.getRedniBrojStavkePredracuna());
            statement.setLong(11, param.getBrojPredracuna());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert Stavka Racuna DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(StavkaRacuna param) throws Exception {
        try {
            String sql = "UPDATE \"StavkaRacuna\" SET \"kolicina\"=?,\"barkod\"=?,\"ukupnaNaknada\"=?,\"rabat\"=?,\"prodajnaCenaSaRabatom\"=?,\"poreskaOsnovica\"=?,"
                    + "\"sifraProizvoda\"=?,\"redniBrojStavkePredracuna\"=?,\"brojPredracuna\"=? WHERE \"redniBrojStavkeRacuna\"=? AND \"brojRacuna\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(10, param.getRedniBrojStavkeRacuna());
            preparedStatement.setLong(11, param.getSifraRacuna());
            preparedStatement.setInt(1, param.getKolicina());
            preparedStatement.setString(2, param.getBarkod());
            preparedStatement.setDouble(3, param.getUkupnaNaknada());
            preparedStatement.setDouble(4, param.getRabat());
            preparedStatement.setDouble(5, param.getProdajnaCenaSaRabatom());
            preparedStatement.setDouble(6, param.getPoreskaOsnovica());
            preparedStatement.setLong(7, param.getSifraProizvoda());
            preparedStatement.setLong(8, param.getRedniBrojStavkePredracuna());
            preparedStatement.setLong(9, param.getBrojPredracuna());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Stavka Racuna can not be updated!");
        }
    }

    @Override
    public void delete(StavkaRacuna param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StavkaRacuna> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"StavkaRacuna\"";
            System.out.println(sql);
            List<StavkaRacuna> listStavkaRacuna = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                StavkaRacuna sr = new StavkaRacuna();
                sr.setRedniBrojStavkeRacuna(rs.getLong("redniBrojStavkeRacuna"));
                sr.setSifraRacuna(rs.getLong("brojRacuna"));
                sr.setKolicina(rs.getInt("kolicina"));
                sr.setBarkod(rs.getString("barkod"));
                sr.setUkupnaNaknada(rs.getDouble("ukupnaNaknada"));
                sr.setRabat(rs.getDouble("rabat"));
                sr.setProdajnaCenaSaRabatom(rs.getDouble("prodajnaCenaSaRabatom"));
                sr.setPoreskaOsnovica(rs.getDouble("poreskaOsnovica"));
                sr.setSifraProizvoda(rs.getLong("sifraProizvoda"));
                sr.setRedniBrojStavkePredracuna(rs.getLong("redniBrojStavkePredracuna"));
                sr.setBrojPredracuna(rs.getLong("brojPredracuna"));

                listStavkaRacuna.add(sr);

            }
            rs.close();
            statement.close();

            return listStavkaRacuna;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Stavke racuna error!\n" + e.getMessage());
        }
    }

    @Override
    public StavkaRacuna get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(StavkaRacuna param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(StavkaRacuna param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
