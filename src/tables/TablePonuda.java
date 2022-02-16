/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.Ponuda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TablePonuda extends AbstractTableModel {

    private List<Ponuda> ponude;

    private String[] columnNames = new String[]{"Sifra ponude", "Godina", "PIB"};
    private Class[] columnClasses = new Class[]{Long.class, Integer.class, Long.class};

    public TablePonuda(List<Ponuda> ponude) {
        this.ponude = ponude;
    }

    @Override
    public int getRowCount() {
        if (ponude == null) {
            return 0;
        }
        return ponude.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Ponuda p = ponude.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getSifraPonude();
            case 1:
                return p.getGodina();
            case 2:
                return p.getPIB();

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

    public Ponuda getPonuda(int r) {
        return ponude.get(r);
    }

}
