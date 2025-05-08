
package Frames;

import Classes.Run;
import Classes.UIcolors;
import Classes.serverCredentials;
import java.awt.Color;
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
    public int prevID;
    
    
    File f1 = null;
    String  path1 = null;
    private ImageIcon format1 = null;
    
   
    PreparedStatement pst;
    UIcolors color = new UIcolors();
    
    
    public HistoryPreview(Main mainFrame) {
        initComponents();
        this.main = mainFrame;
        this.con = mainFrame.con; 

        if (stat == false){
            issuescroll.setVisible(false);
            PreviewReason.setVisible(false);
        }
        PreviewPanel.setVisible(true);
        status.setForeground(new Color(118, 199, 102));
        color.UIcolor();
        ImageIcon HistoryIcon = new ImageIcon(getClass().getResource("/Images/transparentHB.jpg"));
        setIconImage(HistoryIcon.getImage());
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
        line = new javax.swing.JPanel();
        receipttxt = new javax.swing.JLabel();
        receipt = new javax.swing.JLabel();
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
        cost = new SystemOtherComps.PH_TextField();
        quantity = new SystemOtherComps.PH_TextField();
        discountper = new SystemOtherComps.PH_TextField();
        discount = new SystemOtherComps.PH_TextField();
        subtotal = new SystemOtherComps.PH_TextField();
        total = new SystemOtherComps.PH_TextField();
        status = new SystemShadowedComp.PH_ComboBox();

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

        DescriptionScroll.setBorder(null);
        DescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        DescriptionScroll.setToolTipText("");

        Description.setEditable(false);
        Description.setBackground(new java.awt.Color(24, 23, 23));
        Description.setColumns(20);
        Description.setRows(5);
        Description.setText("\n");
        Description.setBorder(null);
        DescriptionScroll.setViewportView(Description);

        Category.setForeground(new java.awt.Color(102, 102, 102));
        Category.setText("Category");

        Title.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Name");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        line.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        receipttxt.setBackground(new java.awt.Color(102, 102, 102));
        receipttxt.setForeground(new java.awt.Color(255, 255, 255));
        receipttxt.setText("Receipt No:");

        receipt.setBackground(new java.awt.Color(102, 102, 102));
        receipt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PreviewPanelLayout = new javax.swing.GroupLayout(PreviewPanel);
        PreviewPanel.setLayout(PreviewPanelLayout);
        PreviewPanelLayout.setHorizontalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DescriptionText)
                    .addGroup(PreviewPanelLayout.createSequentialGroup()
                        .addComponent(receipttxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(receipt))
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Category, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(DescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviewImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PreviewPanelLayout.setVerticalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreviewPanelLayout.createSequentialGroup()
                        .addGroup(PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receipttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Category)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescriptionText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        Issues.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                IssuesCaretUpdate(evt);
            }
        });
        issuescroll.setViewportView(Issues);

        cost.setEditable(false);
        cost.setForeground(new java.awt.Color(255, 255, 255));
        cost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cost.setAA_TextHint("");
        cost.setAB_LineColor(new java.awt.Color(51, 51, 51));

        quantity.setEditable(false);
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        quantity.setAA_TextHint("");
        quantity.setAB_LineColor(new java.awt.Color(51, 51, 51));

        discountper.setEditable(false);
        discountper.setForeground(new java.awt.Color(255, 255, 255));
        discountper.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        discountper.setAA_TextHint("");
        discountper.setAB_LineColor(new java.awt.Color(51, 51, 51));

        discount.setEditable(false);
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        discount.setAA_TextHint("");
        discount.setAB_LineColor(new java.awt.Color(51, 51, 51));

        subtotal.setEditable(false);
        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        subtotal.setAA_TextHint("");
        subtotal.setAB_LineColor(new java.awt.Color(51, 51, 51));

        total.setEditable(false);
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        total.setAA_TextHint("");
        total.setAB_LineColor(new java.awt.Color(51, 51, 51));

        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sold", "Refunded" }));
        status.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        status.setAA_lineColor(new java.awt.Color(45, 187, 63));
        status.setFocusable(false);
        status.setLabeText("");
        status.setRequestFocusEnabled(false);
        status.setVerifyInputWhenFocusTarget(false);
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreviewReason, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discountper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addComponent(issuescroll, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountper, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        if (status.getSelectedItem().equals("Sold")){
            stat = false;
            PreviewReason.setVisible(false);
            issuescroll.setVisible(false);    
            Issues.setText("");
            status.setForeground(new Color(118, 199, 102));
            status(prevID);
            
        }else{
            stat = true;
            PreviewReason.setVisible(true);
            issuescroll.setVisible(true);    
            status.setForeground(new Color(235, 87, 87));
            status(prevID);
        }
        
        main.HistoryRefreshTable();
    }//GEN-LAST:event_statusActionPerformed

    private void IssuesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_IssuesCaretUpdate
       status(prevID);
    }//GEN-LAST:event_IssuesCaretUpdate

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Category;
    public javax.swing.JTextArea Description;
    private javax.swing.JScrollPane DescriptionScroll;
    private javax.swing.JLabel DescriptionText;
    private javax.swing.JLabel DiscountPercentage;
    private javax.swing.JPanel InfoPanel;
    public javax.swing.JTextArea Issues;
    private javax.swing.JLabel PreviewCost;
    private javax.swing.JLabel PreviewDiscount;
    public javax.swing.JLabel PreviewImage;
    private javax.swing.JPanel PreviewPN;
    private javax.swing.JPanel PreviewPanel;
    private javax.swing.JLabel PreviewQuantity;
    public javax.swing.JLabel PreviewReason;
    private javax.swing.JLabel PreviewStatus;
    private javax.swing.JLabel PreviewSubtotal;
    private javax.swing.JLabel PreviewTotal;
    public javax.swing.JLabel Title;
    public SystemOtherComps.PH_TextField cost;
    public SystemOtherComps.PH_TextField discount;
    public SystemOtherComps.PH_TextField discountper;
    public javax.swing.JScrollPane issuescroll;
    private javax.swing.JPanel line;
    public SystemOtherComps.PH_TextField quantity;
    public javax.swing.JLabel receipt;
    private javax.swing.JLabel receipttxt;
    public SystemShadowedComp.PH_ComboBox status;
    public SystemOtherComps.PH_TextField subtotal;
    public SystemOtherComps.PH_TextField total;
    // End of variables declaration//GEN-END:variables

    
    
    
  public void status(int id) {
    try {
        String sql = "UPDATE history SET status=?, reason=? WHERE id=?";
        pst = con.prepareStatement(sql);

        // Convert selected item to string
        pst.setString(1, status.getSelectedItem().toString());
        pst.setString(2, Issues.getText());
        pst.setInt(3, id); // Pass the ID of the item you want to update

        pst.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }finally {
    try { if (pst != null) pst.close(); } catch (SQLException ignored) {}
    }
}
    
    

}
