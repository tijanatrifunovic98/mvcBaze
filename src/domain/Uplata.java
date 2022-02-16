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
public class Uplata {
    private long sifraUplate;
    private long brojRacuna;
    private double avans;
    private IznosAvansa iznosAvansa;
    private long PIB;

    public Uplata() {
    }

    public Uplata(long sifraUplate, long brojRacuna, double avans, IznosAvansa iznosAvansa, long PIB) {
        this.sifraUplate = sifraUplate;
        this.brojRacuna = brojRacuna;
        this.avans = avans;
        this.iznosAvansa = iznosAvansa;
        this.PIB = PIB;
    }

    

    /**
     * @return the sifraUplate
     */
    public long getSifraUplate() {
        return sifraUplate;
    }

    /**
     * @param sifraUplate the sifraUplate to set
     */
    public void setSifraUplate(long sifraUplate) {
        this.sifraUplate = sifraUplate;
    }

    /**
     * @return the brojRacuna
     */
    public long getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * @param brojRacuna the brojRacuna to set
     */
    public void setBrojRacuna(long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    /**
     * @return the avans
     */
    public double getAvans() {
        return avans;
    }

    /**
     * @param avans the avans to set
     */
    public void setAvans(double avans) {
        this.avans = avans;
    }

    /**
     * @return the iznosAvansa
     */
    public IznosAvansa getIznosAvansa() {
        return iznosAvansa;
    }

    /**
     * @param iznosAvansa the iznosAvansa to set
     */
    public void setIznosAvansa(IznosAvansa iznosAvansa) {
        this.iznosAvansa = iznosAvansa;
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

   
    
    
}
