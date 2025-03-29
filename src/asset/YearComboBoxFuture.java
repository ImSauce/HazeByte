package asset;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;

public class YearComboBoxFuture extends JComboBox<String> {
    public YearComboBoxFuture() {
        super();
        ArrayList<String> years_tmp = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int year = 1900; year <= currentYear + 1; year++) {
            years_tmp.add(Integer.toString(year));
        }
        this.setModel(new javax.swing.DefaultComboBoxModel<>(years_tmp.toArray(new String[0])));
    }
}