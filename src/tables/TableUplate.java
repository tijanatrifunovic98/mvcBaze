/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.IznosAvansa;
import domain.Uplata;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableUplate extends AbstractTableModel {

    private List<Uplata> uplate;

    private String[] columnNames = new String[]{"Sifra uplate", "Broj racuna", "Avans", "Iznos avansa", "PIB"};
    private Class[] columnClasses = new Class[]{Long.class, Long.class, Double.class, IznosAvansa.class, Long.class};

    public TableUplate(List<Uplata> uplate) {
        this.uplate = uplate;
    }

    @Override
    public int getRowCount() {
        if (uplate == null) {
            return 0;
        }
        return uplate.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Uplata u = uplate.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getSifraUplate();
            case 1:
                return u.getBrojRacuna();
            case 2:
                return u.getAvans();
            case 3:
                return u.getIznosAvansa();
            case 4:
                return u.getPIB();
            
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

}
