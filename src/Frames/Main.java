
package Frames;

import Classes.Functions;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public class Main extends javax.swing.JFrame {

    //variables for detecting if a menu button is clicked
    Functions function = new Functions();
    boolean HomeClicked = true;
    boolean OptionClicked = false;
    boolean HistoryClicked = false;
    boolean InfoClicked =false;
    
    
    
    public Main() {
        initComponents();
        
        //icon and title
        ImageIcon Mainicon = new ImageIcon ("HB icon.png");
        setIconImage(Mainicon.getImage());
        setTitle("HazeByte");
        setResizable(true);
       
        
        //Open Games Menu after startup
        Home_BTMouseClicked(null);
        categoriesMouseClicked(null);
        Games_txt.requestFocus();
        
        //CART TABLE SHIT
        CartTable.setShowGrid(false);
        JTableHeader tableHeader = CartTable.getTableHeader();
            tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 40)); // Change 40 to any height you want
        CartTable.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < CartTable.getColumnCount(); i++) {
                CartTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            
            
        CartDescription.setLineWrap(true);     // Auto-wrap text
        CartDescription.setWrapStyleWord(true); // Wrap at word boundaries
    }

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        layers = new javax.swing.JLayeredPane();
        Option = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Info = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Cart = new javax.swing.JPanel();
        CartBar = new javax.swing.JPanel();
        Cart_txt = new javax.swing.JLabel();
        CartBackBT = new javax.swing.JLabel();
        CartItemView = new javax.swing.JPanel();
        ImageTXT = new SystemShadowedComp.PH_SDWLabel();
        CategoryTXT = new javax.swing.JLabel();
        TitleTXT = new javax.swing.JLabel();
        CostTXT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CartDescription = new javax.swing.JTextArea();
        CategoryTXT1 = new javax.swing.JLabel();
        CancelBT1 = new SystemOtherComps.PH_Button();
        change1 = new SystemOtherComps.PH_TextField();
        CostTXT1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        payment = new SystemOtherComps.PH_TextField();
        totalcost = new SystemOtherComps.PH_TextField();
        change = new SystemOtherComps.PH_TextField();
        paymenttxt = new javax.swing.JLabel();
        paymenttxt1 = new javax.swing.JLabel();
        paymenttxt2 = new javax.swing.JLabel();
        CartTableScroll = new SystemOtherComps.PH_ScrollPane();
        CartTable = new javax.swing.JTable();
        BuyBT = new SystemOtherComps.PH_Button();
        CancelBT = new SystemOtherComps.PH_Button();
        Home = new javax.swing.JPanel();
        GameBar = new javax.swing.JPanel();
        Games_txt = new javax.swing.JLabel();
        CartPN = new SystemOtherComps.PH_Panel();
        CartBT = new javax.swing.JLabel();
        Cart_Line = new javax.swing.JPanel();
        categories = new SystemShadowedComp.PH_ComboBox();
        GameSearchTXT = new SystemOtherComps.PH_TextField();
        SearchIconTXT = new javax.swing.JLabel();
        SearchIconTXT1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GameScroll = new SystemOtherComps.PH_ScrollPane();
        GameList = new SystemOtherComps.PH_BettterFlowLayoutPanel();
        newJPanel1 = new Panel.Items();
        newJPanel15 = new Panel.Items();
        newJPanel14 = new Panel.Items();
        newJPanel12 = new Panel.Items();
        newJPanel11 = new Panel.Items();
        newJPanel9 = new Panel.Items();
        newJPanel10 = new Panel.Items();
        newJPanel8 = new Panel.Items();
        newJPanel7 = new Panel.Items();
        newJPanel6 = new Panel.Items();
        newJPanel5 = new Panel.Items();
        newJPanel2 = new Panel.Items();
        newJPanel4 = new Panel.Items();
        newJPanel3 = new Panel.Items();
        newJPanel13 = new Panel.Items();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 720));
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
        Home_BT.setToolTipText("Games");
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
            .addGroup(HomePNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home_BT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePNLayout.setVerticalGroup(
            HomePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        OptionPN.setBackground(new java.awt.Color(24, 23, 23));
        OptionPN.setAAA_ImageBoundArcSize(20);
        OptionPN.setAAA_roundBottomLeft(20);
        OptionPN.setAAA_roundBottomRight(20);
        OptionPN.setAAA_roundTopLeft(20);
        OptionPN.setAAA_roundTopRight(20);

        Option_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customize.png"))); // NOI18N
        Option_BT.setToolTipText("Options");
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
                .addContainerGap()
                .addComponent(Option_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        History_BT.setToolTipText("Transaction History");
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
                .addContainerGap(8, Short.MAX_VALUE)
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
        Info_BT.setToolTipText("Developer Info");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info_BT)
                .addContainerGap())
        );
        InfoPNLayout.setVerticalGroup(
            InfoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info_BT)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(HistoryPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(HomePN, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(OptionPN, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(InfoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(HomePN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(OptionPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(HistoryPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(InfoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(814, Short.MAX_VALUE))
        );
        OptionLayout.setVerticalGroup(
            OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        layers.add(Option, "card3");

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
                .addContainerGap(755, Short.MAX_VALUE))
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        layers.add(History, "card4");

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jToggleButton1)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jToggleButton1)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        layers.add(Info, "card5");

        Cart.setBackground(new java.awt.Color(24, 23, 23));
        Cart.setPreferredSize(new java.awt.Dimension(783, 594));

        CartBar.setBackground(new java.awt.Color(24, 23, 23));

        Cart_txt.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        Cart_txt.setForeground(new java.awt.Color(255, 255, 255));
        Cart_txt.setText("Cart");

        CartBackBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        CartBackBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartBackBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CartBarLayout = new javax.swing.GroupLayout(CartBar);
        CartBar.setLayout(CartBarLayout);
        CartBarLayout.setHorizontalGroup(
            CartBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CartBackBT)
                .addGap(29, 29, 29)
                .addComponent(Cart_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CartBarLayout.setVerticalGroup(
            CartBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cart_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(CartBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CartBackBT)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        CartItemView.setBackground(new java.awt.Color(24, 23, 23));

        ImageTXT.setAAA_FitToSize(true);
        ImageTXT.setAAA_ImageBoundArcSize(2);
        ImageTXT.setAAA_roundBottomLeft(2);
        ImageTXT.setAAA_roundBottomRight(2);
        ImageTXT.setAAA_roundTopLeft(2);
        ImageTXT.setAAA_roundTopRight(2);
        ImageTXT.setAA_ArcSize(2);
        ImageTXT.setAA_BorderSize(0);
        ImageTXT.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/download-modified.png"))); // NOI18N
        ImageTXT.setAA_DrawImage(true);
        ImageTXT.setAA_OpaqueBackground(true);

        CategoryTXT.setForeground(new java.awt.Color(102, 102, 102));
        CategoryTXT.setText("Gacha Game");

        TitleTXT.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TitleTXT.setText("MiSide");

        CostTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CostTXT.setText("456$");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");

        CartDescription.setBackground(new java.awt.Color(24, 23, 23));
        CartDescription.setColumns(20);
        CartDescription.setRows(5);
        CartDescription.setText("MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.\n");
        CartDescription.setBorder(null);
        CartDescription.setFocusable(false);
        jScrollPane1.setViewportView(CartDescription);

        CategoryTXT1.setForeground(new java.awt.Color(102, 102, 102));
        CategoryTXT1.setText("Description:");

        CancelBT1.setBackground(new java.awt.Color(24, 23, 23));
        CancelBT1.setText("Remove from cart");
        CancelBT1.setAAA_ImageBoundArcSize(10);
        CancelBT1.setAAA_roundBottomLeft(10);
        CancelBT1.setAAA_roundBottomRight(10);
        CancelBT1.setAAA_roundTopLeft(10);
        CancelBT1.setAAA_roundTopRight(10);
        CancelBT1.setAA_ArcSize(10);
        CancelBT1.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        CancelBT1.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        CancelBT1.setAA_DrawBorder(true);
        CancelBT1.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        CancelBT1.setAA_PressColor(new java.awt.Color(54, 53, 53));
        CancelBT1.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        CancelBT1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        change1.setBackground(new java.awt.Color(38, 38, 38));
        change1.setForeground(new java.awt.Color(204, 204, 204));
        change1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        change1.setAAA_roundBottomLeft(20);
        change1.setAAA_roundBottomRight(20);
        change1.setAAA_roundTopLeft(20);
        change1.setAAA_roundTopRight(20);
        change1.setAA_DrawLine(false);
        change1.setAA_TextHint("         0");
        change1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        CostTXT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CostTXT1.setForeground(new java.awt.Color(25, 167, 56));
        CostTXT1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CostTXT1.setText("4560000000000000000$");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cost.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quantity.png"))); // NOI18N

        javax.swing.GroupLayout CartItemViewLayout = new javax.swing.GroupLayout(CartItemView);
        CartItemView.setLayout(CartItemViewLayout);
        CartItemViewLayout.setHorizontalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartItemViewLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ImageTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTXT)
                            .addComponent(CategoryTXT)
                            .addComponent(CostTXT)
                            .addComponent(CategoryTXT1)))
                    .addComponent(CancelBT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(CartItemViewLayout.createSequentialGroup()
                            .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(change1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CostTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        CartItemViewLayout.setVerticalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartItemViewLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CostTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CategoryTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(change1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CostTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelBT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        payment.setBackground(new java.awt.Color(24, 23, 23));
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        payment.setAAA_roundBottomLeft(20);
        payment.setAAA_roundBottomRight(20);
        payment.setAAA_roundTopLeft(20);
        payment.setAAA_roundTopRight(20);
        payment.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        payment.setAA_DrawBorder(true);
        payment.setAA_DrawBottomBorder(true);
        payment.setAA_DrawLeftBorder(true);
        payment.setAA_DrawLine(false);
        payment.setAA_DrawRightBorder(true);
        payment.setAA_DrawTopBorder(true);
        payment.setAA_TextHint("   Enter Amount");
        payment.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        totalcost.setBackground(new java.awt.Color(38, 38, 38));
        totalcost.setForeground(new java.awt.Color(204, 204, 204));
        totalcost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        totalcost.setAAA_roundBottomLeft(20);
        totalcost.setAAA_roundBottomRight(20);
        totalcost.setAAA_roundTopLeft(20);
        totalcost.setAAA_roundTopRight(20);
        totalcost.setAA_DrawLine(false);
        totalcost.setAA_TextHint("   0");
        totalcost.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        change.setBackground(new java.awt.Color(38, 38, 38));
        change.setForeground(new java.awt.Color(204, 204, 204));
        change.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        change.setAAA_roundBottomLeft(20);
        change.setAAA_roundBottomRight(20);
        change.setAAA_roundTopLeft(20);
        change.setAAA_roundTopRight(20);
        change.setAA_DrawLine(false);
        change.setAA_TextHint("   0");
        change.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        paymenttxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        paymenttxt.setText("Payment:");

        paymenttxt1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        paymenttxt1.setText("Total Cost:");

        paymenttxt2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        paymenttxt2.setText("Change:");

        CartTable.setBackground(new java.awt.Color(24, 23, 23));
        CartTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CartTable.setForeground(new java.awt.Color(255, 255, 255));
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dsadas", "dasdas", "dasd", "asdsad"},
                {"sadsa", "sadsd", "sad", "sa"},
                {"dsad", "sad", "sadad", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Cost", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CartTable.setFocusable(false);
        CartTable.setGridColor(new java.awt.Color(24, 23, 23));
        CartTable.setRowHeight(40);
        CartTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        CartTableScroll.setViewportView(CartTable);
        if (CartTable.getColumnModel().getColumnCount() > 0) {
            CartTable.getColumnModel().getColumn(0).setResizable(false);
            CartTable.getColumnModel().getColumn(1).setResizable(false);
            CartTable.getColumnModel().getColumn(2).setResizable(false);
            CartTable.getColumnModel().getColumn(3).setResizable(false);
        }

        BuyBT.setBackground(new java.awt.Color(32, 180, 52));
        BuyBT.setForeground(new java.awt.Color(255, 255, 255));
        BuyBT.setText("Buy");
        BuyBT.setAAA_ImageBoundArcSize(10);
        BuyBT.setAAA_roundBottomLeft(10);
        BuyBT.setAAA_roundBottomRight(10);
        BuyBT.setAAA_roundTopLeft(10);
        BuyBT.setAAA_roundTopRight(10);
        BuyBT.setAA_ArcSize(10);
        BuyBT.setAA_ButtonColor(new java.awt.Color(32, 180, 52));
        BuyBT.setAA_HoverColor(new java.awt.Color(95, 219, 112));
        BuyBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        BuyBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        BuyBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        CancelBT.setBackground(new java.awt.Color(24, 23, 23));
        CancelBT.setText("Cancel all");
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

        javax.swing.GroupLayout CartLayout = new javax.swing.GroupLayout(Cart);
        Cart.setLayout(CartLayout);
        CartLayout.setHorizontalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CartLayout.createSequentialGroup()
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CartLayout.createSequentialGroup()
                                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymenttxt1)
                                    .addComponent(paymenttxt2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(paymenttxt, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalcost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(CartLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CartTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(CartLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(CartItemView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CartLayout.setVerticalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartLayout.createSequentialGroup()
                .addComponent(CartBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartLayout.createSequentialGroup()
                        .addComponent(CartTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymenttxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymenttxt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymenttxt2))
                        .addGap(76, 76, 76)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuyBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(CartItemView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layers.add(Cart, "card2");

        Home.setBackground(new java.awt.Color(24, 23, 23));
        Home.setPreferredSize(new java.awt.Dimension(783, 594));

        GameBar.setBackground(new java.awt.Color(24, 23, 23));

        Games_txt.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        Games_txt.setForeground(new java.awt.Color(255, 255, 255));
        Games_txt.setText("Games");

        CartPN.setBackground(new java.awt.Color(24, 23, 23));
        CartPN.setAAA_ImageBoundArcSize(20);
        CartPN.setAAA_roundBottomLeft(20);
        CartPN.setAAA_roundBottomRight(20);
        CartPN.setAAA_roundTopLeft(20);
        CartPN.setAAA_roundTopRight(20);

        CartBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cart.png"))); // NOI18N
        CartBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CartBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartBTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CartPNLayout = new javax.swing.GroupLayout(CartPN);
        CartPN.setLayout(CartPNLayout);
        CartPNLayout.setHorizontalGroup(
            CartPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CartBT)
                .addContainerGap())
        );
        CartPNLayout.setVerticalGroup(
            CartPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CartBT)
                .addContainerGap())
        );

        Cart_Line.setBackground(new java.awt.Color(51, 51, 51));
        Cart_Line.setPreferredSize(new java.awt.Dimension(1, 44));

        javax.swing.GroupLayout Cart_LineLayout = new javax.swing.GroupLayout(Cart_Line);
        Cart_Line.setLayout(Cart_LineLayout);
        Cart_LineLayout.setHorizontalGroup(
            Cart_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        Cart_LineLayout.setVerticalGroup(
            Cart_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        categories.setForeground(new java.awt.Color(255, 255, 255));
        categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
        categories.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        categories.setAA_lineColor(new java.awt.Color(45, 187, 63));
        categories.setFocusable(false);
        categories.setLabeText("   Categories ");
        categories.setRequestFocusEnabled(false);
        categories.setVerifyInputWhenFocusTarget(false);
        categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriesMouseClicked(evt);
            }
        });

        GameSearchTXT.setForeground(new java.awt.Color(255, 255, 255));
        GameSearchTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        GameSearchTXT.setAA_TextHint("Search...");
        GameSearchTXT.setAB_LineColor(new java.awt.Color(51, 51, 51));

        SearchIconTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        SearchIconTXT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transparentHB.jpg"))); // NOI18N

        javax.swing.GroupLayout GameBarLayout = new javax.swing.GroupLayout(GameBar);
        GameBar.setLayout(GameBarLayout);
        GameBarLayout.setHorizontalGroup(
            GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameBarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Games_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(SearchIconTXT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(SearchIconTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GameSearchTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Cart_Line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        GameBarLayout.setVerticalGroup(
            GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameBarLayout.createSequentialGroup()
                .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GameBarLayout.createSequentialGroup()
                        .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GameBarLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(GameBarLayout.createSequentialGroup()
                                        .addComponent(SearchIconTXT1)
                                        .addGap(10, 10, 10))
                                    .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CartPN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cart_Line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(GameBarLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GameSearchTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameBarLayout.createSequentialGroup()
                                .addComponent(SearchIconTXT)
                                .addGap(9, 9, 9))))
                    .addGroup(GameBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(GameBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Games_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        GameScroll.setBackground(new java.awt.Color(51, 51, 51));
        GameScroll.setForeground(new java.awt.Color(0, 204, 255));
        GameScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        GameScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        GameList.setBackground(new java.awt.Color(24, 23, 23));
        GameList.setForeground(new java.awt.Color(255, 255, 255));
        GameList.add(newJPanel1);
        GameList.add(newJPanel15);
        GameList.add(newJPanel14);
        GameList.add(newJPanel12);
        GameList.add(newJPanel11);
        GameList.add(newJPanel9);
        GameList.add(newJPanel10);
        GameList.add(newJPanel8);
        GameList.add(newJPanel7);
        GameList.add(newJPanel6);
        GameList.add(newJPanel5);
        GameList.add(newJPanel2);
        GameList.add(newJPanel4);
        GameList.add(newJPanel3);
        GameList.add(newJPanel13);

        GameScroll.setViewportView(GameList);

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GameBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GameScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(GameBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GameScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        layers.add(Home, "card2");

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
        Cart.setVisible(false);
        HomeClicked = true;
        OptionClicked = false;
        HistoryClicked =false;
        InfoClicked =false;
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_Home_BTMouseClicked

    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(true);
        History.setVisible(false);
        Info.setVisible(false);
        Cart.setVisible(false);
        HomeClicked = false;
        OptionClicked = true;
        HistoryClicked =false;
        InfoClicked =false;
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_Option_BTMouseClicked

    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(true);
        Info.setVisible(false);
        Cart.setVisible(false);
        HomeClicked = false;
        OptionClicked = false;
        HistoryClicked =true;
        InfoClicked =false;
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_History_BTMouseClicked

    private void Info_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(false);
        Info.setVisible(true);
        Cart.setVisible(false);
        HomeClicked = false;
        OptionClicked = false;
        HistoryClicked =false;
        InfoClicked =true;
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_Info_BTMouseClicked

    private void Home_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseEntered
        
        HomePN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Home_BTMouseEntered

    private void Home_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseExited
        if (HomeClicked == false){
            HomePN.setBackground(new java.awt.Color(24,23,23));
        }    
    }//GEN-LAST:event_Home_BTMouseExited

    private void Option_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseEntered
        OptionPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Option_BTMouseEntered

    private void Option_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseExited
        if (OptionClicked == false){
            OptionPN.setBackground(new java.awt.Color(24,23,23));
        } 
    }//GEN-LAST:event_Option_BTMouseExited

    private void History_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseEntered
       HistoryPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_History_BTMouseEntered

    private void History_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseExited
        if (HistoryClicked == false){
            HistoryPN.setBackground(new java.awt.Color(24,23,23));
        } 
    }//GEN-LAST:event_History_BTMouseExited

    private void Info_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseEntered
        InfoPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Info_BTMouseEntered

    private void Info_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseExited
        if (InfoClicked == false){
            InfoPN.setBackground(new java.awt.Color(24,23,23));
        }  
    }//GEN-LAST:event_Info_BTMouseExited
//----------------MENU BUTTONS -------------//    
    
    
    
    
//------------------HOME PANEL FRONTEND CODES------------------//
    private void CartBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBTMouseEntered
        CartPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_CartBTMouseEntered

    private void CartBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBTMouseExited
        CartPN.setBackground(new java.awt.Color(24,23,23));
    }//GEN-LAST:event_CartBTMouseExited

    private void CartBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBTMouseClicked
        Home.setVisible(false);
        Option.setVisible(false);
        History.setVisible(false);
        Info.setVisible(false);
        Cart.setVisible(true);
    }//GEN-LAST:event_CartBTMouseClicked

    private void categoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesMouseClicked
        categories.setSelectedItem("Action");
        categories.setSelectedItem("All");
        Games_txt.requestFocus();
    }//GEN-LAST:event_categoriesMouseClicked
 //------------------HOME PANEL FRONTEND CODES------------------// 
    

    
    
    private void CartBackBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackBTMouseClicked
        Home.setVisible(true);
        Option.setVisible(false);
        History.setVisible(false);
        Info.setVisible(false);
        Cart.setVisible(false);
    }//GEN-LAST:event_CartBackBTMouseClicked
  
    
    
    
    
    
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button BuyBT;
    private SystemOtherComps.PH_Button CancelBT;
    private SystemOtherComps.PH_Button CancelBT1;
    private javax.swing.JPanel Cart;
    private javax.swing.JLabel CartBT;
    private javax.swing.JLabel CartBackBT;
    private javax.swing.JPanel CartBar;
    private javax.swing.JTextArea CartDescription;
    private javax.swing.JPanel CartItemView;
    private SystemOtherComps.PH_Panel CartPN;
    public javax.swing.JTable CartTable;
    private SystemOtherComps.PH_ScrollPane CartTableScroll;
    private javax.swing.JPanel Cart_Line;
    private javax.swing.JLabel Cart_txt;
    private javax.swing.JLabel CategoryTXT;
    private javax.swing.JLabel CategoryTXT1;
    private javax.swing.JLabel CostTXT;
    private javax.swing.JLabel CostTXT1;
    private javax.swing.JPanel GameBar;
    private SystemOtherComps.PH_BettterFlowLayoutPanel GameList;
    private SystemOtherComps.PH_ScrollPane GameScroll;
    private SystemOtherComps.PH_TextField GameSearchTXT;
    public javax.swing.JLabel Games_txt;
    private javax.swing.JPanel History;
    private SystemOtherComps.PH_Panel HistoryPN;
    private javax.swing.JLabel History_BT;
    private javax.swing.JPanel Home;
    private SystemOtherComps.PH_Panel HomePN;
    public javax.swing.JLabel Home_BT;
    private SystemShadowedComp.PH_SDWLabel ImageTXT;
    private javax.swing.JPanel Info;
    private SystemOtherComps.PH_Panel InfoPN;
    private javax.swing.JLabel Info_BT;
    private javax.swing.JPanel Option;
    private SystemOtherComps.PH_Panel OptionPN;
    private javax.swing.JLabel Option_BT;
    private javax.swing.JLabel SearchIconTXT;
    private javax.swing.JLabel SearchIconTXT1;
    private javax.swing.JLabel TitleTXT;
    public SystemShadowedComp.PH_ComboBox categories;
    private SystemOtherComps.PH_TextField change;
    private SystemOtherComps.PH_TextField change1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menu;
    private Panel.Items newJPanel1;
    private Panel.Items newJPanel10;
    private Panel.Items newJPanel11;
    private Panel.Items newJPanel12;
    private Panel.Items newJPanel13;
    private Panel.Items newJPanel14;
    private Panel.Items newJPanel15;
    private Panel.Items newJPanel2;
    private Panel.Items newJPanel3;
    private Panel.Items newJPanel4;
    private Panel.Items newJPanel5;
    private Panel.Items newJPanel6;
    private Panel.Items newJPanel7;
    private Panel.Items newJPanel8;
    private Panel.Items newJPanel9;
    private SystemOtherComps.PH_TextField payment;
    private javax.swing.JLabel paymenttxt;
    private javax.swing.JLabel paymenttxt1;
    private javax.swing.JLabel paymenttxt2;
    private SystemOtherComps.PH_TextField totalcost;
    // End of variables declaration//GEN-END:variables
}
