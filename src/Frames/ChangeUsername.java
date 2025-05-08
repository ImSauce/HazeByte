
package Frames;

import Classes.Run;
import Classes.UIcolors;
import Classes.serverCredentials;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class ChangeUsername extends javax.swing.JFrame {
    UIcolors color = new UIcolors();
    Connection con;
    PreparedStatement pst;
    
  

   
    public ChangeUsername(Main mainFrame) {
        initComponents();
        this.con = mainFrame.con;
        color.UIcolor();
        ImageIcon UserIcon = new ImageIcon(getClass().getResource("/Images/usericon.png"));
        setIconImage(UserIcon.getImage());
        setTitle("Change Username");
        setResizable(false);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        ChangeUsernameTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    ChangeUsernameBT.requestFocusInWindow();
                }
            }
        });
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ChangeUsernameBT = new SystemOtherComps.PH_Button();
        ChangeUsernameTXT = new SystemOtherComps.PH_PasswordField();
        changepusernametext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 23, 23));

        jPanel1.setBackground(new java.awt.Color(24, 23, 23));

        ChangeUsernameBT.setBackground(new java.awt.Color(51, 51, 51));
        ChangeUsernameBT.setForeground(new java.awt.Color(251, 251, 251));
        ChangeUsernameBT.setText("Save");
        ChangeUsernameBT.setAAA_ImageBoundArcSize(10);
        ChangeUsernameBT.setAAA_roundBottomLeft(10);
        ChangeUsernameBT.setAAA_roundBottomRight(10);
        ChangeUsernameBT.setAAA_roundTopLeft(10);
        ChangeUsernameBT.setAAA_roundTopRight(10);
        ChangeUsernameBT.setAA_ArcSize(10);
        ChangeUsernameBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        ChangeUsernameBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        ChangeUsernameBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        ChangeUsernameBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        ChangeUsernameBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeUsernameBTActionPerformed(evt);
            }
        });

        ChangeUsernameTXT.setForeground(new java.awt.Color(255, 255, 255));
        ChangeUsernameTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ChangeUsernameTXT.setAA_TextHint("New Username");
        ChangeUsernameTXT.setAB_HintColor(new java.awt.Color(153, 153, 153));
        ChangeUsernameTXT.setAB_LineColor(new java.awt.Color(102, 102, 102));

        changepusernametext.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        changepusernametext.setForeground(new java.awt.Color(255, 255, 255));
        changepusernametext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepusernametext.setText("Change Username");
        changepusernametext.setMaximumSize(new java.awt.Dimension(125, 43));
        changepusernametext.setMinimumSize(new java.awt.Dimension(1235, 43));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(changepusernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ChangeUsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(ChangeUsernameBT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(changepusernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChangeUsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChangeUsernameBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeUsernameBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeUsernameBTActionPerformed
        ChangeUsername();
    }//GEN-LAST:event_ChangeUsernameBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button ChangeUsernameBT;
    private SystemOtherComps.PH_PasswordField ChangeUsernameTXT;
    private javax.swing.JLabel changepusernametext;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    public void ChangeUsername() {
    String newUsername = ChangeUsernameTXT.getText();

    if (newUsername.isEmpty()) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please enter a new username.");
        return;
    }

    try {
        String update = "UPDATE login SET username=? WHERE id=1";
        pst = con.prepareStatement(update);
        pst.setString(1, newUsername);
        pst.executeUpdate();

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Username successfully updated.");

        ChangeUsernameTXT.setText("");
        setVisible(false);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error: " + ex.getMessage());
    }finally {
    try { if (pst != null) pst.close(); } catch (SQLException ignored) {}
    }
}

    
}
