/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.StavkaRacuna;
import domain.StavkaRezervacije;
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
public class RepositoryDbStavkaRezervacije implements Repository<StavkaRezervacije, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(StavkaRezervacije param) throws Exception {
        try {
            String sql = "INSERT INTO \"StavkaRezervacije\" (\"redniBrojStavkeRezervacije\",\"brojRezervacije\",\"kolicina\",\"barkod\",\"ukupnaNaknada\",\"rabat\",\"prodajnaCenaSaRabatom\",\"poreskaOsnovica\","
                    + "\"sifraProizvoda\",\"redniBrojStavke\",\"sifraPonude\") VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getRedniBrojStavkeRezervacije());
            statement.setLong(2, param.getBrojRezervacije());
            statement.setInt(3, param.getKolicina());
            statement.setString(4, param.getBarkod());
            statement.setDouble(5, param.getUkupnaNaknada());
            statement.setDouble(6, param.getRabat());
            statement.setDouble(7, param.getProdajnaCenaSaRabatom());
            statement.setDouble(8, param.getPoreskaOsnovica());
            statement.setLong(9, param.getSifraProizvoda());
            statement.setLong(10, param.getRedniBrojStavkePonude());
            statement.setLong(11, param.getSifraPonude());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert Stavka Rezervacije DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(StavkaRezervacije param) throws Exception {
        try {
            String sql = "UPDATE \"StavkaRezervacije\" SET \"kolicina\"=?,\"barkod\"=?,\"ukupnaNaknada\"=?,\"rabat\"=?,\"prodajnaCenaSaRabatom\"=?,\"poreskaOsnovica\"=?,"
                    + "\"sifraProizvoda\"=?,\"redniBrojStavke\"=?,\"sifraPonude\"=?,\"godina\"=? WHERE \"redniBrojStavkeRezervacije\"=? AND \"brojRezervacije\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getKolicina());
            preparedStatement.setString(2, param.getBarkod());
            preparedStatement.setDouble(3, param.getUkupnaNaknada());
            preparedStatement.setDouble(4, param.getRabat());
            preparedStatement.setDouble(5, param.getProdajnaCenaSaRabatom());
            preparedStatement.setDouble(6, param.getPoreskaOsnovica());
            preparedStatement.setLong(7, param.getSifraProizvoda());
            preparedStatement.setLong(8, param.getRedniBrojStavkePonude());
            preparedStatement.setLong(9, param.getSifraPonude());
            preparedStatement.setInt(10, param.getGodina());
            preparedStatement.setLong(11, param.getRedniBrojStavkeRezervacije());
            preparedStatement.setLong(12, param.getBrojRezervacije());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Stavka rezervacije can not be updated!");
        }
    }

    @Override
    public void delete(StavkaRezervacije param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StavkaRezervacije> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"StavkaRezervacije\"";
            System.out.println(sql);
            List<StavkaRezervacije> listStavkaRezervacije = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                StavkaRezervacije sr = new StavkaRezervacije();
                sr.setRedniBrojStavkeRezervacije(rs.getLong("redniBrojStavkeRezervacije"));
                sr.setBrojRezervacije(rs.getLong("brojRezervacije"));
                sr.setKolicina(rs.getInt("kolicina"));
                sr.setBarkod(rs.getString("barkod"));
                sr.setUkupnaNaknada(rs.getDouble("ukupnaNaknada"));
                sr.setRabat(rs.getDouble("rabat"));
                sr.setProdajnaCenaSaRabatom(rs.getDouble("prodajnaCenaSaRabatom"));
                sr.setPoreskaOsnovica(rs.getDouble("poreskaOsnovica"));
                sr.setSifraProizvoda(rs.getLong("sifraProizvoda"));
                sr.setRedniBrojStavkePonude(rs.getLong("redniBrojStavke"));
                sr.setSifraPonude(rs.getLong("sifraPonude"));
                sr.setGodina(rs.getInt("godina"));

                listStavkaRezervacije.add(sr);

            }
            rs.close();
            statement.close();

            return listStavkaRezervacije;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Stavke rezervacije error!\n" + e.getMessage());
        }
    }

    @Override
    public StavkaRezervacije get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(StavkaRezervacije param) throws Exception {
        try {
            String sql = "UPDATE \"StavkaRezervacije\" SET \"kolicina\"=?,\"barkod\"=?,\"ukupnaNaknada\"=?,\"rabat\"=?,\"prodajnaCenaSaRabatom\"=?,\"poreskaOsnovica\"=?,"
                    + "\"sifraProizvoda\"=?,\"redniBrojStavke\"=?,\"sifraPonude\"=? WHERE \"redniBrojStavkeRezervacije\"=?,\"brojRezervacije\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getKolicina());
            preparedStatement.setString(2, param.getBarkod());
            preparedStatement.setDouble(3, param.getUkupnaNaknada());
            preparedStatement.setDouble(4, param.getRabat());
            preparedStatement.setDouble(5, param.getProdajnaCenaSaRabatom());
            preparedStatement.setDouble(6, param.getPoreskaOsnovica());
            preparedStatement.setLong(7, param.getSifraProizvoda());
            preparedStatement.setLong(8, param.getRedniBrojStavkePonude());
            preparedStatement.setLong(9, param.getSifraPonude());
            preparedStatement.setLong(10, param.getRedniBrojStavkeRezervacije());
            preparedStatement.setLong(11, param.getBrojRezervacije());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Stavka rezervacije can not be updated!");
        }
    }

    @Override
    public void saveSaImenom(StavkaRezervacije param) throws Exception {
        try {
            String sql = "UPDATE \"StavkaRezervacije\" SET \"kolicina\"=?,\"barkod\"=?,\"ukupnaNaknada\"=?,\"rabat\"=?,\"prodajnaCenaSaRabatom\"=?,\"poreskaOsnovica\"=?,"
                    + "\"sifraProizvoda\"=?,\"redniBrojStavke\"=?,\"sifraPonude\"=? WHERE \"redniBrojStavkeRezervacije\"=? AND \"brojRezervacije\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getKolicina());
            preparedStatement.setString(2, param.getBarkod());
            preparedStatement.setDouble(3, param.getUkupnaNaknada());
            preparedStatement.setDouble(4, param.getRabat());
            preparedStatement.setDouble(5, param.getProdajnaCenaSaRabatom());
            preparedStatement.setDouble(6, param.getPoreskaOsnovica());
            preparedStatement.setLong(7, param.getSifraProizvoda());
            preparedStatement.setLong(8, param.getRedniBrojStavkePonude());
            preparedStatement.setLong(9, param.getSifraPonude());
            //preparedStatement.setInt(10, param.getGodina());
            preparedStatement.setLong(10, param.getRedniBrojStavkeRezervacije());
            preparedStatement.setLong(11, param.getBrojRezervacije());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Stavka rezervacije can not be updated!");
        }
    }

}
