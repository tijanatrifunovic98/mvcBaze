/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.Ponuda;
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
public class RepositoryDbPonuda implements Repository<Ponuda, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(Ponuda param) throws Exception {
        try {
            String sql = "INSERT INTO \"Ponuda\" (\"sifraPonude\",\"godina\",\"PIB\") VALUES (?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getSifraPonude());
            statement.setInt(2, param.getGodina());
            statement.setLong(3, param.getPIB());

            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert ponuda DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(Ponuda param) throws Exception {
        try {
            String sql = "UPDATE \"Ponuda\" SET \"PIB\"=?,\"godina\" =? WHERE \"sifraPonude\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(3, param.getSifraPonude());
            preparedStatement.setLong(1, param.getPIB());
            preparedStatement.setInt(2, param.getGodina());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("PONUDA can not be updated!");
        }
    }

    @Override
    public void delete(Ponuda param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ponuda> getAll() throws Exception {
        try {
            String sql = "SELECT \"sifraPonude\",\"godina\",\"PIB\" FROM \"Ponuda\"";
            System.out.println(sql);
            List<Ponuda> listPonuda = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Ponuda ponuda = new Ponuda();
                ponuda.setSifraPonude(rs.getLong("sifraPonude"));
                ponuda.setGodina(rs.getInt("godina"));
                ponuda.setPIB(rs.getLong("PIB"));

                listPonuda.add(ponuda);

            }
            rs.close();
            statement.close();

            return listPonuda;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Ponude error!\n" + e.getMessage());
        }
    }

    @Override
    public Ponuda get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(Ponuda param) throws Exception {
        try {
            String sql = "UPDATE \"Ponuda\" SET \"PIB\"=?,\"godina\" =? WHERE \"sifraPonude\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(3, param.getSifraPonude());
            preparedStatement.setLong(1, param.getPIB());
            preparedStatement.setInt(2, param.getGodina());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("PONUDA can not be updated!");
        }
    }

    @Override
    public void saveSaImenom(Ponuda param) throws Exception {
        try {
            String sql = "UPDATE \"Ponuda\" SET \"PIB\"=?,\"godina\" =? WHERE \"sifraPonude\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(3, param.getSifraPonude());
            preparedStatement.setLong(1, param.getPIB());
            preparedStatement.setInt(2, param.getGodina());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("PONUDA can not be updated!");
        }
    }

}
