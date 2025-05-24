
package Splash;

import Classes.Run;
import Classes.serverCredentials;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.sqlite.SQLiteDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Frames.Main;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;




public class Login extends javax.swing.JFrame {
        
        private Main mainApp; 
        Connection con = null;
        PreparedStatement pst;

        
        public void connection (){
        //MYSQL CODE-----------------------------------------------
        try 
        {
            Class.forName("org.sqlite.JDBC");
            String dbPath = "database/hazebyteLITE.db";
            File dbFile = new File(dbPath);
            System.out.println("Using database at: " + dbFile.getAbsolutePath());
            con = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            
            

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        //MYSQL CODE-----------------------------------------------

        }
    
   
        
    public Login() {
        initComponents();
        connection();
        
        mainApp = new Main(con);       // Create Main
        mainApp.setVisible(false);
        
        cacheloading();
        ImageIcon logo = new ImageIcon(getClass().getResource("/Images/HB icon.png"));
        setIconImage(logo.getImage());
        setTitle("HazeByte Login");
        setResizable(false);
        
        
        
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    password.requestFocusInWindow();
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    LoginBT.doClick();
                }
            }
        });
        
        Notifications.getInstance().setJFrame(this);
        
        
    }
 
    
    

private void openMainApplicationFrame() {
    java.awt.EventQueue.invokeLater(() -> {
             // Keep it hidden for now
        new Splash.SplashScreen(null, true).setVisible(true);  // Show splash
        mainApp.setVisible(true);
    });
}


    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new Splash.CurvesPanel();
        password = new SystemOtherComps.PH_PasswordField();
        username = new SystemOtherComps.PH_TextField();
        LoginBT = new SystemOtherComps.PH_Button();
        Cart_txt1 = new javax.swing.JLabel();
        Cart_txt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setAA_TextHint("password");
        password.setAB_LineColor(new java.awt.Color(102, 102, 102));

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setAA_TextHint("username");
        username.setAB_LineColor(new java.awt.Color(102, 102, 102));

        LoginBT.setBackground(new java.awt.Color(51, 51, 51));
        LoginBT.setForeground(new java.awt.Color(255, 255, 255));
        LoginBT.setText("Login");
        LoginBT.setAAA_ImageBoundArcSize(10);
        LoginBT.setAAA_roundBottomLeft(10);
        LoginBT.setAAA_roundBottomRight(10);
        LoginBT.setAAA_roundTopLeft(10);
        LoginBT.setAAA_roundTopRight(10);
        LoginBT.setAA_ArcSize(10);
        LoginBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        LoginBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        LoginBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        LoginBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        LoginBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        LoginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTActionPerformed(evt);
            }
        });

        Cart_txt1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Cart_txt1.setForeground(new java.awt.Color(33, 188, 54));
        Cart_txt1.setText("HAZE");

        Cart_txt2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        Cart_txt2.setForeground(new java.awt.Color(255, 255, 255));
        Cart_txt2.setText("BYTE");

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Cart_txt1)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cart_txt2)
                .addGap(151, 151, 151))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Cart_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cart_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTActionPerformed
        String enteredUsername = username.getText().trim();
        char[] enteredPasswordChars = password.getPassword();
        String enteredPassword = new String(enteredPasswordChars);

        // Empty field check
        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Username or password cannot be empty.");
            return;
        }

        String sqlQuery = "SELECT username, password FROM login WHERE id=1";
        try {
            pst = con.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String usernameDB = rs.getString("username");
                String passwordDB = rs.getString("password");

                if (!enteredUsername.equals(usernameDB)|| !enteredPassword.equals(passwordDB)) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Incorrect username or password");
                } else {
                    // Successful login
                    //forConnection(con, url, user, pass);
                    openMainApplicationFrame();
                    setVisible(false);

                }
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, "User not found in the database.");
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_LoginBTActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cart_txt1;
    private javax.swing.JLabel Cart_txt2;
    private SystemOtherComps.PH_Button LoginBT;
    private Splash.CurvesPanel curvesPanel1;
    private SystemOtherComps.PH_PasswordField password;
    private SystemOtherComps.PH_TextField username;
    // End of variables declaration//GEN-END:variables

        public void cacheloading() {
            JDialog loadingDialog = mainApp.createLoadingDialog();

            new Thread(() -> {
     
                SwingUtilities.invokeLater(() -> loadingDialog.setVisible(true));

                try {
                    mainApp.initProds(); // Run the heavy loading here
                } finally {
                    loadingDialog.dispose(); // Close loading popup after loading
                }

            }).start();
        }
    
    }



