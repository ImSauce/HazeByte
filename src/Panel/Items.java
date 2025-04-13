
package Panel;
import Classes.serverCredentials;
import javax.swing.ImageIcon;
import Frames.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Items extends javax.swing.JPanel {

    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
    public int productID;
    private String productName;
    private Double productPrice;
    private String productCategory;
    private Double productDiscount;
    public ImageIcon productImage;
   private Main main;
    
    
    public String serverIP ;
    public String userID ;
    public String passwordID ;
    
    
    public void forConnection(Connection conn, String serverIP,String userID ,String passwordID){
        this.con = conn;
        this.serverIP = serverIP;
        this.userID = userID;
        this.passwordID = passwordID;
        
        LIP.setText(main.IP.getText());
        LUSER.setText(main.USER.getText());
        LPASS.setText(main.PASS.getText());
        
    }
    
    private void connect(){
   
        forConnection(con,serverIP,userID,passwordID);
        
        
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(LIP.getText());
        sv.setUserID(LUSER.getText());
        sv.setPass(LPASS.getText()); // Get password as char array and convert to String

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + sv.getServerIP() + "/schale_online", sv.getUserID(), sv.getPass());


        } catch (ClassNotFoundException ex) { } catch (SQLException ex) {}

    }
    
 
    public Items(Main main) {
        initComponents();
        this.main = main;
        connect();
    }
    
    
    public void setDetails(int productID, String productName, double productPrice, String productCategory, double productDiscount ) {
        TitleTXT.setText(productName);
        CostTXT.setText(String.valueOf(productPrice));
        CategoryTXT.setText(productCategory);
        String discount = productDiscount +" discount!"; 
        discountTXT.setText(discount);
        
        
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDiscount = productDiscount;
   
    }
     public void setProductImage(ImageIcon imageIcon) {
        ImageTXT.setIcon(imageIcon);
        
        this.productImage = imageIcon;
    }

     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageTXT = new SystemShadowedComp.PH_SDWLabel();
        CategoryTXT = new javax.swing.JLabel();
        TitleTXT = new javax.swing.JLabel();
        CostTXT = new javax.swing.JLabel();
        AddCartBT = new SystemOtherComps.PH_Button();
        quantityTXT = new SystemOtherComps.PH_TextField();
        incrementBT = new SystemOtherComps.PH_Button();
        decrementBT = new SystemOtherComps.PH_Button();
        discountTXT = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        LIP = new javax.swing.JLabel();
        LUSER = new javax.swing.JLabel();
        LPASS = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 23, 23));
        setMaximumSize(new java.awt.Dimension(223, 363));
        setMinimumSize(new java.awt.Dimension(223, 363));

        ImageTXT.setAAA_AutoSize(true);
        ImageTXT.setAAA_ImageBoundArcSize(20);
        ImageTXT.setAAA_roundBottomLeft(20);
        ImageTXT.setAAA_roundBottomRight(20);
        ImageTXT.setAAA_roundTopLeft(20);
        ImageTXT.setAAA_roundTopRight(20);
        ImageTXT.setAA_ArcSize(20);
        ImageTXT.setAA_BorderSize(0);
        ImageTXT.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/download-modified.png"))); // NOI18N
        ImageTXT.setAA_DrawImage(true);
        ImageTXT.setAA_OpaqueBackground(true);

        CategoryTXT.setForeground(new java.awt.Color(102, 102, 102));
        CategoryTXT.setText("Gacha Game");

        TitleTXT.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        TitleTXT.setText("MiSide");

        CostTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CostTXT.setText("456$");

        AddCartBT.setBackground(new java.awt.Color(24, 23, 23));
        AddCartBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add to cart.png"))); // NOI18N
        AddCartBT.setToolTipText("add to cart");
        AddCartBT.setAAA_ImageBoundArcSize(20);
        AddCartBT.setAAA_roundBottomLeft(20);
        AddCartBT.setAAA_roundBottomRight(20);
        AddCartBT.setAAA_roundTopLeft(20);
        AddCartBT.setAAA_roundTopRight(20);
        AddCartBT.setAA_ArcSize(20);
        AddCartBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        AddCartBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        AddCartBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        AddCartBT.setAA_RippleColor(new java.awt.Color(31, 211, 71));

        quantityTXT.setForeground(new java.awt.Color(255, 255, 255));
        quantityTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityTXT.setText("1");

        incrementBT.setBackground(new java.awt.Color(38, 38, 38));
        incrementBT.setForeground(new java.awt.Color(255, 255, 255));
        incrementBT.setText("+");
        incrementBT.setAA_ButtonColor(new java.awt.Color(38, 38, 38));
        incrementBT.setAA_HoverColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_RippleColor(new java.awt.Color(71, 70, 70));
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
        decrementBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementBTActionPerformed(evt);
            }
        });

        discountTXT.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        discountTXT.setForeground(new java.awt.Color(153, 201, 75));
        discountTXT.setText("10% discount!");

        ID.setBackground(new java.awt.Color(24, 23, 23));
        ID.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        ID.setForeground(new java.awt.Color(24, 23, 23));
        ID.setText("Gacha Game");
        ID.setToolTipText("");
        ID.setMaximumSize(new java.awt.Dimension(0, 0));
        ID.setMinimumSize(new java.awt.Dimension(0, 0));
        ID.setPreferredSize(new java.awt.Dimension(0, 0));

        LIP.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LIP.setText("jLabel1");
        LIP.setMaximumSize(new java.awt.Dimension(0, 0));
        LIP.setMinimumSize(new java.awt.Dimension(0, 0));
        LIP.setPreferredSize(new java.awt.Dimension(0, 0));

        LUSER.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LUSER.setText("jLabel1");
        LUSER.setMaximumSize(new java.awt.Dimension(0, 0));
        LUSER.setMinimumSize(new java.awt.Dimension(0, 0));
        LUSER.setPreferredSize(new java.awt.Dimension(0, 0));

        LPASS.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LPASS.setText("jLabel1");
        LPASS.setMaximumSize(new java.awt.Dimension(0, 0));
        LPASS.setMinimumSize(new java.awt.Dimension(0, 0));
        LPASS.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTXT)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CostTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(49, 49, 49))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(quantityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(76, 76, 76))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(discountTXT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(AddCartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CategoryTXT)))
                    .addComponent(ImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(169, Short.MAX_VALUE)
                    .addComponent(LPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(ImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CategoryTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTXT)
                            .addComponent(LUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CostTXT)
                            .addComponent(LIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discountTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddCartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(LPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(96, 96, 96)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void incrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementBTActionPerformed
        int plus = Integer.parseInt(quantityTXT.getText());
        
        plus += 1;
        quantityTXT.setText(Integer.toString(plus)); 
       
    }//GEN-LAST:event_incrementBTActionPerformed

    private void decrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementBTActionPerformed
        int plus = Integer.parseInt(quantityTXT.getText());
        if (plus > 1) {
        
        plus -= 1;
        quantityTXT.setText(Integer.toString(plus));
        
        }else {
        //add sound
        }
    }//GEN-LAST:event_decrementBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button AddCartBT;
    private javax.swing.JLabel CategoryTXT;
    private javax.swing.JLabel CostTXT;
    private javax.swing.JLabel ID;
    private SystemShadowedComp.PH_SDWLabel ImageTXT;
    private javax.swing.JLabel LIP;
    private javax.swing.JLabel LPASS;
    private javax.swing.JLabel LUSER;
    private javax.swing.JLabel TitleTXT;
    private SystemOtherComps.PH_Button decrementBT;
    private javax.swing.JLabel discountTXT;
    private SystemOtherComps.PH_Button incrementBT;
    private SystemOtherComps.PH_TextField quantityTXT;
    // End of variables declaration//GEN-END:variables
}
