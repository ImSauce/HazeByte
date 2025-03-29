
package asset;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;

public class YearComboBox extends JComboBox<String> {
    public YearComboBox() {
        super();
        ArrayList<String> years_tmp = new ArrayList<>();
        for (int years = 1900; years <= Calendar.getInstance().get(Calendar.YEAR); years++) {
            years_tmp.add(Integer.toString(years));
        }
        this.setModel(new javax.swing.DefaultComboBoxModel<>(years_tmp.toArray(new String[0])));
    }
}