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
public class StavkaRezervacije {
    private long redniBrojStavkeRezervacije;
    private long brojRezervacije;
    private int kolicina;
    private String barkod;
    private double ukupnaNaknada;
    private double rabat;
    private double prodajnaCenaSaRabatom;
    private double poreskaOsnovica;
    private long sifraProizvoda;
    private long redniBrojStavkePonude;
    private long sifraPonude;
    private int godina;

    public StavkaRezervacije() {
    }

    public StavkaRezervacije(long redniBrojStavkeRezervacije, long brojRezervacije, int kolicina, String barkod, double ukupnaNaknada, double rabat, double prodajnaCenaSaRabatom, double poreskaOsnovica, long sifraProizvoda, long redniBrojStavkePonude, long sifraPonude, int godina) {
        this.redniBrojStavkeRezervacije = redniBrojStavkeRezervacije;
        this.brojRezervacije = brojRezervacije;
        this.kolicina = kolicina;
        this.barkod = barkod;
        this.ukupnaNaknada = ukupnaNaknada;
        this.rabat = rabat;
        this.prodajnaCenaSaRabatom = prodajnaCenaSaRabatom;
        this.poreskaOsnovica = poreskaOsnovica;
        this.sifraProizvoda = sifraProizvoda;
        this.redniBrojStavkePonude = redniBrojStavkePonude;
        this.sifraPonude = sifraPonude;
        this.godina = godina;
    }

    

    /**
     * @return the redniBrojStavkeRezervacije
     */
    public long getRedniBrojStavkeRezervacije() {
        return redniBrojStavkeRezervacije;
    }

    /**
     * @param redniBrojStavkeRezervacije the redniBrojStavkeRezervacije to set
     */
    public void setRedniBrojStavkeRezervacije(long redniBrojStavkeRezervacije) {
        this.redniBrojStavkeRezervacije = redniBrojStavkeRezervacije;
    }

    /**
     * @return the brojRezervacije
     */
    public long getBrojRezervacije() {
        return brojRezervacije;
    }

    /**
     * @param brojRezervacije the brojRezervacije to set
     */
    public void setBrojRezervacije(long brojRezervacije) {
        this.brojRezervacije = brojRezervacije;
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
     * @return the redniBrojStavkePonude
     */
    public long getRedniBrojStavkePonude() {
        return redniBrojStavkePonude;
    }

    /**
     * @param redniBrojStavkePonude the redniBrojStavkePonude to set
     */
    public void setRedniBrojStavkePonude(long redniBrojStavkePonude) {
        this.redniBrojStavkePonude = redniBrojStavkePonude;
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
    
    
}
