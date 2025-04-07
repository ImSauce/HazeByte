
package Panel;

public class Items extends javax.swing.JPanel {

 
    public Items() {
        initComponents();
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
        discount1 = new javax.swing.JLabel();

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

        discount1.setBackground(new java.awt.Color(24, 23, 23));
        discount1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        discount1.setForeground(new java.awt.Color(24, 23, 23));
        discount1.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(discount1)
                        .addGap(1, 1, 1)
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
                        .addComponent(TitleTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CostTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountTXT)
                            .addComponent(discount1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddCartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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
    private SystemShadowedComp.PH_SDWLabel ImageTXT;
    private javax.swing.JLabel TitleTXT;
    private SystemOtherComps.PH_Button decrementBT;
    private javax.swing.JLabel discount1;
    private javax.swing.JLabel discountTXT;
    private SystemOtherComps.PH_Button incrementBT;
    private SystemOtherComps.PH_TextField quantityTXT;
    // End of variables declaration//GEN-END:variables
}
