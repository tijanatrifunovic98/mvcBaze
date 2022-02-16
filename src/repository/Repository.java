/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;

/**
 *
 * @author trifu
 */
public interface Repository<T, K> {

    public void connect() throws Exception;

    public void disconnect() throws Exception;

    public void add(T param) throws Exception;

    public void save(T param) throws Exception;

    public void delete(T param) throws Exception;

    public List<T> getAll() throws Exception;

    public T get(K id) throws Exception;

    public void saveSaDatumom(T param) throws Exception;

    public void saveSaImenom(T param) throws Exception;


}
