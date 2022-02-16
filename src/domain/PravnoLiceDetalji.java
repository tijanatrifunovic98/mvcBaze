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
public class PravnoLiceDetalji {
    private long PIBD;
    private String telefon;
    private String adresa;
    private String tekuciRacun;
    private long PIBO;

    public PravnoLiceDetalji() {
    }

    public PravnoLiceDetalji(long PIBD, String telefon, String adresa, String tekuciRacun, long PIBO) {
        this.PIBD = PIBD;
        this.telefon = telefon;
        this.adresa = adresa;
        this.tekuciRacun = tekuciRacun;
        this.PIBO = PIBO;
    }

    /**
     * @return the PIBD
     */
    public long getPIBD() {
        return PIBD;
    }

    /**
     * @param PIBD the PIBD to set
     */
    public void setPIBD(long PIBD) {
        this.PIBD = PIBD;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    /**
     * @return the tekuciRacun
     */
    public String getTekuciRacun() {
        return tekuciRacun;
    }

    /**
     * @param tekuciRacun the tekuciRacun to set
     */
    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
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
    
}
