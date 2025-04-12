
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

public class ChangePassword extends javax.swing.JFrame {
    UIcolors color = new UIcolors();
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
  

    public void connect() {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP("localhost");
        sv.setUserID("root");
        sv.setPass("");
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP() +"/hazebyte", sv.getUserID(), sv.getPass());
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    public ChangePassword(Main mainFrame) {
        initComponents();
        connect();
        color.UIcolor();
        ImageIcon PasswordIcon = new ImageIcon ("lock.png");
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
                        .addGap(26, 26, 26)
                        .addComponent(changepasswordtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(ChangePassBT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(changepasswordtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ChangePassBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    String currentPassword, newPassword, confirmPassword;

    // Get password values from password fields
    currentPassword = new String(OldPass.getPassword());
    newPassword = new String(NewPass.getPassword());
    confirmPassword = new String(ReNewPass.getPassword());

    // Check for empty fields
    if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill out all password fields.");
        return;
    }

    // Check if new password matches confirmation
    if (!newPassword.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "New password and confirmation do not match.");
        return;
    }

    try {
        // Check if the current password is correct
        String query = "SELECT password FROM login WHERE id = 1";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        if (rs.next()) {
            String storedPassword = rs.getString("password");

            if (!storedPassword.equals(currentPassword)) {
                JOptionPane.showMessageDialog(this, "Incorrect current password.");
                return;
            }
        }

        // Update to new password
        String update = "UPDATE login SET password = ? WHERE id = 1";
        pst = con.prepareStatement(update);
        pst.setString(1, newPassword);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Password successfully updated.");

        // Clear the fields
        OldPass.setText("");
        NewPass.setText("");
        ReNewPass.setText("");

        setVisible(false);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    }
}

    
    
}
