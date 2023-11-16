/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pablo
 */
public class TablaLocal {

    // TODO agregar informacion de la tabla local e interacciones aqui
    // Intente hacer que la tabla local se ordenara desde aqui, pero no pude
    public void ordenarTabla(DefaultTableModel Medallero)
    {
        DefaultTableModel modelo = Medallero;
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);

        
        int columnaMedallasOro = 1; // La columna de medallas de oro es la segunda columna (0-indexed).
        sorter.setComparator(columnaMedallasOro, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Ordenar de mayor a menor
                return o2.compareTo(o1);
            }    
        });

        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(columnaMedallasOro, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

}
