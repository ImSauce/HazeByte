package SystemOtherComps;

import SystemFunctions.Constants;
import SystemFunctions.ScrollBarWin11UI;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Objects;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class PH_ScrollPane extends JScrollPane {
    
    public int getAA_VerticalUnitIncrement() {
        return AA_VerticalUnitIncrement;
    }
    
    public void setAA_VerticalUnitIncrement(int AA_VerticalUnitIncrement) {
        this.AA_VerticalUnitIncrement = AA_VerticalUnitIncrement;
    }
    
    public int getAA_HoriontalUnitIncrement() {
        return AA_HoriontalUnitIncrement;
    }
    
    public void setAA_HoriontalUnitIncrement(int AA_HoriontalUnitIncrement) {
        this.AA_HoriontalUnitIncrement = AA_HoriontalUnitIncrement;
    }

    public PH_ScrollPane() {
        getVerticalScrollBar().setUI(new ScrollBarWin11UI());
        getHorizontalScrollBar().setUI(new ScrollBarWin11UI());
        getVerticalScrollBar().setUnitIncrement(10);
        getHorizontalScrollBar().setUnitIncrement(10);
        setBorder(null);
        setOpaque(false);
        setLayout(new ScrollLayout());
    
                
    }
    
    private int AA_VerticalUnitIncrement = 10;
    private int AA_HoriontalUnitIncrement = 10;
    
    @Override
    public boolean isOptimizedDrawingEnabled() {
        return false;
    }

    @Override
    public void updateUI() {
        super.updateUI();
        EventQueue.invokeLater(() -> {
            setComponentZOrder(getVerticalScrollBar(), 0);
            setComponentZOrder(getHorizontalScrollBar(), 2);
            setComponentZOrder(getViewport(), 2);
            getVerticalScrollBar().setOpaque(false);
            getHorizontalScrollBar().setOpaque(false);
            
        });
    }

    private class ScrollLayout extends ScrollPaneLayout {

        @Override
        public void layoutContainer(Container parent) {
            super.layoutContainer(parent);
            if (parent instanceof JScrollPane) {
                
                
                
                PH_ScrollPane scroll = (PH_ScrollPane) parent;
                
                
                scroll.setBackground(Constants.UI_Default_CompColor);
                scroll.setForeground(Constants.UI_Default_CompButtonColor.darker());
                Rectangle rec = scroll.getViewport().getBounds();
                
               
                Insets insets = parent.getInsets();
                int rhHeight = 0;
                if (scroll.getColumnHeader() != null) {
                    Rectangle rh = scroll.getColumnHeader().getBounds();
                    rhHeight = rh.height;
                }
                rec.width = scroll.getBounds().width - (insets.left + insets.right);
                rec.height = scroll.getBounds().height - (insets.top + insets.bottom) - rhHeight;
                if (Objects.nonNull(viewport)) {
                    viewport.setBounds(rec);
                }
                if (!Objects.isNull(hsb)) {
                    Rectangle hrc = hsb.getBounds();
                    hrc.width = rec.width;
                    hsb.setBounds(hrc);
                }
                
                
            }
        }
        
        
       
        
    }
    
    
}
