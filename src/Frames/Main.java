
package Frames;
//import java.awt.Color;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import Classes.Functions;
import Classes.Run;
import Classes.serverCredentials;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Main extends javax.swing.JFrame {

    private ChangePassword ChangePass;
    private ChangeUsername ChangeUser;
    
    //variables for detecting if a menu button is clicked
    Functions function = new Functions();
    boolean HomeClicked = true;
    boolean OptionClicked = false;
    boolean HistoryClicked = false;
    boolean InfoClicked =false;
    
    
    int add_remove_image = 0;
    int edit_remove_image = 0;
    
    File f1 = null;
    String  path1 = null;
    private ImageIcon format1 = null;
    
    File f2 = null;
    String  path2 = null;
    private ImageIcon format2 = null;
    
    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
  

    public void connect() {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP("localhost");
        sv.setUserID("root");
        sv.setPass("");
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP() +"/hazebyte", sv.getUserID(), sv.getPass());
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }    

    public Main() {
        initComponents();
        connect();
        startup();
        
        Hidden.setVisible(false);
        
        
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
        SettingsPN = new SystemOtherComps.PH_Panel();
        Settings_BT = new javax.swing.JLabel();
        layers = new javax.swing.JLayeredPane();
        Hidden = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addimagetool1 = new javax.swing.JPanel();
        EditID = new javax.swing.JLabel();
        iddesc1 = new javax.swing.JLabel();
        imagenamedesk1 = new javax.swing.JLabel();
        imagepathdesc1 = new javax.swing.JLabel();
        edit_imageName = new javax.swing.JLabel();
        edit_imagePath = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addimagetool = new javax.swing.JPanel();
        AddID = new javax.swing.JLabel();
        iddesc = new javax.swing.JLabel();
        imagenamedesk = new javax.swing.JLabel();
        imagepathdesc = new javax.swing.JLabel();
        add_imageName = new javax.swing.JLabel();
        add_imagePath = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        HistoryTableScroll = new SystemOtherComps.PH_ScrollPane();
        HistoryTable = new javax.swing.JTable();
        HistoryBar = new javax.swing.JPanel();
        HistoryText = new javax.swing.JLabel();
        Historycategories = new SystemShadowedComp.PH_ComboBox();
        HistorySearch = new SystemOtherComps.PH_TextField();
        HistorySearchIconTXT = new javax.swing.JLabel();
        HistoryCategoryIcon = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        SettingsBar = new javax.swing.JPanel();
        SettingsText = new javax.swing.JLabel();
        ChangeUsernamePN = new SystemOtherComps.PH_Panel();
        ChangeusernameDesc = new javax.swing.JLabel();
        ChangeUsernameHeading = new javax.swing.JLabel();
        Settings_BT1 = new javax.swing.JLabel();
        ChangePassPN = new SystemOtherComps.PH_Panel();
        ChangepassDesc1 = new javax.swing.JLabel();
        ChangePassHeading1 = new javax.swing.JLabel();
        Settings_BT2 = new javax.swing.JLabel();
        AboutPN = new SystemOtherComps.PH_Panel();
        AboutDesc = new javax.swing.JLabel();
        AboutHeading = new javax.swing.JLabel();
        Settings_BT3 = new javax.swing.JLabel();
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
        total = new SystemOtherComps.PH_TextField();
        change = new SystemOtherComps.PH_TextField();
        PaymentHeading = new javax.swing.JLabel();
        TotalCostHeading = new javax.swing.JLabel();
        ChangeHeading = new javax.swing.JLabel();
        CartTableScroll = new SystemOtherComps.PH_ScrollPane();
        CartTable = new javax.swing.JTable();
        BuyBT = new SystemOtherComps.PH_Button();
        CancelAllBT = new SystemOtherComps.PH_Button();
        subtotal = new SystemOtherComps.PH_TextField();
        SubtotalHeading = new javax.swing.JLabel();
        totaldiscount = new SystemOtherComps.PH_TextField();
        TotalDiscountHeading = new javax.swing.JLabel();
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
        Add = new javax.swing.JPanel();
        AddBar = new javax.swing.JPanel();
        AddBT2 = new javax.swing.JLabel();
        EditBT2 = new javax.swing.JLabel();
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
        Edit = new javax.swing.JPanel();
        EditBar = new javax.swing.JPanel();
        AddBT1 = new javax.swing.JLabel();
        EditBT1 = new javax.swing.JLabel();
        EditSideBar = new javax.swing.JPanel();
        EditSearch = new SystemOtherComps.PH_TextField();
        EditSearchIcon = new javax.swing.JLabel();
        EditTableScroll = new SystemOtherComps.PH_ScrollPane();
        EditTable = new javax.swing.JTable();
        EditCategorySort = new SystemShadowedComp.PH_ComboBox();
        EditSearchIcon1 = new javax.swing.JLabel();
        EditSaveBT = new SystemOtherComps.PH_Button();
        EditDeleteBT = new SystemOtherComps.PH_Button();
        EditDescriptionText = new javax.swing.JLabel();
        EditDescriptionScroll = new javax.swing.JScrollPane();
        EditDescription = new javax.swing.JTextArea();
        EditImage = new javax.swing.JLabel();
        EditCost = new SystemOtherComps.PH_TextField();
        EditName = new SystemOtherComps.PH_TextField();
        EditNameText = new javax.swing.JLabel();
        EditCostText = new javax.swing.JLabel();
        EditDiscount = new SystemOtherComps.PH_TextField();
        EditDiscountText = new javax.swing.JLabel();
        EditCategoryText = new javax.swing.JLabel();
        EditCategory = new SystemShadowedComp.PH_ComboBox();
        saveloading = new Splash.LoadingAnimation();
        saving = new javax.swing.JLabel();

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

        SettingsPN.setBackground(new java.awt.Color(24, 23, 23));
        SettingsPN.setAAA_ImageBoundArcSize(20);
        SettingsPN.setAAA_roundBottomLeft(20);
        SettingsPN.setAAA_roundBottomRight(20);
        SettingsPN.setAAA_roundTopLeft(20);
        SettingsPN.setAAA_roundTopRight(20);

        Settings_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        Settings_BT.setToolTipText("Developer Info");
        Settings_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Settings_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Settings_BTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Settings_BTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SettingsPNLayout = new javax.swing.GroupLayout(SettingsPN);
        SettingsPN.setLayout(SettingsPNLayout);
        SettingsPNLayout.setHorizontalGroup(
            SettingsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Settings_BT)
                .addContainerGap())
        );
        SettingsPNLayout.setVerticalGroup(
            SettingsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Settings_BT)
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
                    .addComponent(SettingsPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(SettingsPN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(menu);

        layers.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Add Image");

        addimagetool1.setBackground(new java.awt.Color(102, 102, 102));

        EditID.setText(" ");

        iddesc1.setText("id");

        imagenamedesk1.setText("imgname");

        imagepathdesc1.setText("imgpath");

        edit_imageName.setText(" ");

        edit_imagePath.setText(" ");

        javax.swing.GroupLayout addimagetool1Layout = new javax.swing.GroupLayout(addimagetool1);
        addimagetool1.setLayout(addimagetool1Layout);
        addimagetool1Layout.setHorizontalGroup(
            addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addimagetool1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addimagetool1Layout.createSequentialGroup()
                        .addComponent(iddesc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addimagetool1Layout.createSequentialGroup()
                        .addComponent(imagenamedesk1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_imageName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addimagetool1Layout.createSequentialGroup()
                        .addComponent(imagepathdesc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        addimagetool1Layout.setVerticalGroup(
            addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addimagetool1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditID)
                    .addComponent(iddesc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagenamedesk1)
                    .addComponent(edit_imageName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addimagetool1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagepathdesc1)
                    .addComponent(edit_imagePath))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3.setText("Edit Image");

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

        javax.swing.GroupLayout HiddenLayout = new javax.swing.GroupLayout(Hidden);
        Hidden.setLayout(HiddenLayout);
        HiddenLayout.setHorizontalGroup(
            HiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(HiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addimagetool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addimagetool1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(596, Short.MAX_VALUE))
        );
        HiddenLayout.setVerticalGroup(
            HiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(addimagetool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addimagetool1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        layers.add(Hidden, "card8");

        History.setBackground(new java.awt.Color(24, 23, 23));

        HistoryTable.setBackground(new java.awt.Color(24, 23, 23));
        HistoryTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HistoryTable.setForeground(new java.awt.Color(255, 255, 255));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Miside", "2", "200", "10", "400", "380", "1/3/4", "10:09:07", "1", "1"},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Cost", "Discount", "Subtotal", "Total", "Date", "Time", "ID", "ProductID"
            }
        ));
        HistoryTable.setFocusable(false);
        HistoryTable.setGridColor(new java.awt.Color(24, 23, 23));
        HistoryTable.setRowHeight(40);
        HistoryTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        HistoryTableScroll.setViewportView(HistoryTable);
        if (HistoryTable.getColumnModel().getColumnCount() > 0) {
            HistoryTable.getColumnModel().getColumn(0).setResizable(false);
            HistoryTable.getColumnModel().getColumn(1).setResizable(false);
            HistoryTable.getColumnModel().getColumn(2).setResizable(false);
            HistoryTable.getColumnModel().getColumn(3).setResizable(false);
            HistoryTable.getColumnModel().getColumn(4).setResizable(false);
            HistoryTable.getColumnModel().getColumn(5).setResizable(false);
            HistoryTable.getColumnModel().getColumn(6).setResizable(false);
            HistoryTable.getColumnModel().getColumn(7).setResizable(false);
            HistoryTable.getColumnModel().getColumn(8).setResizable(false);
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

        Settings.setBackground(new java.awt.Color(24, 23, 23));
        Settings.setPreferredSize(new java.awt.Dimension(418, 347));

        SettingsBar.setBackground(new java.awt.Color(24, 23, 23));

        SettingsText.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        SettingsText.setForeground(new java.awt.Color(255, 255, 255));
        SettingsText.setText("Settings");

        javax.swing.GroupLayout SettingsBarLayout = new javax.swing.GroupLayout(SettingsBar);
        SettingsBar.setLayout(SettingsBarLayout);
        SettingsBarLayout.setHorizontalGroup(
            SettingsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(SettingsText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingsBarLayout.setVerticalGroup(
            SettingsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SettingsText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        ChangeUsernamePN.setBackground(new java.awt.Color(24, 23, 23));
        ChangeUsernamePN.setForeground(new java.awt.Color(24, 23, 23));
        ChangeUsernamePN.setAAA_ImageBoundArcSize(30);
        ChangeUsernamePN.setAAA_roundBottomLeft(30);
        ChangeUsernamePN.setAAA_roundBottomRight(30);
        ChangeUsernamePN.setAAA_roundTopLeft(30);
        ChangeUsernamePN.setAAA_roundTopRight(30);
        ChangeUsernamePN.setAA_ArcSize(30);
        ChangeUsernamePN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeUsernamePNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangeUsernamePNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangeUsernamePNMouseExited(evt);
            }
        });

        ChangeusernameDesc.setBackground(new java.awt.Color(102, 102, 102));
        ChangeusernameDesc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ChangeusernameDesc.setForeground(new java.awt.Color(102, 102, 102));
        ChangeusernameDesc.setText("Update your username to a new one");

        ChangeUsernameHeading.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ChangeUsernameHeading.setForeground(new java.awt.Color(255, 255, 255));
        ChangeUsernameHeading.setText("Change Username");

        Settings_BT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usericon.png"))); // NOI18N
        Settings_BT1.setToolTipText("Developer Info");

        javax.swing.GroupLayout ChangeUsernamePNLayout = new javax.swing.GroupLayout(ChangeUsernamePN);
        ChangeUsernamePN.setLayout(ChangeUsernamePNLayout);
        ChangeUsernamePNLayout.setHorizontalGroup(
            ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeUsernamePNLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Settings_BT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangeusernameDesc)
                    .addComponent(ChangeUsernameHeading))
                .addContainerGap(641, Short.MAX_VALUE))
        );
        ChangeUsernamePNLayout.setVerticalGroup(
            ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeUsernamePNLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangeUsernamePNLayout.createSequentialGroup()
                        .addComponent(ChangeUsernameHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangeusernameDesc)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangeUsernamePNLayout.createSequentialGroup()
                        .addComponent(Settings_BT1)
                        .addGap(23, 23, 23))))
        );

        ChangePassPN.setBackground(new java.awt.Color(24, 23, 23));
        ChangePassPN.setForeground(new java.awt.Color(24, 23, 23));
        ChangePassPN.setAAA_ImageBoundArcSize(30);
        ChangePassPN.setAAA_roundBottomLeft(30);
        ChangePassPN.setAAA_roundBottomRight(30);
        ChangePassPN.setAAA_roundTopLeft(30);
        ChangePassPN.setAAA_roundTopRight(30);
        ChangePassPN.setAA_ArcSize(30);
        ChangePassPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePassPNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangePassPNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangePassPNMouseExited(evt);
            }
        });

        ChangepassDesc1.setBackground(new java.awt.Color(102, 102, 102));
        ChangepassDesc1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ChangepassDesc1.setForeground(new java.awt.Color(102, 102, 102));
        ChangepassDesc1.setText("Change your current password to a new one.");

        ChangePassHeading1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ChangePassHeading1.setForeground(new java.awt.Color(255, 255, 255));
        ChangePassHeading1.setText("Change Password");

        Settings_BT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        Settings_BT2.setToolTipText("Developer Info");

        javax.swing.GroupLayout ChangePassPNLayout = new javax.swing.GroupLayout(ChangePassPN);
        ChangePassPN.setLayout(ChangePassPNLayout);
        ChangePassPNLayout.setHorizontalGroup(
            ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePassPNLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Settings_BT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangepassDesc1)
                    .addComponent(ChangePassHeading1))
                .addContainerGap(595, Short.MAX_VALUE))
        );
        ChangePassPNLayout.setVerticalGroup(
            ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePassPNLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePassPNLayout.createSequentialGroup()
                        .addComponent(ChangePassHeading1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangepassDesc1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePassPNLayout.createSequentialGroup()
                        .addComponent(Settings_BT2)
                        .addGap(23, 23, 23))))
        );

        AboutPN.setBackground(new java.awt.Color(24, 23, 23));
        AboutPN.setForeground(new java.awt.Color(24, 23, 23));
        AboutPN.setAAA_ImageBoundArcSize(30);
        AboutPN.setAAA_roundBottomLeft(30);
        AboutPN.setAAA_roundBottomRight(30);
        AboutPN.setAAA_roundTopLeft(30);
        AboutPN.setAAA_roundTopRight(30);
        AboutPN.setAA_ArcSize(30);
        AboutPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutPNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutPNMouseExited(evt);
            }
        });

        AboutDesc.setBackground(new java.awt.Color(102, 102, 102));
        AboutDesc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AboutDesc.setForeground(new java.awt.Color(102, 102, 102));
        AboutDesc.setText("About info shows developers and application details.");

        AboutHeading.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AboutHeading.setForeground(new java.awt.Color(255, 255, 255));
        AboutHeading.setText("About");

        Settings_BT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        Settings_BT3.setToolTipText("Developer Info");

        javax.swing.GroupLayout AboutPNLayout = new javax.swing.GroupLayout(AboutPN);
        AboutPN.setLayout(AboutPNLayout);
        AboutPNLayout.setHorizontalGroup(
            AboutPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutPNLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Settings_BT3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AboutPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AboutDesc)
                    .addComponent(AboutHeading))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutPNLayout.setVerticalGroup(
            AboutPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutPNLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(AboutPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPNLayout.createSequentialGroup()
                        .addComponent(AboutHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AboutDesc)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPNLayout.createSequentialGroup()
                        .addComponent(Settings_BT3)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangeUsernamePN, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addComponent(ChangePassPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addComponent(AboutPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
                .addContainerGap())
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(SettingsBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangeUsernamePN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangePassPN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AboutPN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        layers.add(Settings, "card5");

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

        total.setBackground(new java.awt.Color(38, 38, 38));
        total.setForeground(new java.awt.Color(204, 204, 204));
        total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        total.setAAA_roundBottomLeft(20);
        total.setAAA_roundBottomRight(20);
        total.setAAA_roundTopLeft(20);
        total.setAAA_roundTopRight(20);
        total.setAA_DrawLine(false);
        total.setAA_TextHint("   0");
        total.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
        PaymentHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PaymentHeading.setText("Payment:");

        TotalCostHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TotalCostHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalCostHeading.setText("Total:");

        ChangeHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ChangeHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ChangeHeading.setText("Change:");

        CartTable.setBackground(new java.awt.Color(24, 23, 23));
        CartTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CartTable.setForeground(new java.awt.Color(255, 255, 255));
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Miside", "2", "200", "10", "400", "380", "1/3/4", "10:09:07", "1", "1"},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Cost", "Discount", "Subtotal", "Total", "Date", "Time", "ID", "ProductID"
            }
        ));
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
            CartTable.getColumnModel().getColumn(4).setResizable(false);
            CartTable.getColumnModel().getColumn(5).setResizable(false);
            CartTable.getColumnModel().getColumn(6).setResizable(false);
            CartTable.getColumnModel().getColumn(7).setResizable(false);
            CartTable.getColumnModel().getColumn(8).setResizable(false);
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

        subtotal.setBackground(new java.awt.Color(38, 38, 38));
        subtotal.setForeground(new java.awt.Color(204, 204, 204));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        subtotal.setAAA_roundBottomLeft(20);
        subtotal.setAAA_roundBottomRight(20);
        subtotal.setAAA_roundTopLeft(20);
        subtotal.setAAA_roundTopRight(20);
        subtotal.setAA_DrawLine(false);
        subtotal.setAA_TextHint("   0");
        subtotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        SubtotalHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SubtotalHeading.setText("Subtotal:");

        totaldiscount.setBackground(new java.awt.Color(38, 38, 38));
        totaldiscount.setForeground(new java.awt.Color(204, 204, 204));
        totaldiscount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        totaldiscount.setAAA_roundBottomLeft(20);
        totaldiscount.setAAA_roundBottomRight(20);
        totaldiscount.setAAA_roundTopLeft(20);
        totaldiscount.setAAA_roundTopRight(20);
        totaldiscount.setAA_DrawLine(false);
        totaldiscount.setAA_TextHint("   0");
        totaldiscount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TotalDiscountHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TotalDiscountHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalDiscountHeading.setText("Total Discount:");

        javax.swing.GroupLayout CartLayout = new javax.swing.GroupLayout(Cart);
        Cart.setLayout(CartLayout);
        CartLayout.setHorizontalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CartLayout.createSequentialGroup()
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CartTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addGroup(CartLayout.createSequentialGroup()
                                .addComponent(PaymentHeading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(CartLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelAllBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(CartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChangeHeading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubtotalHeading)
                            .addComponent(TotalDiscountHeading)
                            .addComponent(TotalCostHeading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totaldiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
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
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totaldiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TotalDiscountHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubtotalHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalCostHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChangeHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
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
                .addComponent(GameScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );

        layers.add(Home, "card2");

        Add.setBackground(new java.awt.Color(24, 23, 23));
        Add.setPreferredSize(new java.awt.Dimension(783, 594));

        AddBar.setBackground(new java.awt.Color(24, 23, 23));

        AddBT2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        AddBT2.setForeground(new java.awt.Color(255, 255, 255));
        AddBT2.setText("Add Product");

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
        AddCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
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

        AddDiscount.setBackground(new java.awt.Color(24, 23, 23));
        AddDiscount.setForeground(new java.awt.Color(255, 255, 255));
        AddDiscount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        AddDiscount.setAA_TextHint("   Enter Discount");
        AddDiscount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        AddDiscountText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddDiscountText.setText("Discount:");

        AddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insertimage.jpg"))); // NOI18N
        AddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AddDescriptionText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDiscountText))
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
                .addContainerGap(108, Short.MAX_VALUE))
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
        EditSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                EditSearchCaretUpdate(evt);
            }
        });
        EditSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditSearchMouseClicked(evt);
            }
        });

        EditSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        EditTable.setBackground(new java.awt.Color(24, 23, 23));
        EditTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        EditTable.setForeground(new java.awt.Color(255, 255, 255));
        EditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Products", "Cost", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EditTable.setFocusable(false);
        EditTable.setGridColor(new java.awt.Color(24, 23, 23));
        EditTable.setRowHeight(40);
        EditTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        EditTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditTableMouseClicked(evt);
            }
        });
        EditTableScroll.setViewportView(EditTable);
        if (EditTable.getColumnModel().getColumnCount() > 0) {
            EditTable.getColumnModel().getColumn(0).setMinWidth(0);
            EditTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            EditTable.getColumnModel().getColumn(0).setMaxWidth(0);
            EditTable.getColumnModel().getColumn(1).setResizable(false);
            EditTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            EditTable.getColumnModel().getColumn(2).setMinWidth(0);
            EditTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            EditTable.getColumnModel().getColumn(2).setMaxWidth(0);
            EditTable.getColumnModel().getColumn(3).setMinWidth(0);
            EditTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            EditTable.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        EditCategorySort.setForeground(new java.awt.Color(255, 255, 255));
        EditCategorySort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration" }));
        EditCategorySort.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        EditCategorySort.setAA_lineColor(new java.awt.Color(45, 187, 63));
        EditCategorySort.setFocusable(false);
        EditCategorySort.setLabeText("    ");
        EditCategorySort.setRequestFocusEnabled(false);
        EditCategorySort.setVerifyInputWhenFocusTarget(false);
        EditCategorySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCategorySortActionPerformed(evt);
            }
        });

        EditSearchIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

        javax.swing.GroupLayout EditSideBarLayout = new javax.swing.GroupLayout(EditSideBar);
        EditSideBar.setLayout(EditSideBarLayout);
        EditSideBarLayout.setHorizontalGroup(
            EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditSideBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(EditSideBarLayout.createSequentialGroup()
                        .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditSearchIcon)
                            .addComponent(EditSearchIcon1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EditCategorySort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
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
                .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditCategorySort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditSearchIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        EditSaveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSaveBTActionPerformed(evt);
            }
        });

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
        EditDeleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDeleteBTActionPerformed(evt);
            }
        });

        EditDescriptionText.setForeground(new java.awt.Color(255, 255, 255));
        EditDescriptionText.setText("Description:");

        EditDescriptionScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        EditDescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        EditDescriptionScroll.setToolTipText("");

        EditDescription.setBackground(new java.awt.Color(24, 23, 23));
        EditDescription.setColumns(20);
        EditDescription.setRows(5);
        EditDescription.setText("\n");
        EditDescription.setBorder(null);
        EditDescriptionScroll.setViewportView(EditDescription);

        EditImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insertimage.jpg"))); // NOI18N
        EditImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditImageMouseClicked(evt);
            }
        });

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

        EditNameText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditNameText.setText(" Name:");

        EditCostText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditCostText.setText("Cost:");

        EditDiscount.setBackground(new java.awt.Color(24, 23, 23));
        EditDiscount.setForeground(new java.awt.Color(255, 255, 255));
        EditDiscount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditDiscount.setAAA_roundBottomLeft(20);
        EditDiscount.setAAA_roundBottomRight(20);
        EditDiscount.setAAA_roundTopLeft(20);
        EditDiscount.setAAA_roundTopRight(20);
        EditDiscount.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        EditDiscount.setAA_DrawBorder(true);
        EditDiscount.setAA_DrawBottomBorder(true);
        EditDiscount.setAA_DrawLeftBorder(true);
        EditDiscount.setAA_DrawLine(false);
        EditDiscount.setAA_DrawRightBorder(true);
        EditDiscount.setAA_DrawTopBorder(true);
        EditDiscount.setAA_TextHint("   Enter Discount");
        EditDiscount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        EditDiscountText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditDiscountText.setText("Discount:");

        EditCategoryText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditCategoryText.setText("Category:");

        EditCategory.setForeground(new java.awt.Color(255, 255, 255));
        EditCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm", "Cappie Time", "Cappie Date", "Cappie Sex", "Cappie Breeding", "Cappie Impregnation", "Cappie Penetration", "Aoi  Impregnation" }));
        EditCategory.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        EditCategory.setAA_lineColor(new java.awt.Color(45, 187, 63));
        EditCategory.setFocusable(false);
        EditCategory.setLabeText("    ");
        EditCategory.setRequestFocusEnabled(false);
        EditCategory.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout saveloadingLayout = new javax.swing.GroupLayout(saveloading);
        saveloading.setLayout(saveloadingLayout);
        saveloadingLayout.setHorizontalGroup(
            saveloadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        saveloadingLayout.setVerticalGroup(
            saveloadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        saving.setText("saving...");

        javax.swing.GroupLayout EditLayout = new javax.swing.GroupLayout(Edit);
        Edit.setLayout(EditLayout);
        EditLayout.setHorizontalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditLayout.createSequentialGroup()
                        .addComponent(saveloading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saving)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditDeleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditSaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditLayout.createSequentialGroup()
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditLayout.createSequentialGroup()
                                .addComponent(EditImage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EditNameText)
                                            .addComponent(EditCostText)))
                                    .addComponent(EditCategoryText)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(EditDiscountText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addComponent(EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE)
                                        .addGap(92, 92, 92))
                                    .addComponent(EditDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(EditDescriptionText))
                        .addGap(10, 10, 10))
                    .addComponent(EditDescriptionScroll, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(59, 59, 59)
                .addComponent(EditSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EditLayout.setVerticalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditLayout.createSequentialGroup()
                .addComponent(EditBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditLayout.createSequentialGroup()
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditImage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EditLayout.createSequentialGroup()
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditNameText)
                                    .addComponent(EditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditCostText)
                                    .addComponent(EditCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditDiscountText))
                                .addGap(12, 12, 12)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditCategoryText))
                                .addGap(8, 8, 8)))
                        .addGap(12, 12, 12)
                        .addComponent(EditDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditDescriptionScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EditSaveBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EditDeleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saving, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saveloading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addComponent(EditSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layers.add(Edit, "card2");

        getContentPane().add(layers);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //----------------MENU BUTTONS -------------//
    private void Home_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseClicked
        showcase(true,false,false,false,false,false);
        MenuHighlight(true,false,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
    }//GEN-LAST:event_Home_BTMouseClicked
    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        showcase(false,true,false,false,false,false);
        MenuHighlight(false,true,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
        EditRefreshTable();
    }//GEN-LAST:event_Option_BTMouseClicked
    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        showcase(false,false,false,true,false,false);
        MenuHighlight(false,false,true,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
    }//GEN-LAST:event_History_BTMouseClicked
    private void Settings_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_BTMouseClicked
        showcase(false,false,false,false,true,false);
        MenuHighlight(false,false,false,true);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
    }//GEN-LAST:event_Settings_BTMouseClicked
    private void Home_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseEntered
        HomePN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Home_BTMouseEntered
    private void Home_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_BTMouseExited
        if (HomeClicked == false){HomePN.setBackground(new java.awt.Color(24,23,23));}    
    }//GEN-LAST:event_Home_BTMouseExited
    private void Option_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseEntered
        OptionPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Option_BTMouseEntered
    private void Option_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseExited
        if (OptionClicked == false){OptionPN.setBackground(new java.awt.Color(24,23,23));} 
    }//GEN-LAST:event_Option_BTMouseExited
    private void History_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseEntered
       HistoryPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_History_BTMouseEntered
    private void History_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseExited
        if (HistoryClicked == false){HistoryPN.setBackground(new java.awt.Color(24,23,23));} 
    }//GEN-LAST:event_History_BTMouseExited
    private void Settings_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_BTMouseEntered
        SettingsPN.setBackground(new java.awt.Color(38, 38, 38));
    }//GEN-LAST:event_Settings_BTMouseEntered
    private void Settings_BTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_BTMouseExited
        if (InfoClicked == false){SettingsPN.setBackground(new java.awt.Color(24,23,23));}  
    }//GEN-LAST:event_Settings_BTMouseExited
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
        autoIncrement();
    }//GEN-LAST:event_AddBT1MouseClicked

    private void EditBT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseClicked
        showcase(false,true,false,false,false,false);
        EditRefreshTable();
    }//GEN-LAST:event_EditBT2MouseClicked

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
                AddImage.setIcon(new ImageIcon("insertimage.jpg")); // Clear the icon

                add_remove_image = 1;

            }catch(Exception e){}
        }else{
            AddImage();
            add_remove_image=0;
        }
    }//GEN-LAST:event_AddImageMouseClicked

    private void EditCategorySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCategorySortActionPerformed
        EditSortCategory();
    }//GEN-LAST:event_EditCategorySortActionPerformed

    private void EditSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_EditSearchCaretUpdate
        EditSortSearch();
    }//GEN-LAST:event_EditSearchCaretUpdate

    private void EditSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditSearchMouseClicked
        EditCategorySort.setSelectedItem("All");
    }//GEN-LAST:event_EditSearchMouseClicked

    private void EditTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditTableMouseClicked
       SelectEditProduct();
        LoadImageID();
        edit_remove_image=0;
    }//GEN-LAST:event_EditTableMouseClicked

    private void EditDeleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDeleteBTActionPerformed
        DeleteButton();
        EditLoading();
    }//GEN-LAST:event_EditDeleteBTActionPerformed

    private void EditSaveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSaveBTActionPerformed
        EditProduct();
    }//GEN-LAST:event_EditSaveBTActionPerformed

    private void EditImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditImageMouseClicked
            
    if (evt.getButton() == MouseEvent.BUTTON3) {
        try{edit_imagePath.setText(""); // Clear the text
            edit_imageName.setText("");
            ImageIcon resetimage = new ImageIcon("insertimage.jpg");
            EditImage.setIcon(resetimage);
            edit_remove_image=1;
            }catch(Exception e){}
    }else { 
        EditImage(); 
        }
    }//GEN-LAST:event_EditImageMouseClicked

    private void ChangeUsernamePNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeUsernamePNMouseEntered
        function.SettingsHoverIn(ChangeUsernamePN);
    }//GEN-LAST:event_ChangeUsernamePNMouseEntered

    private void ChangePassPNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassPNMouseEntered
        function.SettingsHoverIn(ChangePassPN);
    }//GEN-LAST:event_ChangePassPNMouseEntered

    private void AboutPNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPNMouseEntered
        function.SettingsHoverIn(AboutPN);
    }//GEN-LAST:event_AboutPNMouseEntered

    private void ChangeUsernamePNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeUsernamePNMouseExited
        function.SettingsHoverOut(ChangeUsernamePN);
    }//GEN-LAST:event_ChangeUsernamePNMouseExited

    private void ChangePassPNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassPNMouseExited
        function.SettingsHoverOut(ChangePassPN);
    }//GEN-LAST:event_ChangePassPNMouseExited

    private void AboutPNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPNMouseExited
        function.SettingsHoverOut(AboutPN);
    }//GEN-LAST:event_AboutPNMouseExited

    
    private void ChangeUsernamePNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeUsernamePNMouseClicked
      ChangeUser = new ChangeUsername(this);
       ChangeUser.setVisible(true);
    }//GEN-LAST:event_ChangeUsernamePNMouseClicked

    private void ChangePassPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassPNMouseClicked
        ChangePass = new ChangePassword(this);
       ChangePass.setVisible(true);
    }//GEN-LAST:event_ChangePassPNMouseClicked
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AboutDesc;
    public javax.swing.JLabel AboutHeading;
    private SystemOtherComps.PH_Panel AboutPN;
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
    private SystemOtherComps.PH_TextField AddDiscount;
    private javax.swing.JLabel AddDiscountText;
    private javax.swing.JLabel AddID;
    private javax.swing.JLabel AddImage;
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
    public javax.swing.JLabel ChangePassHeading1;
    private SystemOtherComps.PH_Panel ChangePassPN;
    public javax.swing.JLabel ChangeUsernameHeading;
    private SystemOtherComps.PH_Panel ChangeUsernamePN;
    public javax.swing.JLabel ChangepassDesc1;
    public javax.swing.JLabel ChangeusernameDesc;
    private javax.swing.JLabel CostIcon;
    private javax.swing.JPanel Edit;
    private javax.swing.JLabel EditBT1;
    private javax.swing.JLabel EditBT2;
    private javax.swing.JPanel EditBar;
    public SystemShadowedComp.PH_ComboBox EditCategory;
    public SystemShadowedComp.PH_ComboBox EditCategorySort;
    private javax.swing.JLabel EditCategoryText;
    private SystemOtherComps.PH_TextField EditCost;
    private javax.swing.JLabel EditCostText;
    private SystemOtherComps.PH_Button EditDeleteBT;
    private javax.swing.JTextArea EditDescription;
    private javax.swing.JScrollPane EditDescriptionScroll;
    private javax.swing.JLabel EditDescriptionText;
    private SystemOtherComps.PH_TextField EditDiscount;
    private javax.swing.JLabel EditDiscountText;
    private javax.swing.JLabel EditID;
    private javax.swing.JLabel EditImage;
    private SystemOtherComps.PH_TextField EditName;
    private javax.swing.JLabel EditNameText;
    private SystemOtherComps.PH_Button EditSaveBT;
    private SystemOtherComps.PH_TextField EditSearch;
    private javax.swing.JLabel EditSearchIcon;
    private javax.swing.JLabel EditSearchIcon1;
    private javax.swing.JPanel EditSideBar;
    public javax.swing.JTable EditTable;
    private SystemOtherComps.PH_ScrollPane EditTableScroll;
    private javax.swing.JPanel GameBar;
    private SystemOtherComps.PH_BettterFlowLayoutPanel GameList;
    private SystemOtherComps.PH_ScrollPane GameScroll;
    private SystemOtherComps.PH_TextField GameSearchTXT;
    public javax.swing.JLabel Games_txt;
    private javax.swing.JPanel Hidden;
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
    private SystemOtherComps.PH_Panel OptionPN;
    private javax.swing.JLabel Option_BT;
    private javax.swing.JLabel PaymentHeading;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel SettingsBar;
    private SystemOtherComps.PH_Panel SettingsPN;
    public javax.swing.JLabel SettingsText;
    private javax.swing.JLabel Settings_BT;
    private javax.swing.JLabel Settings_BT1;
    private javax.swing.JLabel Settings_BT2;
    private javax.swing.JLabel Settings_BT3;
    private javax.swing.JLabel SubtotalHeading;
    private javax.swing.JLabel TotalCostHeading;
    private javax.swing.JLabel TotalDiscountHeading;
    private javax.swing.JLabel add_imageName;
    private javax.swing.JLabel add_imagePath;
    private javax.swing.JPanel addimagetool;
    private javax.swing.JPanel addimagetool1;
    public SystemShadowedComp.PH_ComboBox categories;
    private SystemOtherComps.PH_TextField change;
    private javax.swing.JLabel edit_imageName;
    private javax.swing.JLabel edit_imagePath;
    private javax.swing.JLabel iddesc;
    private javax.swing.JLabel iddesc1;
    private javax.swing.JLabel imagenamedesk;
    private javax.swing.JLabel imagenamedesk1;
    private javax.swing.JLabel imagepathdesc;
    private javax.swing.JLabel imagepathdesc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private Splash.LoadingAnimation saveloading;
    private javax.swing.JLabel saving;
    private SystemOtherComps.PH_TextField subtotal;
    private SystemOtherComps.PH_TextField total;
    private SystemOtherComps.PH_TextField totaldiscount;
    // End of variables declaration//GEN-END:variables

    public void startup(){
        //icon and title
        ImageIcon Mainicon = new ImageIcon ("HB icon.png");
        setIconImage(Mainicon.getImage());
        setTitle("HazeByte");
        setResizable(true);
        setExtendedState(MAXIMIZED_BOTH);
        
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
            
        saving.setVisible(false); 
        saveloading.setVisible(false);    
            
        DescriptionMethod();
        
    }
    
    
    public void DescriptionMethod(){
        CartDescriptionTXT.setLineWrap(true);     // Auto-wrap text in JTextArea
        CartDescriptionTXT.setWrapStyleWord(true); // Wrap at word boundaries in JTextArea
        EditDescription.setLineWrap(true);  
        EditDescription.setWrapStyleWord(true);
        AddDescription.setLineWrap(true);  
        AddDescription.setWrapStyleWord(true);
    }

    
    
    
    public void showcase(boolean Home_, boolean Edit_, boolean Add_, boolean History_, boolean Info_, boolean Cart_){
        Home.setVisible(Home_);
        Edit.setVisible(Edit_);
        Add.setVisible(Add_);
        History.setVisible(History_);
        Settings.setVisible(Info_);
        Cart.setVisible(Cart_);     
    }
    
    public void MenuHighlight(boolean home, boolean option, boolean history, boolean info){
        HomeClicked = home;
        OptionClicked = option;
        HistoryClicked =history;
        InfoClicked =info; 
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void AddProduct() {

        if (!validateFields()) {
           return; // Stop execution if all textbox are not inputted
       }

               try {
               serverCredentials sv = new serverCredentials();
               sv.setServerIP("localhost");
               sv.setUserID("root");
               sv.setPass("");


               String query = "INSERT INTO product(`id`,`name`, `cost`, `discount`, `category`, `description`, `imageName`, `imagePath`, `imageFile`) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
               con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP() +"/hazebyte", sv.getUserID(), sv.getPass());
               pst = con.prepareStatement(query); 
               pst.setString(1, AddID.getText()); 
               pst.setString(2, AddName.getText());      
               pst.setDouble(3, Double.parseDouble(AddCost.getText()));  
               pst.setDouble(4, Double.parseDouble(AddDiscount.getText()));  
               pst.setString(5, AddCategory.getSelectedItem().toString()); 
               pst.setString(6, AddDescription.getText());  
               pst.setString(7, "");  
               pst.setString(8, ""); 
               pst.setString(9, "");  
               pst.executeUpdate();


               JOptionPane.showMessageDialog(null,"SAVED!");
               ClearAdd();
               
               if (add_remove_image ==1){
                emptyBlobFile(AddID.getText());
                
                }else{
             saveImageToDatabase(f1, path1);
             }
                add_remove_image=0;
                
                
            
            add_imagePath.setText(""); // Clear the text
            add_imageName.setText("");
            AddImage.setIcon(new ImageIcon("insertimage.jpg"));           
           autoIncrement();
            

         } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, ex + " save bt nigga");
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
        AddDiscount.setText("");
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
    String ID =AddID.getText();
       if (file != null && path != null && !path.isEmpty()) {
           try {
               FileInputStream fis = new FileInputStream(file);
               String query = "UPDATE product SET imageName = ?, imagePath = ?, imageFile = ? WHERE id=? ";
               pst = con.prepareStatement(query);
               pst.setString(1, file.getName());
               pst.setString(2, path);
               pst.setBinaryStream(3, fis, (int) file.length());
               pst.setString(4, ID);
               pst.executeUpdate();
           } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Image file not found: " + ex.getMessage());
           }  catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error saving image to database: " + ex.getMessage());
           }
       }
   } 



    private void emptyBlobFile(String ID) {
        try {
            String query = "UPDATE product SET imageName = '', imagePath = '', imageFile = '' WHERE id = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, ID);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error emptying BLOB file: " + ex.getMessage());
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void EditRefreshTable() {
        String sql = "SELECT * FROM product ORDER BY `name` ASC";


        try {
            DefaultTableModel model = (DefaultTableModel) EditTable.getModel();
            model.setRowCount(0);

            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();


        while (rs.next()) {


            model.addRow(new Object[] {

                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
             
            });
        }
            // update the student count shown in the upper right corner

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
    public void EditSortCategory(){
        String selectedValue = (String) EditCategorySort.getSelectedItem();

        // Construct appropriate SQL query based on selected value

        String sql = null;
        if (selectedValue.equals("All")) {
            sql = "SELECT * FROM product ORDER BY name ASC";
        } else {
            sql = "SELECT * FROM product WHERE category= '" + selectedValue + "' ORDER BY name ASC";
        }

        try {
            // Prepare the statement
            pst = con.prepareStatement(sql);

            // Execute the query
            ResultSet resultSet = pst.executeQuery();

            // Create a list to hold the updated data
            List<Object[]> data = new ArrayList<>();

            // Populate the list with fetched data
            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                data.add(row);
            }

            // Update the existing table model with new data
            DefaultTableModel model = (DefaultTableModel) EditTable.getModel();
            model.setRowCount(0); // Clear existing data
            for (Object[] row : data) {
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            pst.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
    }    


    
    
    
    public void EditSortSearch() {
      String searchText = EditSearch.getText().trim(); // your search text field
    String sql;

    if (searchText.isEmpty()) {
        sql = "SELECT * FROM product ORDER BY `name` ASC";
    } else {
        sql = "SELECT * FROM product WHERE `name` LIKE ? ORDER BY `name` ASC";
    }

    try {
        DefaultTableModel model = (DefaultTableModel) EditTable.getModel();
        model.setRowCount(0); // clear table

        PreparedStatement pst = con.prepareStatement(sql);

        if (!searchText.isEmpty()) {
            pst.setString(1, "%" + searchText + "%");
        }

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("id"),
                rs.getString("name"),
                rs.getString("cost"),
                rs.getString("discount")
                // Add more if needed
            });
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Search Error: " + ex.getMessage());
    }
}
    
    public void LoadImageID() {
        try {
            String ID = EditID.getText();
            pst = con.prepareStatement("SELECT imageFile FROM product WHERE id = ?");
            pst.setString(1, ID);

            rs = pst.executeQuery();

            if (rs.next()) {
                LoadImage();
            } else {
                // Set default image if no imageFile found
                setDefaultImage();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            setDefaultImage();
        }
    }

   public void LoadImage() {
        try {
            byte[] imagedata = rs.getBytes("imageFile");

            if (imagedata != null && imagedata.length > 0) {
                format1 = new ImageIcon(imagedata);
                Image mm = format1.getImage();
                Image img2 = mm.getScaledInstance(211, 217, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                EditImage.setIcon(image);
            } else {
                setDefaultImage(); // fallback if byte array is empty
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            setDefaultImage(); // fallback on error
        }
    }
   
   
   public void setDefaultImage() {
        try {
            ImageIcon ii = new ImageIcon("insertimage.jpg"); // Make sure this image exists in your project directory
            Image img = ii.getImage().getScaledInstance(211, 217, Image.SCALE_SMOOTH);
            EditImage.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Default image not found!");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }

   
   
   public void SelectEditProduct() {
        int selectedRow = EditTable.getSelectedRow();

        if (selectedRow != -1) {
            String productID = EditTable.getValueAt(selectedRow, 0).toString();

            String sql = "SELECT `id`, `name`, `cost`, `discount`, `category`, `description`, `imageName`, `imagePath` FROM `product` WHERE id = ?";

            try {
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, productID);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // Populate your fields
                    EditID.setText(rs.getString("id"));
                    EditName.setText(rs.getString("name"));
                    EditCost.setText(rs.getString("cost"));
                    EditDiscount.setText(rs.getString("discount"));
                    EditCategory.setSelectedItem(rs.getString("category"));
                    EditDescription.setText(rs.getString("description"));
                    edit_imageName.setText(rs.getString("imageName"));
                    edit_imagePath.setText(rs.getString("imagePath"));

//                    // Optional: set preview image
//                    String imagePath = rs.getString("imagePath");
//                    if (imagePath != null && !imagePath.isEmpty()) {
//                        ImageIcon ii = new ImageIcon(imagePath);
//                        Image img = ii.getImage().getScaledInstance(478, 300, Image.SCALE_SMOOTH);
//                        EditImage.setIcon(new ImageIcon(img));
//                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error loading product: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        }
    }

   
   
   private void DeleteButton() {
        int selectedRow = EditTable.getSelectedRow();

        if (selectedRow != -1) {
            int option = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete this product?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
            );

            if (option == JOptionPane.YES_OPTION) {
                String productID = EditTable.getValueAt(selectedRow, 0).toString(); // Get the selected product ID

                String sql = "DELETE FROM `product` WHERE id = ?";

                try {
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, productID);
                    pst.executeUpdate();


                    // Refresh table and reinitialize product data
                    EditRefreshTable();
                    ClearEdit();
                  

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Delete failed: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a product to delete");
        }
    }
   
   
   public void ClearEdit(){
        EditName.setText("");
        EditCost.setText("");
        EditDiscount.setText("");
        EditCategory.setSelectedItem("Action");
        EditDescription.setText("");
        EditID.setText("");
        edit_imageName.setText("");
        edit_imagePath.setText("");
        ImageIcon resetimage = new ImageIcon("insertimage.jpg");
        EditImage.setIcon(resetimage);
 
    }
   
   
   
   public void EditProduct() {
    try {
        // SQL Update Query
        String sql = "UPDATE product SET name=?, cost=?, discount=?, category=?, description=?, imageName=?, imagePath=? WHERE id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        // Set parameters
        preparedStatement.setString(1, EditName.getText());
        preparedStatement.setString(2, EditCost.getText());
        preparedStatement.setString(3, EditDiscount.getText());
        preparedStatement.setString(4, EditCategory.getSelectedItem().toString());
        preparedStatement.setString(5, EditDescription.getText());
        preparedStatement.setString(6, edit_imageName.getText());
        preparedStatement.setString(7, edit_imagePath.getText());
        preparedStatement.setString(8, EditID.getText());

        // Execute the update
        preparedStatement.executeUpdate();

        // Save image to database if needed
        saveImageToDatabaseEdit(f2, path2);

        // Remove image blob if flagged
        if (edit_remove_image == 1) {
            emptyBlobFile(EditID.getText());
        }
        edit_remove_image = 0;

        EditLoading();
        // Refresh table and UI
        EditRefreshTable();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}

   
   
 private void saveImageToDatabaseEdit(File file, String path) {
        String ID =EditID.getText();
       if (file != null && path != null && !path.isEmpty()) {
           try {
               FileInputStream fis = new FileInputStream(file);
               String query = "UPDATE product SET imageName = ?, imagePath = ?, imageFile = ? WHERE id=? ";
               pst = con.prepareStatement(query);
               pst.setString(1, file.getName());
               pst.setString(2, path);
               pst.setBinaryStream(3, fis, (int) file.length());
               pst.setString(4, ID);
               pst.executeUpdate();



           } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Image file not found: " + ex.getMessage());
           }  catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error saving image to database: " + ex.getMessage());
           }
       }
   } 
 
 
    private void EditImage(){
    
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","gif");
        fileChooser.setFileFilter(imageFilter);
        int load = fileChooser.showOpenDialog(null);

        if (load == JFileChooser.APPROVE_OPTION) {
            f2 = fileChooser.getSelectedFile();
            path2 = f2.getAbsolutePath();
            String imageName = f2.getName();
            edit_imageName.setText(imageName);
            

            edit_imagePath.setText(path2);
            ImageIcon ii = new ImageIcon(path2);
           

            Image img = ii.getImage().getScaledInstance(211, 217, Image.SCALE_SMOOTH);
            EditImage.setIcon(new ImageIcon(img));



        }
    } 
    
    
    public void EditLoading() {
    saving.setVisible(true); // Show the label
    saveloading.setVisible(true);

    // Create a Swing timer to hide it after 3 seconds (3000 ms)
    Timer timer = new Timer(1500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saving.setVisible(false); // Hide the label after time is up
            saveloading.setVisible(false);
        }
    });

    timer.setRepeats(false); // Only run once
    timer.start();
}




}
