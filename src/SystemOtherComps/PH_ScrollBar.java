package SystemOtherComps;

import SystemFunctions.Constants;
import SystemFunctions.ScrollBarWin11UI;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class PH_ScrollBar extends JScrollBar {

    public PH_ScrollBar() {
        setUI(new ScrollBarWin11UI());
        setPreferredSize(new Dimension(10, 10));
        setBackground(Color.BLACK);
        setForeground(new Color (80,80,80));
        repaint();
    }
    
}
