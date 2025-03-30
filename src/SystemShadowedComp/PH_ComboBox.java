package SystemShadowedComp;

import SystemFunctions.Constants;
import SystemOtherComps.PH_ScrollBar;
import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class PH_ComboBox<e> extends JComboBox<e> {
    
    public Color getAA_CellSelectedColor() {
        return AA_CellSelectedColor;
    }
    
    public void setAA_CellSelectedColor(Color AA_CellSelectedColor) {
        this.AA_CellSelectedColor = AA_CellSelectedColor;
        refresh();
    }
    
    public Color getAA_BorderColor() {
        return AA_BorderColor;
    }
    
    public void setAA_BorderColor(Color AA_BorderColor) {
        this.AA_BorderColor = AA_BorderColor;
        refresh();
    }
    
    public Color getAA_ComboBoxColor() {
        return AA_ComboBoxColor;
    }
    
    public void setAA_ComboBoxColor(Color AA_ComboBoxColor) {
        this.AA_ComboBoxColor = AA_ComboBoxColor;
        refresh();
    }
    
    public Color getAA_PopForeground() {
        return AA_PopForeground;
    }
    
    public void setAA_PopForeground(Color AA_PopForeground) {
        this.AA_PopForeground = AA_PopForeground;
        refresh();
    }
    
    public Color getAA_HintForeground() {
        return AA_HintForeground;
    }
    
    public void setAA_HintForeground(Color AA_HintForeground) {
        this.AA_HintForeground = AA_HintForeground;
        refresh();
    }
    
    public Color getAA_WordLinerColor() {
        return AA_WordLinerColor;
    }
    
    public void setAA_WordLinerColor(Color AA_WordLinerColor) {
        this.AA_WordLinerColor = AA_WordLinerColor;
        refresh();
    }
    
    public Color getAA_ArrowColor() {
        return AA_ArrowColor;
    }
    
    public void setAA_ArrowColor(Color AA_ArrowColor) {
        this.AA_ArrowColor = AA_ArrowColor;
        refresh();
    }
    
    public Color getAA_SelectedArrowColor() {
        return AA_SelectedArrowColor;
    }
    
    public void setAA_SelectedArrowColor(Color AA_SelectedArrowColor) {
        this.AA_SelectedArrowColor = AA_SelectedArrowColor;
        refresh();
    }
    
    public Color getAA_UnSelectedArrowColor() {
        return AA_UnSelectedArrowColor;
    }
    
    public void setAA_UnSelectedArrowColor(Color AA_UnSelectedArrowColor) {
        this.AA_UnSelectedArrowColor = AA_UnSelectedArrowColor;
        refresh();
    }
    
    public Color getAAA_ComboBoxScrollColor() {
        return AAA_ComboBoxScrollColor;
    }
    
    public void setAAA_ComboBoxScrollColor(Color AAA_ComboBoxScrollColor) {
        this.AAA_ComboBoxScrollColor = AAA_ComboBoxScrollColor;
        refresh();
    }
    
    public int getAAA_FixedCellHeight() {
        return AAA_FixedCellHeight;
    }
    
    public void setAAA_FixedCellHeight(int AAA_FixedCellHeight) {
        this.AAA_FixedCellHeight = AAA_FixedCellHeight;
        refresh();
    }
    
    public int getAAA_UniIncrement() {
        return AAA_UniIncrement;
    }
    
    public void setAAA_UniIncrement(int AAA_UniIncrement) {
        this.AAA_UniIncrement = AAA_UniIncrement;
        refresh();
    }
    
    public int getAA_BorderSize() {
        return AA_BorderSize;
    }
    
    public void setAA_BorderSize(int AA_BorderSize) {
        this.AA_BorderSize = AA_BorderSize;
        refresh();
    }

    public String getLabeText() {
        return labeText;
    }

    public void setLabeText(String labeText) {
        this.labeText = labeText;
        refresh();
    }

    public Color getAA_lineColor() {
        return AA_lineColor;
    }

    public void setAA_lineColor(Color lineColor) {
        this.AA_lineColor = lineColor;
        refresh();
    }
    
    private void refresh() {
        this.revalidate();
        this.repaint();
    }
    
    @Override
    public void updateUI() {
        super.updateUI();
        installUI();
    }
    
    private void installUI() {
        setUI(new ComboUI(this));  // Pass the reference to the PH_ComboBox instance
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean bln1) {
                Component com = super.getListCellRendererComponent(jlist, o, i, bln, bln1);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                if (bln) {
                    //Color han selected Cell han pop
                    com.setBackground(AA_CellSelectedColor);
                }
                return com;
            }
        });
    }

    public PH_ComboBox() {
        //Whole background han Combobox
        setBackground(AA_ComboBoxColor);
        setForeground(Constants.UI_Default_FontColor);
        setBorder(new EmptyBorder(15, 3, 5, 3));
        installUI();
    }

    public class ComboUI extends BasicComboBoxUI {

        private final Animator animator;
        private boolean animateHinText = true;
        private float location;
        private boolean show;
        private PH_ComboBox combo;

        public ComboUI(PH_ComboBox combo) {
            //Foreground han pop
            setForeground(AA_PopForeground);
            this.combo = combo;
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                    mouseOver = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    mouseOver = false;
                    repaint();
                }
            });
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent fe) {
                    showing(false);
                }

                @Override
                public void focusLost(FocusEvent fe) {
                    showing(true);
                }
            });
            addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    if (!isFocusOwner()) {
                        if (getSelectedIndex() == -1) {
                            showing(true);
                        } else {
                            showing(false);
                        }
                    }
                }
            });
            addPopupMenuListener(new PopupMenuListener() {
                @Override
                public void popupMenuWillBecomeVisible(PopupMenuEvent pme) {
                    if (arrowButton != null) {
                        //Color han  arrow button kun pidlit
                        arrowButton.setBackground(AA_SelectedArrowColor);
                    }
                }

                @Override
                public void popupMenuWillBecomeInvisible(PopupMenuEvent pme) {
                    if (arrowButton != null) {
                        //Color han arrow button kun diri pidlit
                        arrowButton.setBackground(AA_UnSelectedArrowColor);
                    }
                }

                @Override
                public void popupMenuCanceled(PopupMenuEvent pme) {
                    if (arrowButton != null) {
                        //ambot
                        arrowButton.setBackground(new Color(0,0,0));
                    }
                }
            });
            TimingTarget target = new TimingTargetAdapter() {
                @Override
                public void begin() {
                    animateHinText = getSelectedIndex() == -1;
                }

                @Override
                public void timingEvent(float fraction) {
                    location = fraction;
                    repaint();
                }

            };
            animator = new Animator(300, target);
            animator.setResolution(0);
            animator.setAcceleration(0.5f);
            animator.setDeceleration(0.5f);
        }

        @Override
        public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bln) {

        }

        @Override
        protected JButton createArrowButton() {
            return new ArrowButton();
        }

        
        //SCROLL BAR SHIT
        @Override
        protected ComboPopup createPopup() {
            BasicComboPopup pop = new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {
                    list.setFixedCellHeight(getAAA_FixedCellHeight());
                    JScrollPane scroll = new JScrollPane(list);
                    //Somehow Scroll
                    scroll.setBackground(Color.WHITE);
                    
                    PH_ScrollBar sb = new PH_ScrollBar();
                    sb.setUnitIncrement(AAA_UniIncrement);
                    //Scrollbar Color
                    sb.setBackground(AA_BorderColor); //SCROLLBAR BG
                    sb.setForeground(AAA_ComboBoxScrollColor);
                    scroll.setVerticalScrollBar(sb);
                    return scroll;
                    
                }
            };
            //Border of the Pop, basta an nakapot han mga model strings
            pop.setBorder(new LineBorder(combo.getAA_BorderColor(), combo.getAA_BorderSize()));
            return pop;
        }

        @Override
        public void paint(Graphics grphcs, JComponent jc) {
            super.paint(grphcs, jc);
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            int width = getWidth();
            int height = getHeight();
            
            if (mouseOver) {
                //Color of the line when the mouse is over
                g2.setColor(combo.AA_lineColor);
            } else {
                //Color of the line when the mouse is not over
                g2.setColor(combo.AA_WordLinerColor);
            }
            g2.fillRect(2, height - 1, width - 4, 1);
            createHintText(g2);
            createLineStyle(g2);
            g2.dispose();
        }

        private void createHintText(Graphics2D g2) {
            Insets in = getInsets();
            //Color of the Hint text
            g2.setColor(AA_HintForeground);
            FontMetrics ft = g2.getFontMetrics();
            Rectangle2D r2 = ft.getStringBounds(combo.getLabeText(), g2);
            double height = getHeight() - in.top - in.bottom;
            double textY = (height - r2.getHeight()) / 2;
            double size;
            if (animateHinText) {
                if (show) {
                    size = 18 * (1 - location);
                } else {
                    size = 18 * location;
                }
            } else {
                size = 18;
            }
            g2.drawString(combo.getLabeText(), in.right, (int) (in.top + textY + ft.getAscent() - size));
        }

        private void createLineStyle(Graphics2D g2) {
            if (isFocusOwner()) {
                double width = getWidth() - 4;
                int height = getHeight();
                g2.setColor(getAA_lineColor());
                double size;
                if (show) {
                    size = width * (1 - location);
                } else {
                    size = width * location;
                }
                double x = (width - size) / 2;
                g2.fillRect((int) (x + 2), height - 2, (int) size, 2);
            }
        }

        private void showing(boolean action) {
            if (animator.isRunning()) {
                animator.stop();
            } else {
                location = 1;
            }
            animator.setStartFraction(1f - location);
            show = action;
            location = 1f - location;
            animator.start();
        }

        private class ArrowButton extends JButton {

            public ArrowButton() {
                setContentAreaFilled(false);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                //Color of the arrow button
                setBackground(AA_ArrowColor);
            }

            @Override
            public void paint(Graphics grphcs) {
                super.paint(grphcs);
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size) / 2;
                int y = (height - size) / 2 + 5;
                int reducedHeight = size / 2; // Reduce height by half

                int px[] = {x, x + size, x + size / 2};
                int py[] = {y, y, y + reducedHeight}; // Reduce the top point's height

                g2.setColor(getBackground());
                g2.fillPolygon(px, py, px.length);
                g2.dispose();
            }
        }
    }
    //24,23,23          255,255,255
    
    private Color AA_CellSelectedColor = new Color(51,51,51);
    private Color AA_BorderColor = new Color(24,23,23);
    private Color AA_ComboBoxColor = new Color(24,23,23);
    private Color AA_PopForeground = new Color(70,70,70);
    private Color AA_HintForeground = new Color(140,140,140);
    private Color AA_WordLinerColor =  new Color(37,131,49);
    private Color AA_ArrowColor = new Color(220,220,225);
    private Color AA_SelectedArrowColor = new Color(210,210,215);
    private Color AA_UnSelectedArrowColor = AA_ArrowColor;
    private Color AAA_ComboBoxScrollColor = new Color(250,250,255);
    private int AAA_FixedCellHeight = 30;
    private int AAA_UniIncrement = 10;
    private int AA_BorderSize = 1;
    private String labeText = "Categories";
    private Color AA_lineColor = new Color(3, 133, 179);
    private boolean mouseOver;
    
}
