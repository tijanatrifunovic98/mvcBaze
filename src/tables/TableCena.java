/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.Cena;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableCena extends AbstractTableModel{
     private List<Cena> cene;

    private String[] columnNames = new String[]{"Sifra proizvoda", "Sifra cene", "Vrednost", "Sifra PDV", "Naziv proizvoda"};
    private Class[] columnClasses = new Class[]{Long.class, Long.class, Double.class, Long.class, String.class};

    public TableCena(List<Cena> cene) {
        this.cene = cene;
    }

    

    @Override
    public int getRowCount() {
         if (cene == null) {
            return 0;
        }
        return cene.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cena c = cene.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getSifraProizvoda();
            case 1:
                return c.getSifraCene();
            case 2:
                return c.getVrednost();
            case 3:
                return c.getSifraPDV();
            case 4:
                return c.getNazivProizvoda();
            
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
     

    public Cena getCena(int c) {
        return cene.get(c);
    }
    
}
