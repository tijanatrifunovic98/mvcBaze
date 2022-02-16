/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.RacuniPouzecem;
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
public class RepositoryDbRacuniPouzecem implements Repository<RacuniPouzecem, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(RacuniPouzecem param) throws Exception {
//        try {
//            String sql = "INSERT INTO RACUN_POUZECEM (BROJRACUNA,UKUPANIZNOS,DATUMPROMETADOBARAIUSLUGA,NACINPLACANJA,DATUMIZDAVANJA,ROKPLACANJA,MESTOIZDAVANJA,MESTOISPORUKE,"
//                    + "MAGACIN,PIB) VALUES (?,?,?,?,?,?,?,?,?,?)";
//            System.out.println(sql);
//            Connection connection = DbConnectionFactory.getInstance().getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setLong(1, param.getBrojRacuna());
//            statement.setDouble(2, param.getUkupanIznos());
//            statement.setDate(3, new java.sql.Date(param.getDatumPrometaDobaraIUsluga().getTime()));
//            statement.setString(4, param.getNacinPlacanja());
//            statement.setDate(5, new java.sql.Date(param.getDatumIzdavanja().getTime()));
//            statement.setInt(6, param.getRokPlacanja());
//            statement.setString(7, param.getMestoIzdavanja());
//            statement.setString(8, param.getMestoIsporuke());
//            statement.setString(9, param.getMagacin());
//            statement.setLong(10, param.getPIB());
//            statement.executeUpdate();
//            statement.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            throw new Exception("Insert RACUN_POUZECEM DB error: \n" + ex.getMessage());
//        }
    }

    @Override
    public void save(RacuniPouzecem param) throws Exception {
//        try {
//            String sql = "UPDATE RACUN_POUZECEM SET UKUPANIZNOS=?,DATUMPROMETADOBARAIUSLUGA=?,NACINPLACANJA=?,DATUMIZDAVANJA=?,ROKPLACANJA=?,MESTOIZDAVANJA=?,MESTOISPORUKE=?,MAGACIN=?,PIB=? WHERE BROJRACUNA=?";
//            Connection connection = DbConnectionFactory.getInstance().getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setLong(10, param.getBrojRacuna());
//            preparedStatement.setDouble(1, param.getUkupanIznos());
//            preparedStatement.setDate(2, new java.sql.Date(param.getDatumPrometaDobaraIUsluga().getTime()));
//            preparedStatement.setString(3, param.getNacinPlacanja());
//            preparedStatement.setDate(4, new java.sql.Date(param.getDatumIzdavanja().getTime()));
//            preparedStatement.setInt(5, param.getRokPlacanja());
//            preparedStatement.setString(6, param.getMestoIzdavanja());
//            preparedStatement.setString(7, param.getMestoIsporuke());
//            preparedStatement.setString(8, param.getMagacin());
//            preparedStatement.setLong(9, param.getPIB());
//            preparedStatement.executeUpdate();
//            preparedStatement.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception("RACUN_POUZECEM can not be updated!");
//        }
    }

    @Override
    public void delete(RacuniPouzecem param) throws Exception {
        try {
            String sql = "DELETE FROM \"racun_pouzecem\" WHERE \"brojRacuna\"=" + param.getBrojRacuna();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("RACUN_POUZECEM can not be deleted!");
        }
    }

    @Override
    public List<RacuniPouzecem> getAll() throws Exception {
        try {
//            String sql = "SELECT BROJRACUNA,UKUPANIZNOS,DATUMPROMETADOBARAIUSLUGA,NACINPLACANJA,DATUMIZDAVANJA,ROKPLACANJA,MESTOIZDAVANJA,MESTOISPORUKE,"
//                    + "MAGACIN,PIB FROM RACUN_POUZECEM PARTITION(RACUN_LIST)";
            String sql = "SELECT * FROM \"racun_pouzecem\"";

            System.out.println(sql);
            List<RacuniPouzecem> listRacun = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                RacuniPouzecem r = new RacuniPouzecem();
                r.setBrojRacuna(rs.getLong("brojRacuna"));
                r.setUkupanIznos(rs.getDouble("ukupanIznos"));
                r.setDatumPrometaDobaraIUsluga(rs.getDate("datumPrometaDobaraIUsluga"));
                r.setNacinPlacanja(rs.getString("nacinPlacanja"));
                r.setDatumIzdavanja(rs.getDate("datumIzdavanja"));
                r.setRokPlacanja(rs.getInt("rokPlacanja"));
                r.setMestoIzdavanja(rs.getString("mestoIzdavanja"));
                r.setMestoIsporuke(rs.getString("mestoIsporuke"));
                r.setMagacin(rs.getString("magacin"));
                r.setPIB(rs.getLong("PIB"));

                listRacun.add(r);

            }
            rs.close();
            statement.close();

            return listRacun;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Racuni Pouzecem error!\n" + e.getMessage());
        }
    }

    @Override
    public RacuniPouzecem get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(RacuniPouzecem param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(RacuniPouzecem param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
