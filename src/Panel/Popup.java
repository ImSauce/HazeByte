package Panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author RAVEN
 */
public class Popup extends javax.swing.JPanel {

    public Popup() {
        initComponents();
        setOpaque(false);
        Description.setBackground(new Color(0, 0, 0, 0));
        Description.setSelectionColor(new Color(48, 170, 63, 200));
        Description.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Description = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(24, 23, 23));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        Title.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Your Message Title Dialog Custom");

        Description.setEditable(false);
        Description.setForeground(new java.awt.Color(204, 204, 204));
        Description.setText("This is part of a series of short tutorials about specific elements, components, or interactions. We’ll cover the UX, the UI, and the construction inside of Sketch. Plus, there’s a freebie for you at the end!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(0, 169, Short.MAX_VALUE))
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_cmdCancelActionPerformed

    public void eventOK(ActionListener event) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextPane Description;
    public javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
