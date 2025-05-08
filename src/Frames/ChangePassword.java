
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

public class ChangePassword extends javax.swing.JFrame {
    UIcolors color = new UIcolors();
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
 
    public ChangePassword(Main mainFrame) {
        initComponents();
        color.UIcolor();
        this.con = mainFrame.con;
        ImageIcon PasswordIcon = new ImageIcon(getClass().getResource("/Images/lock.png"));
        setIconImage(PasswordIcon.getImage());
        setTitle("Change Password");
        setResizable(false);
        
        
        OldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    NewPass.requestFocusInWindow();
                }
            }
        });
        
        
        NewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    ReNewPass.requestFocusInWindow();
                }
            }
        });
        
        ReNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    ChangePassBT.requestFocusInWindow();
                }
            }
        });
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ChangePassBT = new SystemOtherComps.PH_Button();
        ReNewPass = new SystemOtherComps.PH_PasswordField();
        NewPass = new SystemOtherComps.PH_PasswordField();
        OldPass = new SystemOtherComps.PH_PasswordField();
        changepasswordtext1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 23, 23));

        jPanel1.setBackground(new java.awt.Color(24, 23, 23));

        ChangePassBT.setBackground(new java.awt.Color(51, 51, 51));
        ChangePassBT.setForeground(new java.awt.Color(251, 251, 251));
        ChangePassBT.setText("Save");
        ChangePassBT.setAAA_ImageBoundArcSize(10);
        ChangePassBT.setAAA_roundBottomLeft(10);
        ChangePassBT.setAAA_roundBottomRight(10);
        ChangePassBT.setAAA_roundTopLeft(10);
        ChangePassBT.setAAA_roundTopRight(10);
        ChangePassBT.setAA_ArcSize(10);
        ChangePassBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        ChangePassBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        ChangePassBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        ChangePassBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        ChangePassBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassBTActionPerformed(evt);
            }
        });

        ReNewPass.setForeground(new java.awt.Color(255, 255, 255));
        ReNewPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ReNewPass.setAA_TextHint(" Re-type new password");
        ReNewPass.setAB_HintColor(new java.awt.Color(153, 153, 153));
        ReNewPass.setAB_LineColor(new java.awt.Color(102, 102, 102));

        NewPass.setForeground(new java.awt.Color(255, 255, 255));
        NewPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NewPass.setAA_TextHint("New password");
        NewPass.setAB_HintColor(new java.awt.Color(153, 153, 153));
        NewPass.setAB_LineColor(new java.awt.Color(102, 102, 102));

        OldPass.setForeground(new java.awt.Color(255, 255, 255));
        OldPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        OldPass.setAA_TextHint("Current password");
        OldPass.setAB_HintColor(new java.awt.Color(153, 153, 153));
        OldPass.setAB_LineColor(new java.awt.Color(102, 102, 102));

        changepasswordtext1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        changepasswordtext1.setForeground(new java.awt.Color(255, 255, 255));
        changepasswordtext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepasswordtext1.setText("Change Password");
        changepasswordtext1.setMaximumSize(new java.awt.Dimension(125, 43));
        changepasswordtext1.setMinimumSize(new java.awt.Dimension(1235, 43));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(changepasswordtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(ChangePassBT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changepasswordtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChangePassBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePassBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassBTActionPerformed
        ChangePass();
    }//GEN-LAST:event_ChangePassBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button ChangePassBT;
    private SystemOtherComps.PH_PasswordField NewPass;
    private SystemOtherComps.PH_PasswordField OldPass;
    private SystemOtherComps.PH_PasswordField ReNewPass;
    private javax.swing.JLabel changepasswordtext1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    public void ChangePass() {
    String currentPassword = new String(OldPass.getPassword());
    String newPassword = new String(NewPass.getPassword());
    String confirmPassword = new String(ReNewPass.getPassword());

    // Empty fields check
    if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please fill out all password fields.");
        return;
    }

    // Password mismatch check
    if (!newPassword.equals(confirmPassword)) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "New password and confirmation do not match.");
        return;
    }

    try {
        // Verify current password
        String query = "SELECT password FROM login WHERE id = 1";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        if (rs.next()) {
            String storedPassword = rs.getString("password");

            if (!storedPassword.equals(currentPassword)) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Incorrect current password.");
                return;
            }
        }

        // Update password
        String update = "UPDATE login SET password = ? WHERE id = 1";
        pst = con.prepareStatement(update);
        pst.setString(1, newPassword);
        pst.executeUpdate();

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Password successfully updated.");

        // Clear the fields
        OldPass.setText("");
        NewPass.setText("");
        ReNewPass.setText("");

        setVisible(false); // Close the window

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Database error: " + ex.getMessage());
    }finally {
    try { if (pst != null) pst.close(); } catch (SQLException ignored) {}
    }
}


    
    
}
