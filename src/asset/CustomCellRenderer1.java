
package asset;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellRenderer1 extends DefaultTableCellRenderer {

     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Check if any cell in the row has the value "Complete" or "complete"
        for (int col = 0; col < table.getColumnCount(); col++) {
            Object cellValue = table.getValueAt(row, col);
            if (cellValue != null && (cellValue.toString().equals("Complete") || cellValue.toString().equals("complete"))) {
                cellComponent.setBackground(new Color(118, 199, 102)); // Set the background color to green
                
                return cellComponent;
            } else if (cellValue != null && (cellValue.toString().equals("Incomplete") || cellValue.toString().equals("incomplete"))) {
                cellComponent.setBackground(new Color(205, 205, 205    )); // Set the background color to red
                
                return cellComponent;
            }
            
        }

        cellComponent.setBackground(table.getBackground()); // Set the default background color
        return cellComponent;
    }
}