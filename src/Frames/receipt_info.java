
package Frames;

import Classes.Run;
import Classes.UIcolors;
import Classes.serverCredentials;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class receipt_info extends javax.swing.JFrame {
    UIcolors color = new UIcolors();
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
 
    public receipt_info(Main mainFrame) {
        initComponents();
        color.UIcolor();
        this.con = mainFrame.con;
        ImageIcon PasswordIcon = new ImageIcon(getClass().getResource("/Images/receipt.png"));
        setIconImage(PasswordIcon.getImage());
        setTitle("Receipt Info");
        setResizable(false);
        
        receipt_information();
        
        
        companyname.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    companyaddress.requestFocusInWindow();
                }
            }
        });
        
        
        companyaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    productwarranty.requestFocusInWindow();
                }
            }
        });
        
        productwarranty.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    SaveBT.requestFocusInWindow();
                }
            }
        });
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SaveBT = new SystemOtherComps.PH_Button();
        changepasswordtext1 = new javax.swing.JLabel();
        companyname = new SystemOtherComps.PH_TextField();
        companyaddress = new SystemOtherComps.PH_TextField();
        productwarranty = new SystemOtherComps.PH_TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 23, 23));

        jPanel1.setBackground(new java.awt.Color(24, 23, 23));

        SaveBT.setBackground(new java.awt.Color(51, 51, 51));
        SaveBT.setForeground(new java.awt.Color(251, 251, 251));
        SaveBT.setText("Save");
        SaveBT.setAAA_ImageBoundArcSize(10);
        SaveBT.setAAA_roundBottomLeft(10);
        SaveBT.setAAA_roundBottomRight(10);
        SaveBT.setAAA_roundTopLeft(10);
        SaveBT.setAAA_roundTopRight(10);
        SaveBT.setAA_ArcSize(10);
        SaveBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        SaveBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        SaveBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        SaveBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        SaveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTActionPerformed(evt);
            }
        });

        changepasswordtext1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        changepasswordtext1.setForeground(new java.awt.Color(255, 255, 255));
        changepasswordtext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepasswordtext1.setText("Modify Receipt");
        changepasswordtext1.setMaximumSize(new java.awt.Dimension(125, 43));
        changepasswordtext1.setMinimumSize(new java.awt.Dimension(1235, 43));

        companyname.setForeground(new java.awt.Color(255, 255, 255));
        companyname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        companyname.setAA_TextHint("Company Name");
        companyname.setAB_HintColor(new java.awt.Color(153, 153, 153));
        companyname.setAB_LineColor(new java.awt.Color(51, 51, 51));

        companyaddress.setForeground(new java.awt.Color(255, 255, 255));
        companyaddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        companyaddress.setAA_TextHint("Address");
        companyaddress.setAB_HintColor(new java.awt.Color(153, 153, 153));
        companyaddress.setAB_LineColor(new java.awt.Color(51, 51, 51));

        productwarranty.setForeground(new java.awt.Color(255, 255, 255));
        productwarranty.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        productwarranty.setAA_TextHint("Warranty (days)");
        productwarranty.setAB_HintColor(new java.awt.Color(153, 153, 153));
        productwarranty.setAB_LineColor(new java.awt.Color(51, 51, 51));

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
                        .addGap(120, 120, 120)
                        .addComponent(SaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productwarranty, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(companyaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(companyname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changepasswordtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(companyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productwarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTActionPerformed
        Save();
    }//GEN-LAST:event_SaveBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button SaveBT;
    private javax.swing.JLabel changepasswordtext1;
    private SystemOtherComps.PH_TextField companyaddress;
    private SystemOtherComps.PH_TextField companyname;
    private javax.swing.JPanel jPanel1;
    private SystemOtherComps.PH_TextField productwarranty;
    // End of variables declaration//GEN-END:variables

    
    
    public void receipt_information() {
        String sql = "SELECT * FROM receipts";
        String company = "";
        String address = "";
        String warranty = "";
       try (
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql)
       ) {
           while (rs.next()) {
               company = rs.getString("company");
               address = rs.getString("address");
               warranty = rs.getString("warranty");

           }
           companyname.setText(company);
           companyaddress.setText(address);
           productwarranty.setText(warranty);

       } catch (SQLException e) {
           System.out.println("Failed to fetch users: " + e.getMessage());
       }
    }
    
    
    public void Save() {
    
    String company = companyname.getText();
    String address = companyaddress.getText();
    String warranty = productwarranty.getText();


    try {
       
        // Update password
        String update = "UPDATE receipts SET company=? , address=?, warranty=?  WHERE id = 1";
        
        pst = con.prepareStatement(update);
        pst.setString(1, company);
        pst.setString(2, address);
        pst.setString(3, warranty);
        pst.executeUpdate();

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Saved");

        // Clear the fields
        companyname.setText("");
        companyaddress.setText("");
        productwarranty.setText("");

        setVisible(false); // Close the window

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Database error: " + ex.getMessage());
    }finally {
    try { if (pst != null) pst.close(); } catch (SQLException ignored) {}
    }
}


    
    
}
