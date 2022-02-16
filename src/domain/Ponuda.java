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
public class Ponuda {
    private long sifraPonude;
    private int godina;
    private long PIB;

    public Ponuda() {
    }

    public Ponuda(long sifraPonude, int godina, long PIB) {
        this.sifraPonude = sifraPonude;
        this.godina = godina;
        this.PIB = PIB;
    }

    /**
     * @return the sifraPonude
     */
    public long getSifraPonude() {
        return sifraPonude;
    }

    /**
     * @param sifraPonude the sifraPonude to set
     */
    public void setSifraPonude(long sifraPonude) {
        this.sifraPonude = sifraPonude;
    }

    /**
     * @return the godina
     */
    public int getGodina() {
        return godina;
    }

    /**
     * @param godina the godina to set
     */
    public void setGodina(int godina) {
        this.godina = godina;
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
