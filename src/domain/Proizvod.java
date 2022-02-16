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
public class Proizvod {
    private long sifraProizvoda;
    private String nazivProizvoda;
    private double zapremina;
    private String opis;
    private long jedinicaMere;
    private long tipProizvoda;
    private String jedMereStr;

    public Proizvod() {
    }

    public Proizvod(long sifraProizvoda, String nazivProizvoda, double zapremina, String opis, long jedinicaMere, long tipProizvoda, String jedMereStr) {
        this.sifraProizvoda = sifraProizvoda;
        this.nazivProizvoda = nazivProizvoda;
        this.zapremina = zapremina;
        this.opis = opis;
        this.jedinicaMere = jedinicaMere;
        this.tipProizvoda = tipProizvoda;
        this.jedMereStr = jedMereStr;
    }

    
   


    /**
     * @return the sifraProizvoda
     */
    public long getSifraProizvoda() {
        return sifraProizvoda;
    }

    /**
     * @param sifraProizvoda the sifraProizvoda to set
     */
    public void setSifraProizvoda(long sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    /**
     * @return the nazivProizvoda
     */
    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    /**
     * @param nazivProizvoda the nazivProizvoda to set
     */
    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    /**
     * @return the zapremina
     */
    public double getZapremina() {
        return zapremina;
    }

    /**
     * @param zapremina the zapremina to set
     */
    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }

    /**
     * @return the opis
     */
    public String getOpis() {
        return opis;
    }

    /**
     * @param opis the opis to set
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * @return the jedinicaMere
     */
    public long getJedinicaMere() {
        return jedinicaMere;
    }

    /**
     * @param jedinicaMere the jedinicaMere to set
     */
    public void setJedinicaMere(long jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    /**
     * @return the tipProizvoda
     */
    public long getTipProizvoda() {
        return tipProizvoda;
    }

    /**
     * @param tipProizvoda the tipProizvoda to set
     */
    public void setTipProizvoda(long tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }

    public String getJedMereStr() {
        return jedMereStr;
    }

    public void setJedMereStr(String jedMereStr) {
        this.jedMereStr = jedMereStr;
    }
    
}
