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
public class ConfirmationPopup extends javax.swing.JPanel {

    public ConfirmationPopup() {
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
        ConfirmBT = new SystemOtherComps.PH_Button();

        setBackground(new java.awt.Color(24, 23, 23));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        Title.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Confirm Deletion");

        Description.setEditable(false);
        Description.setForeground(new java.awt.Color(204, 204, 204));
        Description.setText("Deleting this product will permanently remove all associated data and cannot be undone. Are you sure you want to proceed?");

        ConfirmBT.setBackground(new java.awt.Color(24, 23, 23));
        ConfirmBT.setText("Confirm");
        ConfirmBT.setAAA_ImageBoundArcSize(10);
        ConfirmBT.setAAA_roundBottomLeft(10);
        ConfirmBT.setAAA_roundBottomRight(10);
        ConfirmBT.setAAA_roundTopLeft(10);
        ConfirmBT.setAAA_roundTopRight(10);
        ConfirmBT.setAA_ArcSize(10);
        ConfirmBT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        ConfirmBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        ConfirmBT.setAA_DrawBorder(true);
        ConfirmBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        ConfirmBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        ConfirmBT.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        ConfirmBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(0, 292, Short.MAX_VALUE))
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ConfirmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ConfirmBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_cmdCancelActionPerformed
        
    public void eventOK(ActionListener event) {
        ConfirmBT.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button ConfirmBT;
    public javax.swing.JTextPane Description;
    public javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
