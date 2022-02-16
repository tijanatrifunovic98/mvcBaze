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
public class TablePravnoLiceDetalji extends AbstractTableModel {

    private List<PravnoLiceDetalji> pravnoLiceDetalji;
    private String[] columnNames = new String[]{"PIB", "Telefon", "Adresa", "Tekuci racun"};
    private Class[] columnClasses = new Class[]{Long.class, String.class, String.class, String.class};

    public TablePravnoLiceDetalji(List<PravnoLiceDetalji> pravnoLiceDetalji) {
        this.pravnoLiceDetalji = pravnoLiceDetalji;
    }

    @Override
    public int getRowCount() {
        if (pravnoLiceDetalji == null) {
            return 0;
        }
        return pravnoLiceDetalji.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PravnoLiceDetalji pld = pravnoLiceDetalji.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pld.getPIBD();
            case 1:
                return pld.getTelefon();
            case 2:
                return pld.getAdresa();
            case 3:
                return pld.getTekuciRacun();

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

    public PravnoLiceDetalji getPravnoLiceDetalji(int pld) {
        return pravnoLiceDetalji.get(pld);
    }

    public PravnoLiceDetalji getPravnoLice(PravnoLiceOsnovno osnovno) {
        for (PravnoLiceDetalji pd : pravnoLiceDetalji) {
            if (pd.getPIBD()== osnovno.getPIBO()) {
                return pd;
            }
            else{
                System.out.println(osnovno.getPIBO());
            }
            
        }
        return null;

    }

}
