/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.Racun;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableRacun extends AbstractTableModel {

    private List<Racun> racuni;

    private String[] columnNames = new String[]{"Broj racuna", "Ukupan iznos", "Datum prometa dobara i usluga", "Nacin placanja", "Datum izdavanja", "Rok placanja", "Mesto izdavanja", "Mesto isporuke", "Magacin", "PIB"};
    private Class[] columnClasses = new Class[]{Long.class, Double.class, Date.class, String.class, Date.class, Integer.class, String.class, String.class, String.class, Long.class};

    public TableRacun(List<Racun> racuni) {
        this.racuni = racuni;
    }

    @Override
    public int getRowCount() {
        if (racuni == null) {
            return 0;
        }
        return racuni.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Racun racun = racuni.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return racun.getBrojRacuna();
            case 1:
                return racun.getUkupanIznos();
            case 2:
                return racun.getDatumPrometaDobaraIUsluga();
            case 3:
                return racun.getNacinPlacanja();
            case 4:
                return racun.getDatumIzdavanja();
            case 5:
                return racun.getRokPlacanja();
            case 6:
                return racun.getMestoIzdavanja();
            case 7:
                return racun.getMestoIsporuke();
            case 8:
                return racun.getMagacin();
            case 9:
                return racun.getPIB();
            default:
                return "n/a";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex > columnClasses.length) {
            return Object.class;
        }
        return columnClasses[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) {
            return "n/a";
        }
        return columnNames[column];
    }

    public Racun getRacun(int r) {
        return racuni.get(r);
    }

}
