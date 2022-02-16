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
public class IznosAvansa {
    private EnumValuta valuta;
    private double iznosAvansa;

    public IznosAvansa() {
    }

    public IznosAvansa(EnumValuta valuta, double avans) {
        this.valuta = valuta;
        this.iznosAvansa = avans;
    }

   

    /**
     * @return the valuta
     */
    public EnumValuta getValuta() {
        return valuta;
    }

    /**
     * @param valuta the valuta to set
     */
    public void setValuta(EnumValuta valuta) {
        this.valuta = valuta;
    }

    /**
     * @return the iznosAvansa
     */
    public double getIznosAvansa() {
        return iznosAvansa;
    }

    /**
     * @param iznosAvansa the iznosAvansa to set
     */
    public void setIznosAvansa(double iznosAvansa) {
        this.iznosAvansa = iznosAvansa;
    }

    @Override
    public String toString() {
        return "("+valuta+","+iznosAvansa+")";
    }
    
}
