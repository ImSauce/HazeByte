
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
        Games_txt.requestFocus();
        
        categories.setSelectedItem("Action");
        categories.setSelectedItem("All");
        Historycategories.setSelectedItem("Action");
        Historycategories.setSelectedItem("All");
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
            
            
        CartDescriptionTXT.setLineWrap(true);     // Auto-wrap text in JTextArea
        CartDescriptionTXT.setWrapStyleWord(true); // Wrap at word boundaries in JTextArea
        EditDescription.setLineWrap(true);  
        EditDescription.setWrapStyleWord(true);
    }

    
    
    
    public void showcase(boolean Home_, boolean Edit_, boolean Add_, boolean History_, boolean Info_, boolean Cart_){
        Home.setVisible(Home_);
        Edit.setVisible(Edit_);
        Add.setVisible(Add_);
        History.setVisible(History_);
        Info.setVisible(Info_);
        Cart.setVisible(Cart_);     
    }
    
    public void MenuHighlight(boolean home, boolean option, boolean history, boolean info){
        HomeClicked = home;
        OptionClicked = option;
        HistoryClicked =history;
        InfoClicked =info; 
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
        Add = new javax.swing.JPanel();
        AddBar = new javax.swing.JPanel();
        AddBT2 = new javax.swing.JLabel();
        EditBT2 = new javax.swing.JLabel();
        AddCost = new SystemOtherComps.PH_TextField();
        AddNameText = new javax.swing.JLabel();
        AddBT = new SystemOtherComps.PH_Button();
        CancelBT = new SystemOtherComps.PH_Button();
        AddImage = new SystemShadowedComp.PH_SDWLabel();
        AddCostText = new javax.swing.JLabel();
        AddName = new SystemOtherComps.PH_TextField();
        AddCategoryText = new javax.swing.JLabel();
        AddCategory = new SystemShadowedComp.PH_ComboBox();
        AddDescriptionText = new javax.swing.JLabel();
        AddDescriptionScroll = new javax.swing.JScrollPane();
        AddDescription = new javax.swing.JTextArea();
        Edit = new javax.swing.JPanel();
        EditBar = new javax.swing.JPanel();
        AddBT1 = new javax.swing.JLabel();
        EditBT1 = new javax.swing.JLabel();
        EditSideBar = new javax.swing.JPanel();
        EditSearch = new SystemOtherComps.PH_TextField();
        EditSearchIcon = new javax.swing.JLabel();
        EditTableScroll = new SystemOtherComps.PH_ScrollPane();
        EditTable = new javax.swing.JTable();
        EditCost = new SystemOtherComps.PH_TextField();
        EditNameText = new javax.swing.JLabel();
        EditSaveBT = new SystemOtherComps.PH_Button();
        EditDeleteBT = new SystemOtherComps.PH_Button();
        EditImage = new SystemShadowedComp.PH_SDWLabel();
        EditCostText = new javax.swing.JLabel();
        EditName = new SystemOtherComps.PH_TextField();
        EditCategoryText = new javax.swing.JLabel();
        EditCategory = new SystemShadowedComp.PH_ComboBox();
        EditDescriptionText = new javax.swing.JLabel();
        EditDescriptionScroll = new javax.swing.JScrollPane();
        EditDescription = new javax.swing.JTextArea();
        History = new javax.swing.JPanel();
        HistoryTableScroll = new SystemOtherComps.PH_ScrollPane();
        HistoryTable = new javax.swing.JTable();
        HistoryBar = new javax.swing.JPanel();
        HistoryText = new javax.swing.JLabel();
        Historycategories = new SystemShadowedComp.PH_ComboBox();
        HistorySearch = new SystemOtherComps.PH_TextField();
        HistorySearchIconTXT = new javax.swing.JLabel();
        HistoryCategoryIcon = new javax.swing.JLabel();
        Info = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Cart = new javax.swing.JPanel();
        CartBar = new javax.swing.JPanel();
        Cart_txt = new javax.swing.JLabel();
        CartBackBT = new javax.swing.JLabel();
        CartItemView = new javax.swing.JPanel();
        CartImageTXT = new SystemShadowedComp.PH_SDWLabel();
        CartCategoryTXT = new javax.swing.JLabel();
        CartTitleTXT = new javax.swing.JLabel();
        CartCostTXT = new javax.swing.JLabel();
        CartDescriptionScroll = new javax.swing.JScrollPane();
        CartDescriptionTXT = new javax.swing.JTextArea();
        CartDescriptionheadingTXT = new javax.swing.JLabel();
        CartRemoveBT = new SystemOtherComps.PH_Button();
        CartQuantityTXT = new SystemOtherComps.PH_TextField();
        CartTotalCostTXT = new javax.swing.JLabel();
        CostIcon = new javax.swing.JLabel();
        quantityIcon = new javax.swing.JLabel();
        payment = new SystemOtherComps.PH_TextField();
        totalcost = new SystemOtherComps.PH_TextField();
        change = new SystemOtherComps.PH_TextField();
        PaymentHeading = new javax.swing.JLabel();
        TotalCostHeading = new javax.swing.JLabel();
        ChangeHeading = new javax.swing.JLabel();
        CartTableScroll = new SystemOtherComps.PH_ScrollPane();
        CartTable = new javax.swing.JTable();
        BuyBT = new SystemOtherComps.PH_Button();
        CancelAllBT = new SystemOtherComps.PH_Button();
        Home = new javax.swing.JPanel();
        GameBar = new javax.swing.JPanel();
        Games_txt = new javax.swing.JLabel();
        CartPN = new SystemOtherComps.PH_Panel();
        CartBT = new javax.swing.JLabel();
        Cart_Line = new javax.swing.JPanel();
        categories = new SystemShadowedComp.PH_ComboBox();
        GameSearchTXT = new SystemOtherComps.PH_TextField();
        HomeSearchIcon = new javax.swing.JLabel();
        HomeCategoryIconTXT = new javax.swing.JLabel();
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
                        .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(HomePN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(OptionPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(HistoryPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                        .addComponent(InfoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(menu);

        layers.setLayout(new java.awt.CardLayout());

        Add.setBackground(new java.awt.Color(24, 23, 23));
        Add.setPreferredSize(new java.awt.Dimension(783, 594));

        AddBar.setBackground(new java.awt.Color(24, 23, 23));

        AddBT2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        AddBT2.setForeground(new java.awt.Color(255, 255, 255));
        AddBT2.setText("Add Product");
        AddBT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBT2MouseClicked(evt);
            }
        });

        EditBT2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EditBT2.setForeground(new java.awt.Color(102, 102, 102));
        EditBT2.setText("Edit Product");
        EditBT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBT2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditBT2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditBT2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddBarLayout = new javax.swing.GroupLayout(AddBar);
        AddBar.setLayout(AddBarLayout);
        AddBarLayout.setHorizontalGroup(
            AddBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(EditBT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBT2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddBarLayout.setVerticalGroup(
            AddBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBT2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(EditBT2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        AddBT.setText("Save");
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

        AddImage.setAAA_FitToSize(true);
        AddImage.setAAA_ImageBoundArcSize(2);
        AddImage.setAAA_roundBottomLeft(2);
        AddImage.setAAA_roundBottomRight(2);
        AddImage.setAAA_roundTopLeft(2);
        AddImage.setAAA_roundTopRight(2);
        AddImage.setAA_ArcSize(2);
        AddImage.setAA_BorderSize(0);
        AddImage.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/download-modified.png"))); // NOI18N
        AddImage.setAA_DrawImage(true);
        AddImage.setAA_OpaqueBackground(true);

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
        AddCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
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
        AddDescription.setText("MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.\n");
        AddDescription.setBorder(null);
        AddDescription.setFocusable(false);
        AddDescriptionScroll.setViewportView(AddDescription);

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addComponent(AddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddNameText)
                                    .addComponent(AddCostText)))
                            .addGroup(AddLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddCategoryText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddCost, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddDescriptionScroll)
                            .addComponent(AddDescriptionText))))
                .addGap(303, 303, 303))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addComponent(AddBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNameText)
                            .addComponent(AddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCostText)
                            .addComponent(AddCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCategoryText)
                            .addComponent(AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddDescriptionScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        layers.add(Add, "card2");

        Edit.setBackground(new java.awt.Color(24, 23, 23));
        Edit.setPreferredSize(new java.awt.Dimension(783, 594));

        EditBar.setBackground(new java.awt.Color(24, 23, 23));

        AddBT1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddBT1.setForeground(new java.awt.Color(102, 102, 102));
        AddBT1.setText("Add Product");
        AddBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBT1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddBT1MouseExited(evt);
            }
        });

        EditBT1.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        EditBT1.setForeground(new java.awt.Color(255, 255, 255));
        EditBT1.setText("Edit Product");
        EditBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBT1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EditBarLayout = new javax.swing.GroupLayout(EditBar);
        EditBar.setLayout(EditBarLayout);
        EditBarLayout.setHorizontalGroup(
            EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditBarLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(AddBT1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EditBarLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(EditBT1)
                    .addContainerGap(664, Short.MAX_VALUE)))
        );
        EditBarLayout.setVerticalGroup(
            EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditBarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(AddBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EditBarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EditBT1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        EditSideBar.setBackground(new java.awt.Color(24, 23, 23));

        EditSearch.setForeground(new java.awt.Color(255, 255, 255));
        EditSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditSearch.setAA_TextHint("Search...");
        EditSearch.setAB_LineColor(new java.awt.Color(51, 51, 51));

        EditSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        EditTable.setBackground(new java.awt.Color(24, 23, 23));
        EditTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        EditTable.setForeground(new java.awt.Color(255, 255, 255));
        EditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dsadas"},
                {"sadsa"},
                {"dsad"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Products"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EditTable.setFocusable(false);
        EditTable.setGridColor(new java.awt.Color(24, 23, 23));
        EditTable.setRowHeight(40);
        EditTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        EditTableScroll.setViewportView(EditTable);
        if (EditTable.getColumnModel().getColumnCount() > 0) {
            EditTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout EditSideBarLayout = new javax.swing.GroupLayout(EditSideBar);
        EditSideBar.setLayout(EditSideBarLayout);
        EditSideBarLayout.setHorizontalGroup(
            EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditSideBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(EditSideBarLayout.createSequentialGroup()
                        .addComponent(EditSearchIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EditSideBarLayout.setVerticalGroup(
            EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditSideBarLayout.createSequentialGroup()
                        .addComponent(EditSearchIcon)
                        .addGap(9, 9, 9)))
                .addComponent(EditTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditCost.setBackground(new java.awt.Color(24, 23, 23));
        EditCost.setForeground(new java.awt.Color(255, 255, 255));
        EditCost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditCost.setAAA_roundBottomLeft(20);
        EditCost.setAAA_roundBottomRight(20);
        EditCost.setAAA_roundTopLeft(20);
        EditCost.setAAA_roundTopRight(20);
        EditCost.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        EditCost.setAA_DrawBorder(true);
        EditCost.setAA_DrawBottomBorder(true);
        EditCost.setAA_DrawLeftBorder(true);
        EditCost.setAA_DrawLine(false);
        EditCost.setAA_DrawRightBorder(true);
        EditCost.setAA_DrawTopBorder(true);
        EditCost.setAA_TextHint("   Enter Cost");
        EditCost.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        EditNameText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditNameText.setText(" Name:");

        EditSaveBT.setBackground(new java.awt.Color(32, 180, 52));
        EditSaveBT.setForeground(new java.awt.Color(255, 255, 255));
        EditSaveBT.setText("Save");
        EditSaveBT.setAAA_ImageBoundArcSize(10);
        EditSaveBT.setAAA_roundBottomLeft(10);
        EditSaveBT.setAAA_roundBottomRight(10);
        EditSaveBT.setAAA_roundTopLeft(10);
        EditSaveBT.setAAA_roundTopRight(10);
        EditSaveBT.setAA_ArcSize(10);
        EditSaveBT.setAA_ButtonColor(new java.awt.Color(32, 180, 52));
        EditSaveBT.setAA_HoverColor(new java.awt.Color(95, 219, 112));
        EditSaveBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        EditSaveBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        EditSaveBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        EditDeleteBT.setBackground(new java.awt.Color(24, 23, 23));
        EditDeleteBT.setText("Delete");
        EditDeleteBT.setAAA_ImageBoundArcSize(10);
        EditDeleteBT.setAAA_roundBottomLeft(10);
        EditDeleteBT.setAAA_roundBottomRight(10);
        EditDeleteBT.setAAA_roundTopLeft(10);
        EditDeleteBT.setAAA_roundTopRight(10);
        EditDeleteBT.setAA_ArcSize(10);
        EditDeleteBT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        EditDeleteBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        EditDeleteBT.setAA_DrawBorder(true);
        EditDeleteBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        EditDeleteBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        EditDeleteBT.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        EditDeleteBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        EditImage.setAAA_FitToSize(true);
        EditImage.setAAA_ImageBoundArcSize(2);
        EditImage.setAAA_roundBottomLeft(2);
        EditImage.setAAA_roundBottomRight(2);
        EditImage.setAAA_roundTopLeft(2);
        EditImage.setAAA_roundTopRight(2);
        EditImage.setAA_ArcSize(2);
        EditImage.setAA_BorderSize(0);
        EditImage.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/download-modified.png"))); // NOI18N
        EditImage.setAA_DrawImage(true);
        EditImage.setAA_OpaqueBackground(true);

        EditCostText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditCostText.setText("Cost:");

        EditName.setBackground(new java.awt.Color(24, 23, 23));
        EditName.setForeground(new java.awt.Color(255, 255, 255));
        EditName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditName.setAAA_roundBottomLeft(20);
        EditName.setAAA_roundBottomRight(20);
        EditName.setAAA_roundTopLeft(20);
        EditName.setAAA_roundTopRight(20);
        EditName.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        EditName.setAA_DrawBorder(true);
        EditName.setAA_DrawBottomBorder(true);
        EditName.setAA_DrawLeftBorder(true);
        EditName.setAA_DrawLine(false);
        EditName.setAA_DrawRightBorder(true);
        EditName.setAA_DrawTopBorder(true);
        EditName.setAA_TextHint("   Enter Name");
        EditName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        EditCategoryText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditCategoryText.setText("Category:");

        EditCategory.setForeground(new java.awt.Color(255, 255, 255));
        EditCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
        EditCategory.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        EditCategory.setAA_lineColor(new java.awt.Color(45, 187, 63));
        EditCategory.setFocusable(false);
        EditCategory.setLabeText("    ");
        EditCategory.setRequestFocusEnabled(false);
        EditCategory.setVerifyInputWhenFocusTarget(false);

        EditDescriptionText.setForeground(new java.awt.Color(255, 255, 255));
        EditDescriptionText.setText("Description:");

        EditDescriptionScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        EditDescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        EditDescriptionScroll.setToolTipText("");

        EditDescription.setBackground(new java.awt.Color(24, 23, 23));
        EditDescription.setColumns(20);
        EditDescription.setRows(5);
        EditDescription.setText("MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.\n");
        EditDescription.setBorder(null);
        EditDescription.setFocusable(false);
        EditDescriptionScroll.setViewportView(EditDescription);

        javax.swing.GroupLayout EditLayout = new javax.swing.GroupLayout(Edit);
        Edit.setLayout(EditLayout);
        EditLayout.setHorizontalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EditLayout.createSequentialGroup()
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditDeleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditSaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(EditLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditLayout.createSequentialGroup()
                                .addComponent(EditImage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EditNameText)
                                            .addComponent(EditCostText)))
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EditCategoryText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditCost, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EditLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditDescriptionScroll)
                                    .addComponent(EditDescriptionText))))
                        .addGap(53, 53, 53)))
                .addComponent(EditSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EditLayout.setVerticalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditLayout.createSequentialGroup()
                .addComponent(EditBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditLayout.createSequentialGroup()
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditImage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EditLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditNameText)
                                    .addComponent(EditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditCostText)
                                    .addComponent(EditCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditCategoryText)
                                    .addComponent(EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditDescriptionScroll)
                        .addGap(18, 18, 18)
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditDeleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditSaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(EditSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layers.add(Edit, "card2");

        History.setBackground(new java.awt.Color(24, 23, 23));

        HistoryTable.setBackground(new java.awt.Color(24, 23, 23));
        HistoryTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HistoryTable.setForeground(new java.awt.Color(255, 255, 255));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
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
        HistoryTable.setFocusable(false);
        HistoryTable.setGridColor(new java.awt.Color(24, 23, 23));
        HistoryTable.setRowHeight(40);
        HistoryTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        HistoryTableScroll.setViewportView(HistoryTable);
        if (HistoryTable.getColumnModel().getColumnCount() > 0) {
            HistoryTable.getColumnModel().getColumn(0).setResizable(false);
            HistoryTable.getColumnModel().getColumn(1).setHeaderValue("Quantity");
            HistoryTable.getColumnModel().getColumn(2).setHeaderValue("Cost");
            HistoryTable.getColumnModel().getColumn(3).setResizable(false);
            HistoryTable.getColumnModel().getColumn(3).setHeaderValue("Total");
        }

        HistoryBar.setBackground(new java.awt.Color(24, 23, 23));

        HistoryText.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        HistoryText.setForeground(new java.awt.Color(255, 255, 255));
        HistoryText.setText("Transaction History");

        Historycategories.setForeground(new java.awt.Color(255, 255, 255));
        Historycategories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
        Historycategories.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        Historycategories.setAA_lineColor(new java.awt.Color(45, 187, 63));
        Historycategories.setFocusable(false);
        Historycategories.setLabeText("   Categories ");
        Historycategories.setRequestFocusEnabled(false);
        Historycategories.setVerifyInputWhenFocusTarget(false);

        HistorySearch.setForeground(new java.awt.Color(255, 255, 255));
        HistorySearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        HistorySearch.setAA_TextHint("Search...");
        HistorySearch.setAB_LineColor(new java.awt.Color(51, 51, 51));

        HistorySearchIconTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        HistoryCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

        javax.swing.GroupLayout HistoryBarLayout = new javax.swing.GroupLayout(HistoryBar);
        HistoryBar.setLayout(HistoryBarLayout);
        HistoryBarLayout.setHorizontalGroup(
            HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HistoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(HistoryCategoryIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Historycategories, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(HistorySearchIconTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        HistoryBarLayout.setVerticalGroup(
            HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryBarLayout.createSequentialGroup()
                .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistoryBarLayout.createSequentialGroup()
                        .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HistoryBarLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Historycategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HistoryBarLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(HistoryCategoryIcon)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HistorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                                .addComponent(HistorySearchIconTXT)
                                .addGap(9, 9, 9))))
                    .addGroup(HistoryBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HistoryText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HistoryBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HistoryTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addComponent(HistoryBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap(418, Short.MAX_VALUE))
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jToggleButton1)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        layers.add(Info, "card5");

        Cart.setBackground(new java.awt.Color(24, 23, 23));
        Cart.setPreferredSize(new java.awt.Dimension(783, 594));

        CartBar.setBackground(new java.awt.Color(24, 23, 23));

        Cart_txt.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        Cart_txt.setForeground(new java.awt.Color(255, 255, 255));
        Cart_txt.setText("Cart");

        CartBackBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        CartBackBT.setToolTipText("back");
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

        CartImageTXT.setAAA_FitToSize(true);
        CartImageTXT.setAAA_ImageBoundArcSize(2);
        CartImageTXT.setAAA_roundBottomLeft(2);
        CartImageTXT.setAAA_roundBottomRight(2);
        CartImageTXT.setAAA_roundTopLeft(2);
        CartImageTXT.setAAA_roundTopRight(2);
        CartImageTXT.setAA_ArcSize(2);
        CartImageTXT.setAA_BorderSize(0);
        CartImageTXT.setAA_CompImage(new javax.swing.ImageIcon(getClass().getResource("/Images/download-modified.png"))); // NOI18N
        CartImageTXT.setAA_DrawImage(true);
        CartImageTXT.setAA_OpaqueBackground(true);

        CartCategoryTXT.setForeground(new java.awt.Color(102, 102, 102));
        CartCategoryTXT.setText("Gacha Game");

        CartTitleTXT.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CartTitleTXT.setText("MiSide");

        CartCostTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CartCostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CartCostTXT.setText("456$");

        CartDescriptionScroll.setBorder(null);
        CartDescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CartDescriptionScroll.setToolTipText("");

        CartDescriptionTXT.setBackground(new java.awt.Color(24, 23, 23));
        CartDescriptionTXT.setColumns(20);
        CartDescriptionTXT.setRows(5);
        CartDescriptionTXT.setText("MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.MiSide is an adventure game with horror elements developed by Russian indie development team AIHASTO. It was initially published as a demo on August 18, 2023, before being fully released on Steam on December 11, 2024.\n");
        CartDescriptionTXT.setBorder(null);
        CartDescriptionTXT.setFocusable(false);
        CartDescriptionScroll.setViewportView(CartDescriptionTXT);

        CartDescriptionheadingTXT.setForeground(new java.awt.Color(102, 102, 102));
        CartDescriptionheadingTXT.setText("Description:");

        CartRemoveBT.setBackground(new java.awt.Color(24, 23, 23));
        CartRemoveBT.setText("Remove from cart");
        CartRemoveBT.setAAA_ImageBoundArcSize(10);
        CartRemoveBT.setAAA_roundBottomLeft(10);
        CartRemoveBT.setAAA_roundBottomRight(10);
        CartRemoveBT.setAAA_roundTopLeft(10);
        CartRemoveBT.setAAA_roundTopRight(10);
        CartRemoveBT.setAA_ArcSize(10);
        CartRemoveBT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        CartRemoveBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        CartRemoveBT.setAA_DrawBorder(true);
        CartRemoveBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        CartRemoveBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        CartRemoveBT.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        CartRemoveBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

        CartQuantityTXT.setBackground(new java.awt.Color(38, 38, 38));
        CartQuantityTXT.setForeground(new java.awt.Color(204, 204, 204));
        CartQuantityTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CartQuantityTXT.setToolTipText("quantity");
        CartQuantityTXT.setAAA_roundBottomLeft(20);
        CartQuantityTXT.setAAA_roundBottomRight(20);
        CartQuantityTXT.setAAA_roundTopLeft(20);
        CartQuantityTXT.setAAA_roundTopRight(20);
        CartQuantityTXT.setAA_DrawLine(false);
        CartQuantityTXT.setAA_TextHint("      0");
        CartQuantityTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        CartTotalCostTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CartTotalCostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CartTotalCostTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CartTotalCostTXT.setText("4560000000000000000$");
        CartTotalCostTXT.setToolTipText("cost");

        CostIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cost.png"))); // NOI18N
        CostIcon.setToolTipText("cost");

        quantityIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quantity.png"))); // NOI18N
        quantityIcon.setToolTipText("quantity");

        javax.swing.GroupLayout CartItemViewLayout = new javax.swing.GroupLayout(CartItemView);
        CartItemView.setLayout(CartItemViewLayout);
        CartItemViewLayout.setHorizontalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartItemViewLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CartImageTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CartTitleTXT)
                            .addComponent(CartCategoryTXT)
                            .addComponent(CartCostTXT)
                            .addComponent(CartDescriptionheadingTXT)
                            .addComponent(CartDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CartRemoveBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CostIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CartQuantityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartTotalCostTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        CartItemViewLayout.setVerticalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartItemViewLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(CartImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartCategoryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartTitleTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartCostTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CartDescriptionheadingTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartDescriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartItemViewLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(quantityIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CartItemViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CartQuantityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CostIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CartTotalCostTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CartRemoveBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        PaymentHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PaymentHeading.setText("Payment:");

        TotalCostHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TotalCostHeading.setText("Total Cost:");

        ChangeHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ChangeHeading.setText("Change:");

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

        CancelAllBT.setBackground(new java.awt.Color(24, 23, 23));
        CancelAllBT.setText("Cancel all");
        CancelAllBT.setAAA_ImageBoundArcSize(10);
        CancelAllBT.setAAA_roundBottomLeft(10);
        CancelAllBT.setAAA_roundBottomRight(10);
        CancelAllBT.setAAA_roundTopLeft(10);
        CancelAllBT.setAAA_roundTopRight(10);
        CancelAllBT.setAA_ArcSize(10);
        CancelAllBT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        CancelAllBT.setAA_ButtonColor(new java.awt.Color(24, 23, 23));
        CancelAllBT.setAA_DrawBorder(true);
        CancelAllBT.setAA_HoverColor(new java.awt.Color(38, 38, 38));
        CancelAllBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        CancelAllBT.setAA_RippleColor(new java.awt.Color(215, 54, 54));
        CancelAllBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N

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
                                    .addComponent(TotalCostHeading)
                                    .addComponent(ChangeHeading, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PaymentHeading, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalcost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(CartLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CartTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(CartLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelAllBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(CartTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentHeading))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalCostHeading))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeHeading))
                        .addGap(76, 76, 76)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelAllBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        CartBT.setToolTipText("Cart");
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

        HomeSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        HomeCategoryIconTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

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
                .addComponent(HomeCategoryIconTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(HomeSearchIcon)
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
                                        .addComponent(HomeCategoryIconTXT)
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
                                .addComponent(HomeSearchIcon)
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
        showcase(true,false,false,false,false,false);
        MenuHighlight(true,false,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_Home_BTMouseClicked

    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        showcase(false,true,false,false,false,false);
        MenuHighlight(false,true,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_Option_BTMouseClicked

    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        showcase(false,false,false,true,false,false);
        MenuHighlight(false,false,true,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, InfoPN ); 
    }//GEN-LAST:event_History_BTMouseClicked

    private void Info_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_BTMouseClicked
        showcase(false,false,false,false,true,false);
        MenuHighlight(false,false,false,true);
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
        showcase(false,false,false,false,false,true);
    }//GEN-LAST:event_CartBTMouseClicked

    private void categoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesMouseClicked
        
    }//GEN-LAST:event_categoriesMouseClicked
 //------------------HOME PANEL FRONTEND CODES------------------// 
    
    
    private void CartBackBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackBTMouseClicked
        showcase(true,false,false,false,false,false);
    }//GEN-LAST:event_CartBackBTMouseClicked

    private void EditBT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT1MouseClicked
        showcase(false,true,false,false,false,false);
    }//GEN-LAST:event_EditBT1MouseClicked

    private void AddBT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseClicked
        showcase(false,false,true,false,false,false);
    }//GEN-LAST:event_AddBT1MouseClicked

    private void EditBT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseClicked
        showcase(false,true,false,false,false,false);
    }//GEN-LAST:event_EditBT2MouseClicked

    private void AddBT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT2MouseClicked
        showcase(false,false,true,false,false,false);
    }//GEN-LAST:event_AddBT2MouseClicked

    private void EditBT2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseEntered
        EditBT2.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_EditBT2MouseEntered

    private void EditBT2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseExited
        EditBT2.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_EditBT2MouseExited

    private void AddBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseEntered
         AddBT1.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_AddBT1MouseEntered

    private void AddBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseExited
         AddBT1.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_AddBT1MouseExited
  
    
    
    
    
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private SystemOtherComps.PH_Button AddBT;
    private javax.swing.JLabel AddBT1;
    private javax.swing.JLabel AddBT2;
    private javax.swing.JPanel AddBar;
    public SystemShadowedComp.PH_ComboBox AddCategory;
    private javax.swing.JLabel AddCategoryText;
    private SystemOtherComps.PH_TextField AddCost;
    private javax.swing.JLabel AddCostText;
    private javax.swing.JTextArea AddDescription;
    private javax.swing.JScrollPane AddDescriptionScroll;
    private javax.swing.JLabel AddDescriptionText;
    private SystemShadowedComp.PH_SDWLabel AddImage;
    private SystemOtherComps.PH_TextField AddName;
    private javax.swing.JLabel AddNameText;
    private SystemOtherComps.PH_Button BuyBT;
    private SystemOtherComps.PH_Button CancelAllBT;
    private SystemOtherComps.PH_Button CancelBT;
    private javax.swing.JPanel Cart;
    private javax.swing.JLabel CartBT;
    private javax.swing.JLabel CartBackBT;
    private javax.swing.JPanel CartBar;
    private javax.swing.JLabel CartCategoryTXT;
    private javax.swing.JLabel CartCostTXT;
    private javax.swing.JScrollPane CartDescriptionScroll;
    private javax.swing.JTextArea CartDescriptionTXT;
    private javax.swing.JLabel CartDescriptionheadingTXT;
    private SystemShadowedComp.PH_SDWLabel CartImageTXT;
    private javax.swing.JPanel CartItemView;
    private SystemOtherComps.PH_Panel CartPN;
    private SystemOtherComps.PH_TextField CartQuantityTXT;
    private SystemOtherComps.PH_Button CartRemoveBT;
    public javax.swing.JTable CartTable;
    private SystemOtherComps.PH_ScrollPane CartTableScroll;
    private javax.swing.JLabel CartTitleTXT;
    private javax.swing.JLabel CartTotalCostTXT;
    private javax.swing.JPanel Cart_Line;
    private javax.swing.JLabel Cart_txt;
    private javax.swing.JLabel ChangeHeading;
    private javax.swing.JLabel CostIcon;
    private javax.swing.JPanel Edit;
    private javax.swing.JLabel EditBT1;
    private javax.swing.JLabel EditBT2;
    private javax.swing.JPanel EditBar;
    public SystemShadowedComp.PH_ComboBox EditCategory;
    private javax.swing.JLabel EditCategoryText;
    private SystemOtherComps.PH_TextField EditCost;
    private javax.swing.JLabel EditCostText;
    private SystemOtherComps.PH_Button EditDeleteBT;
    private javax.swing.JTextArea EditDescription;
    private javax.swing.JScrollPane EditDescriptionScroll;
    private javax.swing.JLabel EditDescriptionText;
    private SystemShadowedComp.PH_SDWLabel EditImage;
    private SystemOtherComps.PH_TextField EditName;
    private javax.swing.JLabel EditNameText;
    private SystemOtherComps.PH_Button EditSaveBT;
    private SystemOtherComps.PH_TextField EditSearch;
    private javax.swing.JLabel EditSearchIcon;
    private javax.swing.JPanel EditSideBar;
    public javax.swing.JTable EditTable;
    private SystemOtherComps.PH_ScrollPane EditTableScroll;
    private javax.swing.JPanel GameBar;
    private SystemOtherComps.PH_BettterFlowLayoutPanel GameList;
    private SystemOtherComps.PH_ScrollPane GameScroll;
    private SystemOtherComps.PH_TextField GameSearchTXT;
    public javax.swing.JLabel Games_txt;
    private javax.swing.JPanel History;
    private javax.swing.JPanel HistoryBar;
    private javax.swing.JLabel HistoryCategoryIcon;
    private SystemOtherComps.PH_Panel HistoryPN;
    private SystemOtherComps.PH_TextField HistorySearch;
    private javax.swing.JLabel HistorySearchIconTXT;
    public javax.swing.JTable HistoryTable;
    private SystemOtherComps.PH_ScrollPane HistoryTableScroll;
    public javax.swing.JLabel HistoryText;
    private javax.swing.JLabel History_BT;
    public SystemShadowedComp.PH_ComboBox Historycategories;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel HomeCategoryIconTXT;
    private SystemOtherComps.PH_Panel HomePN;
    private javax.swing.JLabel HomeSearchIcon;
    public javax.swing.JLabel Home_BT;
    private javax.swing.JPanel Info;
    private SystemOtherComps.PH_Panel InfoPN;
    private javax.swing.JLabel Info_BT;
    private SystemOtherComps.PH_Panel OptionPN;
    private javax.swing.JLabel Option_BT;
    private javax.swing.JLabel PaymentHeading;
    private javax.swing.JLabel TotalCostHeading;
    public SystemShadowedComp.PH_ComboBox categories;
    private SystemOtherComps.PH_TextField change;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel quantityIcon;
    private SystemOtherComps.PH_TextField totalcost;
    // End of variables declaration//GEN-END:variables
}
