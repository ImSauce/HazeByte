
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

public class HistoryTotal extends javax.swing.JFrame {

    private Main main;

    UIcolors color = new UIcolors();
    

    
    public HistoryTotal(Main mainFrame) {
        initComponents();
        this.main = mainFrame;

       
        color.UIcolor();
        
        ImageIcon HistoryIcon = new ImageIcon(getClass().getResource("/Images/transparentHB.jpg"));
        setIconImage(HistoryIcon.getImage());
        setTitle("Earnings");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalpanel = new javax.swing.JPanel();
        TotalSold = new javax.swing.JLabel();
        salestxt = new javax.swing.JLabel();
        TotalQuantity = new javax.swing.JLabel();
        itemstxt = new javax.swing.JLabel();
        refundstxt = new javax.swing.JLabel();
        TotalRefund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        totalpanel.setBackground(new java.awt.Color(24, 23, 23));

        TotalSold.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        TotalSold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalSold.setText("0000");

        salestxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salestxt.setForeground(new java.awt.Color(153, 153, 153));
        salestxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salestxt.setText("Total Sales:");

        TotalQuantity.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        TotalQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalQuantity.setText("0000");

        itemstxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemstxt.setForeground(new java.awt.Color(153, 153, 153));
        itemstxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemstxt.setText("Total Items Sold:");

        refundstxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        refundstxt.setForeground(new java.awt.Color(153, 153, 153));
        refundstxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refundstxt.setText("Total Refunds:");

        TotalRefund.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        TotalRefund.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalRefund.setText("0000");

        javax.swing.GroupLayout totalpanelLayout = new javax.swing.GroupLayout(totalpanel);
        totalpanel.setLayout(totalpanelLayout);
        totalpanelLayout.setHorizontalGroup(
            totalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salestxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TotalSold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(itemstxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addComponent(TotalQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(refundstxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TotalRefund, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        totalpanelLayout.setVerticalGroup(
            totalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(salestxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalSold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemstxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refundstxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalRefund)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel TotalQuantity;
    public javax.swing.JLabel TotalRefund;
    public javax.swing.JLabel TotalSold;
    private javax.swing.JLabel itemstxt;
    private javax.swing.JLabel refundstxt;
    private javax.swing.JLabel salestxt;
    private javax.swing.JPanel totalpanel;
    // End of variables declaration//GEN-END:variables
}
