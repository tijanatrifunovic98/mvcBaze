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
public class StavkaPonude {
    private long redniBrojStavke;
    private long sifraPonude;
    private long sifraProizvoda;

    public StavkaPonude() {
    }

    public StavkaPonude(long redniBrojStavke, long sifraPonude, long sifraProizvoda) {
        this.redniBrojStavke = redniBrojStavke;
        this.sifraPonude = sifraPonude;
        this.sifraProizvoda = sifraProizvoda;
    }
    

    /**
     * @return the redniBrojStavke
     */
    public long getRedniBrojStavke() {
        return redniBrojStavke;
    }

    /**
     * @param redniBrojStavke the redniBrojStavke to set
     */
    public void setRedniBrojStavke(long redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
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

}
