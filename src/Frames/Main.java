
package Frames;

import java.awt.Color;
import javax.swing.ImageIcon;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        ImageIcon Mainicon = new ImageIcon ("hare.png");
        setIconImage(Mainicon.getImage());
        setTitle("HazeByte");
        setResizable(false);
        
        //Open Games Menu after startup
        Home_BTMouseClicked(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        menu = new javax.swing.JPanel();
        line = new javax.swing.JPanel();
        HomePN = new SystemOtherComps.PH_Panel();
        Home_BT = new javax.swing.JLabel();
        OptionPN = new SystemOtherComps.PH_Panel();
        Option_BT = new javax.swing.JLabel();
        HistoryPN = new SystemOtherComps.PH_Panel();
        History_BT = new javax.swing.JLabel();
        InfoPN = new SystemOtherComps.PH_Panel();
        Info_BT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        layers = new javax.swing.JLayeredPane();
        Option = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Info = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        menu.setBackground(new java.awt.Color(24, 23, 23));

        line.setBackground(new java.awt.Color(51, 51, 51));
        line.setPreferredSize(new java.awt.Dimension(1, 0));

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

        HomePN.setBackground(new java.awt.Color(24, 23, 23));
        HomePN.setAAA_ImageBoundArcSize(20);
        HomePN.setAAA_roundBottomLeft(20);
        HomePN.setAAA_roundBottomRight(20);
        HomePN.setAAA_roundTopLeft(20);
        HomePN.setAAA_roundTopRight(20);

        Home_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Home_BTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Home_BTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomePNLayout = new javax.swing.GroupLayout(HomePN);
        HomePN.setLayout(HomePNLayout);
        HomePNLayout.setHorizontalGroup(
            HomePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home_BT)
                .addContainerGap())
        );
        HomePNLayout.setVerticalGroup(
            HomePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home_BT)
                .addContainerGap())
        );

        OptionPN.setBackground(new java.awt.Color(24, 23, 23));
        OptionPN.setAAA_ImageBoundArcSize(20);
        OptionPN.setAAA_roundBottomLeft(20);
        OptionPN.setAAA_roundBottomRight(20);
        OptionPN.setAAA_roundTopLeft(20);
        OptionPN.setAAA_roundTopRight(20);

        Option_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customize.png"))); // NOI18N
        Option_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Option_BTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Option_BTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout OptionPNLayout = new javax.swing.GroupLayout(OptionPN);
        OptionPN.setLayout(OptionPNLayout);
        OptionPNLayout.setHorizontalGroup(
            OptionPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Option_BT)
                .addContainerGap())
        );
        OptionPNLayout.setVerticalGroup(
            OptionPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Option_BT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HistoryPN.setBackground(new java.awt.Color(24, 23, 23));
        HistoryPN.setAAA_ImageBoundArcSize(20);
        HistoryPN.setAAA_roundBottomLeft(20);
        HistoryPN.setAAA_roundBottomRight(20);
        HistoryPN.setAAA_roundTopLeft(20);
        HistoryPN.setAAA_roundTopRight(20);

        History_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/history.png"))); // NOI18N
        History_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                History_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                History_BTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                History_BTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HistoryPNLayout = new javax.swing.GroupLayout(HistoryPN);
        HistoryPN.setLayout(HistoryPNLayout);
        HistoryPNLayout.setHorizontalGroup(
            HistoryPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(History_BT)
                .addContainerGap())
        );
        HistoryPNLayout.setVerticalGroup(
            HistoryPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(History_BT)
                .addContainerGap())
        );

        InfoPN.setBackground(new java.awt.Color(24, 23, 23));
        InfoPN.setAAA_ImageBoundArcSize(20);
        InfoPN.setAAA_roundBottomLeft(20);
        InfoPN.setAAA_roundBottomRight(20);
        InfoPN.setAAA_roundTopLeft(20);
        InfoPN.setAAA_roundTopRight(20);

        Info_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        Info_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Info_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Info_BTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Info_BTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InfoPNLayout = new javax.swing.GroupLayout(InfoPN);
        InfoPN.setLayout(InfoPNLayout);
        InfoPNLayout.setHorizontalGroup(
            InfoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Info_BT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InfoPNLayout.setVerticalGroup(
            InfoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info_BT)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/small hare.jpg"))); // NOI18N

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomePN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OptionPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HistoryPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InfoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(HomePN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OptionPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HistoryPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addComponent(InfoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(menu);

        layers.setLayout(new java.awt.CardLayout());

        Option.setBackground(new java.awt.Color(24, 23, 23));
        Option.setPreferredSize(new java.awt.Dimension(783, 594));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("add edit");

        javax.swing.GroupLayout OptionLayout = new javax.swing.GroupLayout(Option);
        Option.setLayout(OptionLayout);
        OptionLayout.setHorizontalGroup(
            OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        OptionLayout.setVerticalGroup(
            OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(561, Short.MAX_VALUE))
        );

        layers.add(Option, "card3");

        Home.setBackground(new java.awt.Color(24, 23, 23));
        Home.setPreferredSize(new java.awt.Dimension(783, 594));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("games");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap(698, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(557, Short.MAX_VALUE))
        );

        layers.add(Home, "card2");

        History.setBackground(new java.awt.Color(24, 23, 23));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("transaction history");

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(561, Short.MAX_VALUE))
        );

        layers.add(History, "card4");

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        layers.add(Info, "card5");

        getContentPane().add(layers);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //----------------MENU BUTTONS -------------//
    private void Home_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseClicked
        Home.setVisible(true);
        Option.setVisible(false);
        History.setVisible(false);
        Info.setVisible(false);
    }//GEN-LAST:event_Home_BTMouseClicked

    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(true);
        History.setVisible(false);
        Info.setVisible(false);
    }//GEN-LAST:event_Option_BTMouseClicked

    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(true);
        Info.setVisible(false);
    }//GEN-LAST:event_History_BTMouseClicked

    private void Info_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(false);
        Info.setVisible(true);
    }//GEN-LAST:event_Info_BTMouseClicked

    private void Home_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseEntered
        HomePN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Home_BTMouseEntered

    private void Home_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseExited
        HomePN.setBackground(new java.awt.Color(24,23,23));
    }//GEN-LAST:event_Home_BTMouseExited

    private void Option_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseEntered
        OptionPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Option_BTMouseEntered

    private void Option_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseExited
        OptionPN.setBackground(new java.awt.Color(24,23,23));
    }//GEN-LAST:event_Option_BTMouseExited

    private void History_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseEntered
       HistoryPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_History_BTMouseEntered

    private void History_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseExited
        HistoryPN.setBackground(new java.awt.Color(24,23,23));
    }//GEN-LAST:event_History_BTMouseExited

    private void Info_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseEntered
        InfoPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Info_BTMouseEntered

    private void Info_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseExited
        InfoPN.setBackground(new java.awt.Color(24,23,23));
        
    }//GEN-LAST:event_Info_BTMouseExited
    //----------------MENU BUTTONS -------------//
    
    
    
    
    
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel History;
    private SystemOtherComps.PH_Panel HistoryPN;
    private javax.swing.JLabel History_BT;
    private javax.swing.JPanel Home;
    private SystemOtherComps.PH_Panel HomePN;
    private javax.swing.JLabel Home_BT;
    private javax.swing.JPanel Info;
    private SystemOtherComps.PH_Panel InfoPN;
    private javax.swing.JLabel Info_BT;
    private javax.swing.JPanel Option;
    private SystemOtherComps.PH_Panel OptionPN;
    private javax.swing.JLabel Option_BT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
