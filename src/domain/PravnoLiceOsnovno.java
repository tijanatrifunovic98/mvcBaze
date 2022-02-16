/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author trifu
 */
public class PravnoLiceOsnovno {
    private long PIBO;
    private String naziv;

    public PravnoLiceOsnovno() {
    }

    public PravnoLiceOsnovno(long PIBO, String naziv) {
        this.PIBO = PIBO;
        this.naziv = naziv;
    }
    

    /**
     * @return the PIBO
     */
    public long getPIBO() {
        return PIBO;
    }

    /**
     * @param PIBO the PIBO to set
     */
    public void setPIBO(long PIBO) {
        this.PIBO = PIBO;
    }

    /**
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
  
}
