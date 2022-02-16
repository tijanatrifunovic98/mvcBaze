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
public class StavkaRacuna {
    private long redniBrojStavkeRacuna;
    private long sifraRacuna;
    private int kolicina;
    private String barkod;
    private double ukupnaNaknada;
    private double rabat;
    private double prodajnaCenaSaRabatom;
    private double poreskaOsnovica;
    private long sifraProizvoda;
    private long redniBrojStavkePredracuna;
    private long brojPredracuna;

    public StavkaRacuna() {
    }

    public StavkaRacuna(long redniBrojStavkeRacuna, long sifraRacuna, int kolicina, String barkod, double ukupnaNaknada, double rabat, double prodajnaCenaSaRabatom, double poreskaOsnovica, long sifraProizvoda, long redniBrojStavkePredracuna, long brojPredracuna) {
        this.redniBrojStavkeRacuna = redniBrojStavkeRacuna;
        this.sifraRacuna = sifraRacuna;
        this.kolicina = kolicina;
        this.barkod = barkod;
        this.ukupnaNaknada = ukupnaNaknada;
        this.rabat = rabat;
        this.prodajnaCenaSaRabatom = prodajnaCenaSaRabatom;
        this.poreskaOsnovica = poreskaOsnovica;
        this.sifraProizvoda = sifraProizvoda;
        this.redniBrojStavkePredracuna = redniBrojStavkePredracuna;
        this.brojPredracuna = brojPredracuna;
    }


    /**
     * @return the redniBrojStavkeRacuna
     */
    public long getRedniBrojStavkeRacuna() {
        return redniBrojStavkeRacuna;
    }

    /**
     * @param redniBrojStavkeRacuna the redniBrojStavkeRacuna to set
     */
    public void setRedniBrojStavkeRacuna(long redniBrojStavkeRacuna) {
        this.redniBrojStavkeRacuna = redniBrojStavkeRacuna;
    }

    /**
     * @return the sifraRacuna
     */
    public long getSifraRacuna() {
        return sifraRacuna;
    }

    /**
     * @param sifraRacuna the sifraRacuna to set
     */
    public void setSifraRacuna(long sifraRacuna) {
        this.sifraRacuna = sifraRacuna;
    }

    /**
     * @return the kolicina
     */
    public int getKolicina() {
        return kolicina;
    }

    /**
     * @param kolicina the kolicina to set
     */
    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    /**
     * @return the barkod
     */
    public String getBarkod() {
        return barkod;
    }

    /**
     * @param barkod the barkod to set
     */
    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    /**
     * @return the ukupnaNaknada
     */
    public double getUkupnaNaknada() {
        return ukupnaNaknada;
    }

    /**
     * @param ukupnaNaknada the ukupnaNaknada to set
     */
    public void setUkupnaNaknada(double ukupnaNaknada) {
        this.ukupnaNaknada = ukupnaNaknada;
    }

    /**
     * @return the rabat
     */
    public double getRabat() {
        return rabat;
    }

    /**
     * @param rabat the rabat to set
     */
    public void setRabat(double rabat) {
        this.rabat = rabat;
    }

    /**
     * @return the prodajnaCenaSaRabatom
     */
    public double getProdajnaCenaSaRabatom() {
        return prodajnaCenaSaRabatom;
    }

    /**
     * @param prodajnaCenaSaRabatom the prodajnaCenaSaRabatom to set
     */
    public void setProdajnaCenaSaRabatom(double prodajnaCenaSaRabatom) {
        this.prodajnaCenaSaRabatom = prodajnaCenaSaRabatom;
    }

    /**
     * @return the poreskaOsnovica
     */
    public double getPoreskaOsnovica() {
        return poreskaOsnovica;
    }

    /**
     * @param poreskaOsnovica the poreskaOsnovica to set
     */
    public void setPoreskaOsnovica(double poreskaOsnovica) {
        this.poreskaOsnovica = poreskaOsnovica;
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
     * @return the redniBrojStavkePredracuna
     */
    public long getRedniBrojStavkePredracuna() {
        return redniBrojStavkePredracuna;
    }

    /**
     * @param redniBrojStavkePredracuna the redniBrojStavkePredracuna to set
     */
    public void setRedniBrojStavkePredracuna(long redniBrojStavkePredracuna) {
        this.redniBrojStavkePredracuna = redniBrojStavkePredracuna;
    }

    /**
     * @return the brojPredracuna
     */
    public long getBrojPredracuna() {
        return brojPredracuna;
    }

    /**
     * @param brojPredracuna the brojPredracuna to set
     */
    public void setBrojPredracuna(long brojPredracuna) {
        this.brojPredracuna = brojPredracuna;
    }
    
}
