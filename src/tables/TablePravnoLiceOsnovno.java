/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.PravnoLiceDetalji;
import domain.PravnoLiceOsnovno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TablePravnoLiceOsnovno extends AbstractTableModel {

    private List<PravnoLiceOsnovno> pravnoLiceOsnovno;
    private String[] columnNames = new String[]{"PIB", "Naziv"};
    private Class[] columnClasses = new Class[]{Long.class, String.class};

    public TablePravnoLiceOsnovno(List<PravnoLiceOsnovno> pravnoLiceOsnovno) {
        this.pravnoLiceOsnovno = pravnoLiceOsnovno;
    }

    @Override
    public int getRowCount() {
        if (pravnoLiceOsnovno == null) {
            return 0;
        }
        return pravnoLiceOsnovno.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PravnoLiceOsnovno plo = pravnoLiceOsnovno.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return plo.getPIBO();
            case 1:
                return plo.getNaziv();

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

    public PravnoLiceOsnovno getPravnoLiceOsnovno(int plo) {
        return pravnoLiceOsnovno.get(plo);
    }

    public PravnoLiceOsnovno getPravnoLice(PravnoLiceDetalji detalji) {
        for (PravnoLiceOsnovno po : pravnoLiceOsnovno) {
            if (po.getPIBO() == detalji.getPIBD()) {
                return po;
            }
            else{
                System.out.println(detalji.getPIBD());
            }
        }
        return null;
    }

}
