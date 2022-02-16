/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.RacuniVirmanom;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableRacunVirmanom extends AbstractTableModel{
     private List<RacuniVirmanom> racuniVirmanom;

    private String[] columnNames = new String[]{"Broj racuna", "Ukupan iznos", "Datum prometa dobara i usluga", "Nacin placanja", "Datum izdavanja", "Rok placanja", "Mesto izdavanja", "Mesto isporuke", "Magacin", "PIB"};
    private Class[] columnClasses = new Class[]{Long.class, Double.class, Date.class, String.class, Date.class, Integer.class, String.class, String.class, String.class, Long.class};

    public TableRacunVirmanom(List<RacuniVirmanom> racuniVirmanom) {
        this.racuniVirmanom = racuniVirmanom;
    }

   
    @Override
    public int getRowCount() {
        if (racuniVirmanom == null) {
            return 0;
        }
        return racuniVirmanom.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         RacuniVirmanom racunV = racuniVirmanom.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return racunV.getBrojRacuna();
            case 1:
                return racunV.getUkupanIznos();
            case 2:
                return racunV.getDatumPrometaDobaraIUsluga();
            case 3:
                return racunV.getNacinPlacanja();
            case 4:
                return racunV.getDatumIzdavanja();
            case 5:
                return racunV.getRokPlacanja();
            case 6:
                return racunV.getMestoIzdavanja();
            case 7:
                return racunV.getMestoIsporuke();
            case 8:
                return racunV.getMagacin();
            case 9:
                return racunV.getPIB();
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
    public RacuniVirmanom getRacunVirmanom(int rv) {
        return racuniVirmanom.get(rv);

    }
    
}
