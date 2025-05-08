
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

public class AddProduct extends javax.swing.JFrame {

    int add_remove_image = 0;
    private Main main;
    private Connection con;
    
    
    File f1 = null;
    String  path1 = null;
    private ImageIcon format1 = null;
    
   
    PreparedStatement pst;
    UIcolors color = new UIcolors();
    
    public Connection getConnection() {
    return this.con;
    }
    
    public AddProduct(Main mainFrame) {
        initComponents();
        this.main = mainFrame;
        this.con = mainFrame.con; 

        autoIncrement();
        hidden.setVisible(false);
        Add.setVisible(true);
        color.UIcolor();
        ImageIcon AddIcon = new ImageIcon(getClass().getResource("/Images/transparentHB.jpg"));
        setIconImage(AddIcon.getImage());
        setTitle("Add Product");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        
    }
    
    @Override
        public void dispose() {
            // Clean up anything needed, but NOT the connection
            super.dispose();
            System.out.println("Ovveride closed");
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hidden = new javax.swing.JPanel();
        addimagetool = new javax.swing.JPanel();
        AddID = new javax.swing.JLabel();
        iddesc = new javax.swing.JLabel();
        imagenamedesk = new javax.swing.JLabel();
        imagepathdesc = new javax.swing.JLabel();
        add_imageName = new javax.swing.JLabel();
        add_imagePath = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        AddBar = new javax.swing.JPanel();
        AddBT2 = new javax.swing.JLabel();
        AddCost = new SystemOtherComps.PH_TextField();
        AddNameText = new javax.swing.JLabel();
        AddBT = new SystemOtherComps.PH_Button();
        CancelBT = new SystemOtherComps.PH_Button();
        AddCostText = new javax.swing.JLabel();
        AddName = new SystemOtherComps.PH_TextField();
        AddCategoryText = new javax.swing.JLabel();
        AddCategory = new SystemShadowedComp.PH_ComboBox();
        AddDescriptionText = new javax.swing.JLabel();
        AddDescriptionScroll = new javax.swing.JScrollPane();
        AddDescription = new javax.swing.JTextArea();
        AddDiscount = new SystemOtherComps.PH_TextField();
        AddDiscountText = new javax.swing.JLabel();
        AddImage = new javax.swing.JLabel();
        incrementBT = new SystemOtherComps.PH_Button();
        decrementBT = new SystemOtherComps.PH_Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 640));
        setMinimumSize(new java.awt.Dimension(650, 640));
        setPreferredSize(new java.awt.Dimension(650, 640));
        getContentPane().setLayout(new java.awt.CardLayout());

        hidden.setPreferredSize(new java.awt.Dimension(400, 594));

        addimagetool.setBackground(new java.awt.Color(102, 102, 102));

        AddID.setText("0");

        iddesc.setText("id");

        imagenamedesk.setText("imgname");

        imagepathdesc.setText("imgpath");

        add_imageName.setText("a");

        add_imagePath.setText("a");

        javax.swing.GroupLayout addimagetoolLayout = new javax.swing.GroupLayout(addimagetool);
        addimagetool.setLayout(addimagetoolLayout);
        addimagetoolLayout.setHorizontalGroup(
            addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addimagetoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addimagetoolLayout.createSequentialGroup()
                        .addComponent(iddesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addimagetoolLayout.createSequentialGroup()
                        .addComponent(imagenamedesk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_imageName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addimagetoolLayout.createSequentialGroup()
                        .addComponent(imagepathdesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        addimagetoolLayout.setVerticalGroup(
            addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addimagetoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddID)
                    .addComponent(iddesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagenamedesk)
                    .addComponent(add_imageName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addimagetoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagepathdesc)
                    .addComponent(add_imagePath))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hiddenLayout = new javax.swing.GroupLayout(hidden);
        hidden.setLayout(hiddenLayout);
        hiddenLayout.setHorizontalGroup(
            hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
            .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hiddenLayout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(addimagetool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        hiddenLayout.setVerticalGroup(
            hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hiddenLayout.createSequentialGroup()
                    .addGap(247, 247, 247)
                    .addComponent(addimagetool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        getContentPane().add(hidden, "card3");

        Add.setBackground(new java.awt.Color(24, 23, 23));
        Add.setPreferredSize(new java.awt.Dimension(500, 594));

        AddBar.setBackground(new java.awt.Color(24, 23, 23));

        AddBT2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        AddBT2.setForeground(new java.awt.Color(255, 255, 255));
        AddBT2.setText("Add Product");

        javax.swing.GroupLayout AddBarLayout = new javax.swing.GroupLayout(AddBar);
        AddBar.setLayout(AddBarLayout);
        AddBarLayout.setHorizontalGroup(
            AddBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(AddBT2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddBarLayout.setVerticalGroup(
            AddBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBT2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        AddBT.setBackground(new java.awt.Color(32, 180, 52));
        AddBT.setForeground(new java.awt.Color(255, 255, 255));
        AddBT.setText("Add");
        AddBT.setAAA_ImageBoundArcSize(10);
        AddBT.setAAA_roundBottomLeft(10);
        AddBT.setAAA_roundBottomRight(10);
        AddBT.setAAA_roundTopLeft(10);
        AddBT.setAAA_roundTopRight(10);
        AddBT.setAA_ArcSize(10);
        AddBT.setAA_ButtonColor(new java.awt.Color(32, 180, 52));
        AddBT.setAA_HoverColor(new java.awt.Color(95, 219, 112));
        AddBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        AddBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        AddBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        AddBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTActionPerformed(evt);
            }
        });

        CancelBT.setBackground(new java.awt.Color(24, 23, 23));
        CancelBT.setText("Cancel");
        CancelBT.setAAA_ImageBoundArcSize(10);
        CancelBT.setAAA_roundBottomLeft(10);
        CancelBT.setAAA_roundBottomRight(10);
        CancelBT.setAAA_roundTopLeft(10);
        CancelBT.setAAA_roundTopRight(10);
        CancelBT.setAA_ArcSize(10);
        CancelBT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        CancelBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        CancelBT.setAA_DrawBorder(true);
        CancelBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        CancelBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        CancelBT.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        CancelBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTActionPerformed(evt);
            }
        });

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

        AddCategory.setForeground(new java.awt.Color(255, 255, 255));
        AddCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
        AddCategory.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        AddCategory.setAA_lineColor(new java.awt.Color(45, 187, 63));
        AddCategory.setFocusable(false);
        AddCategory.setLabeText("    ");
        AddCategory.setRequestFocusEnabled(false);
        AddCategory.setVerifyInputWhenFocusTarget(false);

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

        incrementBT.setBackground(new java.awt.Color(38, 38, 38));
        incrementBT.setForeground(new java.awt.Color(255, 255, 255));
        incrementBT.setText("+");
        incrementBT.setAA_ButtonColor(new java.awt.Color(38, 38, 38));
        incrementBT.setAA_HoverColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_RippleColor(new java.awt.Color(71, 70, 70));
        incrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                incrementBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                incrementBTMouseReleased(evt);
            }
        });
        incrementBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementBTActionPerformed(evt);
            }
        });

        decrementBT.setBackground(new java.awt.Color(38, 38, 38));
        decrementBT.setForeground(new java.awt.Color(255, 255, 255));
        decrementBT.setText("-");
        decrementBT.setAA_ButtonColor(new java.awt.Color(38, 38, 38));
        decrementBT.setAA_HoverColor(new java.awt.Color(54, 53, 53));
        decrementBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        decrementBT.setAA_RippleColor(new java.awt.Color(71, 70, 70));
        decrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                decrementBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                decrementBTMouseReleased(evt);
            }
        });
        decrementBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddLayout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(AddLayout.createSequentialGroup()
                                                .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(AddDescriptionText))))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(AddBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addComponent(AddBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddDiscountText))
                            .addGroup(AddLayout.createSequentialGroup()
                                .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddCategoryText))))
                .addGap(12, 12, 12)
                .addComponent(AddDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Add, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTActionPerformed
        AddProduct();
        

    }//GEN-LAST:event_AddBTActionPerformed

    private void CancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTActionPerformed
        ClearAdd();
    }//GEN-LAST:event_CancelBTActionPerformed

    private void AddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddImageMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            try{
                add_imagePath.setText(""); // Clear the text
                add_imageName.setText("");
                AddImage.setIcon(new ImageIcon(getClass().getResource("/Images/insertimage.jpg")));   

                add_remove_image = 1;

            }catch(Exception e){}
        }else{
            AddImage();
            add_remove_image=0;
        }
    }//GEN-LAST:event_AddImageMouseClicked

    
    private Timer holdIncrementTimer;
    private Timer holdDecrementTimer;
    private void incrementBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementBTMousePressed
        if (holdIncrementTimer == null || !holdIncrementTimer.isRunning()) {
            holdIncrementTimer = new Timer(5, e -> {
                try {
                    // Remove "%" before parsing
                    String text = AddDiscount.getText().replace("%", "").trim();
                    int value = Integer.parseInt(text);

                    if (value < 100) {
                        value++;
                        AddDiscount.setText(value + "%");
                    }

                    if (value >= 100) {
                        holdIncrementTimer.stop(); // Stop timer at 100
                    }
                } catch (NumberFormatException ex) {
                    AddDiscount.setText("0%");
                }
            });
            holdIncrementTimer.setInitialDelay(200); // Delay before auto increment starts
            holdIncrementTimer.start();
        }
    }//GEN-LAST:event_incrementBTMousePressed

    private void incrementBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementBTMouseReleased
        if (holdIncrementTimer != null && holdIncrementTimer.isRunning()) {
            holdIncrementTimer.stop();
        }
    }//GEN-LAST:event_incrementBTMouseReleased

    private void incrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementBTActionPerformed
        String text = AddDiscount.getText().replace("%", "").trim();
        int plus = Integer.parseInt(text);

        if (plus < 100) {
            plus += 1;
            AddDiscount.setText(plus + "%");
        } else {
            AddDiscount.setText("100%");
        }
    }//GEN-LAST:event_incrementBTActionPerformed

    private void decrementBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementBTMousePressed
        if (holdDecrementTimer == null || !holdDecrementTimer.isRunning()) {
            holdDecrementTimer = new Timer(5, e -> {
                try {
                    // Remove "%" before parsing
                    String text = AddDiscount.getText().replace("%", "").trim();
                    int value = Integer.parseInt(text);

                    // Decrease value but not below 1
                    if (value > 0) {
                        value--;
                        AddDiscount.setText(value + "%");
                    }
                } catch (NumberFormatException ex) {
                    AddDiscount.setText("1%");
                }
            });
            holdDecrementTimer.setInitialDelay(200); // Delay before auto decrement starts
            holdDecrementTimer.start();
        }
    }//GEN-LAST:event_decrementBTMousePressed

    private void decrementBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementBTMouseReleased
        if (holdDecrementTimer != null && holdDecrementTimer.isRunning()) {
            holdDecrementTimer.stop();
        }
    }//GEN-LAST:event_decrementBTMouseReleased

    private void decrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementBTActionPerformed
        String text = AddDiscount.getText().replace("%", "").trim();
        int plus = Integer.parseInt(text);
        if (plus > 0) {

            plus -= 1;
            AddDiscount.setText(Integer.toString(plus)+ "%");

        }else {
            //add sound
        }
    }//GEN-LAST:event_decrementBTActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private SystemOtherComps.PH_Button AddBT;
    private javax.swing.JLabel AddBT2;
    private javax.swing.JPanel AddBar;
    public SystemShadowedComp.PH_ComboBox AddCategory;
    private javax.swing.JLabel AddCategoryText;
    private SystemOtherComps.PH_TextField AddCost;
    private javax.swing.JLabel AddCostText;
    private javax.swing.JTextArea AddDescription;
    private javax.swing.JScrollPane AddDescriptionScroll;
    private javax.swing.JLabel AddDescriptionText;
    private SystemOtherComps.PH_TextField AddDiscount;
    private javax.swing.JLabel AddDiscountText;
    public javax.swing.JLabel AddID;
    private javax.swing.JLabel AddImage;
    private SystemOtherComps.PH_TextField AddName;
    private javax.swing.JLabel AddNameText;
    private SystemOtherComps.PH_Button CancelBT;
    public javax.swing.JLabel add_imageName;
    public javax.swing.JLabel add_imagePath;
    private javax.swing.JPanel addimagetool;
    private SystemOtherComps.PH_Button decrementBT;
    private javax.swing.JPanel hidden;
    private javax.swing.JLabel iddesc;
    private javax.swing.JLabel imagenamedesk;
    private javax.swing.JLabel imagepathdesc;
    private SystemOtherComps.PH_Button incrementBT;
    // End of variables declaration//GEN-END:variables

    

    
    
    public void AddProduct() {

        if (!validateFields()) {
           return; // Stop execution if all textbox are not inputted
       }
                String query = "INSERT INTO product(`id`,`name`, `cost`, `discount`, `category`, `description`, `imageName`, `imagePath`, `imageFile`) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
            
               try {

               pst = con.prepareStatement(query); 
               pst.setString(1, AddID.getText()); 
               pst.setString(2, AddName.getText());      
               pst.setDouble(3, Double.parseDouble(AddCost.getText()));  
               pst.setDouble(4, Double.parseDouble(AddDiscount.getText().replace("%", "").trim()));  
               pst.setString(5, AddCategory.getSelectedItem().toString()); 
               pst.setString(6, AddDescription.getText());  
               pst.setString(7, "");  
               pst.setString(8, ""); 
               pst.setString(9, "");  
               pst.executeUpdate();

         
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,"New Product Added");
               ClearAdd();
               
               if (add_remove_image ==1){
                emptyBlobFile(AddID.getText());
                
                }else{
             saveImageToDatabase(f1, path1);
             }
                add_remove_image=0;
                
                
            
            add_imagePath.setText(""); // Clear the text
            add_imageName.setText("");
            AddImage.setIcon(new ImageIcon(getClass().getResource("/Images/insertimage.jpg")));           
            autoIncrement();
            main.initProds();
            main.EditRefreshTable();
            
         } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "Error adding product: " + ex.getMessage());
         }finally {
            try { if (pst != null) pst.close(); System.out.println("db closed");} catch (SQLException ignored) {}
        }
               
    }
 
    private boolean validateFields() {
        // Check if any required fields are empty
        if (AddName.getText().isEmpty() || AddCost.getText().isEmpty() || AddDiscount.getText().isEmpty() ||
            AddCategory.getSelectedItem() == null || AddDescription.getText().isEmpty()) {   
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // If any field is empty, return false
        }
        return true; // If all fields are filled, return true
    }

    public void ClearAdd(){
        AddName.setText("");
        AddCost.setText("");
        AddDiscount.setText("0%");
        AddCategory.setSelectedItem("Action");
        AddDescription.setText("");
        
    }


    
    
    
    
    
    public void autoIncrement() {
    String query = "SELECT MAX(id) AS id FROM product";
    
    try (PreparedStatement stmt = con.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {
        
        int increment = 1; // default if no rows
        
        if (rs.next()) {
            int highestID = rs.getInt("id");
            if (!rs.wasNull()) {
                increment = highestID + 1;
            }
        }

        AddID.setText(Integer.toString(increment));
        
    } catch (SQLException ex) {
        ex.printStackTrace(); // Handle or log the exception appropriately
    } 
}
    
    
    
    private void AddImage(){
    
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","gif");
        fileChooser.setFileFilter(imageFilter);
        int load = fileChooser.showOpenDialog(null);

        if (load == JFileChooser.APPROVE_OPTION) {
            f1 = fileChooser.getSelectedFile();
            path1 = f1.getAbsolutePath();
            String imageName = f1.getName();
            add_imageName.setText(imageName);
            add_imagePath.setText(path1);
            ImageIcon ii = new ImageIcon(path1);
            Image img = ii.getImage().getScaledInstance(211, 217, Image.SCALE_SMOOTH);
            AddImage.setIcon(new ImageIcon(img));


        }
    } 
    
    
    private void saveImageToDatabase(File file, String path) {
    String ID = AddID.getText();
    if (file != null && path != null && !path.isEmpty()) {
        try {
            FileInputStream fis = new FileInputStream(file);
            String query = "UPDATE product SET imageName = ?, imagePath = ?, imageFile = ? WHERE id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, file.getName());
            pst.setString(2, path);
            pst.setBinaryStream(3, fis, (int) file.length());
            pst.setString(4, ID);
            pst.executeUpdate();

            // --- Save to Cache Directory ---
            BufferedImage buffered = ImageIO.read(file);
            if (buffered != null) {
                // Resize image
                Image scaledImg = buffered.getScaledInstance(218, 218, Image.SCALE_SMOOTH);
                BufferedImage resizedBuffered = new BufferedImage(218, 218, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = resizedBuffered.createGraphics();
                g2d.drawImage(scaledImg, 0, 0, null);
                g2d.dispose();

                // Cache path
                String userHome = System.getProperty("user.home");
                File cacheDir = new File(userHome + "/HazeByteCache/");
                if (!cacheDir.exists()) {
                    cacheDir.mkdirs();
                }

                File outputFile = new File(cacheDir, ID + ".png");
                ImageIO.write(resizedBuffered, "png", outputFile);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error caching image: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saving image to database: " + ex.getMessage());
        }
    }
}



public void emptyBlobFile(String id) {
    try {
        String sql = "UPDATE product SET imageFile = ? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBytes(1, new byte[0]); // Empty byte array instead of NULL
        ps.setString(2, id);
        ps.executeUpdate();

        // Also delete the cached image file
        String userHome = System.getProperty("user.home");
        File cacheImage = new File(userHome + "/HazeByteCache/" + id + ".png");
        if (cacheImage.exists()) {
            cacheImage.delete();
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error removing image blob: " + ex.getMessage());
    }
}

    
    
    
    
    

}
