
package Panel;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.ImageIcon;

public class JmPanel extends javax.swing.JPanel {

    public JmPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pH_Label1 = new SystemOtherComps.PH_Label();
        name = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        contactme = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 23, 23));

        pH_Label1.setAAA_AutoSize(true);
        pH_Label1.setAAA_ImageBoundArcSize(40);
        pH_Label1.setAAA_roundBottomLeft(40);
        pH_Label1.setAAA_roundBottomRight(40);
        pH_Label1.setAAA_roundTopLeft(40);
        pH_Label1.setAAA_roundTopRight(40);
        pH_Label1.setAA_ArcSize(40);
        pH_Label1.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/gabadol.png"))); // NOI18N
        pH_Label1.setAA_DrawImage(true);

        name.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("John Vincent Uayan");

        title.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(153, 153, 153));
        title.setText("Project Manager/Beta Tester");

        contactme.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        contactme.setForeground(new java.awt.Color(153, 153, 153));
        contactme.setText("Contact me:");

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facebook1.png"))); // NOI18N
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pH_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactme)
                    .addComponent(facebook))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title)
                        .addGap(34, 34, 34)
                        .addComponent(contactme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facebook))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pH_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void facebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/facebook.png"));
        facebook.setIcon(image);
    }//GEN-LAST:event_facebookMouseEntered

    private void facebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/facebook1.png"));
        facebook.setIcon(image);
    }//GEN-LAST:event_facebookMouseExited

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        try{
             Desktop.getDesktop().browse(new URL("https://www.facebook.com/johnmichaelvincent.uayan").toURI());
         }catch(Exception e){}
    }//GEN-LAST:event_facebookMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel contactme;
    private javax.swing.JLabel facebook;
    public javax.swing.JLabel name;
    private SystemOtherComps.PH_Label pH_Label1;
    public javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
