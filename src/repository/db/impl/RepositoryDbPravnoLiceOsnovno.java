/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db.impl;

import domain.PravnoLiceOsnovno;
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
public class RepositoryDbPravnoLiceOsnovno implements Repository<PravnoLiceOsnovno, String> {

    @Override
    public void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();

    }

    @Override
    public void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();

    }

    @Override
    public void add(PravnoLiceOsnovno param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(PravnoLiceOsnovno param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PravnoLiceOsnovno param) throws Exception {
        try {

            String sql = "DELETE FROM \"pravnolice_view2\" WHERE \"pibo\"=" + param.getPIBO();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Pravno lice osnovno can not be deleted!");
        }
    }

        @Override
        public List<PravnoLiceOsnovno> getAll() throws Exception {
            try {
                String sql = "SELECT * FROM PRAVNOLICEOSNOVNO";

                System.out.println(sql);
                List<PravnoLiceOsnovno> listPravnoLiceOsnovno = new ArrayList<>();
                Connection connection = DbConnectionFactory.getInstance().getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    PravnoLiceOsnovno plo = new PravnoLiceOsnovno();
                    plo.setPIBO(rs.getLong("PIBO"));
                    plo.setNaziv(rs.getString("naziv"));

                    listPravnoLiceOsnovno.add(plo);

                }
                rs.close();
                statement.close();

                return listPravnoLiceOsnovno;
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("Get all Pravna Lica Osnovno error!\n" + e.getMessage());
            }
        }

        @Override
        public PravnoLiceOsnovno get
        (String id) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void saveSaDatumom
        (PravnoLiceOsnovno param) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void saveSaImenom
        (PravnoLiceOsnovno param) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
