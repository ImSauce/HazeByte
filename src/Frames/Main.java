
package Frames;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        Home.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        menu = new javax.swing.JPanel();
        Home_BT = new javax.swing.JLabel();
        Option_BT = new javax.swing.JLabel();
        History_BT = new javax.swing.JLabel();
        layers = new javax.swing.JLayeredPane();
        Option = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        History = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        menu.setBackground(new java.awt.Color(204, 0, 204));

        Home_BT.setText("icon");
        Home_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_BTMouseClicked(evt);
            }
        });

        Option_BT.setText("icon");
        Option_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option_BTMouseClicked(evt);
            }
        });

        History_BT.setText("icon");
        History_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                History_BTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(History_BT)
                    .addComponent(Option_BT)
                    .addComponent(Home_BT))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Home_BT)
                .addGap(45, 45, 45)
                .addComponent(Option_BT)
                .addGap(54, 54, 54)
                .addComponent(History_BT)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        getContentPane().add(menu);

        layers.setLayout(new java.awt.CardLayout());

        Option.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout OptionLayout = new javax.swing.GroupLayout(Option);
        Option.setLayout(OptionLayout);
        OptionLayout.setHorizontalGroup(
            OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        OptionLayout.setVerticalGroup(
            OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        layers.add(Option, "card3");

        Home.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        layers.add(Home, "card2");

        History.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        layers.add(History, "card4");

        getContentPane().add(layers);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //----------------MENU BUTTONS -------------//
    private void Home_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseClicked
        Home.setVisible(true);
        Option.setVisible(false);
        History.setVisible(false);
    }//GEN-LAST:event_Home_BTMouseClicked

    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(true);
        History.setVisible(false);
    }//GEN-LAST:event_Option_BTMouseClicked

    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(true);
    }//GEN-LAST:event_History_BTMouseClicked
    //----------------MENU BUTTONS -------------//
    
    
    
    
    
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel History;
    private javax.swing.JLabel History_BT;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Home_BT;
    private javax.swing.JPanel Option;
    private javax.swing.JLabel Option_BT;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
