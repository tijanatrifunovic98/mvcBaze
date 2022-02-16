/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.db;

import repository.Repository;

/**
 *
 * @author trifu
 */
public interface DbRepository <T, K> extends Repository<T, K>{
     @Override
    public default void connect() throws Exception {
        DbConnectionFactory.getInstance().getConnection();
    }

    @Override
    public default void disconnect() throws Exception {
        DbConnectionFactory.getInstance().getConnection().close();
    }
    
}
