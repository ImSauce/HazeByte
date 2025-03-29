package SystemOtherComps;

import SystemFunctions.Constants;
import SystemFunctions.CustomRoundBorder;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class PH_PasswordField extends JPasswordField{
    
    public boolean isAA_DrawLine() {
        return AA_DrawLine;
    }
    
    public void setAA_DrawLine(boolean AA_DrawLine) {
        this.AA_DrawLine = AA_DrawLine;
    }
    
    public int getAA_BorderSize() {
        return AA_BorderSize;
    }
    
    public void setAA_BorderSize(int AA_BorderSize) {
        this.AA_BorderSize = AA_BorderSize;
    }
    
    public int getAAA_roundTopLeft() {
        return AAA_roundTopLeft;
    }
    
    public void setAAA_roundTopLeft(int AAA_roundTopLeft) {
        this.AAA_roundTopLeft = AAA_roundTopLeft;
    }
    
    public int getAAA_roundTopRight() {
        return AAA_roundTopRight;
    }
    
    public void setAAA_roundTopRight(int AAA_roundTopRight) {
        this.AAA_roundTopRight = AAA_roundTopRight;
    }
    
    public int getAAA_roundBottomLeft() {
        return AAA_roundBottomLeft;
    }
    
    public void setAAA_roundBottomLeft(int AAA_roundBottomLeft) {
        this.AAA_roundBottomLeft = AAA_roundBottomLeft;
    }
    
    public int getAAA_roundBottomRight() {
        return AAA_roundBottomRight;
    }
    
    public void setAAA_roundBottomRight(int AAA_roundBottomRight) {
        this.AAA_roundBottomRight = AAA_roundBottomRight;
    }
    
    public Color getAA_BorderColor() {
        return AA_BorderColor;
    }
    
    public void setAA_BorderColor(Color AA_BorderColor) {
        this.AA_BorderColor = AA_BorderColor;
    }
    
    public boolean isAA_OpaqueBackground() {
        return AA_OpaqueBackground;
    }
    
    public void setAA_OpaqueBackground(boolean AA_OpaqueBackground) {
        this.AA_OpaqueBackground = AA_OpaqueBackground;
    }
    
    public boolean isAA_DrawBorder() {
        return AA_DrawBorder;
    }
    
    public void setAA_DrawBorder(boolean AA_DrawBorder) {
        this.AA_DrawBorder = AA_DrawBorder;
    }
    
    public boolean isAA_DrawLeftBorder() {
        return AA_DrawLeftBorder;
    }
    
    public void setAA_DrawLeftBorder(boolean AA_DrawLeftBorder) {
        this.AA_DrawLeftBorder = AA_DrawLeftBorder;
    }
    
    public boolean isAA_DrawRightBorder() {
        return AA_DrawRightBorder;
    }
    
    public void setAA_DrawRightBorder(boolean AA_DrawRightBorder) {
        this.AA_DrawRightBorder = AA_DrawRightBorder;
    }
    
    public boolean isAA_DrawTopBorder() {
        return AA_DrawTopBorder;
    }
    
    public void setAA_DrawTopBorder(boolean AA_DrawTopBorder) {
        this.AA_DrawTopBorder = AA_DrawTopBorder;
    }
    
    public boolean isAA_DrawBottomBorder() {
        return AA_DrawBottomBorder;
    }
    
    public void setAA_DrawBottomBorder(boolean AA_DrawBottomBorder) {
        this.AA_DrawBottomBorder = AA_DrawBottomBorder;
    }
    
    public String getAA_TextHint() {
        return AA_TextHint;
    }
    
    public void setAA_TextHint(String AA_TextHint) {
        this.AA_TextHint = AA_TextHint;
    }
    
    public Color getAB_LineColor() {
        return AB_LineColor;
    }
    
    public void setAB_LineColor(Color AB_LineColor) {
        this.AB_LineColor = AB_LineColor;
    }
    
    public Color getAB_HintColor() {
        return AB_HintColor;
    }
    
    public void setAB_HintColor(Color AB_HintColor) {
        this.AB_HintColor = AB_HintColor;
    }
    
    public int getAB_LineSize() {
        return AB_LineSize;
    }
    
    public void setAB_LineSize(int AB_LineSize) {
        this.AB_LineSize = AB_LineSize;
    }
    
    public int getAB_LineHeight() {
        return AB_LineHeight;
    }
    
    public void setAB_LineHeight(int AB_LineHeight) {
        this.AB_LineHeight = AB_LineHeight;
    }
    
    public int getAB_LineIndent() {
        return AB_LineIndent;
    }
    
    public void setAB_LineIndent(int AB_LineIndent) {
        this.AB_LineIndent = AB_LineIndent;
    }

    public PH_PasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(9, 1, 9, 1));
        setBackground(Constants.UI_Default_CompButtonSeeThroughColor);
        setForeground(Constants.UI_Default_FontColor);
        setSelectionColor(Constants.UI_Default_HighlightSelectionColor);
        setHorizontalAlignment(Constants.UI_Default_TextHorizontalAligment);
        
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    animate = fraction;
                } else {
                    animate = 1f - fraction;
                }
                repaint();
            }
            @Override
            public void end() {
                show = !show;
                repaint();
            }
        });
        
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!getText().equals("")) {
                    if (show) {
                        if (animator.isRunning() == false) {
                            stop();
                            animator.start();
                        }
                    } else if (animator.isRunning()) {
                        stop();
                        animator.start();
                    }
                }
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                if (getText().equals("")) {
                    stop();
                    animator.start();
                }
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private void stop() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Graphics2D g3 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //Initialization for the Custom round Border
        Shape createRoundTopLeft = CustomRoundBorder.createRoundTopLeft(this, AAA_roundTopLeft);
        Shape createRoundTopRight = CustomRoundBorder.createRoundTopRight(this, AAA_roundTopRight);
        Shape createRoundBottomLeft = CustomRoundBorder.createRoundBottomLeft(this, AAA_roundBottomLeft);
        Shape createRoundBottomRight = CustomRoundBorder.createRoundBottomRight(this, AAA_roundBottomRight);
        Shape createRoundTopLeftB = CustomRoundBorder.createRoundTopLeftB(this, AAA_roundTopLeft, AA_BorderSize);
        Shape createRoundTopRightB = CustomRoundBorder.createRoundTopRightB(this, AAA_roundTopRight, AA_BorderSize);
        Shape createRoundBottomLeftB = CustomRoundBorder.createRoundBottomLeftB(this, AAA_roundBottomLeft, AA_BorderSize);
        Shape createRoundBottomRightB = CustomRoundBorder.createRoundBottomRightB(this, AAA_roundBottomRight, AA_BorderSize);
        g3.setColor(AA_BorderColor);
        //Creation of the Roundborder
        Constants.DrawCustomBorder(g2, AA_OpaqueBackground,AA_DrawBorder, AA_BorderColor, getBackground(), AAA_roundTopRight, AAA_roundBottomLeft, AAA_roundBottomRight,
                createRoundTopLeft, createRoundTopRight, createRoundBottomLeft, createRoundBottomRight,
                createRoundTopLeftB, createRoundTopRightB, createRoundBottomLeftB, createRoundBottomRightB);
        
        if (AA_DrawBorder==false) {
            Constants.CreateCustomBorders(this, g3, AA_BorderColor, AA_BorderSize, AA_DrawLeftBorder, AA_DrawRightBorder, AA_DrawTopBorder, AA_DrawBottomBorder);
        } if (AA_DrawLine==true) {
            g3.setColor(AB_LineColor);
            g3.setStroke(new BasicStroke(AB_LineSize));
            g3.drawLine(AB_LineIndent, getHeight() - AB_LineHeight, getWidth()-AB_LineIndent, getHeight() - AB_LineHeight);
        } if (!AA_TextHint.equals("")) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(AB_HintColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f - animate));
            g2.drawString(AA_TextHint, ins.left + (animate * 30)+AB_LineIndent, h / 2 + fm.getAscent() / 2 - 1);
        }
        
        g2.dispose();
        super.paint(g);
    }
    
    private final Animator animator;
    private String AA_TextHint = Constants.UI_Default_HintText;
    private Color AB_LineColor = Constants.UI_Default_LineColor;
    private Color AB_HintColor = Constants.UI_Default_FontColor;
    private int AB_LineSize = Constants.UI_Default_LineSize;
    private int AB_LineHeight = Constants.UI_Default_LineHeight;
    private int AB_LineIndent = Constants.UI_Default_LineIndent;
    private float animate;
    private boolean show = true;
    private boolean AA_DrawLine = true;
    
    private int AA_BorderSize = Constants.UI_Default_BorderSize;
    private int AAA_roundTopLeft = Constants.UI_Default_RoundTopLeft;
    private int AAA_roundTopRight = Constants.UI_Default_RoundTopRight;
    private int AAA_roundBottomLeft = Constants.UI_Default_RoundBottomLeft;
    private int AAA_roundBottomRight = Constants.UI_Default_RoundBottomRight;
    private Color AA_BorderColor = Constants.UI_Default_BorderColor;
    private boolean AA_OpaqueBackground = Constants.UI_Default_OpaqueBackground;
    private boolean AA_DrawBorder = Constants.UI_Default_DrawBorder;
    private boolean AA_DrawLeftBorder = Constants.UI_Default_DrawLeftBorder;
    private boolean AA_DrawRightBorder = Constants.UI_Default_DrawRightBorder;
    private boolean AA_DrawTopBorder = Constants.UI_Default_DrawTopBorder;
    private boolean AA_DrawBottomBorder = Constants.UI_Default_DrawBottomBorder;
}
