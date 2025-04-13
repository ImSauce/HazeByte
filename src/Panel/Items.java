
package Panel;
import Classes.serverCredentials;
import javax.swing.ImageIcon;
import Frames.Main;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Items extends javax.swing.JPanel {

    
    Connection con;
    
    public int productID;
    public String productName;
    public Double productPrice;
    public String productCategory;
    public Double productDiscount;
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
            con = DriverManager.getConnection("jdbc:mysql://" + sv.getServerIP() + "/hazebyte", sv.getUserID(), sv.getPass());


        } catch (ClassNotFoundException ex) { } catch (SQLException ex) {}

    }
    
 
    public Items(Main main) {
        initComponents();
        this.main = main;
        connect();
        
        

    
    
    }
    
    
    public void setDetails(int productID, String productName, double productPrice, String productCategory, double productDiscount ) {
        int lineLength = 25; // Adjust based on your needs
        StringBuilder formattedText = new StringBuilder("<html>");
        
        // Split the text and add line breaks
        while (productName.length() > lineLength) {
            formattedText.append(productName.substring(0, lineLength)).append("<br>");
            productName = productName.substring(lineLength);
        }
        formattedText.append(productName).append("</html>");
        
        // Update the JLabel's text
        TitleTXT.setText(formattedText.toString());
        CategoryTXT.setText(productCategory);

        DecimalFormat df = new DecimalFormat("₱#,##0.00");
        CostTXT.setText(df.format(productPrice));
        
        if (productDiscount >= 1 && productDiscount <= 100 ) {
             String discount = new DecimalFormat("#").format(productDiscount) + "% discount!";
            discountTXT.setText(discount);
        } else {
            discountTXT.setText("");
        }
               
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDiscount = productDiscount;
   
    }
     public void setProductImage(ImageIcon imageIcon) {
    if (imageIcon != null) {
        Image originalImage = imageIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(218, 218, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        ImageTXT.setIcon(resizedIcon);
        this.productImage = resizedIcon;
    } else {
        ImageTXT.setIcon(null);
        this.productImage = null;
    }
}

     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        ImageTXT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 23, 23));
        setMaximumSize(new java.awt.Dimension(232, 395));
        setMinimumSize(new java.awt.Dimension(232, 395));
        setPreferredSize(new java.awt.Dimension(232, 395));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryTXT.setForeground(new java.awt.Color(102, 102, 102));
        CategoryTXT.setText("Gacha Game");
        add(CategoryTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 231, 222, -1));

        TitleTXT.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        TitleTXT.setText("MiSide");
        TitleTXT.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(TitleTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 253, 216, -1));

        CostTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CostTXT.setText("456$");
        add(CostTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 299, 216, -1));

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
        AddCartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCartBTActionPerformed(evt);
            }
        });
        add(AddCartBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 48, 42));

        quantityTXT.setForeground(new java.awt.Color(255, 255, 255));
        quantityTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityTXT.setText("1");
        quantityTXT.setFocusable(false);
        add(quantityTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 351, 50, 32));

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
        add(incrementBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 351, 25, 13));

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
        add(decrementBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 370, 25, 13));

        discountTXT.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        discountTXT.setForeground(new java.awt.Color(153, 201, 75));
        discountTXT.setText("10% discount!");
        add(discountTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 321, 216, -1));

        ID.setBackground(new java.awt.Color(24, 23, 23));
        ID.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        ID.setForeground(new java.awt.Color(24, 23, 23));
        ID.setText("Gacha Game");
        ID.setToolTipText("");
        ID.setMaximumSize(new java.awt.Dimension(0, 0));
        ID.setMinimumSize(new java.awt.Dimension(0, 0));
        ID.setPreferredSize(new java.awt.Dimension(0, 0));
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 504, -1, -1));

        LIP.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LIP.setText("jLabel1");
        LIP.setMaximumSize(new java.awt.Dimension(0, 0));
        LIP.setMinimumSize(new java.awt.Dimension(0, 0));
        LIP.setPreferredSize(new java.awt.Dimension(0, 0));
        add(LIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 389, -1, -1));

        LUSER.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LUSER.setText("jLabel1");
        LUSER.setMaximumSize(new java.awt.Dimension(0, 0));
        LUSER.setMinimumSize(new java.awt.Dimension(0, 0));
        LUSER.setPreferredSize(new java.awt.Dimension(0, 0));
        add(LUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 389, -1, -1));

        LPASS.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        LPASS.setText("jLabel1");
        LPASS.setMaximumSize(new java.awt.Dimension(0, 0));
        LPASS.setMinimumSize(new java.awt.Dimension(0, 0));
        LPASS.setPreferredSize(new java.awt.Dimension(0, 0));
        add(LPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 408, -1, -1));
        add(ImageTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 220, 218));
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

    private void AddCartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCartBTActionPerformed
        AddCart();
    }//GEN-LAST:event_AddCartBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button AddCartBT;
    private javax.swing.JLabel CategoryTXT;
    private javax.swing.JLabel CostTXT;
    private javax.swing.JLabel ID;
    public javax.swing.JLabel ImageTXT;
    private javax.swing.JLabel LIP;
    private javax.swing.JLabel LPASS;
    private javax.swing.JLabel LUSER;
    private javax.swing.JLabel TitleTXT;
    private SystemOtherComps.PH_Button decrementBT;
    private javax.swing.JLabel discountTXT;
    private SystemOtherComps.PH_Button incrementBT;
    private SystemOtherComps.PH_TextField quantityTXT;
    // End of variables declaration//GEN-END:variables
    
    
    
   
    
    
    public void AddCart() {
    try {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(LIP.getText());
        sv.setUserID(LUSER.getText());
        sv.setPass(LPASS.getText());
            
        String name = productName;
        String category = productCategory;
        double cost = productPrice;
        double discount = productDiscount; 
        int quantity = Integer.parseInt(quantityTXT.getText());

        double discountedPrice = cost - (cost * (discount / 100));

        double total = discountedPrice * quantity;
        double subtotal = cost * quantity; 

        // Fetch additional product info from the database
        String description = "";
        String imageName = "";
        String imagePath = "";
        byte[] imageFile = null;
        
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        try (Connection con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP()+"/hazebyte", sv.getUserID(), sv.getPass());
             PreparedStatement fetchPst = con.prepareStatement("SELECT description, imageName, imagePath, imageFile FROM product WHERE id = ?")) {

            fetchPst.setInt(1, productID);
            try (ResultSet rs = fetchPst.executeQuery()) {
                if (rs.next()) {
                    description = rs.getString("description");
                    imageName = rs.getString("imageName");
                    imagePath = rs.getString("imagePath");
                    imageFile = rs.getBytes("imageFile");
                }
            }
        }

        // Insert into cart
        String query = "INSERT INTO `cart`(`name`, `cost`, `discount`, `category`, `description`, `subtotal`, `total`, `quantity`, `Date`, `Time`, `productID`, `imageName`, `imagePath`, `imageFile`)" +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP()+"/hazebyte", sv.getUserID(), sv.getPass());
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setDouble(2, cost);
            pst.setDouble(3, discount);
            pst.setString(4, category);
            pst.setString(5, description);
            pst.setDouble(6, subtotal);
            pst.setDouble(7, total);
            pst.setInt(8, quantity);
            pst.setString(9, formattedDate); 
            pst.setString(10, formattedTime); 
            pst.setInt(11, productID);
            pst.setString(12, imageName);
            pst.setString(13, imagePath);
            pst.setBytes(14, imageFile);

            pst.executeUpdate();
        }
        
        quantityTXT.setText("1");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Add to Cart Failed: " + ex.getMessage());
        ex.printStackTrace();
    }
}

}
