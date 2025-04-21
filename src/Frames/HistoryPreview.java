
package Frames;

import Classes.Run;
import Classes.UIcolors;
import Classes.serverCredentials;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

public class HistoryPreview extends javax.swing.JFrame {

    int add_remove_image = 0;
    private Main main;
    private Connection con;
    public boolean stat = false;
    
    
    File f1 = null;
    String  path1 = null;
    private ImageIcon format1 = null;
    
   
    PreparedStatement pst;
    UIcolors color = new UIcolors();
    
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
    
    public Connection getConnection() {
    return this.con;
    }
    
    public HistoryPreview(Main mainFrame) {
        initComponents();
        this.main = mainFrame;
        this.con = mainFrame.con; 
        connect();
        if (stat == false){
            issuescroll.setVisible(false);
            PreviewReason.setVisible(false);
        }
        PreviewPanel.setVisible(true);
        color.UIcolor();
        ImageIcon PasswordIcon = new ImageIcon ("transparentHB.jpg");
        setIconImage(PasswordIcon.getImage());
        setTitle("Preview");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PreviewPN = new javax.swing.JPanel();
        PreviewPanel = new javax.swing.JPanel();
        DescriptionText = new javax.swing.JLabel();
        DescriptionScroll = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        PreviewImage = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        InfoPanel = new javax.swing.JPanel();
        PreviewCost = new javax.swing.JLabel();
        PreviewQuantity = new javax.swing.JLabel();
        DiscountPercentage = new javax.swing.JLabel();
        PreviewDiscount = new javax.swing.JLabel();
        PreviewSubtotal = new javax.swing.JLabel();
        PreviewTotal = new javax.swing.JLabel();
        PreviewStatus = new javax.swing.JLabel();
        PreviewReason = new javax.swing.JLabel();
        issuescroll = new javax.swing.JScrollPane();
        Issues = new javax.swing.JTextArea();
        pH_TextField1 = new SystemOtherComps.PH_TextField();
        pH_TextField2 = new SystemOtherComps.PH_TextField();
        pH_TextField3 = new SystemOtherComps.PH_TextField();
        pH_TextField4 = new SystemOtherComps.PH_TextField();
        pH_TextField5 = new SystemOtherComps.PH_TextField();
        pH_TextField6 = new SystemOtherComps.PH_TextField();
        categories = new SystemShadowedComp.PH_ComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 412));
        setMinimumSize(new java.awt.Dimension(542, 412));
        setResizable(false);

        PreviewPN.setBackground(new java.awt.Color(24, 23, 23));
        PreviewPN.setForeground(new java.awt.Color(102, 102, 102));

        PreviewPanel.setBackground(new java.awt.Color(24, 23, 23));
        PreviewPanel.setPreferredSize(new java.awt.Dimension(500, 594));

        DescriptionText.setBackground(new java.awt.Color(102, 102, 102));
        DescriptionText.setForeground(new java.awt.Color(102, 102, 102));
        DescriptionText.setText("Description:");

        DescriptionScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        DescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        DescriptionScroll.setToolTipText("");

        Description.setBackground(new java.awt.Color(24, 23, 23));
        Description.setColumns(20);
        Description.setRows(5);
        Description.setText("\n");
        Description.setBorder(null);
        DescriptionScroll.setViewportView(Description);

        PreviewImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aoi.jpg"))); // NOI18N
        PreviewImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreviewImageMouseClicked(evt);
            }
        });

        Category.setForeground(new java.awt.Color(102, 102, 102));
        Category.setText("Category");

        Title.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Name");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PreviewPanelLayout = new javax.swing.GroupLayout(PreviewPanel);
        PreviewPanel.setLayout(PreviewPanelLayout);
        PreviewPanelLayout.setHorizontalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addGroup(PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreviewPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescriptionScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DescriptionText)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PreviewPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(PreviewImage)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PreviewPanelLayout.setVerticalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addGap(42, 42, 42)
                .addComponent(DescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InfoPanel.setBackground(new java.awt.Color(24, 23, 23));

        PreviewCost.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewCost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewCost.setText("Cost:");

        PreviewQuantity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewQuantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewQuantity.setText("Quantity:");

        DiscountPercentage.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        DiscountPercentage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DiscountPercentage.setText("Discount %:");

        PreviewDiscount.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewDiscount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewDiscount.setText("Total Discount:");

        PreviewSubtotal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewSubtotal.setText("Subtotal:");

        PreviewTotal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewTotal.setText("Total:");

        PreviewStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PreviewStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewStatus.setText("Status:");

        PreviewReason.setBackground(new java.awt.Color(102, 102, 102));
        PreviewReason.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PreviewReason.setForeground(new java.awt.Color(102, 102, 102));
        PreviewReason.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreviewReason.setText("Issues:");

        issuescroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        issuescroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        issuescroll.setToolTipText("");

        Issues.setBackground(new java.awt.Color(24, 23, 23));
        Issues.setColumns(20);
        Issues.setRows(5);
        Issues.setText("\n");
        Issues.setBorder(null);
        issuescroll.setViewportView(Issues);

        pH_TextField1.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField1.setText("output");
        pH_TextField1.setAA_TextHint("");
        pH_TextField1.setAB_LineColor(new java.awt.Color(51, 51, 51));

        pH_TextField2.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField2.setText("output");
        pH_TextField2.setAA_TextHint("");
        pH_TextField2.setAB_LineColor(new java.awt.Color(51, 51, 51));

        pH_TextField3.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField3.setText("output");
        pH_TextField3.setAA_TextHint("");
        pH_TextField3.setAB_LineColor(new java.awt.Color(51, 51, 51));

        pH_TextField4.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField4.setText("output");
        pH_TextField4.setAA_TextHint("");
        pH_TextField4.setAB_LineColor(new java.awt.Color(51, 51, 51));

        pH_TextField5.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField5.setText("output");
        pH_TextField5.setAA_TextHint("");
        pH_TextField5.setAB_LineColor(new java.awt.Color(51, 51, 51));

        pH_TextField6.setForeground(new java.awt.Color(255, 255, 255));
        pH_TextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField6.setText("output");
        pH_TextField6.setAA_TextHint("");
        pH_TextField6.setAB_LineColor(new java.awt.Color(51, 51, 51));

        categories.setForeground(new java.awt.Color(255, 255, 255));
        categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sold", "Returned" }));
        categories.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        categories.setAA_lineColor(new java.awt.Color(45, 187, 63));
        categories.setFocusable(false);
        categories.setLabeText("");
        categories.setRequestFocusEnabled(false);
        categories.setVerifyInputWhenFocusTarget(false);
        categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PreviewReason, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InfoPanelLayout.createSequentialGroup()
                                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PreviewSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DiscountPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PreviewTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PreviewDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PreviewQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PreviewCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PreviewStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pH_TextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pH_TextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pH_TextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pH_TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pH_TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pH_TextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categories, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(issuescroll, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pH_TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviewStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PreviewReason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issuescroll, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout PreviewPNLayout = new javax.swing.GroupLayout(PreviewPN);
        PreviewPN.setLayout(PreviewPNLayout);
        PreviewPNLayout.setHorizontalGroup(
            PreviewPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPNLayout.createSequentialGroup()
                .addComponent(PreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        PreviewPNLayout.setVerticalGroup(
            PreviewPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreviewPNLayout.createSequentialGroup()
                .addGroup(PreviewPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PreviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PreviewPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PreviewPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PreviewImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreviewImageMouseClicked
      
    }//GEN-LAST:event_PreviewImageMouseClicked

    private void categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesActionPerformed

    }//GEN-LAST:event_categoriesActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JTextArea Description;
    private javax.swing.JScrollPane DescriptionScroll;
    private javax.swing.JLabel DescriptionText;
    private javax.swing.JLabel DiscountPercentage;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JTextArea Issues;
    private javax.swing.JLabel PreviewCost;
    private javax.swing.JLabel PreviewDiscount;
    private javax.swing.JLabel PreviewImage;
    private javax.swing.JPanel PreviewPN;
    private javax.swing.JPanel PreviewPanel;
    private javax.swing.JLabel PreviewQuantity;
    private javax.swing.JLabel PreviewReason;
    private javax.swing.JLabel PreviewStatus;
    private javax.swing.JLabel PreviewSubtotal;
    private javax.swing.JLabel PreviewTotal;
    private javax.swing.JLabel Title;
    public SystemShadowedComp.PH_ComboBox categories;
    private javax.swing.JScrollPane issuescroll;
    private javax.swing.JPanel jPanel1;
    private SystemOtherComps.PH_TextField pH_TextField1;
    private SystemOtherComps.PH_TextField pH_TextField2;
    private SystemOtherComps.PH_TextField pH_TextField3;
    private SystemOtherComps.PH_TextField pH_TextField4;
    private SystemOtherComps.PH_TextField pH_TextField5;
    private SystemOtherComps.PH_TextField pH_TextField6;
    // End of variables declaration//GEN-END:variables

    

    
    

}
