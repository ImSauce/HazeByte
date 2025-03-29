package SystemOtherComps;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class PH_Separator extends JComponent {
    
    public int getAA_LineSize() {
        return AA_LineSize;
    }
    
    public void setAA_LineSize(int AA_LineSize) {
        this.AA_LineSize = AA_LineSize;
    }
    
    public int getAA_Indent() {
        return AA_Indent;
    }
    
    public void setAA_Indent(int AA_Indent) {
        this.AA_Indent = AA_Indent;
    }
    
    public boolean isAB_DrawTail() {
        return AB_DrawTail;
    }
    
    public void setAB_DrawTail(boolean AB_DrawTail) {
        this.AB_DrawTail = AB_DrawTail;
    }
    
    public boolean isAB_DrawAllTails() {
        return AB_DrawAllTails;
    }
    
    public void setAB_DrawAllTails(boolean AB_DrawAllTails) {
        this.AB_DrawAllTails = AB_DrawAllTails;
    }
    
    public boolean isAB_TailTopRight() {
        return AB_TailTopRight;
    }
    
    public void setAB_TailTopRight(boolean AB_TailTopRight) {
        this.AB_TailTopRight = AB_TailTopRight;
    }
    
    public boolean isAB_TailTopLeft() {
        return AB_TailTopLeft;
    }
    
    public void setAB_TailTopLeft(boolean AB_TailTopLeft) {
        this.AB_TailTopLeft = AB_TailTopLeft;
    }
    
    public boolean isAB_TailBottomRight() {
        return AB_TailBottomRight;
    }
    
    public void setAB_TailBottomRight(boolean AB_TailBottomRight) {
        this.AB_TailBottomRight = AB_TailBottomRight;
    }
    
    public boolean isAB_TailBottomLeft() {
        return AB_TailBottomLeft;
    }
    
    public void setAB_TailBottomLeft(boolean AB_TailBottomLeft) {
        this.AB_TailBottomLeft = AB_TailBottomLeft;
    }
    
    public PH_Separator() {
        setPreferredSize(new Dimension(100,10));
        setBackground(new Color(205,205,205));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.setStroke(new BasicStroke(AA_LineSize));
        
        if (getWidth()>getHeight()) {
            g2.drawLine(AA_Indent, getHeight()/2, getWidth()-AA_Indent, getHeight()/2);
            
            if (AB_DrawTail == true) {
                if (AB_DrawAllTails == true) {
                    g2.drawLine(AA_Indent, AA_Indent, AA_Indent, getHeight()-AA_Indent);
                    g2.drawLine(getWidth()-AA_Indent, AA_Indent, getWidth()-AA_Indent, getHeight()-AA_Indent);
                }
                if (AB_TailTopRight == true) {
                    g2.drawLine(getWidth()-AA_Indent, AA_Indent, getWidth()-AA_Indent, getHeight()/2);
                }
                if (AB_TailTopLeft == true) {
                    g2.drawLine(AA_Indent, AA_Indent, AA_Indent, getHeight()/2);
                }
                if (AB_TailBottomRight == true) {
                    g2.drawLine(getWidth()-AA_Indent, getHeight()/2, getWidth()-AA_Indent, getHeight()-AA_Indent);
                }
                if (AB_TailBottomLeft == true) {
                    g2.drawLine(AA_Indent, getHeight()/2, AA_Indent, getHeight()-AA_Indent);
                }
            }
            
        } else if (getHeight()>getWidth()) {
            g2.drawLine(getWidth()/2, AA_Indent, getWidth()/2, getHeight()-AA_Indent);
            
            if (AB_DrawTail == true) {
                if (AB_DrawAllTails == true) {
                    g2.drawLine(AA_Indent, AA_Indent, getWidth()-AA_Indent, AA_Indent);
                    g2.drawLine(AA_Indent, getHeight()-AA_Indent, getWidth()-AA_Indent, getHeight()-AA_Indent);
                }
                if (AB_TailTopRight == true) {
                    g2.drawLine(getWidth()/2, AA_Indent, getWidth()-AA_Indent, AA_Indent);
                }
                if (AB_TailTopLeft == true) {
                    g2.drawLine(AA_Indent, AA_Indent, getWidth()/2, AA_Indent);
                }
                if (AB_TailBottomRight == true) {
                    g2.drawLine(getWidth()/2, getHeight()-AA_Indent, getWidth()-AA_Indent, getHeight()-AA_Indent);
                }
                if (AB_TailBottomLeft == true) {
                    g2.drawLine(AA_Indent, getHeight()-AA_Indent, getWidth()/2, getHeight()-AA_Indent);
                }
            }
            
        }
        
        super.paintComponent(g);
    }
    
    private int AA_LineSize = 2;
    private int AA_Indent = 2;
    private boolean AB_DrawTail = false;
    private boolean AB_DrawAllTails = true;
    private boolean AB_TailTopRight = false;
    private boolean AB_TailTopLeft = false;
    private boolean AB_TailBottomRight = false;
    private boolean AB_TailBottomLeft = false;
    
}