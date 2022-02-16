/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author trifu
 */
public class Racun {

    private long brojRacuna;
    private double ukupanIznos;
    private Date datumPrometaDobaraIUsluga;
    private String nacinPlacanja;
    private Date datumIzdavanja;
    private int rokPlacanja;
    private String mestoIzdavanja;
    private String mestoIsporuke;
    private String magacin;
    private long PIB;

    public Racun() {
    }

    public Racun(long brojRacuna, double ukupanIznos, Date datumPrometaDobaraIUsluga, String nacinPlacanja, Date datumIzdavanja, int rokPlacanja, String mestoIzdavanja, String mestoIsporuke, String magacin, long PIB) {
        this.brojRacuna = brojRacuna;
        this.ukupanIznos = ukupanIznos;
        this.datumPrometaDobaraIUsluga = datumPrometaDobaraIUsluga;
        this.nacinPlacanja = nacinPlacanja;
        this.datumIzdavanja = datumIzdavanja;
        this.rokPlacanja = rokPlacanja;
        this.mestoIzdavanja = mestoIzdavanja;
        this.mestoIsporuke = mestoIsporuke;
        this.magacin = magacin;
        this.PIB = PIB;
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
     * @return the ukupanIznos
     */
    public double getUkupanIznos() {
        return ukupanIznos;
    }

    /**
     * @param ukupanIznos the ukupanIznos to set
     */
    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    /**
     * @return the datumPrometaDobaraIUsluga
     */
    public Date getDatumPrometaDobaraIUsluga() {
        return datumPrometaDobaraIUsluga;
    }

    /**
     * @param datumPrometaDobaraIUsluga the datumPrometaDobaraIUsluga to set
     */
    public void setDatumPrometaDobaraIUsluga(Date datumPrometaDobaraIUsluga) {
        this.datumPrometaDobaraIUsluga = datumPrometaDobaraIUsluga;
    }

    /**
     * @return the nacinPlacanja
     */
    public String getNacinPlacanja() {
        return nacinPlacanja;
    }

    /**
     * @param nacinPlacanja the nacinPlacanja to set
     */
    public void setNacinPlacanja(String nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    /**
     * @return the datumIzdavanja
     */
    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    /**
     * @param datumIzdavanja the datumIzdavanja to set
     */
    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    /**
     * @return the rokPlacanja
     */
    public int getRokPlacanja() {
        return rokPlacanja;
    }

    /**
     * @param rokPlacanja the rokPlacanja to set
     */
    public void setRokPlacanja(int rokPlacanja) {
        this.rokPlacanja = rokPlacanja;
    }

    /**
     * @return the mestoIzdavanja
     */
    public String getMestoIzdavanja() {
        return mestoIzdavanja;
    }

    /**
     * @param mestoIzdavanja the mestoIzdavanja to set
     */
    public void setMestoIzdavanja(String mestoIzdavanja) {
        this.mestoIzdavanja = mestoIzdavanja;
    }

    /**
     * @return the mestoIsporuke
     */
    public String getMestoIsporuke() {
        return mestoIsporuke;
    }

    /**
     * @param mestoIsporuke the mestoIsporuke to set
     */
    public void setMestoIsporuke(String mestoIsporuke) {
        this.mestoIsporuke = mestoIsporuke;
    }

    /**
     * @return the magacin
     */
    public String getMagacin() {
        return magacin;
    }

    /**
     * @param magacin the magacin to set
     */
    public void setMagacin(String magacin) {
        this.magacin = magacin;
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
