
package asset;


import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class BooleanRenderer extends JCheckBox implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        // Assuming the boolean value is stored as a String in the database
        if (value != null && value instanceof String) {
            String stringValue = (String) value;
            setSelected(stringValue.equalsIgnoreCase("true"));
        }

        return this;
    }
}