
package Panel;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.ImageIcon;

public class SamPanel extends javax.swing.JPanel {

    public SamPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pH_Label1 = new SystemOtherComps.PH_Label();
        name = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        contactme = new javax.swing.JLabel();
        github = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 23, 23));

        pH_Label1.setAAA_AutoSize(true);
        pH_Label1.setAAA_ImageBoundArcSize(40);
        pH_Label1.setAAA_roundBottomLeft(40);
        pH_Label1.setAAA_roundBottomRight(40);
        pH_Label1.setAAA_roundTopLeft(40);
        pH_Label1.setAAA_roundTopRight(40);
        pH_Label1.setAA_ArcSize(40);
        pH_Label1.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/hare.jpg"))); // NOI18N
        pH_Label1.setAA_DrawImage(true);

        name.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Samuel James Cinco");

        title.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(153, 153, 153));
        title.setText("Lead Programmer");

        contactme.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        contactme.setForeground(new java.awt.Color(153, 153, 153));
        contactme.setText("Contact me:");

        github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/github1.png"))); // NOI18N
        github.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                githubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                githubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                githubMouseExited(evt);
            }
        });

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x1.png"))); // NOI18N
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twitterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twitterMouseExited(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(github)
                        .addGap(18, 18, 18)
                        .addComponent(twitter)
                        .addGap(18, 18, 18)
                        .addComponent(facebook)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(github)
                            .addComponent(twitter)
                            .addComponent(facebook)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pH_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void githubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/github.png"));
        github.setIcon(image);
    }//GEN-LAST:event_githubMouseEntered

    private void facebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/facebook.png"));
        facebook.setIcon(image);
    }//GEN-LAST:event_facebookMouseEntered

    private void twitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/x.png"));
        twitter.setIcon(image);
    }//GEN-LAST:event_twitterMouseEntered

    private void githubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/github1.png"));
        github.setIcon(image);
    }//GEN-LAST:event_githubMouseExited

    private void twitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/x1.png"));
        twitter.setIcon(image);;
    }//GEN-LAST:event_twitterMouseExited

    private void facebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/facebook1.png"));
        facebook.setIcon(image);
    }//GEN-LAST:event_facebookMouseExited

    private void githubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubMouseClicked
        try{
             Desktop.getDesktop().browse(new URL("https://github.com/ImSauce").toURI());
         }catch(Exception e){}
    }//GEN-LAST:event_githubMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        try{
             Desktop.getDesktop().browse(new URL("https://x.com/imsauce_").toURI());
         }catch(Exception e){}
    }//GEN-LAST:event_twitterMouseClicked

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        try{
             Desktop.getDesktop().browse(new URL("https://www.facebook.com/samueljames.cinco.5").toURI());
         }catch(Exception e){}
    }//GEN-LAST:event_facebookMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel contactme;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel github;
    public javax.swing.JLabel name;
    private SystemOtherComps.PH_Label pH_Label1;
    public javax.swing.JLabel title;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables
}
