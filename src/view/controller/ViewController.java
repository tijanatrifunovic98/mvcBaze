/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controller;

import javax.swing.JFrame;
import view.Frm2nf;
import view.FrmHardCoded;
import view.FrmHorizontalno;
import view.FrmMain;
import view.FrmStoringDerivableValues;
import view.FrmVertikalno;
import view.NfForma3;

/**
 *
 * @author trifu
 */
public class ViewController {

    private JFrame mainForm;
    private static ViewController instance;
    FrmHorizontalno frmHorizontalno;
    FrmHardCoded frmHardCoded;
    FrmStoringDerivableValues frmStoringDerivableValues;
    Frm2nf frm2nf;
    //Frm3nf frm3nf;
    FrmVertikalno frmVertikalno;
    NfForma3 frm3nfNova;

    public ViewController() {
    }

    public static ViewController getInstance() {
        if (instance == null) {
            instance = new ViewController();
        }
        return instance;
    }

    public void openMainForm() {
        mainForm = new FrmMain();
        mainForm.setVisible(true);
    }

    public void openFrmHorizontalno() {
        frmHorizontalno = new FrmHorizontalno(mainForm, true);
        frmHorizontalno.setVisible(true);
    }

    public void openFrmVertikalno() {
        frmVertikalno = new FrmVertikalno(mainForm, true);
        frmVertikalno.setVisible(true);
    }

    public void openFrmHardCoded() {
        frmHardCoded = new FrmHardCoded(mainForm, true);
        frmHardCoded.setVisible(true);
    }

    public void openFrmStoringDerivableValues() {
        frmStoringDerivableValues = new FrmStoringDerivableValues(mainForm, true);
        frmStoringDerivableValues.setVisible(true);
    }

    public void openFrm2nf() {
        frm2nf = new Frm2nf(mainForm, true);
        frm2nf.setVisible(true);
    }


    public void openNfForma3() {
        frm3nfNova = new NfForma3(mainForm, true);
        frm3nfNova.setVisible(true);
    }

}
