package SystemFunctions;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Constants {
    //Others
    public static Dimension UI_Default_Size = new Dimension(30,30);
    public static Cursor UI_Default_HoverCursor = new Cursor(Cursor.HAND_CURSOR);
    //Color
    public static Color UI_Default_CompColor = new Color(255,255,255);
    public static Color UI_Default_CompButtonColor = new Color(245,245,245);
    public static Color UI_Default_BorderColor = new Color(140,140,140);
    public static Color UI_Default_FontColor = new Color(70,70,70);
    public static Color UI_Default_RippleColor = new Color(160,160,160);
    public static Color UI_Default_LineColor = new Color(140,140,140);
    public static Color UI_Default_HighlightSelectionColor = new Color(100,100,105, 160);
    public static Color UI_Default_HoverColor = new Color(220,220,225);
    public static Color UI_Default_PressColor = new Color(210,210,215);
    public static Color UI_Default_CompButtonSeeThroughColor = new Color(200,200,205, 0);
    public static Color UI_Default_ShadowColor = new Color(0,0,0);
    //Size
    public static int UI_Default_TextHorizontalAligment = 4;
    public static int UI_Default_ShadowSize = 3;
    public static int UI_Default_LineSize = 1;
    public static int UI_Default_LineHeight = 1; //aligned with categories line
    public static int UI_Default_LineIndent = 1;
    public static int UI_Default_Indent = 5;
    public static int UI_Default_BorderSize = 1;
    public static int UI_Default_ArcSize = 0;
    public static int UI_Default_ImageBoundArcSize = 0;
    public static int UI_Default_RoundTopLeft = 0;
    public static int UI_Default_RoundTopRight = 0;
    public static int UI_Default_RoundBottomLeft = 0;
    public static int UI_Default_RoundBottomRight = 0;
    public static float UI_Default_ShadowOpacity = 0.3f;
    //Booleans
    public static boolean UI_Default_BorderDraw = false;
    public static boolean UI_Default_ResizeableImageBound = true;
    public static boolean UI_Default_RippleButton = true;
    public static boolean UI_Default_DrawBorder = false;
    public static boolean UI_Default_DrawImage = false;
    public static boolean UI_Default_OpaqueBackground = false;
    public static boolean UI_Default_OpaqueBackgroundTrue = true;
    //Image
    public static boolean UI_Default_FitToSize = false;
    public static boolean UI_Default_AutoFitToSize = false;
    public static boolean UI_Default_AutoSize = false;
    public static boolean UI_Default_AutoFillSize = false;
    //Custom Border
    public static boolean UI_Default_DrawLeftBorder = false;
    public static boolean UI_Default_DrawRightBorder = false;
    public static boolean UI_Default_DrawTopBorder = false;
    public static boolean UI_Default_DrawBottomBorder = false;
    //Strings
    public static String UI_Default_HintText = "Set Hint";
    
    public static void CreateCustomBorders(JComponent comp, Graphics2D g2, Color BorderColor,int LineSize, boolean Left, boolean Right, boolean Top, boolean Bottom) {
        g2.setColor(BorderColor);
        g2.setStroke(new BasicStroke(LineSize));
        if (Left == true) {
            g2.drawLine(0+(LineSize/2), 0, 0+(LineSize/2), comp.getHeight());
        } if (Right == true) {
            g2.drawLine((comp.getWidth()-1)-(LineSize/2), 0, (comp.getWidth()-1)-(LineSize/2), comp.getHeight());
        } if (Top == true) {
            g2.drawLine(0, 0+(LineSize/2), comp.getWidth(), 0+(LineSize/2));
        } if (Bottom == true) {
            g2.drawLine(0, (comp.getHeight()-1)-(LineSize/2), comp.getWidth(), (comp.getHeight()-1)-(LineSize/2));
        }
    }
    
    public static void rippleComponent(RippleEffect ripple ,JComponent comp, Boolean DrawBorder, Graphics g, int ArcSize, int BorderSize) {
        if (DrawBorder == true) {
            ripple.reder(g, new RoundRectangle2D.Double(0+BorderSize, 0+BorderSize, comp.getWidth()-(BorderSize*2), comp.getHeight()-(BorderSize*2), ArcSize, ArcSize));
        } else {
            ripple.reder(g, new RoundRectangle2D.Double(0, 0, comp.getWidth(), comp.getHeight(), ArcSize, ArcSize));
        }
    }
    
    public static void resizableImageBound(Boolean isResizeableImageBound, Graphics2D g2, int ImageBoundArcSize, int ArcSize, int width, int height, int BorderSize, int ImageIndent) {
        if (isResizeableImageBound == true) {
            RoundRectangle2D roundedRect = new RoundRectangle2D.Float(ImageIndent+BorderSize, ImageIndent+BorderSize, width-((ImageIndent)*2)-(BorderSize*2), height-((ImageIndent)*2)-(BorderSize*2), ImageBoundArcSize, ImageBoundArcSize);
            g2.clip(roundedRect);
        } else {
            RoundRectangle2D roundedRect = new RoundRectangle2D.Float(ImageIndent+BorderSize, ImageIndent+BorderSize, width-((ImageIndent)*2)-(BorderSize*2), height-((ImageIndent)*2)-(BorderSize*2), ArcSize, ArcSize);
            g2.clip(roundedRect);
        }
    }
    
    public static void paintImage(int Ind, JComponent comp, Graphics2D g2, boolean DrawImage, Icon IconImage, boolean FitToSize, boolean AutoFitToSize, boolean AutoSize, boolean AutoFillSize) {
        if (DrawImage == true) {
            Image compImage = ((ImageIcon) IconImage).getImage();
            if (FitToSize == true) {
                g2.drawImage(compImage, 0+Ind, 0+Ind, comp.getWidth()-(Ind*2), comp.getHeight()-(Ind*2), null);
            }
            else if (AutoFitToSize == true) {
                int newWidth = (int) ((double) compImage.getWidth(null) / compImage.getHeight(null) * comp.getHeight());
                if (newWidth <= comp.getWidth()) {
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, newWidth, comp.getHeight());
                } else {
                    int newHeight = (int) ((double) compImage.getHeight(null) / compImage.getWidth(null) * comp.getWidth());
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, comp.getWidth(), newHeight);
                }
            }
            else if (AutoSize == true) {
                if (comp.getWidth() < comp.getHeight()) {
                    int newWidth = (int) ((double) compImage.getWidth(null) / compImage.getHeight(null) * comp.getHeight());
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, newWidth, comp.getHeight());
                } else {
                    int newHeight = (int) ((double) compImage.getHeight(null) / compImage.getWidth(null) * comp.getWidth());
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, comp.getWidth(), newHeight);
                }
            }
            else if (AutoFillSize) {
                double imageAspectRatio = (double) compImage.getWidth(null) / compImage.getHeight(null);
                double compAspectRatio = (double) comp.getWidth() / comp.getHeight();
                int newWidth, newHeight;

                if (compAspectRatio > imageAspectRatio) {
                    newHeight = (int) (comp.getWidth() / imageAspectRatio);
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, comp.getWidth(), newHeight);
                } else {
                    newWidth = (int) (comp.getHeight() * imageAspectRatio);
                    drawImageWithAspectRatio(Ind, comp, g2, compImage, newWidth, comp.getHeight());
                }
            }
        }
    }
    
    public static void paintImageWithBorder(int Ind, int BorderSize, JComponent comp, Graphics2D g2, boolean DrawImage, Icon IconImage, boolean FitToSize, boolean AutoFitToSize, boolean AutoSize, boolean AutoFillSize) {
        if (DrawImage == true) {
            Image compImage = ((ImageIcon) IconImage).getImage();
            if (FitToSize == true) {
                g2.drawImage(compImage, 0+Ind+BorderSize, 0+Ind+BorderSize, comp.getWidth()-(Ind*2)-(BorderSize*2), comp.getHeight()-(Ind*2)-(BorderSize*2), null);
            }
            else if (AutoFitToSize == true) {
                int newWidth = (int) ((double) compImage.getWidth(null) / compImage.getHeight(null) * comp.getHeight());
                if (newWidth <= comp.getWidth()) {
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, newWidth, comp.getHeight());
                } else {
                    int newHeight = (int) ((double) compImage.getHeight(null) / compImage.getWidth(null) * comp.getWidth());
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, comp.getWidth(), newHeight);
                }
            }
            else if (AutoSize == true) {
                if (comp.getWidth() < comp.getHeight()) {
                    int newWidth = (int) ((double) compImage.getWidth(null) / compImage.getHeight(null) * comp.getHeight());
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, newWidth, comp.getHeight());
                } else {
                    int newHeight = (int) ((double) compImage.getHeight(null) / compImage.getWidth(null) * comp.getWidth());
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, comp.getWidth(), newHeight);
                }
            }
            else if (AutoFillSize) {
                double imageAspectRatio = (double) compImage.getWidth(null) / compImage.getHeight(null);
                double compAspectRatio = (double) comp.getWidth() / comp.getHeight();
                int newWidth, newHeight;

                if (compAspectRatio > imageAspectRatio) {
                    newHeight = (int) (comp.getWidth() / imageAspectRatio);
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, comp.getWidth(), newHeight);
                } else {
                    newWidth = (int) (comp.getHeight() * imageAspectRatio);
                    drawImageWithAspectRatioBordered(Ind, BorderSize, comp, g2, compImage, newWidth, comp.getHeight());
                }
            }
        }  
    }
    
    private static void drawImageWithAspectRatioBordered(int Ind, int BorderSize, JComponent comp, Graphics2D g2, Image image, int width, int height) {
        int x = (comp.getWidth() - width) / 2;
        int y = (comp.getHeight() - height) / 2;
        g2.drawImage(image, (x+Ind)+(BorderSize*2), (y+Ind)+(BorderSize*2), width-(Ind*2)-(BorderSize*3), height-(Ind*2)-(BorderSize*3), null);
    }
    
    private static void drawImageWithAspectRatio(int Ind, JComponent comp, Graphics2D g2, Image image, int width, int height) {
        int x = (comp.getWidth() - width) / 2;
        int y = (comp.getHeight() - height) / 2;
        g2.drawImage(image, x+Ind, y+Ind, width-(Ind*2), height-(Ind*2), null);
    }
    
    public static void DrawCustomBorder(Graphics2D g2, boolean IsOpaque, boolean DrawBorder, Color BorderColor, Color backgoundColor,
            int roundTopRight, int roundBottomLeft, int roundBottomRight,
            Shape createRoundTopLeft, Shape createRoundTopRight, Shape createRoundBottomLeft, Shape createRoundBottomRight,
            Shape createRoundTopLeftB, Shape createRoundTopRightB, Shape createRoundBottomLeftB, Shape createRoundBottomRightB) {
        if (IsOpaque == false) {
            g2.setColor(backgoundColor);
            Area area = new Area(createRoundTopLeft);
            if (DrawBorder == true) {
                g2.setColor(BorderColor);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                } g2.fill(area);
                g2.setColor(backgoundColor);
                Area areaB = new Area(createRoundTopLeftB);
                if (roundTopRight > 0) {
                    areaB.intersect(new Area(createRoundTopRightB));
                }
                if (roundBottomLeft > 0) {
                    areaB.intersect(new Area(createRoundBottomLeftB));
                }
                if (roundBottomRight > 0) {
                    areaB.intersect(new Area(createRoundBottomRightB));
                } g2.fill(areaB);
            }
            else {
                g2.setColor(backgoundColor);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                } g2.fill(area);
            }
        } else {
            Area area = new Area(createRoundTopLeft);
            if (DrawBorder == true) {
                g2.setColor(BorderColor);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                }
                Area areaB = new Area(createRoundTopLeftB);
                if (roundTopRight > 0) {
                    areaB.intersect(new Area(createRoundTopRightB));
                }
                if (roundBottomLeft > 0) {
                    areaB.intersect(new Area(createRoundBottomLeftB));
                }
                if (roundBottomRight > 0) {
                    areaB.intersect(new Area(createRoundBottomRightB));
                }
                area.subtract(areaB);
                g2.fill(area);
            }
        }
    }
    
    public static void paintPreSDW(Color backgoundColor, Graphics2D g2, boolean IsOpaque, boolean DrawBorder, Color BorderColor,
            int roundTopRight, int roundBottomLeft, int roundBottomRight,
            Shape createRoundTopLeft, Shape createRoundTopRight, Shape createRoundBottomLeft, Shape createRoundBottomRight,
            Shape createRoundTopLeftB, Shape createRoundTopRightB, Shape createRoundBottomLeftB, Shape createRoundBottomRightB){
        if (IsOpaque == false) {
            g2.setColor(backgoundColor);
            if (DrawBorder == true) {
                g2.setColor(BorderColor);
                Area area = new Area(createRoundTopLeft);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                } g2.fill(area);
                g2.setColor(backgoundColor);
                Area areaB = new Area(createRoundTopLeftB);
                if (roundTopRight > 0) {
                    areaB.intersect(new Area(createRoundTopRightB));
                }
                if (roundBottomLeft > 0) {
                    areaB.intersect(new Area(createRoundBottomLeftB));
                }
                if (roundBottomRight > 0) {
                    areaB.intersect(new Area(createRoundBottomRightB));
                } g2.fill(areaB);
            }
            else if (DrawBorder == false) {
                Area area = new Area(createRoundTopLeft);
                g2.setColor(backgoundColor);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                } g2.fill(area);
            }
        } else {
            Area area = new Area(createRoundTopLeft);
            if (DrawBorder == true) {
                g2.setColor(BorderColor);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                }
                Area areaB = new Area(createRoundTopLeftB);
                if (roundTopRight > 0) {
                    areaB.intersect(new Area(createRoundTopRightB));
                }
                if (roundBottomLeft > 0) {
                    areaB.intersect(new Area(createRoundBottomLeftB));
                }
                if (roundBottomRight > 0) {
                    areaB.intersect(new Area(createRoundBottomRightB));
                }
                area.subtract(areaB);
                g2.fill(area);
            }
        }
    }
    
    public static void paintSDW(Graphics2D g2, Graphics2D g1, BufferedImage ShadowIMG, Color ShadowColor, boolean IsOpaque, boolean DrawBorder, int ShadowSize, float ShadowOpacity,
            int roundTopRight, int roundBottomLeft, int roundBottomRight,
            Shape createRoundTopLeft, Shape createRoundTopRight, Shape createRoundBottomLeft, Shape createRoundBottomRight,
            Shape createRoundTopLeftB, Shape createRoundTopRightB, Shape createRoundBottomLeftB, Shape createRoundBottomRightB){
        g1.setColor(ShadowColor);
        if (IsOpaque==false) {
            Area areaB = new Area(createRoundTopLeft);
            if (roundTopRight > 0) {
                areaB.intersect(new Area(createRoundTopRight));
            }
            if (roundBottomLeft > 0) {
                areaB.intersect(new Area(createRoundBottomLeft));
            }
            if (roundBottomRight > 0) {
                areaB.intersect(new Area(createRoundBottomRight));
            } g1.fill(areaB);
        } else if (IsOpaque==true) {
            if (DrawBorder == true) {
                Area area = new Area(createRoundTopLeft);
                if (roundTopRight > 0) {
                    area.intersect(new Area(createRoundTopRight));
                }
                if (roundBottomLeft > 0) {
                    area.intersect(new Area(createRoundBottomLeft));
                }
                if (roundBottomRight > 0) {
                    area.intersect(new Area(createRoundBottomRight));
                }
                Area areaB = new Area(createRoundTopLeftB);
                if (roundTopRight > 0) {
                    areaB.intersect(new Area(createRoundTopRightB));
                }
                if (roundBottomLeft > 0) {
                    areaB.intersect(new Area(createRoundBottomLeftB));
                }
                if (roundBottomRight > 0) {
                    areaB.intersect(new Area(createRoundBottomRightB));
                }
                area.subtract(areaB);
                g1.fill(area);
            }
        }
        ShadowRenderer render = new ShadowRenderer(ShadowSize, ShadowOpacity, ShadowColor);
        g2.drawImage(render.createShadow(ShadowIMG), 0 - ShadowSize, 0 - ShadowSize, null);
        g2.drawImage(ShadowIMG, 0, 0, null);
    }
    
}