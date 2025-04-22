package Classes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Only apply background color to the 14th column (index 13)
        if (column == 13 && value != null) {
            String status = value.toString();
            if (status.equals("Sold")) {
                cellComponent.setBackground(new Color(118, 199, 102)); // Green
            } else if (status.equals("Refunded")) {
                cellComponent.setBackground(new Color(235, 87, 87)); // Red
            } else {
                cellComponent.setBackground(new Color(0,0,0)); // Default
            }
        } else {
            cellComponent.setBackground(new Color(0,0,0)); // Default
        }

        return cellComponent;
    }
}