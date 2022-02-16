/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.StavkaRezervacije;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableStavkaRezervacije extends AbstractTableModel {

    private List<StavkaRezervacije> stavkeRezervacije;

    private String[] columnNames = new String[]{"Redni broj stavke rezervacije", "Broj rezervacije", "Kolicina", "Barkod", "Ukupna naknada", "Rabat", "Prodajna cena sa rabatom", "Poreska osnovica", "Sifra proizvoda", "Redni broj stavke ponude", "Sifra ponude", "Godina"};
    private Class[] columnClasses = new Class[]{Long.class, Long.class, Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Long.class, Long.class, Long.class, Integer.class};

    public TableStavkaRezervacije(List<StavkaRezervacije> stavkeRezervacije) {
        this.stavkeRezervacije = stavkeRezervacije;
    }

    @Override
    public int getRowCount() {
        if (stavkeRezervacije == null) {
            return 0;
        }
        return stavkeRezervacije.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRezervacije sr = stavkeRezervacije.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sr.getRedniBrojStavkeRezervacije();
            case 1:
                return sr.getBrojRezervacije();
            case 2:
                return sr.getKolicina();
            case 3:
                return sr.getBarkod();
            case 4:
                return sr.getUkupnaNaknada();
            case 5:
                return sr.getRabat();
            case 6:
                return sr.getProdajnaCenaSaRabatom();
            case 7:
                return sr.getPoreskaOsnovica();
            case 8:
                return sr.getSifraProizvoda();
            case 9:
                return sr.getRedniBrojStavkePonude();
            case 10:
                return sr.getSifraPonude();
            case 11:
                return sr.getGodina();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) {
            return "n/a";
        }
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex > columnClasses.length) {
            return Object.class;
        }
        return columnClasses[columnIndex];
    }

    public StavkaRezervacije getStavkaRezervacije(int r) {
        return stavkeRezervacije.get(r);
    }

}
