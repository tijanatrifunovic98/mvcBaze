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
public class JedinicaMere {

    private long sifraJediniceMere;
    private String nazivJediniceMere;

    public JedinicaMere() {
    }

    public JedinicaMere(long sifraJediniceMere, String nazivJediniceMere) {
        this.sifraJediniceMere = sifraJediniceMere;
        this.nazivJediniceMere = nazivJediniceMere;
    }

    

    /**
     * @return the sifraJediniceMere
     */
    public long getSifraJediniceMere() {
        return sifraJediniceMere;
    }

    /**
     * @param sifraJediniceMere the sifraJediniceMere to set
     */
    public void setSifraJediniceMere(long sifraJediniceMere) {
        this.sifraJediniceMere = sifraJediniceMere;
    }

    /**
     * @return the nazivJediniceMere
     */
    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    /**
     * @param nazivJediniceMere the nazivJediniceMere to set
     */
    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }
    

}
