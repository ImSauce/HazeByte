package SystemFunctions;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

public class CustomRoundBorder {
    
    //Unshadowed
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    public static Shape createRoundTopLeft(JComponent comp, int roundTopLeft) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    public static Shape createRoundTopRight(JComponent comp, int roundTopRight) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    public static Shape createRoundBottomLeft(JComponent comp, int roundBottomLeft) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    public static Shape createRoundBottomRight(JComponent comp, int roundBottomRight) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
    
    public static Shape createRoundTopLeftB(JComponent comp, int roundTopLeft, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+BorderSize, 0+BorderSize, (width)-(BorderSize*2), (height)-(BorderSize*2), roundX-BorderSize, roundY-BorderSize));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+BorderSize, 0+BorderSize, (width - roundX / 2)-(BorderSize*2), height-(BorderSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+BorderSize, (roundY / 2)+BorderSize, width-(BorderSize*2), (height - roundY / 2)-(BorderSize*2))));
        return area;
    }

    public static Shape createRoundTopRightB(JComponent comp, int roundTopRight, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0+BorderSize, (width)-(BorderSize), height-BorderSize, roundX-BorderSize, roundY-BorderSize));
        area.add(new Area(new Rectangle2D.Double(0+BorderSize, 0+BorderSize, (width - roundX / 2)-(BorderSize*2), height-(BorderSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+BorderSize, (roundY / 2)+BorderSize, width-(BorderSize*2), (height - roundY / 2)-(BorderSize*2))));
        return area;
    }
    
    public static Shape createRoundBottomLeftB(JComponent comp, int roundBottomLeft, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+BorderSize, 0, width-BorderSize, height-BorderSize, roundX-BorderSize, roundY-BorderSize));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+BorderSize, 0+BorderSize, (width - roundX / 2)-(BorderSize*2), height-(BorderSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+BorderSize, 0+BorderSize, width-(BorderSize*2), (height - roundY / 2)-(BorderSize*2))));
        return area;
    }
    
    public static Shape createRoundBottomRightB(JComponent comp, int roundBottomRight, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, (width)-(BorderSize), height-BorderSize, roundX-BorderSize, roundY-BorderSize));
        area.add(new Area(new Rectangle2D.Double(0, 0, (width - roundX / 2)-(BorderSize*2), height-(BorderSize*2))));
        area.add(new Area(new Rectangle2D.Double(0, (roundY / 2)+BorderSize, width-(roundY), (height - roundY / 2)-(BorderSize*2))));
        return area;
    }
    // </editor-fold>  
    
    //Shadowed
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    
    public static Shape createRoundTopLeft_SDW(JComponent comp, int roundTopLeft, int ShadowSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+ShadowSize, 0+ShadowSize, (width)-(ShadowSize*2), (height)-(ShadowSize*2), roundX-ShadowSize, roundY-ShadowSize));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+ShadowSize, 0+ShadowSize, (width - roundX / 2)-(ShadowSize*2), height-(ShadowSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize, (roundY / 2)+ShadowSize, width-(ShadowSize*2), (height - roundY / 2)-(ShadowSize*2))));
        return area;
    }

    public static Shape createRoundTopRight_SDW(JComponent comp, int roundTopRight, int ShadowSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0+ShadowSize, (width)-(ShadowSize), height-ShadowSize, roundX-ShadowSize, roundY-ShadowSize));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize, 0+ShadowSize, (width - roundX / 2)-(ShadowSize*2), height-(ShadowSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize, (roundY / 2)+ShadowSize, width-(ShadowSize*2), (height - roundY / 2)-(ShadowSize*2))));
        return area;
    }
    
    public static Shape createRoundBottomLeft_SDW(JComponent comp, int roundBottomLeft, int ShadowSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+ShadowSize, 0, width-ShadowSize, height-ShadowSize, roundX-ShadowSize, roundY-ShadowSize));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+ShadowSize, 0+ShadowSize, (width - roundX / 2)-(ShadowSize*2), height-(ShadowSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize, 0+ShadowSize, width-(ShadowSize*2), (height - roundY / 2)-(ShadowSize*2))));
        return area;
    }
    
    public static Shape createRoundBottomRight_SDW(JComponent comp, int roundBottomRight, int ShadowSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, (width)-(ShadowSize), height-ShadowSize, roundX-ShadowSize, roundY-ShadowSize));
        area.add(new Area(new Rectangle2D.Double(0, 0, (width - roundX / 2)-(ShadowSize*2), height-(ShadowSize*2))));
        area.add(new Area(new Rectangle2D.Double(0, (roundY / 2)+ShadowSize, width-(roundY), (height - roundY / 2)-(ShadowSize*2))));
        return area;
    }
    
    public static Shape createRoundTopLeftB_SDW(JComponent comp, int roundTopLeft, int ShadowSize, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+ShadowSize+BorderSize, 0+ShadowSize+BorderSize, (width)-((ShadowSize*2)+BorderSize), (height)-((ShadowSize*2)+BorderSize), (roundX)-(ShadowSize+BorderSize), (roundY)-(ShadowSize+BorderSize)));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+(ShadowSize+BorderSize), 0+ShadowSize+BorderSize, (width - roundX / 2)-((ShadowSize*2)+BorderSize), height-((ShadowSize*2)+BorderSize))));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize+BorderSize, (roundY / 2)+(ShadowSize+BorderSize), width-((ShadowSize*2)+BorderSize), (height - roundY / 2)-((ShadowSize*2)+BorderSize))));
        return area;
    }

    public static Shape createRoundTopRightB_SDW(JComponent comp, int roundTopRight, int ShadowSize, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0+ShadowSize+BorderSize, (width)-(ShadowSize)-BorderSize, height-ShadowSize-BorderSize, roundX-ShadowSize-BorderSize, roundY-ShadowSize-BorderSize));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize+BorderSize, 0+ShadowSize+BorderSize, (width - roundX / 2)-(ShadowSize*2)-BorderSize, (height)-(ShadowSize*2)-BorderSize)));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize+BorderSize, (roundY / 2)+ShadowSize+BorderSize, (width)-(ShadowSize*2)-BorderSize, (height - roundY / 2)-(ShadowSize*2)-BorderSize)));
        return area;
    }
    
    public static Shape createRoundBottomLeftB_SDW(JComponent comp, int roundBottomLeft, int ShadowSize, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0+ShadowSize+BorderSize, 0, (width-ShadowSize)-BorderSize, (height-ShadowSize)-BorderSize, (roundX-ShadowSize)-BorderSize, (roundY-ShadowSize)-BorderSize));
        area.add(new Area(new Rectangle2D.Double((roundX / 2)+ShadowSize, 0+ShadowSize, (width - roundX / 2)-(ShadowSize*2), height-(ShadowSize*2))));
        area.add(new Area(new Rectangle2D.Double(0+ShadowSize, 0+ShadowSize, width-(ShadowSize*2), (height - roundY / 2)-(ShadowSize*2))));
        return area;
    }
    
    public static Shape createRoundBottomRightB_SDW(JComponent comp, int roundBottomRight, int ShadowSize, int BorderSize) {
        int width = comp.getWidth();
        int height = comp.getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, (width)-(ShadowSize)-BorderSize, height-ShadowSize-BorderSize, roundX-ShadowSize-BorderSize, roundY-ShadowSize-BorderSize));
        area.add(new Area(new Rectangle2D.Double(0-BorderSize, 0-BorderSize, (width - roundX / 2)-(ShadowSize*2)-BorderSize, (height)-(ShadowSize*2)-BorderSize)));
        area.add(new Area(new Rectangle2D.Double(0-BorderSize, (roundY / 2)+ShadowSize-BorderSize, (width)-(roundY), (height - roundY / 2)-(ShadowSize*2)-BorderSize)));
        return area;
    }
    // </editor-fold>  
}
