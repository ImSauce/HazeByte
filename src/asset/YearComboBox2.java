package asset;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class YearComboBox2 extends JComboBox<String> {
    public YearComboBox2() {
        super();
        ArrayList<String> years_tmp = new ArrayList<>();
        
        // Get the current year
        int currentYear = java.time.Year.now().getValue();
        
        // Adjust the loop to generate year ranges in the format "YYYY-YYYY"
        for (int startYear = 2000; startYear <= currentYear; startYear++) {
            int endYear = startYear + 1;
            years_tmp.add(startYear + "-" + endYear);
        }
        
        this.setModel(new javax.swing.DefaultComboBoxModel<>(years_tmp.toArray(new String[0])));
    }
}