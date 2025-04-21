
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
    
    
    File f1 = null;
    String  path1 = null;
    private ImageIcon format1 = null;
    
   
    PreparedStatement pst;
    UIcolors color = new UIcolors();
    
  
   
    public HistoryPreview(Main mainFrame) {
        initComponents();
        this.main = mainFrame;
        this.con = mainFrame.con; 
        Add.setVisible(true);
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

        Add = new javax.swing.JPanel();
        AddCost = new SystemOtherComps.PH_TextField();
        AddNameText = new javax.swing.JLabel();
        AddCostText = new javax.swing.JLabel();
        AddName = new SystemOtherComps.PH_TextField();
        AddCategoryText = new javax.swing.JLabel();
        AddDescriptionText = new javax.swing.JLabel();
        AddDescriptionScroll = new javax.swing.JScrollPane();
        AddDescription = new javax.swing.JTextArea();
        AddDiscount = new SystemOtherComps.PH_TextField();
        AddDiscountText = new javax.swing.JLabel();
        AddImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 640));
        getContentPane().setLayout(new java.awt.CardLayout());

        Add.setBackground(new java.awt.Color(24, 23, 23));
        Add.setPreferredSize(new java.awt.Dimension(500, 594));

        AddCost.setBackground(new java.awt.Color(24, 23, 23));
        AddCost.setForeground(new java.awt.Color(255, 255, 255));
        AddCost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AddCost.setAAA_roundBottomLeft(20);
        AddCost.setAAA_roundBottomRight(20);
        AddCost.setAAA_roundTopLeft(20);
        AddCost.setAAA_roundTopRight(20);
        AddCost.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        AddCost.setAA_DrawBorder(true);
        AddCost.setAA_DrawBottomBorder(true);
        AddCost.setAA_DrawLeftBorder(true);
        AddCost.setAA_DrawLine(false);
        AddCost.setAA_DrawRightBorder(true);
        AddCost.setAA_DrawTopBorder(true);
        AddCost.setAA_TextHint("   Enter Cost");
        AddCost.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        AddNameText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddNameText.setText(" Name:");

        AddCostText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddCostText.setText("Cost:");

        AddName.setBackground(new java.awt.Color(24, 23, 23));
        AddName.setForeground(new java.awt.Color(255, 255, 255));
        AddName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AddName.setAAA_roundBottomLeft(20);
        AddName.setAAA_roundBottomRight(20);
        AddName.setAAA_roundTopLeft(20);
        AddName.setAAA_roundTopRight(20);
        AddName.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        AddName.setAA_DrawBorder(true);
        AddName.setAA_DrawBottomBorder(true);
        AddName.setAA_DrawLeftBorder(true);
        AddName.setAA_DrawLine(false);
        AddName.setAA_DrawRightBorder(true);
        AddName.setAA_DrawTopBorder(true);
        AddName.setAA_TextHint("   Enter Name");
        AddName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        AddCategoryText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddCategoryText.setText("Category:");

        AddDescriptionText.setForeground(new java.awt.Color(255, 255, 255));
        AddDescriptionText.setText("Description:");

        AddDescriptionScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        AddDescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        AddDescriptionScroll.setToolTipText("");

        AddDescription.setBackground(new java.awt.Color(24, 23, 23));
        AddDescription.setColumns(20);
        AddDescription.setRows(5);
        AddDescription.setText("\n");
        AddDescription.setBorder(null);
        AddDescriptionScroll.setViewportView(AddDescription);

        AddDiscount.setEditable(false);
        AddDiscount.setBackground(new java.awt.Color(24, 23, 23));
        AddDiscount.setForeground(new java.awt.Color(255, 255, 255));
        AddDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AddDiscount.setText("0%");
        AddDiscount.setAAA_roundBottomLeft(20);
        AddDiscount.setAAA_roundBottomRight(20);
        AddDiscount.setAAA_roundTopLeft(20);
        AddDiscount.setAAA_roundTopRight(20);
        AddDiscount.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        AddDiscount.setAA_DrawBorder(true);
        AddDiscount.setAA_DrawBottomBorder(true);
        AddDiscount.setAA_DrawLeftBorder(true);
        AddDiscount.setAA_DrawLine(false);
        AddDiscount.setAA_DrawRightBorder(true);
        AddDiscount.setAA_DrawTopBorder(true);
        AddDiscount.setAA_TextHint("");
        AddDiscount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        AddDiscountText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddDiscountText.setText("Discount:");

        AddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insertimage.jpg"))); // NOI18N
        AddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addComponent(AddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddNameText)
                                    .addComponent(AddCostText)))
                            .addComponent(AddCategoryText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(AddDiscountText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddCost, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AddDescriptionText))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNameText)
                            .addComponent(AddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCostText)
                            .addComponent(AddCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDiscountText))
                        .addGap(35, 35, 35)
                        .addComponent(AddCategoryText)))
                .addGap(12, 12, 12)
                .addComponent(AddDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(Add, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddImageMouseClicked
      
    }//GEN-LAST:event_AddImageMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JLabel AddCategoryText;
    private SystemOtherComps.PH_TextField AddCost;
    private javax.swing.JLabel AddCostText;
    private javax.swing.JTextArea AddDescription;
    private javax.swing.JScrollPane AddDescriptionScroll;
    private javax.swing.JLabel AddDescriptionText;
    private SystemOtherComps.PH_TextField AddDiscount;
    private javax.swing.JLabel AddDiscountText;
    private javax.swing.JLabel AddImage;
    private SystemOtherComps.PH_TextField AddName;
    private javax.swing.JLabel AddNameText;
    // End of variables declaration//GEN-END:variables

    

    
    

}
