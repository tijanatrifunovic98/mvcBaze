/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.Proizvod;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trifu
 */
public class TableProizvod extends AbstractTableModel {

    private List<Proizvod> proizvodi;

    private String[] columnNames = new String[]{"Sifra proizvoda", "Naziv proizvoda", "Zapremina", "Opis", "Tip proizvoda", "Jedinica mere"};
    private Class[] columnClasses = new Class[]{Long.class, String.class, Double.class, String.class, Long.class, String.class};

    public TableProizvod(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public int getRowCount() {
        if (proizvodi == null) {
            return 0;
        }
        return proizvodi.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proizvod p = proizvodi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getSifraProizvoda();
            case 1:
                return p.getNazivProizvoda();
            case 2:
                return p.getZapremina();
            case 3:
                return p.getOpis();
            case 4:
                return p.getTipProizvoda();
            case 5:
                return p.getJedMereStr();
            
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

    public Proizvod getProizvod(int p) {
        return proizvodi.get(p);
    }

}
