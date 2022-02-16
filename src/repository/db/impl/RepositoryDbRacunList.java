/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.Racun;
import domain.RacunList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author trifu
 */
public class RepositoryDbRacunList implements DbRepository<RacunList, String> {

    @Override
    public void add(RacunList param) throws Exception {
        try {
            String sql = "INSERT INTO \"Racun\"(\"brojRacuna\",\"ukupanIznos\",\"datumPrometaDobaraIUsluga\",\"nacinPlacanja\",\"datumIzdavanja\",\"rokPlacanja\",\"mestoIzdavanja\",\"mestoIsporuke\","
                    + "\"magacin\",\"PIB\") VALUES (?,?,?,?,?,?,?,?,?,?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getBrojRacuna());
            statement.setDouble(2, param.getUkupanIznos());
            statement.setDate(3, new java.sql.Date(param.getDatumPrometaDobaraIUsluga().getTime()));
            statement.setString(4, param.getNacinPlacanja());
            statement.setDate(5, new java.sql.Date(param.getDatumIzdavanja().getTime()));
            statement.setInt(6, param.getRokPlacanja());
            statement.setString(7, param.getMestoIzdavanja());
            statement.setString(8, param.getMestoIsporuke());
            statement.setString(9, param.getMagacin());
            statement.setLong(10, param.getPIB());
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Insert RACUN_LIST DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(RacunList param) throws Exception {
        try {
            String sql = "UPDATE \"racun_list\" SET \"ukupaniznos\"=?,\"datumprometadobaraiusluga\"=?,\"datumizdavanja\"=?,\"rokplacanja\"=?,\"mestoizdavanja\"=?,\"mestoisporuke\"=?,\"magacin\"=?,\"pib\"=? WHERE \"brojracuna\"=? AND \"nacinplacanja\"=?";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(9, param.getBrojRacuna());
            preparedStatement.setDouble(1, param.getUkupanIznos());
            preparedStatement.setDate(2, new java.sql.Date(param.getDatumPrometaDobaraIUsluga().getTime()));
            preparedStatement.setString(10, param.getNacinPlacanja());
            preparedStatement.setDate(3, new java.sql.Date(param.getDatumIzdavanja().getTime()));
            preparedStatement.setInt(4, param.getRokPlacanja());
            preparedStatement.setString(5, param.getMestoIzdavanja());
            preparedStatement.setString(6, param.getMestoIsporuke());
            preparedStatement.setString(7, param.getMagacin());
            preparedStatement.setLong(8, param.getPIB());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("racun_list can not be updated!");
        }
    }

    @Override
    public void delete(RacunList param) throws Exception {
        try {
            String sql = "DELETE FROM \"racun_list\" WHERE \"brojracuna\"=" + param.getBrojRacuna();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("racun_list can not be deleted!");
        }
    }

    @Override
    public List<RacunList> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"racun_list\"";
            System.out.println(sql);
            List<RacunList> listRacun = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                RacunList r = new RacunList();
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
            throw new Exception("Get all Racuni error!\n" + e.getMessage());
        }
    }

    @Override
    public RacunList get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(RacunList param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(RacunList param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
