package SystemFunctions;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class SetHighlight {
    Color PCL;
    Color HVR;
    Color PRS;
    int hover = 5; int press = 10;
    boolean IsOver = false;
    
    public void SetHiglightColor(Color CompCOL) {
        this.PCL = CompCOL;
    }
    
    public void SetColorIndent(int hover, int press) {
        this.hover = hover;
        this.press = press;
    }
    
    private Color New_ColHVR() {
        this.HVR = new Color(PCL.getRed()+hover, PCL.getGreen()+hover, PCL.getBlue()+hover);
        return HVR;
    }
    
    private Color New_ColPRS() {
        this.PRS = new Color(PCL.getRed()+press, PCL.getGreen()+press, PCL.getBlue()+press);
        return PRS;
    }
    
    public void Highlight_Comp(JComponent comp) {
        comp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                comp.setBackground(New_ColHVR());
                IsOver = true;
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                comp.setBackground(PCL);
                IsOver = false;
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                comp.setBackground(New_ColPRS());
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (IsOver == true) {
                    comp.setBackground(New_ColHVR());
                } else {
                    comp.setBackground(PCL);
                }
            }
        });
    }
}
