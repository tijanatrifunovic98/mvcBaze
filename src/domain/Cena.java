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
public class Cena {
    private long sifraProizvoda;
    private long sifraCene;
    private double vrednost;
    private long sifraPDV;
    private String nazivProizvoda;

    public Cena() {
    }

    public Cena(long sifraProizvoda, long sifraCene, double vrednost, long sifraPDV, String nazivProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
        this.sifraCene = sifraCene;
        this.vrednost = vrednost;
        this.sifraPDV = sifraPDV;
        this.nazivProizvoda = nazivProizvoda;
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
     * @return the sifraCene
     */
    public long getSifraCene() {
        return sifraCene;
    }

    /**
     * @param sifraCene the sifraCene to set
     */
    public void setSifraCene(long sifraCene) {
        this.sifraCene = sifraCene;
    }

    /**
     * @return the vrednost
     */
    public double getVrednost() {
        return vrednost;
    }

    /**
     * @param vrednost the vrednost to set
     */
    public void setVrednost(double vrednost) {
        this.vrednost = vrednost;
    }

    /**
     * @return the sifraPDV
     */
    public long getSifraPDV() {
        return sifraPDV;
    }

    /**
     * @param sifraPDV the sifraPDV to set
     */
    public void setSifraPDV(long sifraPDV) {
        this.sifraPDV = sifraPDV;
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

    
}
