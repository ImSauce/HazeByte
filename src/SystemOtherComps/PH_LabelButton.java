package SystemOtherComps;

import SystemFunctions.Constants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class PH_LabelButton extends JLabel {
    
    public Color getForegroundColor() {
        return ForegroundColor;
    }
    
    public void setForegroundColor(Color ForegroundColor) {
        this.ForegroundColor = ForegroundColor;
    }
    
    public Color getForegroundHover() {
        return ForegroundHover;
    }
    
    public void setForegroundHover(Color ForegroundHover) {
        this.ForegroundHover = ForegroundHover;
    }
    
    public Color getForegroundPressed() {
        return ForegroundPressed;
    }
    
    public void setForegroundPressed(Color ForegroundPressed) {
        this.ForegroundPressed = ForegroundPressed;
    }
    
    public PH_LabelButton() {
        
        setForeground(Constants.UI_Default_FontColor);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                Use = getForegroundHover();
                RefreshColor();
                IsOver = true;
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                Use = getForegroundColor();
                RefreshColor();
                IsOver = false;
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                Use = getForegroundPressed();
                RefreshColor();
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (IsOver == true) {
                    Use = getForegroundHover();
                } else {
                    Use = getForegroundColor();
                }
                RefreshColor();
            }
        });
        
    }
    
    public void RefreshColor() {
        setForeground(Use);
    }
    private Color ForegroundColor = Constants.UI_Default_FontColor;
    private Color ForegroundHover = new Color(65,130,230);
    private Color ForegroundPressed = new Color(25,85,165);
    //LOCAL VARS
    boolean IsOver = false;
    Color Use;
}
