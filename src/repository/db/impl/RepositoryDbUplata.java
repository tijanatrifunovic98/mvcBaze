/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import static com.oracle.jrockit.jfr.ContentType.Class;
import controller.Controller;
import domain.EnumValuta;
import domain.IznosAvansa;
import domain.Uplata;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import repository.Repository;
import repository.db.DbConnectionFactory;

/**
 *
 * @author trifu
 */
public class RepositoryDbUplata implements Repository<Uplata, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    @Override
    public void add(Uplata param) throws Exception {
        try {
            String sql = "INSERT INTO \"Uplata\" (\"sifraUplate\",\"brojRacuna\",\"avans\",\"iznosAvansa\",\"PIB\") VALUES (?,?,?,row('" + param.getIznosAvansa().getValuta().toString() + "',?),?)";
            System.out.println(sql);
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, param.getSifraUplate());
            statement.setLong(2, param.getBrojRacuna());
            statement.setDouble(3, param.getAvans());
            statement.setDouble(4, param.getIznosAvansa().getIznosAvansa());
            System.out.println(statement);

            statement.setLong(5, param.getPIB());

            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();

            throw new Exception("Insert Uplata DB error: \n" + ex.getMessage());
        }
    }

    @Override
    public void save(Uplata param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Uplata param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Uplata> getAll() throws Exception {
        try {
            String sql = "SELECT * FROM \"Uplata\"";

            System.out.println(sql);
            List<Uplata> listUplata = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Uplata u = new Uplata();
                u.setSifraUplate(rs.getLong("sifraUplate"));
                u.setBrojRacuna(rs.getLong("brojRacuna"));
                u.setAvans(rs.getDouble("avans"));
              //  u.setIznosAvansa(rs.getString("iznosAvansa"));
//                IznosAvansa2 iz = new IznosAvansa2();
//                iz.setIznosAvansa(rs.getString("iznosAvansa"));
//                //iz.setValuta(rs.getString("valuta"));
//                u.setIznosAvansa(iz);
//                System.out.println(iz);
//                u.setPIB(rs.getLong("PIB"));
//                listUplata.add(u);

//                iz.setValuta(EnumValuta.valueOf(rs.getString("iznosAvansa").substring(2, 4)));

            }
            rs.close();
            statement.close();

            return listUplata;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Get all Uplate error!\n" + e.getMessage());
        }
    }

    @Override
    public Uplata get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaDatumom(Uplata param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSaImenom(Uplata param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
