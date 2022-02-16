/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.StavkaRacuna;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableStavkaRacuna extends AbstractTableModel {

    private List<StavkaRacuna> stavkeRacuna;

    private String[] columnNames = new String[]{"Redni broj", "Sifra racuna", "Kolicina", "Barkod", "Ukupna naknada", "Rabat", "Prodajna cena sa rabatom", "Poreska osnovica", "Redni broj stavke predracuna", "Broj predracuna", "Sifra proizvoda"};
    private Class[] columnClasses = new Class[]{Long.class, Long.class, Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Long.class, Long.class, Long.class};

    public TableStavkaRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    @Override
    public int getRowCount() {
        if (stavkeRacuna == null) {
            return 0;
        }
        return stavkeRacuna.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRacuna sr = stavkeRacuna.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sr.getRedniBrojStavkeRacuna();
            case 1:
                return sr.getSifraRacuna();
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
                return sr.getRedniBrojStavkePredracuna();
                case 10:
                return sr.getBrojPredracuna();
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

    public StavkaRacuna getStavkaRacuna(int r) {
        return stavkeRacuna.get(r);
    }

}
