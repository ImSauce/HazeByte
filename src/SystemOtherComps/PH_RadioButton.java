package SystemOtherComps;

import SystemFunctions.Constants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JRadioButton;

public class PH_RadioButton extends JRadioButton {
    
    public Color getAA_PressColor() {
        return AA_PressColor;
    }
    
    public void setAA_PressColor(Color AA_PressColor) {
        this.AA_PressColor = AA_PressColor;
    }
    
    public Color getAA_SelectedBorderColor() {
        return AA_SelectedBorderColor;
    }
    
    public void setAA_SelectedBorderColor(Color AA_SelectedBorderColor) {
        this.AA_SelectedBorderColor = AA_SelectedBorderColor;
    }
    
    public Color getAA_BorderColor() {
        return AA_BorderColor;
    }
    
    public void setAA_BorderColor(Color AA_BorderColor) {
        this.AA_BorderColor = AA_BorderColor;
    }

    public PH_RadioButton() {
        setOpaque(false);
        setFocusable(false);
        setForeground(Constants.UI_Default_FontColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBackground(Constants.UI_Default_CompColor);
    }
    
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int ly = (getHeight() - 16) / 2;
        if (isSelected()) {
            if (isEnabled()) {
                //border color when selected
                g2.setColor(AA_SelectedBorderColor);
            } else {
                g2.setColor(AA_BorderColor);
            }
            g2.fillOval(1, ly, 16, 16);
            //Main Background when clicked
            g2.setColor(AA_PressColor);
            g2.fillOval(2, ly + 1, 14, 14);
            if (isEnabled()) {
                g2.setColor(getBackground());
            } else {
                g2.setColor(AA_BorderColor);
            }
            g2.fillOval(5, ly + 4, 8, 8);
        }
        else {
            if (isFocusOwner()) {
                g2.setColor(getBackground());
            } else {
                g2.setColor(AA_BorderColor);
            }
            g2.fillOval(1, ly, 16, 16);
            //Main Background
            g2.setColor(getBackground());
            g2.fillOval(2, ly + 1, 14, 14);
        }
        g2.dispose();
    }
    
    private Color AA_PressColor = Constants.UI_Default_PressColor;
    private Color AA_SelectedBorderColor = Constants.UI_Default_BorderColor.brighter();
    private Color AA_BorderColor = Constants.UI_Default_BorderColor;
    
}
