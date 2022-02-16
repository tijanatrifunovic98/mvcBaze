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
public class PravnoLice {

    private long PIB;
    private String naziv;
    private String telefon;
    private String adresa;
    private String tekuciRacun;

    public PravnoLice() {
    }

    public PravnoLice(long PIB, String naziv, String telefon, String adresa, String tekuciRacun) {
        this.PIB = PIB;
        this.naziv = naziv;
        this.telefon = telefon;
        this.adresa = adresa;
        this.tekuciRacun = tekuciRacun;
    }

    /**
     * @return the PIB
     */
    public long getPIB() {
        return PIB;
    }

    /**
     * @param PIB the PIB to set
     */
    public void setPIB(long PIB) {
        this.PIB = PIB;
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

   

}
