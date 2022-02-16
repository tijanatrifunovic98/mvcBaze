/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.RacuniPouzecem;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableRacunPouzecem extends AbstractTableModel {

    private List<RacuniPouzecem> racuniPouzecem;

    private String[] columnNames = new String[]{"Broj racuna", "Ukupan iznos", "Datum prometa dobara i usluga", "Nacin placanja", "Datum izdavanja", "Rok placanja", "Mesto izdavanja", "Mesto isporuke", "Magacin", "PIB"};
    private Class[] columnClasses = new Class[]{Long.class, Double.class, Date.class, String.class, Date.class, Integer.class, String.class, String.class, String.class, Long.class};

    public TableRacunPouzecem(List<RacuniPouzecem> racuniPouzecem) {
        this.racuniPouzecem = racuniPouzecem;
    }

    @Override
    public int getRowCount() {
        if (racuniPouzecem == null) {
            return 0;
        }
        return racuniPouzecem.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RacuniPouzecem racunP = racuniPouzecem.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return racunP.getBrojRacuna();
            case 1:
                return racunP.getUkupanIznos();
            case 2:
                return racunP.getDatumPrometaDobaraIUsluga();
            case 3:
                return racunP.getNacinPlacanja();
            case 4:
                return racunP.getDatumIzdavanja();
            case 5:
                return racunP.getRokPlacanja();
            case 6:
                return racunP.getMestoIzdavanja();
            case 7:
                return racunP.getMestoIsporuke();
            case 8:
                return racunP.getMagacin();
            case 9:
                return racunP.getPIB();
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

    public RacuniPouzecem getRacunPouzecem(int rp) {
        return racuniPouzecem.get(rp);

    }

}
