
package Frames;
import javax.swing.Timer;
import Classes.ProductImage;
import Classes.Functions;
import Classes.Run;
import Classes.CustomCellRenderer;
import Classes.serverCredentials;
import Panel.ConfirmationPopup;
import Panel.Items;
import Panel.Popup;
import Splash.LoadingAnimation;
import Splash.Login;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;


public class Main extends javax.swing.JFrame {

    private ChangePassword ChangePass;
    public AddProduct addProduct;
    private ChangeUsername ChangeUser;
    public HistoryPreview preview;
    public HistoryTotal historytotal;
    
    
    
    
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
    
    
    public Connection con;
    ResultSet rs;
    PreparedStatement pst;
    

    
    int categorystartup = 0;
 
    public Main(Connection con) {
        initComponents();
        GlassPanePopup.install(this);
        
        this.con = con;

    
        startup();
        ClearCart();
        processlist();
        wrapLabelText(AboutQuote);

        if (CartTable.getRowCount() == 0) {
            paymentTXT.setEnabled(false);
            CartItemView.setVisible(false);
        } else {
            paymentTXT.setEnabled(true);
        }
        
                
        Hidden.setVisible(false);
        About.setVisible(false);
        
        GameSearchTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    searching();
                }
            }
        });
        
        
        
        
        
        
        incrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            incrementBTMousePressed(evt);
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
            incrementBTMouseReleased(evt);
        }
    });

            decrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            decrementBTMousePressed(evt);
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            decrementBTMouseReleased(evt);
        }
    });

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
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
        About = new javax.swing.JPanel();
        AboutScroll = new SystemOtherComps.PH_ScrollPane();
        AboutFlow = new SystemOtherComps.PH_BettterFlowLayoutPanel();
        samPanel5 = new Panel.SamPanel();
        tonyPanel1 = new Panel.TonyPanel();
        elaizaPanel1 = new Panel.ElaizaPanel();
        jmPanel1 = new Panel.JmPanel();
        clarkPanel1 = new Panel.ClarkPanel();
        SettingsBar1 = new javax.swing.JPanel();
        SettingsText1 = new javax.swing.JLabel();
        AboutBackBT = new javax.swing.JLabel();
        AboutQuote = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IP = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();
        PASS = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        HistoryBar = new javax.swing.JPanel();
        HistoryText = new javax.swing.JLabel();
        HistoryCategorySort = new SystemShadowedComp.PH_ComboBox();
        HistorySearch = new SystemOtherComps.PH_TextField();
        HistorySearchIconTXT = new javax.swing.JLabel();
        HistoryCategoryIcon = new javax.swing.JLabel();
        TransactionNumber = new SystemOtherComps.PH_Label();
        HistoryCalculate = new javax.swing.JLabel();
        HistoryTableScroll = new SystemOtherComps.PH_ScrollPane();
        HistoryTable = new javax.swing.JTable();
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
        CartImageTXT = new javax.swing.JLabel();
        discountTXT = new javax.swing.JLabel();
        paymentTXT = new SystemOtherComps.PH_TextField();
        totalTXT = new SystemOtherComps.PH_TextField();
        changeTXT = new SystemOtherComps.PH_TextField();
        PaymentHeading = new javax.swing.JLabel();
        TotalCostHeading = new javax.swing.JLabel();
        ChangeHeading = new javax.swing.JLabel();
        BuyBT = new SystemOtherComps.PH_Button();
        CancelAllBT = new SystemOtherComps.PH_Button();
        subtotalTXT = new SystemOtherComps.PH_TextField();
        SubtotalHeading = new javax.swing.JLabel();
        totaldiscountTXT = new SystemOtherComps.PH_TextField();
        TotalDiscountHeading = new javax.swing.JLabel();
        CartTableScroll = new SystemOtherComps.PH_ScrollPane();
        CartTable = new javax.swing.JTable();
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
        EditBT = new javax.swing.JLabel();
        EditSideBar = new javax.swing.JPanel();
        EditSearch = new SystemOtherComps.PH_TextField();
        EditSearchIcon = new javax.swing.JLabel();
        EditTableScroll = new SystemOtherComps.PH_ScrollPane();
        EditTable = new javax.swing.JTable();
        EditCategorySort = new SystemShadowedComp.PH_ComboBox();
        EditSearchIcon1 = new javax.swing.JLabel();
        AddBT1 = new javax.swing.JLabel();
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
        decrementBT = new SystemOtherComps.PH_Button();
        incrementBT = new SystemOtherComps.PH_Button();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

        About.setBackground(new java.awt.Color(24, 23, 23));

        AboutScroll.setBackground(new java.awt.Color(51, 51, 51));
        AboutScroll.setForeground(new java.awt.Color(0, 204, 255));
        AboutScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        AboutFlow.setBackground(new java.awt.Color(24, 23, 23));
        AboutFlow.setForeground(new java.awt.Color(255, 255, 255));
        AboutFlow.add(samPanel5);
        AboutFlow.add(tonyPanel1);
        AboutFlow.add(elaizaPanel1);
        AboutFlow.add(jmPanel1);
        AboutFlow.add(clarkPanel1);

        AboutScroll.setViewportView(AboutFlow);

        SettingsBar1.setBackground(new java.awt.Color(24, 23, 23));

        SettingsText1.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        SettingsText1.setForeground(new java.awt.Color(255, 255, 255));
        SettingsText1.setText("About us");

        AboutBackBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        AboutBackBT.setToolTipText("back");
        AboutBackBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutBackBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutBackBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutBackBTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SettingsBar1Layout = new javax.swing.GroupLayout(SettingsBar1);
        SettingsBar1.setLayout(SettingsBar1Layout);
        SettingsBar1Layout.setHorizontalGroup(
            SettingsBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsBar1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(AboutBackBT)
                .addGap(18, 18, 18)
                .addComponent(SettingsText1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(675, Short.MAX_VALUE))
        );
        SettingsBar1Layout.setVerticalGroup(
            SettingsBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsBar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SettingsText1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsBar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AboutBackBT)
                .addGap(14, 14, 14))
        );

        AboutQuote.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        AboutQuote.setForeground(new java.awt.Color(255, 255, 255));
        AboutQuote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutQuote.setText("\"If it works, don't touch it.\"");

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About);
        About.setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AboutLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(AboutQuote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AboutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AboutScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutLayout.createSequentialGroup()
                .addComponent(SettingsBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(AboutQuote, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(504, 504, 504))
            .addGroup(AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutLayout.createSequentialGroup()
                    .addContainerGap(170, Short.MAX_VALUE)
                    .addComponent(AboutScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        layers.add(About, "card8");

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

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setText("ip");

        jLabel5.setText("user");

        jLabel6.setText("pass");

        IP.setText("0");

        USER.setText("0");

        PASS.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(IP, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(USER, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PASS, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
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
                    .addComponent(jLabel1)
                    .addGroup(HiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addimagetool1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(691, Short.MAX_VALUE))
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
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        layers.add(Hidden, "card8");

        History.setBackground(new java.awt.Color(24, 23, 23));

        HistoryBar.setBackground(new java.awt.Color(24, 23, 23));

        HistoryText.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        HistoryText.setForeground(new java.awt.Color(255, 255, 255));
        HistoryText.setText("Transaction History");

        HistoryCategorySort.setForeground(new java.awt.Color(255, 255, 255));
        HistoryCategorySort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
        HistoryCategorySort.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        HistoryCategorySort.setAA_lineColor(new java.awt.Color(45, 187, 63));
        HistoryCategorySort.setFocusable(false);
        HistoryCategorySort.setLabeText("   Categories ");
        HistoryCategorySort.setRequestFocusEnabled(false);
        HistoryCategorySort.setVerifyInputWhenFocusTarget(false);
        HistoryCategorySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryCategorySortActionPerformed(evt);
            }
        });

        HistorySearch.setForeground(new java.awt.Color(255, 255, 255));
        HistorySearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        HistorySearch.setAA_TextHint("Search...");
        HistorySearch.setAB_LineColor(new java.awt.Color(51, 51, 51));
        HistorySearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                HistorySearchCaretUpdate(evt);
            }
        });
        HistorySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorySearchMouseClicked(evt);
            }
        });

        HistorySearchIconTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        HistoryCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

        TransactionNumber.setForeground(new java.awt.Color(204, 204, 204));
        TransactionNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransactionNumber.setText("0");
        TransactionNumber.setToolTipText("Number of Transactions");
        TransactionNumber.setAAA_ImageBoundArcSize(20);
        TransactionNumber.setAAA_roundBottomLeft(20);
        TransactionNumber.setAAA_roundBottomRight(20);
        TransactionNumber.setAAA_roundTopLeft(20);
        TransactionNumber.setAAA_roundTopRight(20);
        TransactionNumber.setAA_ArcSize(20);
        TransactionNumber.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        TransactionNumber.setAA_DrawBorder(true);

        HistoryCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/total.png"))); // NOI18N
        HistoryCalculate.setToolTipText("Total Earnings");
        HistoryCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryCalculateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistoryCalculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistoryCalculateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HistoryBarLayout = new javax.swing.GroupLayout(HistoryBar);
        HistoryBar.setLayout(HistoryBarLayout);
        HistoryBarLayout.setHorizontalGroup(
            HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HistoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TransactionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HistoryCategoryIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryCategorySort, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(HistorySearchIconTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(HistoryCalculate)
                .addGap(28, 28, 28))
        );
        HistoryBarLayout.setVerticalGroup(
            HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HistoryBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HistorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                                        .addComponent(HistorySearchIconTXT)
                                        .addGap(9, 9, 9))))
                            .addComponent(HistoryCategorySort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(HistoryText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HistoryBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(HistoryBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TransactionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HistoryCategoryIcon))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HistoryCalculate)
                .addGap(14, 14, 14))
        );

        HistoryTable.setBackground(new java.awt.Color(24, 23, 23));
        HistoryTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HistoryTable.setForeground(new java.awt.Color(255, 255, 255));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Category", "Quantity", "Cost", "Discount", "Subtotal", "Total", "Date", "Time", "ID", "ProductID", "Description", "Receipt No.", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HistoryTable.setFocusable(false);
        HistoryTable.setGridColor(new java.awt.Color(24, 23, 23));
        HistoryTable.setRowHeight(40);
        HistoryTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        HistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryTableMouseClicked(evt);
            }
        });
        HistoryTableScroll.setViewportView(HistoryTable);
        if (HistoryTable.getColumnModel().getColumnCount() > 0) {
            HistoryTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            HistoryTable.getColumnModel().getColumn(8).setPreferredWidth(0);
            HistoryTable.getColumnModel().getColumn(9).setMinWidth(0);
            HistoryTable.getColumnModel().getColumn(9).setPreferredWidth(0);
            HistoryTable.getColumnModel().getColumn(9).setMaxWidth(0);
            HistoryTable.getColumnModel().getColumn(10).setMinWidth(0);
            HistoryTable.getColumnModel().getColumn(10).setPreferredWidth(0);
            HistoryTable.getColumnModel().getColumn(10).setMaxWidth(0);
            HistoryTable.getColumnModel().getColumn(11).setMinWidth(0);
            HistoryTable.getColumnModel().getColumn(11).setPreferredWidth(0);
            HistoryTable.getColumnModel().getColumn(11).setMaxWidth(0);
            HistoryTable.getColumnModel().getColumn(13).setMinWidth(3);
            HistoryTable.getColumnModel().getColumn(13).setPreferredWidth(3);
            HistoryTable.getColumnModel().getColumn(13).setMaxWidth(3);
        }

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HistoryBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HistoryTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
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
                .addContainerGap(153, Short.MAX_VALUE))
        );
        ChangeUsernamePNLayout.setVerticalGroup(
            ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeUsernamePNLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(ChangeUsernamePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangeUsernameHeading)
                    .addComponent(Settings_BT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangeusernameDesc)
                .addGap(14, 14, 14))
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
                .addContainerGap(107, Short.MAX_VALUE))
        );
        ChangePassPNLayout.setVerticalGroup(
            ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePassPNLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(ChangePassPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangePassHeading1)
                    .addComponent(Settings_BT2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangepassDesc1)
                .addGap(14, 14, 14))
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutPNMouseClicked(evt);
            }
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
        AboutHeading.setText("About us");

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
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(AboutPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AboutHeading)
                    .addComponent(Settings_BT3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AboutDesc)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangeUsernamePN, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(ChangePassPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(AboutPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
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
                .addContainerGap(49, Short.MAX_VALUE))
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CartBackBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartBackBTMouseExited(evt);
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
                .addGroup(CartBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cart_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CartBarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(CartBackBT)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        CartItemView.setBackground(new java.awt.Color(24, 23, 23));

        CartCategoryTXT.setForeground(new java.awt.Color(102, 102, 102));

        CartTitleTXT.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        CartTitleTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CartTitleTXT.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CartCostTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CartCostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CartCostTXT.setText("₱0");

        CartDescriptionScroll.setBorder(null);
        CartDescriptionScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CartDescriptionScroll.setToolTipText("");

        CartDescriptionTXT.setBackground(new java.awt.Color(24, 23, 23));
        CartDescriptionTXT.setColumns(20);
        CartDescriptionTXT.setRows(5);
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
        CartRemoveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartRemoveBTActionPerformed(evt);
            }
        });

        CartQuantityTXT.setEditable(false);
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
        CartQuantityTXT.setFocusable(false);
        CartQuantityTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        CartTotalCostTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CartTotalCostTXT.setForeground(new java.awt.Color(25, 167, 56));
        CartTotalCostTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CartTotalCostTXT.setText("0");
        CartTotalCostTXT.setToolTipText("cost");

        CostIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coins.png"))); // NOI18N
        CostIcon.setToolTipText("cost");

        quantityIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quantity.png"))); // NOI18N
        quantityIcon.setToolTipText("quantity");

        CartImageTXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        discountTXT.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        discountTXT.setForeground(new java.awt.Color(153, 201, 75));
        discountTXT.setText("10% discount!");

        javax.swing.GroupLayout CartItemViewLayout = new javax.swing.GroupLayout(CartItemView);
        CartItemView.setLayout(CartItemViewLayout);
        CartItemViewLayout.setHorizontalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartItemViewLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CartImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CartDescriptionheadingTXT)
                                    .addComponent(CartDescriptionScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantityIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CostIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CartQuantityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CartTotalCostTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                        .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CartRemoveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CartItemViewLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CartCategoryTXT)
                                    .addComponent(CartCostTXT)
                                    .addComponent(CartTitleTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(discountTXT))))))
                .addGap(39, 39, 39))
        );
        CartItemViewLayout.setVerticalGroup(
            CartItemViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartItemViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CartImageTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartCategoryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartTitleTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartCostTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discountTXT)
                .addGap(2, 2, 2)
                .addComponent(CartDescriptionheadingTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CartDescriptionScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 5, Short.MAX_VALUE)
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
                .addGap(41, 41, 41)
                .addComponent(CartRemoveBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        paymentTXT.setBackground(new java.awt.Color(24, 23, 23));
        paymentTXT.setForeground(new java.awt.Color(255, 255, 255));
        paymentTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        paymentTXT.setAAA_roundBottomLeft(20);
        paymentTXT.setAAA_roundBottomRight(20);
        paymentTXT.setAAA_roundTopLeft(20);
        paymentTXT.setAAA_roundTopRight(20);
        paymentTXT.setAA_BorderColor(new java.awt.Color(51, 51, 51));
        paymentTXT.setAA_DrawBorder(true);
        paymentTXT.setAA_DrawBottomBorder(true);
        paymentTXT.setAA_DrawLeftBorder(true);
        paymentTXT.setAA_DrawLine(false);
        paymentTXT.setAA_DrawRightBorder(true);
        paymentTXT.setAA_DrawTopBorder(true);
        paymentTXT.setAA_TextHint("   Add items to proceed with payment");
        paymentTXT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paymentTXT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                paymentTXTCaretUpdate(evt);
            }
        });

        totalTXT.setEditable(false);
        totalTXT.setBackground(new java.awt.Color(38, 38, 38));
        totalTXT.setForeground(new java.awt.Color(204, 204, 204));
        totalTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        totalTXT.setAAA_roundBottomLeft(20);
        totalTXT.setAAA_roundBottomRight(20);
        totalTXT.setAAA_roundTopLeft(20);
        totalTXT.setAAA_roundTopRight(20);
        totalTXT.setAA_DrawLine(false);
        totalTXT.setAA_TextHint("   0.00");
        totalTXT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        changeTXT.setEditable(false);
        changeTXT.setBackground(new java.awt.Color(38, 38, 38));
        changeTXT.setForeground(new java.awt.Color(204, 204, 204));
        changeTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        changeTXT.setAAA_roundBottomLeft(20);
        changeTXT.setAAA_roundBottomRight(20);
        changeTXT.setAAA_roundTopLeft(20);
        changeTXT.setAAA_roundTopRight(20);
        changeTXT.setAA_DrawLine(false);
        changeTXT.setAA_TextHint("   0.00");
        changeTXT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        PaymentHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PaymentHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PaymentHeading.setText("Payment:");

        TotalCostHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TotalCostHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalCostHeading.setText("Total:");

        ChangeHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ChangeHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ChangeHeading.setText("Change:");

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
        BuyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyBTActionPerformed(evt);
            }
        });

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
        CancelAllBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAllBTActionPerformed(evt);
            }
        });

        subtotalTXT.setEditable(false);
        subtotalTXT.setBackground(new java.awt.Color(38, 38, 38));
        subtotalTXT.setForeground(new java.awt.Color(204, 204, 204));
        subtotalTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        subtotalTXT.setAAA_roundBottomLeft(20);
        subtotalTXT.setAAA_roundBottomRight(20);
        subtotalTXT.setAAA_roundTopLeft(20);
        subtotalTXT.setAAA_roundTopRight(20);
        subtotalTXT.setAA_DrawLine(false);
        subtotalTXT.setAA_TextHint("   0.00");
        subtotalTXT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        SubtotalHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SubtotalHeading.setText("Subtotal:");

        totaldiscountTXT.setEditable(false);
        totaldiscountTXT.setBackground(new java.awt.Color(38, 38, 38));
        totaldiscountTXT.setForeground(new java.awt.Color(204, 204, 204));
        totaldiscountTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        totaldiscountTXT.setAAA_roundBottomLeft(20);
        totaldiscountTXT.setAAA_roundBottomRight(20);
        totaldiscountTXT.setAAA_roundTopLeft(20);
        totaldiscountTXT.setAAA_roundTopRight(20);
        totaldiscountTXT.setAA_DrawLine(false);
        totaldiscountTXT.setAA_TextHint("   0.00");
        totaldiscountTXT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TotalDiscountHeading.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TotalDiscountHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalDiscountHeading.setText("Total Discount:");

        CartTable.setBackground(new java.awt.Color(24, 23, 23));
        CartTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CartTable.setForeground(new java.awt.Color(255, 255, 255));
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Category", "Quantity", "Cost", "Discount", "Subtotal", "Total", "Date", "Time", "ID", "ProductID", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CartTable.setFocusable(false);
        CartTable.setGridColor(new java.awt.Color(24, 23, 23));
        CartTable.setRowHeight(40);
        CartTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        CartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartTableMouseClicked(evt);
            }
        });
        CartTableScroll.setViewportView(CartTable);
        if (CartTable.getColumnModel().getColumnCount() > 0) {
            CartTable.getColumnModel().getColumn(0).setResizable(false);
            CartTable.getColumnModel().getColumn(1).setResizable(false);
            CartTable.getColumnModel().getColumn(2).setResizable(false);
            CartTable.getColumnModel().getColumn(3).setResizable(false);
            CartTable.getColumnModel().getColumn(4).setResizable(false);
            CartTable.getColumnModel().getColumn(5).setResizable(false);
            CartTable.getColumnModel().getColumn(6).setResizable(false);
            CartTable.getColumnModel().getColumn(7).setMinWidth(0);
            CartTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            CartTable.getColumnModel().getColumn(7).setMaxWidth(0);
            CartTable.getColumnModel().getColumn(8).setMinWidth(0);
            CartTable.getColumnModel().getColumn(8).setPreferredWidth(0);
            CartTable.getColumnModel().getColumn(8).setMaxWidth(0);
            CartTable.getColumnModel().getColumn(9).setMinWidth(0);
            CartTable.getColumnModel().getColumn(9).setPreferredWidth(0);
            CartTable.getColumnModel().getColumn(9).setMaxWidth(0);
            CartTable.getColumnModel().getColumn(10).setMinWidth(0);
            CartTable.getColumnModel().getColumn(10).setPreferredWidth(0);
            CartTable.getColumnModel().getColumn(10).setMaxWidth(0);
            CartTable.getColumnModel().getColumn(11).setMinWidth(0);
            CartTable.getColumnModel().getColumn(11).setPreferredWidth(0);
            CartTable.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        javax.swing.GroupLayout CartLayout = new javax.swing.GroupLayout(Cart);
        Cart.setLayout(CartLayout);
        CartLayout.setHorizontalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CartLayout.createSequentialGroup()
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(PaymentHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(CartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CartTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CartLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CancelAllBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(BuyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CartLayout.createSequentialGroup()
                                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ChangeHeading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SubtotalHeading)
                                    .addComponent(TotalDiscountHeading)
                                    .addComponent(TotalCostHeading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totaldiscountTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subtotalTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paymentTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totaldiscountTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TotalDiscountHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotalTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubtotalHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalCostHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChangeHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
        categories.setAA_WordLinerColor(new java.awt.Color(51, 51, 51));
        categories.setAA_lineColor(new java.awt.Color(45, 187, 63));
        categories.setFocusable(false);
        categories.setLabeText("   Categories ");
        categories.setRequestFocusEnabled(false);
        categories.setVerifyInputWhenFocusTarget(false);
        categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesActionPerformed(evt);
            }
        });

        GameSearchTXT.setForeground(new java.awt.Color(255, 255, 255));
        GameSearchTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        GameSearchTXT.setAA_TextHint("Search...");
        GameSearchTXT.setAB_LineColor(new java.awt.Color(51, 51, 51));
        GameSearchTXT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                GameSearchTXTCaretUpdate(evt);
            }
        });

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
        GameScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        GameList.setBackground(new java.awt.Color(24, 23, 23));
        GameList.setForeground(new java.awt.Color(255, 255, 255));
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
        AddCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layers.add(Add, "card2");

        Edit.setBackground(new java.awt.Color(24, 23, 23));
        Edit.setPreferredSize(new java.awt.Dimension(783, 594));

        EditBar.setBackground(new java.awt.Color(24, 23, 23));

        EditBT.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        EditBT.setForeground(new java.awt.Color(255, 255, 255));
        EditBT.setText("Inventory");
        EditBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EditBarLayout = new javax.swing.GroupLayout(EditBar);
        EditBar.setLayout(EditBarLayout);
        EditBarLayout.setHorizontalGroup(
            EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditBarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(EditBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditBarLayout.setVerticalGroup(
            EditBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditBT, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
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
        EditCategorySort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
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

        AddBT1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddBT1.setForeground(new java.awt.Color(102, 102, 102));
        AddBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add2.png"))); // NOI18N
        AddBT1.setToolTipText("Add Product");
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

        javax.swing.GroupLayout EditSideBarLayout = new javax.swing.GroupLayout(EditSideBar);
        EditSideBar.setLayout(EditSideBarLayout);
        EditSideBarLayout.setHorizontalGroup(
            EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(EditSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditSideBarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                    .addGroup(EditSideBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AddBT1)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
        EditImage.setToolTipText("right click to remove image");
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

        EditDiscount.setEditable(false);
        EditDiscount.setBackground(new java.awt.Color(24, 23, 23));
        EditDiscount.setForeground(new java.awt.Color(255, 255, 255));
        EditDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        EditDiscount.setAA_TextHint("");
        EditDiscount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        EditDiscountText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditDiscountText.setText("Discount:");

        EditCategoryText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EditCategoryText.setText("Category:");

        EditCategory.setForeground(new java.awt.Color(255, 255, 255));
        EditCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Adventure", "Shooter", "Strategy", "Horror", "Sports", "RPG", "Visual Novel", "Gacha", "Rythm" }));
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

        decrementBT.setBackground(new java.awt.Color(38, 38, 38));
        decrementBT.setForeground(new java.awt.Color(255, 255, 255));
        decrementBT.setText("-");
        decrementBT.setAA_ButtonColor(new java.awt.Color(38, 38, 38));
        decrementBT.setAA_HoverColor(new java.awt.Color(54, 53, 53));
        decrementBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        decrementBT.setAA_RippleColor(new java.awt.Color(71, 70, 70));
        decrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                decrementBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                decrementBTMouseReleased(evt);
            }
        });
        decrementBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementBTActionPerformed(evt);
            }
        });

        incrementBT.setBackground(new java.awt.Color(38, 38, 38));
        incrementBT.setForeground(new java.awt.Color(255, 255, 255));
        incrementBT.setText("+");
        incrementBT.setAA_ButtonColor(new java.awt.Color(38, 38, 38));
        incrementBT.setAA_HoverColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_PressColor(new java.awt.Color(54, 53, 53));
        incrementBT.setAA_RippleColor(new java.awt.Color(71, 70, 70));
        incrementBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                incrementBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                incrementBTMouseReleased(evt);
            }
        });
        incrementBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementBTActionPerformed(evt);
            }
        });

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
                            .addGroup(EditLayout.createSequentialGroup()
                                .addComponent(EditDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EditName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102))))
                    .addGroup(EditLayout.createSequentialGroup()
                        .addComponent(EditDescriptionText)
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
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EditDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(EditDiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addComponent(incrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(decrementBT, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(EditLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(EditCategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditDescriptionScroll)
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
        showcase(true,false,false,false,false,false,false);
        MenuHighlight(true,false,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
        CartItemView.setVisible(false);
    }//GEN-LAST:event_Home_BTMouseClicked
    int autoselect = 0;
    private void Option_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option_BTMouseClicked
        showcase(false,true,false,false,false,false,false);
        MenuHighlight(false,true,false,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
            
        EditRefreshTable();
        EditTable.setRowSelectionInterval(0, 0);
        EditTable.requestFocus();  
        autoselect = 0;
        EditTableMouseClicked(null);
     
        
    }//GEN-LAST:event_Option_BTMouseClicked
    private void History_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_BTMouseClicked
        showcase(false,false,false,true,false,false,false);
        MenuHighlight(false,false,true,false);
        function.MenuClicked(HomeClicked, HomePN, OptionClicked, OptionPN, HistoryClicked, HistoryPN, InfoClicked, SettingsPN ); 
        HistoryRefreshTable();
    }//GEN-LAST:event_History_BTMouseClicked
    private void Settings_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_BTMouseClicked
        showcase(false,false,false,false,true,false,false);
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
        showcase(false,false,false,false,false,true,false);
        CartRefreshTable();
        CartMath();
    }//GEN-LAST:event_CartBTMouseClicked
 //------------------HOME PANEL FRONTEND CODES------------------// 
    
    
    private void CartBackBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackBTMouseClicked
        showcase(true,false,false,false,false,false,false);
        CartItemView.setVisible(false);
    }//GEN-LAST:event_CartBackBTMouseClicked

    private void EditBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBTMouseClicked
        showcase(false,true,false,false,false,false,false);
    }//GEN-LAST:event_EditBTMouseClicked

    private void AddBT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseClicked
        //showcase(false,false,true,false,false,false);
        //autoIncrement();
        addProduct = new AddProduct(this);
//            addProduct.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosed(WindowEvent e) {
//                EditRefreshTable(); // Call this after AddProduct is closed
//                initProds();
//               
//            }
//        });
        addProduct.setVisible(true);
        
    }//GEN-LAST:event_AddBT1MouseClicked

    private void EditBT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseClicked
        showcase(false,true,false,false,false,false,false);
        EditRefreshTable();
    }//GEN-LAST:event_EditBT2MouseClicked

    private void EditBT2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseEntered
        EditBT2.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_EditBT2MouseEntered

    private void EditBT2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBT2MouseExited
        EditBT2.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_EditBT2MouseExited

    private void AddBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/add.png"));
        AddBT1.setIcon(image);
    }//GEN-LAST:event_AddBT1MouseEntered

    private void AddBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBT1MouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/add2.png"));
        AddBT1.setIcon(image);
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
                AddImage.setIcon(new ImageIcon(getClass().getResource("/Images/insertimage.jpg"))); // Clear the icon

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
        
        
    }//GEN-LAST:event_EditDeleteBTActionPerformed

    private void EditSaveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSaveBTActionPerformed
        EditProduct();
        initProds();
    }//GEN-LAST:event_EditSaveBTActionPerformed

    private void EditImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditImageMouseClicked
            
    if (evt.getButton() == MouseEvent.BUTTON3) {
        try{edit_imagePath.setText(""); // Clear the text
            edit_imageName.setText("");
            ImageIcon resetimage = new ImageIcon(getClass().getResource("/Images/insertimage.jpg"));
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

    private void categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesActionPerformed
        if (categorystartup != 0){
            filterProductsByCategory();
        }
        
        
    }//GEN-LAST:event_categoriesActionPerformed

    private void CartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartTableMouseClicked
       SelectCartItem();
    }//GEN-LAST:event_CartTableMouseClicked

    private void CancelAllBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAllBTActionPerformed
        ClearCart();
        CartMath();
        CartRefreshTable();
        CartItemView.setVisible(false);
    }//GEN-LAST:event_CancelAllBTActionPerformed

    private void CartBackBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackBTMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/back2.png"));
        CartBackBT.setIcon(image);
    }//GEN-LAST:event_CartBackBTMouseEntered

    private void CartBackBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackBTMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/back.png"));
        CartBackBT.setIcon(image);
    }//GEN-LAST:event_CartBackBTMouseExited

    private void CartRemoveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartRemoveBTActionPerformed
        CartSelectDelete();
        CartMath();
    }//GEN-LAST:event_CartRemoveBTActionPerformed

    private void paymentTXTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_paymentTXTCaretUpdate
        CartMath();
    }//GEN-LAST:event_paymentTXTCaretUpdate

    private void BuyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyBTActionPerformed
       BuyCart();
       CartMath();
       
       
    }//GEN-LAST:event_BuyBTActionPerformed

    private void HistorySearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorySearchMouseClicked
        HistoryCategorySort.setSelectedItem("All");
    }//GEN-LAST:event_HistorySearchMouseClicked

    private void HistorySearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_HistorySearchCaretUpdate
        HistorySortSearch();
    }//GEN-LAST:event_HistorySearchCaretUpdate

    private void HistoryCategorySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryCategorySortActionPerformed
        HistorySortCategory();
    }//GEN-LAST:event_HistoryCategorySortActionPerformed

    private void AboutPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPNMouseClicked
       showcase(false, false, false, false, false, false,true);
    }//GEN-LAST:event_AboutPNMouseClicked

    private void AboutBackBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutBackBTMouseClicked
        showcase(false,false,false,false,true,false,false);
    }//GEN-LAST:event_AboutBackBTMouseClicked

    private void AboutBackBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutBackBTMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/back2.png"));
        AboutBackBT.setIcon(image);
    }//GEN-LAST:event_AboutBackBTMouseEntered

    private void AboutBackBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutBackBTMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/back.png"));
        AboutBackBT.setIcon(image);
    }//GEN-LAST:event_AboutBackBTMouseExited

    
    
    private Timer holdIncrementTimer;
    private Timer holdDecrementTimer;
    private void incrementBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementBTMousePressed
       if (holdIncrementTimer == null || !holdIncrementTimer.isRunning()) {
        holdIncrementTimer = new Timer(5, e -> {
            try {
                // Remove "%" before parsing
                String text = EditDiscount.getText().replace("%", "").trim();
                int value = Integer.parseInt(text);

                if (value < 100) {
                    value++;
                    EditDiscount.setText(value + "%");
                }

                if (value >= 100) {
                    holdIncrementTimer.stop(); // Stop timer at 100
                }
            } catch (NumberFormatException ex) {
                EditDiscount.setText("0%");
            }
        });
        holdIncrementTimer.setInitialDelay(200); // Delay before auto increment starts
        holdIncrementTimer.start();
    }
    }//GEN-LAST:event_incrementBTMousePressed

    private void incrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementBTActionPerformed
        String text = EditDiscount.getText().replace("%", "").trim();
        int plus = Integer.parseInt(text);

        if (plus < 100) {
            plus += 1;
            EditDiscount.setText(plus + "%");
        } else {
            EditDiscount.setText("100%");
        }

    }//GEN-LAST:event_incrementBTActionPerformed

    private void decrementBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementBTMousePressed
        if (holdDecrementTimer == null || !holdDecrementTimer.isRunning()) {
        holdDecrementTimer = new Timer(5, e -> {
            try {
                // Remove "%" before parsing
                String text = EditDiscount.getText().replace("%", "").trim();
                int value = Integer.parseInt(text);

                // Decrease value but not below 1
                if (value > 0) {
                    value--;
                    EditDiscount.setText(value + "%");
                }
            } catch (NumberFormatException ex) {
                EditDiscount.setText("1%");
            }
        });
        holdDecrementTimer.setInitialDelay(200); // Delay before auto decrement starts
        holdDecrementTimer.start();
    }

    }//GEN-LAST:event_decrementBTMousePressed

    private void decrementBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementBTMouseReleased
        if (holdDecrementTimer != null && holdDecrementTimer.isRunning()) {
            holdDecrementTimer.stop();
        }
    }//GEN-LAST:event_decrementBTMouseReleased

    private void decrementBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementBTActionPerformed
        String text = EditDiscount.getText().replace("%", "").trim();
        int plus = Integer.parseInt(text);
        if (plus > 0) {

            plus -= 1;
            EditDiscount.setText(Integer.toString(plus)+ "%");

        }else {
            //add sound
        }
    }//GEN-LAST:event_decrementBTActionPerformed

    private void incrementBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementBTMouseReleased
        if (holdIncrementTimer != null && holdIncrementTimer.isRunning()) {
        holdIncrementTimer.stop();
    }
    }//GEN-LAST:event_incrementBTMouseReleased

    private void HistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryTableMouseClicked
         if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) { // Right-click
        SelectHistoryItem();
    }
    }//GEN-LAST:event_HistoryTableMouseClicked

    private void HistoryCalculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryCalculateMouseEntered
       ImageIcon image = new ImageIcon(getClass().getResource("/Images/total2.png"));
       HistoryCalculate.setIcon(image);
    }//GEN-LAST:event_HistoryCalculateMouseEntered

    private void HistoryCalculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryCalculateMouseExited
       ImageIcon image = new ImageIcon(getClass().getResource("/Images/total.png"));
       HistoryCalculate.setIcon(image);
    }//GEN-LAST:event_HistoryCalculateMouseExited

    private void HistoryCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryCalculateMouseClicked
       HistoryCalculate();
    }//GEN-LAST:event_HistoryCalculateMouseClicked

    private void GameSearchTXTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_GameSearchTXTCaretUpdate
        searching();
    }//GEN-LAST:event_GameSearchTXTCaretUpdate
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JLabel AboutBackBT;
    public javax.swing.JLabel AboutDesc;
    private SystemOtherComps.PH_BettterFlowLayoutPanel AboutFlow;
    public javax.swing.JLabel AboutHeading;
    private SystemOtherComps.PH_Panel AboutPN;
    public javax.swing.JLabel AboutQuote;
    private SystemOtherComps.PH_ScrollPane AboutScroll;
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
    public javax.swing.JLabel AddID;
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
    private javax.swing.JLabel CartImageTXT;
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
    private javax.swing.JLabel EditBT;
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
    private javax.swing.JLabel HistoryCalculate;
    private javax.swing.JLabel HistoryCategoryIcon;
    public SystemShadowedComp.PH_ComboBox HistoryCategorySort;
    private SystemOtherComps.PH_Panel HistoryPN;
    private SystemOtherComps.PH_TextField HistorySearch;
    private javax.swing.JLabel HistorySearchIconTXT;
    public javax.swing.JTable HistoryTable;
    private SystemOtherComps.PH_ScrollPane HistoryTableScroll;
    public javax.swing.JLabel HistoryText;
    private javax.swing.JLabel History_BT;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel HomeCategoryIconTXT;
    private SystemOtherComps.PH_Panel HomePN;
    private javax.swing.JLabel HomeSearchIcon;
    public javax.swing.JLabel Home_BT;
    public javax.swing.JLabel IP;
    private SystemOtherComps.PH_Panel OptionPN;
    private javax.swing.JLabel Option_BT;
    public javax.swing.JLabel PASS;
    private javax.swing.JLabel PaymentHeading;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel SettingsBar;
    private javax.swing.JPanel SettingsBar1;
    private SystemOtherComps.PH_Panel SettingsPN;
    public javax.swing.JLabel SettingsText;
    public javax.swing.JLabel SettingsText1;
    private javax.swing.JLabel Settings_BT;
    private javax.swing.JLabel Settings_BT1;
    private javax.swing.JLabel Settings_BT2;
    private javax.swing.JLabel Settings_BT3;
    private javax.swing.JLabel SubtotalHeading;
    private javax.swing.JLabel TotalCostHeading;
    private javax.swing.JLabel TotalDiscountHeading;
    private SystemOtherComps.PH_Label TransactionNumber;
    public javax.swing.JLabel USER;
    public javax.swing.JLabel add_imageName;
    public javax.swing.JLabel add_imagePath;
    private javax.swing.JPanel addimagetool;
    private javax.swing.JPanel addimagetool1;
    public SystemShadowedComp.PH_ComboBox categories;
    private SystemOtherComps.PH_TextField changeTXT;
    private Panel.ClarkPanel clarkPanel1;
    private SystemOtherComps.PH_Button decrementBT;
    private javax.swing.JLabel discountTXT;
    private javax.swing.JLabel edit_imageName;
    private javax.swing.JLabel edit_imagePath;
    private Panel.ElaizaPanel elaizaPanel1;
    private javax.swing.JLabel iddesc;
    private javax.swing.JLabel iddesc1;
    private javax.swing.JLabel imagenamedesk;
    private javax.swing.JLabel imagenamedesk1;
    private javax.swing.JLabel imagepathdesc;
    private javax.swing.JLabel imagepathdesc1;
    private SystemOtherComps.PH_Button incrementBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private Panel.JmPanel jmPanel1;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menu;
    private SystemOtherComps.PH_TextField paymentTXT;
    private javax.swing.JLabel quantityIcon;
    private Panel.SamPanel samPanel5;
    private Splash.LoadingAnimation saveloading;
    private javax.swing.JLabel saving;
    private SystemOtherComps.PH_TextField subtotalTXT;
    private Panel.TonyPanel tonyPanel1;
    private SystemOtherComps.PH_TextField totalTXT;
    private SystemOtherComps.PH_TextField totaldiscountTXT;
    // End of variables declaration//GEN-END:variables

    
    public void startup(){
        //icon and title
        ImageIcon Mainicon = new ImageIcon(getClass().getResource("/Images/HB icon.png"));
        setIconImage(Mainicon.getImage());
        setTitle("HazeByte");
        setResizable(true);
        setExtendedState(MAXIMIZED_BOTH);
        
        //Open Games Menu after startup
        Home_BTMouseClicked(null);
        Games_txt.requestFocus();
        
        categories.setSelectedItem("Action");
        categories.setSelectedItem("All");
        HistoryCategorySort.setSelectedItem("Action");
        HistoryCategorySort.setSelectedItem("All");
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
            
        HistoryTable.setShowGrid(false);

        // Set header properties
        JTableHeader historyTableHeader = HistoryTable.getTableHeader();
        historyTableHeader.setPreferredSize(new Dimension(historyTableHeader.getWidth(), 40));
        historyTableHeader.setReorderingAllowed(false);

        // Create renderers
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

        DefaultTableCellRenderer historycenterRenderer = new DefaultTableCellRenderer();
        historycenterRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Apply renderers
        for (int i = 0; i < HistoryTable.getColumnCount(); i++) {
            if (i == 0) {
                HistoryTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer); // First column left
            } else {
                HistoryTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); // Others center
            }
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

    
    
    
    public void showcase(boolean Home_, boolean Edit_, boolean Add_, boolean History_, boolean Info_, boolean Cart_, boolean About_){
        Home.setVisible(Home_);
        Edit.setVisible(Edit_);
        Add.setVisible(Add_); 
        History.setVisible(History_);
        Settings.setVisible(Info_);
        Cart.setVisible(Cart_);    
        About.setVisible(About_); 
    }
    
    public void MenuHighlight(boolean home, boolean option, boolean history, boolean info){
        HomeClicked = home;
        OptionClicked = option;
        HistoryClicked =history;
        InfoClicked =info; 
    }
    
    
    
    public void CallPopUp(String title, String description){
        Popup pop = new Popup();
            pop.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            pop.Title.setText(title);
            pop.Description.setText(description);
            GlassPanePopup.showPopup(pop);
            return;
    }

    
    public JDialog createLoadingDialog() {
    JDialog loading = new JDialog(this, "Loading...", true); // modal
    loading.setUndecorated(true);
    loading.setSize(350, 200);
    loading.setLocationRelativeTo(null);

    // Get cache directory location
    String userHome = System.getProperty("user.home");
    File cacheDir = new File(userHome + "/HazeByteCache/");
    String cacheLocation = "Location: " + cacheDir.getAbsolutePath(); // Location message

    // Create a panel with vertical layout
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBackground(new Color(24, 23, 23)); // Background color

    // Load and add the loading animation (spinner)
    LoadingAnimation loadingSpinner = new LoadingAnimation();
    loadingSpinner.setAlignmentX(Component.CENTER_ALIGNMENT); // Center in BoxLayout

    // Text label for download message
    JLabel textLabel = new JLabel("Downloading cache, please wait...");
    textLabel.setForeground(Color.WHITE);
    textLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center in BoxLayout

    // Text label for cache location (gray foreground)
    JLabel cacheLocationLabel = new JLabel(cacheLocation);
    cacheLocationLabel.setForeground(Color.GRAY); // Set foreground to gray
    cacheLocationLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center in BoxLayout

    // Optional: Add padding around the image/text
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    panel.add(Box.createVerticalGlue());  // space before spinner
    panel.add(loadingSpinner);  // Add the loading spinner
    panel.add(Box.createVerticalStrut(10));  // space between spinner and text
    panel.add(textLabel);  // Add the text label
    panel.add(Box.createVerticalStrut(10));  // space between text labels
    panel.add(cacheLocationLabel);  // Add the cache location label
    panel.add(Box.createVerticalGlue());  // space after text

    loading.setContentPane(panel);
    return loading;
}
    
    
    public void showNotification(String message,Notifications.Location location, Notifications.Type type) {
    Notifications.getInstance().show(type,location, message);
}
    
    
    
    
    
    
    
    
    
     public void loadAndAddImage(int productId, JLabel label) {
        // Use ProductImage class to load image and set it to the JLabel
        ProductImage.loadImageAndSetToLabel(productId, label, con);
    }

    
  ArrayList<Items> ITEMPANELS = new ArrayList<>();  
public void initProds() {
    String PRODUCT_QUERY = "SELECT id, name, cost, category, discount, imageFile FROM product ORDER BY name ASC";
    PreparedStatement ptsProducts;
    ResultSet resultSet;

    try {
        // Clear the FlowPanel and item list
        GameList.removeAll();
        ITEMPANELS.clear();

        // Set up cache directory
        String userHome = System.getProperty("user.home");
        File cacheDir = new File(userHome + "/HazeByteCache/");
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }

        // Prepare and execute product query
        ptsProducts = con.prepareStatement(PRODUCT_QUERY);
        resultSet = ptsProducts.executeQuery();

        while (resultSet.next()) {
            int prdID = resultSet.getInt("id");
            String prdName = resultSet.getString("name");
            double prdPrice = resultSet.getDouble("cost"); 
            String prdCategory = resultSet.getString("category");
            double prdDiscount = resultSet.getDouble("discount");

            Items shopPanel = new Items(this);
            shopPanel.setDetails(prdID, prdName, prdPrice, prdCategory, prdDiscount); // Make sure setDetails accepts double

            // --- Caching Logic ---
            File imageFile = new File(cacheDir, prdID + ".png");
            ImageIcon imageIcon = null;

            if (imageFile.exists()) {
                imageIcon = new ImageIcon(imageFile.getAbsolutePath());
            } else {
                byte[] imageData = resultSet.getBytes("imageFile");
                if (imageData != null) {
                    BufferedImage buffered = ImageIO.read(new ByteArrayInputStream(imageData));
                    if (buffered != null) {
                        Image scaledImg = buffered.getScaledInstance(218, 218, Image.SCALE_SMOOTH);
                        BufferedImage resizedBuffered = new BufferedImage(218, 218, BufferedImage.TYPE_INT_ARGB);
                        resizedBuffered.getGraphics().drawImage(scaledImg, 0, 0, null);

                        ImageIO.write(resizedBuffered, "png", imageFile);
                        imageIcon = new ImageIcon(resizedBuffered);
                    }
                }
            }

            if (imageIcon != null) {
                shopPanel.setProductImage(imageIcon);
            }

            GameList.add(shopPanel);
            ITEMPANELS.add(shopPanel);
        }


        GameList.revalidate();
        GameList.repaint();
        categorystartup = 1;

    } catch (SQLException | IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Init Load Error: " + ex.getMessage());
    }
}

      
   public void filterProductsByCategory() {
    String selectedCategory = (String) categories.getSelectedItem();

    String sql;
    if (selectedCategory.equals("All")) {
        sql = "SELECT * FROM product ORDER BY name ASC";
    } else {
        sql = "SELECT * FROM product WHERE category = ? ORDER BY name ASC";
    }

    try {
        pst = con.prepareStatement(sql);

        if (!selectedCategory.equals("All")) {
            pst.setString(1, selectedCategory);
        }

        rs = pst.executeQuery();
        GameList.removeAll();

        // Set up cache directory
        String userHome = System.getProperty("user.home");
        File cacheDir = new File(userHome + "/HazeByteCache/");
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }

        while (rs.next()) {
            int prdID = rs.getInt("id");
            String prdName = rs.getString("name");
            double prdPrice = rs.getDouble("cost");
            String prdCategory = rs.getString("category");
            double prdDiscount = rs.getDouble("discount");

            Items itemPanel = new Items(this);
            itemPanel.setDetails(prdID, prdName, prdPrice, prdCategory, prdDiscount);

            // --- Caching Logic ---
            File imageFile = new File(cacheDir, prdID + ".png");

            try {
                ImageIcon imageIcon = null;

                if (imageFile.exists()) {
                    imageIcon = new ImageIcon(imageFile.getAbsolutePath());
                } else {
                    byte[] imageData = rs.getBytes("imageFile");
                    if (imageData != null) {
                        BufferedImage buffered = ImageIO.read(new ByteArrayInputStream(imageData));
                        if (buffered != null) {
                            Image scaledImg = buffered.getScaledInstance(216, 218, Image.SCALE_SMOOTH);
                            ImageIO.write(buffered, "png", imageFile); // Save to cache
                            imageIcon = new ImageIcon(scaledImg);
                        }
                    }
                }

                if (imageIcon != null) {
                    itemPanel.setProductImage(imageIcon);
                }

            } catch (Exception e) {
                // Image loading failed, but we continue without it
                System.err.println("Image loading failed for product ID " + prdID + ": " + e.getMessage());
            }

            GameList.add(itemPanel);
        }

        GameList.revalidate();
        GameList.repaint();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}

 
   
    public void filterProductsBySearchAndCategory(String searchTerm, String selectedCategory) {
    String sql;
    if (selectedCategory.equals("All")) {
        sql = "SELECT * FROM product WHERE name LIKE ? ORDER BY name ASC";
    } else {
        sql = "SELECT * FROM product WHERE category = ? AND name LIKE ? ORDER BY name ASC";
    }

    try {
        pst = con.prepareStatement(sql);

        if (selectedCategory.equals("All")) {
            pst.setString(1, "%" + searchTerm + "%");
        } else {
            pst.setString(1, selectedCategory);
            pst.setString(2, "%" + searchTerm + "%");
        }

        rs = pst.executeQuery();
        GameList.removeAll();

        // Set up cache directory
        String userHome = System.getProperty("user.home");
        File cacheDir = new File(userHome + "/HazeByteCache/");
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }

        while (rs.next()) {
            int prdID = rs.getInt("id");
            String prdName = rs.getString("name");
            double prdPrice = rs.getDouble("cost");
            String prdCategory = rs.getString("category");
            double prdDiscount = rs.getDouble("discount");

            Items itemPanel = new Items(this);
            itemPanel.setDetails(prdID, prdName, prdPrice, prdCategory, prdDiscount);

            // --- Caching Logic ---
            File imageFile = new File(cacheDir, prdID + ".png");

            try {
                ImageIcon imageIcon = null;

                if (imageFile.exists()) {
                    imageIcon = new ImageIcon(imageFile.getAbsolutePath());
                } else {
                    byte[] imageData = rs.getBytes("imageFile");
                    if (imageData != null) {
                        BufferedImage buffered = ImageIO.read(new ByteArrayInputStream(imageData));
                        if (buffered != null) {
                            Image scaledImg = buffered.getScaledInstance(216, 218, Image.SCALE_SMOOTH);
                            ImageIO.write(buffered, "png", imageFile); // Save to cache
                            imageIcon = new ImageIcon(scaledImg);
                        }
                    }
                }

                if (imageIcon != null) {
                    itemPanel.setProductImage(imageIcon);
                }

            } catch (Exception e) {
                // Image loading failed, but we continue without it
                System.err.println("Image loading failed for product ID " + prdID + ": " + e.getMessage());
            }

            GameList.add(itemPanel);
        }

        GameList.revalidate();
        GameList.repaint();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}

    
  
   
    
   
   
   public void searching(){ 
        String category = (String) categories.getSelectedItem();
        String search = GameSearchTXT.getText();
        filterProductsBySearchAndCategory(search,category);
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

               String query = "INSERT INTO product(`id`,`name`, `cost`, `discount`, `category`, `description`, `imageName`, `imagePath`, `imageFile`) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)"; 
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
            AddImage.setIcon(new ImageIcon(getClass().getResource("/Images/insertimage.jpg")));         
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
    String ID = AddID.getText();
    if (file != null && path != null && !path.isEmpty()) {
        try {
            FileInputStream fis = new FileInputStream(file);
            String query = "UPDATE product SET imageName = ?, imagePath = ?, imageFile = ? WHERE id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, file.getName());
            pst.setString(2, path);
            pst.setBinaryStream(3, fis, (int) file.length());
            pst.setString(4, ID);
            pst.executeUpdate();

            // --- Save to Cache Directory ---
            BufferedImage buffered = ImageIO.read(file);
            if (buffered != null) {
                // Resize image
                Image scaledImg = buffered.getScaledInstance(218, 218, Image.SCALE_SMOOTH);
                BufferedImage resizedBuffered = new BufferedImage(218, 218, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = resizedBuffered.createGraphics();
                g2d.drawImage(scaledImg, 0, 0, null);
                g2d.dispose();

                // Cache path
                String userHome = System.getProperty("user.home");
                File cacheDir = new File(userHome + "/HazeByteCache/");
                if (!cacheDir.exists()) {
                    cacheDir.mkdirs();
                }

                File outputFile = new File(cacheDir, ID + ".png");
                ImageIO.write(resizedBuffered, "png", outputFile);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error caching image: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saving image to database: " + ex.getMessage());
        }
    }
}



public void emptyBlobFile(String id) {
    try {
        String sql = "UPDATE product SET imageFile = ? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBytes(1, new byte[0]); // Empty byte array instead of NULL
        ps.setString(2, id);
        ps.executeUpdate();

        // Also delete the cached image file
        String userHome = System.getProperty("user.home");
        File cacheImage = new File(userHome + "/HazeByteCache/" + id + ".png");
        if (cacheImage.exists()) {
            cacheImage.delete();
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error removing image blob: " + ex.getMessage());
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
            ImageIcon ii = new ImageIcon(getClass().getResource("/Images/insertimage.jpg"));
            Image img = ii.getImage().getScaledInstance(211, 217, Image.SCALE_SMOOTH);
            EditImage.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Default image not found!");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }

   
   
   public void SelectEditProduct() {
    int selectedRow = 0;
    if (autoselect == 0){
        selectedRow = 0;
    } else {
        selectedRow = EditTable.getSelectedRow();
        autoselect = 1;
    }
    

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
                double costValue = rs.getDouble("cost");
                DecimalFormat costFormat = new DecimalFormat("0.00"); // Use "0" if you want integers only
                EditCost.setText(costFormat.format(costValue));
                // Get discount, remove decimals, and set it
                double discountValue = rs.getDouble("discount");  // Get the discount as a double
                int discountWithoutDecimal = (int) discountValue;  // Remove decimals by casting to int
                EditDiscount.setText(String.valueOf(discountWithoutDecimal) + "%");  // Set the discount without decimals

                EditCategory.setSelectedItem(rs.getString("category"));
                EditDescription.setText(rs.getString("description"));
                edit_imageName.setText(rs.getString("imageName"));
                edit_imagePath.setText(rs.getString("imagePath"));
            }

            autoselect = 1;
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
        ConfirmationPopup obj = new ConfirmationPopup();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String productID = EditTable.getValueAt(selectedRow, 0).toString();

                String sql = "DELETE FROM `product` WHERE id = ?";

                try {
                    // Delete image cache first
                    String userHome = System.getProperty("user.home");
                    File cacheDir = new File(userHome + "/HazeByteCache/");
                    File imageFile = new File(cacheDir, productID + ".png");

                    if (imageFile.exists()) {
                        imageFile.delete();
                        System.out.println("Deleted image cache: " + imageFile.getAbsolutePath());
                    }

                    // Delete from database
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, productID);
                    pst.executeUpdate();

                    // Refresh UI
                    EditRefreshTable();
                    ClearEdit();
                    EditLoading();
                    initProds();
                    showNotification("Product Deleted",Notifications.Location.TOP_CENTER, Notifications.Type.WARNING);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Delete failed: " + ex.getMessage());
                }

                GlassPanePopup.closePopupLast();
            }
        });

        GlassPanePopup.showPopup(obj);
    } else {
        CallPopUp("No Product Selected", "Select a product to remove.");
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
        ImageIcon resetimage = new ImageIcon(getClass().getResource("/Images/insertimage.jpg"));
        EditImage.setIcon(resetimage);
 
    }
   
   
   
   public void EditProduct() {
    String currentID = EditID.getText();
    String sqlCheck = "SELECT name, cost, discount, category, description, imageName, imagePath FROM product WHERE id = ?";

    try (PreparedStatement checkStmt = con.prepareStatement(sqlCheck)) {
        checkStmt.setString(1, currentID);
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next()) {
            // Get current database values
            String dbName = rs.getString("name");
            String dbCost = rs.getString("cost");
            String dbDiscount = rs.getString("discount");
            String dbCategory = rs.getString("category");
            String dbDescription = rs.getString("description");
            String dbImageName = rs.getString("imageName");
            String dbImagePath = rs.getString("imagePath");

            // Get current form values
            String formName = EditName.getText();
            String formCost = EditCost.getText();
            String formDiscount = EditDiscount.getText().replace("%", "").trim();
            String formCategory = EditCategory.getSelectedItem().toString();
            String formDescription = EditDescription.getText();
            String formImageName = edit_imageName.getText();
            String formImagePath = edit_imagePath.getText();

            // Check if all values are unchanged
            boolean noChange = 
                formName.equals(dbName) &&
                formCost.equals(dbCost) &&
                formDiscount.equals(dbDiscount + "%") &&
                formCategory.equals(dbCategory) &&
                formDescription.equals(dbDescription) &&
                formImageName.equals(dbImageName) &&
                formImagePath.equals(dbImagePath) &&
                edit_remove_image == 0 &&
                f2 == null;

            if (noChange) {
                showNotification("No changes detected.", Notifications.Location.TOP_CENTER, Notifications.Type.WARNING);
                return;
            }

        } else {
            showNotification("Product not found.", Notifications.Location.TOP_CENTER, Notifications.Type.ERROR);
            return;
        }
    } catch (Exception e) {
        String errorMsg = e.getMessage() != null ? e.getMessage() : "Unknown error while checking changes.";
        CallPopUp("Check Error", errorMsg);
        return;
    }

    // -- If changes detected, proceed with update --
    try {
        String sqlUpdate = "UPDATE product SET name=?, cost=?, discount=?, category=?, description=?, imageName=?, imagePath=? WHERE id=?";
        PreparedStatement updateStmt = con.prepareStatement(sqlUpdate);

        updateStmt.setString(1, EditName.getText());
        updateStmt.setString(2, EditCost.getText());
        updateStmt.setString(3, EditDiscount.getText().replace("%", "").trim());
        updateStmt.setString(4, EditCategory.getSelectedItem().toString());
        updateStmt.setString(5, EditDescription.getText());
        updateStmt.setString(6, edit_imageName.getText());
        updateStmt.setString(7, edit_imagePath.getText());
        updateStmt.setString(8, EditID.getText());

        updateStmt.executeUpdate();

        // Save new image if any
        saveImageToDatabaseEdit(f2, path2);

        if (edit_remove_image == 1) {
            emptyBlobFile(EditID.getText());
        }
        edit_remove_image = 0;

        EditLoading();
        EditRefreshTable();
        showNotification("Edit Saved", Notifications.Location.TOP_CENTER, Notifications.Type.SUCCESS);

    } catch (Exception ex) {
        String errorMsg = ex.getMessage() != null ? ex.getMessage() : "Unknown error.";
        CallPopUp("An Error Has Occurred", errorMsg);
    }
}

   
 private void saveImageToDatabaseEdit(File file, String path) {
    String ID = EditID.getText();

    if (file != null && path != null && !path.isEmpty()) {
        try {
            FileInputStream fis = new FileInputStream(file);
            String query = "UPDATE product SET imageName = ?, imagePath = ?, imageFile = ? WHERE id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, file.getName());
            pst.setString(2, path);
            pst.setBinaryStream(3, fis, (int) file.length());
            pst.setString(4, ID);
            pst.executeUpdate();

            // Save to cache directory
            BufferedImage bufferedImage = ImageIO.read(new File(path));
            if (bufferedImage != null) {
                BufferedImage resizedBuffered = new BufferedImage(218, 218, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = resizedBuffered.createGraphics();
                g2d.drawImage(bufferedImage.getScaledInstance(218, 218, Image.SCALE_SMOOTH), 0, 0, null);
                g2d.dispose();

                // Cache directory
                String userHome = System.getProperty("user.home");
                File cacheDir = new File(userHome + "/HazeByteCache/");
                if (!cacheDir.exists()) {
                    cacheDir.mkdirs();
                }

                // Save image to cache
                File cacheImageFile = new File(cacheDir, ID + ".png");
                ImageIO.write(resizedBuffered, "png", cacheImageFile);
            }

        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saving image to database/cache: " + ex.getMessage());
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


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public void ClearCart() {
    String sql = "DELETE FROM `cart`";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.executeUpdate();
        
    } catch (SQLException ex) {
       
    }
    
    CartImageTXT.setIcon(null);
    CartTitleTXT.setText("");
    CartCategoryTXT.setText("");
    CartCostTXT.setText("₱0");
    CartDescriptionTXT.setText("");
    CartQuantityTXT.setText("0");
    CartTotalCostTXT.setText("0");
    discountTXT.setText("");
    discountTXT.setVisible(false);
    paymentTXT.setText("");
    changeTXT.setText("₱0.00");
    
}



private void CartSelectDelete() {
    int selectedRow = CartTable.getSelectedRow();

    if (selectedRow != -1) {
        String ID = CartTable.getValueAt(selectedRow, 9).toString();

        String sql = "DELETE FROM `cart` WHERE id = ?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            pst.executeUpdate();
            
            CartRefreshTable();
            CartImageTXT.setIcon(null);
            CartTitleTXT.setText("");
            CartCategoryTXT.setText("");
            CartCostTXT.setText("₱0");
            CartDescriptionTXT.setText("");
            CartQuantityTXT.setText("0");
            CartTotalCostTXT.setText("0");
            discountTXT.setText("");
            discountTXT.setVisible(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  
}

    


public void CartRefreshTable() {
    String sql = "SELECT * FROM cart ORDER BY `id` DESC";

    try {
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();
        model.setRowCount(0);

        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Formatter for numbers with commas and 2 decimal places
        DecimalFormat df = new DecimalFormat("#,##0.00");

        while (rs.next()) {
            // Discount (remove decimals)
            double discountValue = Double.parseDouble(rs.getString(4));
            int discountWithoutDecimal = (int) discountValue;

            // Format quantity as integer with commas
            int quantity = Integer.parseInt(rs.getString(9));
            String formattedQuantity = String.format("%,d", quantity);

            // Format cost, subtotal, total with commas and 2 decimal places
            double cost = Double.parseDouble(rs.getString(3).replace(",", ""));
            double subtotal = Double.parseDouble(rs.getString(7).replace(",", ""));
            double total = Double.parseDouble(rs.getString(8).replace(",", ""));

            String formattedCost = df.format(cost);
            String formattedSubtotal = df.format(subtotal);
            String formattedTotal = df.format(total);

            model.addRow(new Object[] {
                rs.getString(2),          // name
                rs.getString(5),
                formattedQuantity,        // quantity
                formattedCost,            // cost with commas
                discountWithoutDecimal + "%", // discount
                formattedSubtotal,        // subtotal with commas
                formattedTotal,           // total with commas
                rs.getString(10),         // date
                rs.getString(11),         // time
                rs.getString(1),          // id
                rs.getString(12),         // prodID
                rs.getString(6),          // another prodID?
            });
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


public void SelectCartItem() {
    int selectedRow = CartTable.getSelectedRow();
    CartItemView.setVisible(true);
    
    if (selectedRow != -1) {
        int id = Integer.parseInt(CartTable.getValueAt(selectedRow, 10).toString());    
        String name = CartTable.getValueAt(selectedRow, 0).toString();       // Product
        String category = CartTable.getValueAt(selectedRow, 1).toString();
        String quantity = CartTable.getValueAt(selectedRow, 2).toString();   // Quantity
        String cost = CartTable.getValueAt(selectedRow, 3).toString();       // Cost
        String discount = CartTable.getValueAt(selectedRow, 4).toString();   // Discount
        String total = CartTable.getValueAt(selectedRow, 6).toString();   // total
        String description = CartTable.getValueAt(selectedRow, 11).toString();

        CartCategoryTXT.setText(category);
        CartTitleTXT.setText(name);
        
        function.adjustFontSizeToFit(CartTitleTXT, 24, 12);
        
        // Remove commas before parsing
        CartCostTXT.setText("₱" +new DecimalFormat("#,##0.00").format(Double.parseDouble(cost.replace(",", ""))));
        CartDescriptionTXT.setText(description);
        CartQuantityTXT.setText(quantity);
        CartTotalCostTXT.setText("₱" +new DecimalFormat("#,##0.00").format(Double.parseDouble(total.replace(",", ""))));
        int discountValue = Integer.parseInt(discount.replace("%", ""));
        if (discountValue > 0 && discountValue <=100){
            discountTXT.setVisible(true);
            discountTXT.setText(discount+" Discount!");
        } else {
            discountTXT.setVisible(false);
        }
        
        // Now fetch the image from the database using the ID
        try {
            String sql = "SELECT imageFile FROM product WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                byte[] imgBytes = rs.getBytes("imageFile");

                if (imgBytes != null) {
                    ImageIcon icon = new ImageIcon(imgBytes);
                    Image img = icon.getImage().getScaledInstance(211, 211, Image.SCALE_SMOOTH);
                    CartImageTXT.setIcon(new ImageIcon(img));
                    CartImageTXT.setText("");
                } else {
                    CartImageTXT.setIcon(null);
                    CartImageTXT.setText("No Image");
                }
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            CartImageTXT.setIcon(null);
            CartImageTXT.setText("Error loading image");
        }
    } 
}




public void CartMath() {
    
    if (CartTable.getRowCount() == 0) {
        paymentTXT.setEnabled(false);
        paymentTXT.setAA_TextHint("   Add items to proceed with payment");
        CartItemView.setVisible(false);
    } else {
        paymentTXT.setEnabled(true);
        paymentTXT.setAA_TextHint("   Enter Amount");
        
    }

    try {
        // 1. Get subtotal from cart table
        String sqlSubtotal = "SELECT SUM(subtotal) FROM cart";
        PreparedStatement pstSubtotal = con.prepareStatement(sqlSubtotal);
        ResultSet rsSubtotal = pstSubtotal.executeQuery();

        double subtotal = 0;
        if (rsSubtotal.next()) {
            subtotal = rsSubtotal.getDouble(1);
        }

        // 2. Get total discount from cart table
        String sqlDiscount = "SELECT SUM((cost * discount / 100) * quantity) FROM cart";
        PreparedStatement pstDiscount = con.prepareStatement(sqlDiscount);
        ResultSet rsDiscount = pstDiscount.executeQuery();

        double totalDiscount = 0;
        if (rsDiscount.next()) {
            totalDiscount = rsDiscount.getDouble(1);
        }

        // 3. Compute final total
        double total = subtotal - totalDiscount;

        // 4. Get user payment (wallet input)
        double payment = 0.0;

        if (paymentTXT.getText() == null || paymentTXT.getText().trim().equals("")) {
            payment = 0.0;
        } else {
            payment = Double.parseDouble(paymentTXT.getText().replace(",", "").replace("₱", ""));
        }
        // 5. Compute change
        double change = payment - total;

        // 6. Format numbers
        DecimalFormat df = new DecimalFormat("#,##0.00");

        String formattedSubtotal = df.format(subtotal);
        String formattedDiscount = df.format(totalDiscount);
        String formattedTotal = df.format(total);
        String formattedChange = df.format(change);
       

        // 7. Set values to UI
        
        subtotalTXT.setText("₱" + formattedSubtotal);
        totaldiscountTXT.setText("₱" +formattedDiscount);
        totalTXT.setText("₱" +formattedTotal);
        changeTXT.setText("₱" +formattedChange);
     

        // 8. Change text color based on payment
        if (payment < total) {
            paymentTXT.setForeground(new Color(201, 15, 15));
            changeTXT.setForeground(new Color(201, 15, 15));
        } else if (payment == 0){
            changeTXT.setForeground(new Color(255,255,255));
            paymentTXT.setForeground(new Color(255,255,255));
        }
        else {
            paymentTXT.setForeground(new Color(52, 196, 57));
            changeTXT.setForeground(new Color(52, 196, 57));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}



public ImageIcon generateQRCode(String data, int width, int height) {
    try {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height);

        BufferedImage qrImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                qrImage.setRGB(x, y, bitMatrix.get(x, y) ? Color.BLACK.getRGB() : Color.WHITE.getRGB());
            }
        }

        return new ImageIcon(qrImage);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


public void BuyCart() {
    LocalDateTime now = LocalDateTime.now();
    String formattedDate = getFormattedDate();
    String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        
    if (CartTable.getRowCount() == 0) {
            CallPopUp("Cart Empty", "Please select items to purchase.");
        return;
    }

    String paymentText = paymentTXT.getText().replace(",", "").trim();
    String totalText = totalTXT.getText().replace(",", "").trim().replace("₱", "");
    String totalDiscount = totaldiscountTXT.getText().replace(",", "").trim().replace("₱", "");
    String totalsubtotal = subtotalTXT.getText().replace(",", "").trim().replace("₱", "");
    String totalchange = changeTXT.getText().replace(",", "").trim().replace("₱", "");
    if (paymentText.isEmpty() || totalText.isEmpty()) {
        CallPopUp("Payment Required","Please make a payment before proceeding with the purchase.");
        
    }

    double payment = Double.parseDouble(paymentText);
    double total = Double.parseDouble(totalText);

    if (payment >= total) {
        try {
            // 1. Insert all cart records into 
            String receiptnum="";
            receiptnum = generate8DigitString();
            String sql = "INSERT INTO history (id, name, cost, discount, category, description, subtotal, total, quantity, Date, Time, productID, imageName, imagePath, imageFile, receipt, status, reason) " +
                         "SELECT id, name, cost, discount, category, description, subtotal, total, quantity, ?, ?, productID, imageName, imagePath, imageFile, ?,?,? FROM cart";
            pst = con.prepareStatement(sql);
            pst.setString(1, formattedDate);
            pst.setString(2, formattedTime);
            pst.setString(3, receiptnum);
            pst.setString(4, "Sold");
            pst.setString(5, "");
            pst.executeUpdate();

            // 2. Show receipt window
            receipt receipt = new receipt(this);
            receipt.setVisible(true);

            
            double subtotal = Double.parseDouble(totalsubtotal);
            double tax = Double.parseDouble(totalDiscount);
            double change = Double.parseDouble(totalchange);


            String[] fields = {"Subtotal", "Tax", "Total", "Payment", "Change"};
            double[] values = {subtotal, tax, total, payment, change};
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            for (int i = 0; i < fields.length; i++) {
                String formattedValue = decimalFormat.format(values[i]);
                formattedValue = String.format("%s", formattedValue);

                int numDots = Math.max(0, 70 - formattedValue.length());
                String dots = new String(new char[numDots]).replace('\0', '-');

                switch (fields[i]) {
                    case "Subtotal":
                        receipt.r_subtotal.setText(dots +" ₱"+ formattedValue);
                        break;
                    case "Tax":
                        receipt.r_tax.setText(dots +" ₱"+ formattedValue);
                        break;
                    case "Total":
                        receipt.r_total.setText(dots +" ₱"+ formattedValue);
                        break;
                    case "Payment":
                        receipt.r_payment.setText(dots +" ₱"+ formattedValue);
                        break;
                    case "Change":
                        receipt.r_change.setText(dots +" ₱"+ formattedValue);
                        break;
                }
            }
            
            String info = 
                    "[ HAZEBYTE ]\n"
                   +"Receipt number: " + receiptnum +"\n"
                   +"Date: " + formattedDate +"\n"
                   +"Time: " + formattedTime +"\n\n"
                   +"Subtotal: " + receipt.r_subtotal.getText().replace("-", "").replace("₱", "")  +"\n"
                   +"Discount: " + receipt.r_tax.getText().replace("-", "").replace("₱", "") + "\n"
                   +"Total: " + receipt.r_total.getText().replace("-", "").replace("₱", "")  +"\n\n"
                   +"Payment: " + receipt.r_payment.getText().replace("-", "").replace("₱", "")  +"\n"
                   +"Change: " + receipt.r_change.getText().replace("-", "").replace("₱", "")  +"\n"
                   +"\n 14 days warranty!"
                    ;
            
            receipt.r_date.setText(formattedDate);
            receipt.r_number.setText(receiptnum);
            ImageIcon qrIcon = generateQRCode(info, 200, 200); // 150x150 is a good size
            receipt.qrcode.setIcon(qrIcon);
            
            
            // 4. Clear cart
            

            paymentTXT.setText("");
            totalTXT.setText("₱0.00");

            ClearCart();
            CartRefreshTable();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        CallPopUp("Insufficient Payment", "Please enter a sufficient payment amount.");
    }
}



public static String getFormattedDate() {
    Date now = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy");
    return formatter.format(now).trim();  // Trim any accidental space
}

 public static String generate8DigitString() {
        Random rand = new Random();
        int number = 10000000 + rand.nextInt(90000000); // ensures it's 8 digits
        return String.valueOf(number);
    }

    
    
    
    
    
    
    
    
    
    
    
    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//    
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//     
    
    
    
    
    
    
    
    
    
    
    
    
    
    



    public void HistoryRefreshTable() {
    String sql = "SELECT * FROM History ORDER BY `Date` DESC, `Time` DESC";
    
    
    try {
        DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
        model.setRowCount(0);

        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Formatter for numbers with commas and 2 decimal places
        DecimalFormat df = new DecimalFormat("#,##0.00");

        while (rs.next()) {
            // Discount (remove decimals)
            double discountValue = Double.parseDouble(rs.getString(4));
            int discountWithoutDecimal = (int) discountValue;

            // Format quantity as integer with commas
            int quantity = Integer.parseInt(rs.getString(9));
            String formattedQuantity = String.format("%,d", quantity);

            // Format cost, subtotal, total with commas and 2 decimal places
            double cost = Double.parseDouble(rs.getString(3).replace(",", ""));
            double subtotal = Double.parseDouble(rs.getString(7).replace(",", ""));
            double total = Double.parseDouble(rs.getString(8).replace(",", ""));

            String formattedCost = df.format(cost);
            String formattedSubtotal = df.format(subtotal);
            String formattedTotal = df.format(total);

            model.addRow(new Object[] {
                rs.getString(2),          // name
                rs.getString(5),
                formattedQuantity,        // quantity
                formattedCost,            // cost with commas
                discountWithoutDecimal + "%", // discount
                formattedSubtotal,        // subtotal with commas
                formattedTotal,           // total with commas
                rs.getString(10),         // date
                rs.getString(11),         // time
                rs.getString(1),          // id
                rs.getString(12),         // prodID
                rs.getString(6),          // desc
                rs.getString(16),       // receipt
                rs.getString(17),       //status
                                  
            });
        }
        
        HistoryTable.getColumnModel().getColumn(13).setCellRenderer(new CustomCellRenderer());
        
        int rows = HistoryTable.getRowCount();
        DecimalFormat history = new DecimalFormat("#,###"); // Format without decimals
        String formattedRows = history.format(rows);
        TransactionNumber.setText(formattedRows);
            
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


    
    
    
    public void HistorySortSearch() {
    String searchText = HistorySearch.getText().trim(); // Get the search text
    String sql;

    if (searchText.isEmpty()) {
        // Default query when the search field is empty
        sql = "SELECT * FROM History ORDER BY `Date` DESC, `Time` DESC";
    } else {
        // Updated query that excludes `id`, `productID`, `description`, `imageName`, `imagePath`, and `imageFile`
        sql = "SELECT * FROM History WHERE `name` LIKE ? OR `cost` LIKE ? OR `discount` LIKE ? OR `category` LIKE ? OR `subtotal` LIKE ? OR `total` LIKE ? OR `quantity` LIKE ? OR `Date` LIKE ? OR `Time` LIKE ? OR `receipt` LIKE ? OR `status` LIKE ? ORDER BY `Date` DESC, `Time` DESC";
    }

    try {
        DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        PreparedStatement pst = con.prepareStatement(sql);

        if (!searchText.isEmpty()) {
            String likeSearch = "%" + searchText + "%"; // Search text with wildcards

            // Set the parameters for the query to search in multiple columns
            pst.setString(1, likeSearch);  // name
            pst.setString(2, likeSearch);  // cost
            pst.setString(3, likeSearch);  // discount
            pst.setString(4, likeSearch);  // category
            pst.setString(5, likeSearch);  // subtotal
            pst.setString(6, likeSearch);  // total
            pst.setString(7, likeSearch);  // quantity
            pst.setString(8, likeSearch);  // Date
            pst.setString(9, likeSearch);  // Time
            pst.setString(10, likeSearch);  // receipt
            pst.setString(11, likeSearch);  // status
        }

        ResultSet rs = pst.executeQuery();

        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Loop through the result set and populate the table
        while (rs.next()) {
            double discountValue = Double.parseDouble(rs.getString(4));
            int discountWithoutDecimal = (int) discountValue;

            int quantity = Integer.parseInt(rs.getString(9));
            String formattedQuantity = String.format("%,d", quantity);

            double cost = Double.parseDouble(rs.getString(3).replace(",", ""));
            double subtotal = Double.parseDouble(rs.getString(7).replace(",", ""));
            double total = Double.parseDouble(rs.getString(8).replace(",", ""));

            String formattedCost = df.format(cost);
            String formattedSubtotal = df.format(subtotal);
            String formattedTotal = df.format(total);

            // Add the row to the table model
            model.addRow(new Object[]{
                rs.getString(2),          // name
                rs.getString(5),          // category
                formattedQuantity,
                formattedCost,
                discountWithoutDecimal + "%",
                formattedSubtotal,
                formattedTotal,
                rs.getString(10),         // date
                rs.getString(11),         // time
                rs.getString(1),          // id (we are not displaying id)
                rs.getString(12),         // productID
                rs.getString(6),
                rs.getString(16),
                rs.getString(17),       //status
            });
        
        
        }
        
        int rows = HistoryTable.getRowCount();
        DecimalFormat history = new DecimalFormat("#,###"); // Format without decimals
        String formattedRows = history.format(rows);
        TransactionNumber.setText(formattedRows);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Search Error: " + ex.getMessage());
    }
}
    
    
    
    
    public void HistorySortCategory() {
    String selectedValue = (String) HistoryCategorySort.getSelectedItem();
    String sql;

    if (selectedValue.equals("All")) {
        sql = "SELECT * FROM history ORDER BY `Date` DESC, `Time` DESC";
    } else {
        sql = "SELECT * FROM history WHERE category = ? ORDER BY `Date` DESC, `Time` DESC";
    }

    try {
        DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
        model.setRowCount(0); // Clear existing rows

        PreparedStatement pst = con.prepareStatement(sql);

        if (!selectedValue.equals("All")) {
            pst.setString(1, selectedValue); // Bind category filter
        }

        ResultSet rs = pst.executeQuery();
        DecimalFormat df = new DecimalFormat("#,##0.00");

        while (rs.next()) {
            double discountValue = Double.parseDouble(rs.getString(4));
            int discountWithoutDecimal = (int) discountValue;

            int quantity = Integer.parseInt(rs.getString(9));
            String formattedQuantity = String.format("%,d", quantity);

            double cost = Double.parseDouble(rs.getString(3).replace(",", ""));
            double subtotal = Double.parseDouble(rs.getString(7).replace(",", ""));
            double total = Double.parseDouble(rs.getString(8).replace(",", ""));

            String formattedCost = df.format(cost);
            String formattedSubtotal = df.format(subtotal);
            String formattedTotal = df.format(total);

            model.addRow(new Object[]{
                rs.getString(2),          // name
                rs.getString(5),          // category
                formattedQuantity,
                formattedCost,
                discountWithoutDecimal + "%",
                formattedSubtotal,
                formattedTotal,
                rs.getString(10),         // date
                rs.getString(11),         // time
                rs.getString(1),          // id (hidden)
                rs.getString(12),         // productID (hidden)
                rs.getString(6),
                rs.getString(16),  
                rs.getString(17),       //status
            });
        }

        int rows = HistoryTable.getRowCount();
        DecimalFormat history = new DecimalFormat("#,###"); // Format without decimals
        String formattedRows = history.format(rows);
        TransactionNumber.setText(formattedRows);

        rs.close();
        pst.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Sort Error: " + ex.getMessage());
    }
}




    public void wrapLabelText(JLabel label) {
    String text = label.getText();
    int width = label.getWidth();

    if (width <= 0 || text == null || text.isEmpty()) return;

    // Create a dummy FontMetrics to estimate text width
    FontMetrics fm = label.getFontMetrics(label.getFont());
    StringBuilder wrappedText = new StringBuilder("<html>");

    String[] words = text.split(" ");
    StringBuilder line = new StringBuilder();

    for (String word : words) {
        String testLine = line + word + " ";
        int testWidth = fm.stringWidth(testLine);

        if (testWidth > width) {
            wrappedText.append(line).append("<br>");
            line = new StringBuilder(word).append(" ");
        } else {
            line.append(word).append(" ");
        }
    }

    wrappedText.append(line).append("</html>");
    label.setText(wrappedText.toString());
}
    
    
    
    
    public void SelectHistoryItem() {
    int selectedRow = HistoryTable.getSelectedRow();
    
    
    if (selectedRow != -1) {
        int id = Integer.parseInt(HistoryTable.getValueAt(selectedRow, 9).toString());
        
        try{
            String sql ="SELECT * FROM History WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            
             if (rs.next()) {
                // Extract all values
                int dbId = rs.getInt("id");
                String name = rs.getString("name");
                double cost = rs.getDouble("cost");
                double discount = rs.getDouble("discount");
                String category = rs.getString("category");
                String description = rs.getString("description");
                double subtotal = rs.getDouble("subtotal");
                double total = rs.getDouble("total");
                String quantity = rs.getString("quantity");
                String receipt = rs.getString("receipt");
                String status = rs.getString("status");
                String reason = rs.getString("reason");

                DecimalFormat df = new DecimalFormat("₱#,##0.00");
                double discountAmount = subtotal * (discount / 100.0);
                // Show preview
                preview = new HistoryPreview(this);
                preview.prevID = dbId;
                PreviewLoadImageID(dbId,preview.PreviewImage);
                preview.receipt.setText(receipt);
                preview.Title.setText(name);
                preview.Category.setText(category);
                preview.Description.setText(description);
                preview.Issues.setText(reason);
                function.adjustFontSizeToFit(preview.Title, 20, 10);
                preview.Description.setLineWrap(true);
                preview.Issues.setLineWrap(true);
                //.Issues.setCaretPosition(0);
                //preview.issuescroll.getVerticalScrollBar().setValue(0);
                //preview.issuescroll.getViewport().setViewPosition(new java.awt.Point(0, 0));
                
                
                
                
                preview.cost.setText(df.format(cost));
                preview.quantity.setText(quantity);
                preview.discountper.setText(((int) discount) + "%");
                preview.discount.setText(df.format(discountAmount));
                preview.subtotal.setText(df.format(subtotal));
                preview.total.setText(df.format(total));
                preview.status.setSelectedItem(status);
                if (status.equals("Refunded")){
                    preview.status.setForeground(new Color(235, 87, 87));
                    preview.stat = true;
                    preview.PreviewReason.setVisible(true);
                    preview.issuescroll.setVisible(true);
                }
                preview.setVisible(true);
                
             }
        
        }catch(Exception e){
             e.printStackTrace();
        }
        
       
    } 
}
    
    
   
   
    
    
    public void PreviewLoadImageID(int ID, JLabel label) {
        try {

            pst = con.prepareStatement("SELECT imageFile FROM history WHERE id = ?");
            pst.setInt(1, ID);

            rs = pst.executeQuery();

            if (rs.next()) {
                LoadImagePreview(label);
            } else {
                // Set default image if no imageFile found
                setDefaultImage();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            setDefaultImage();
        }
    }

   public void LoadImagePreview(JLabel label) {
        try {
            byte[] imagedata = rs.getBytes("imageFile");

            if (imagedata != null && imagedata.length > 0) {
                format1 = new ImageIcon(imagedata);
                Image mm = format1.getImage();
                Image img2 = mm.getScaledInstance(213, 207, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                label.setIcon(image);
            } else {
                setDefaultImage(); // fallback if byte array is empty
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            setDefaultImage(); // fallback on error
        }
    }
   
   public void PreviewDefaultImage() {
        try {
            ImageIcon ii = new ImageIcon(""); // Make sure this image exists in your project directory
            Image img = ii.getImage().getScaledInstance(213, 207, Image.SCALE_SMOOTH);
            EditImage.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Default image not found!");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }


   
   
   public void HistoryCalculate() {
    String query = "SELECT cost, discount, quantity, total, status FROM history";

    long totalQuantity = 0;
    double totalSales = 0;
    double totalDiscountAmount = 0;
    int totalSold = 0;
    int totalRefund = 0;
    double totalRefundAmount = 0; // New variable to track refunded amount

    try (PreparedStatement stmt = con.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            double cost = rs.getDouble("cost");
            double discountPercent = rs.getDouble("discount");
            long quantity = rs.getLong("quantity");
            double total = rs.getDouble("total");

            String status = rs.getString("status");

            if ("Sold".equalsIgnoreCase(status)) {
                // Calculate only for rows where status is "Sold"
                totalQuantity += quantity;
                totalSales += total;

                // Convert discount % to actual discount amount and accumulate it
                double discountAmount = (cost * (discountPercent / 100.0)) * quantity;
                totalDiscountAmount += discountAmount;

                totalSold++; // Increment totalSold for "Sold" status
            } else if ("Refunded".equalsIgnoreCase(status)) {
                // For refunded rows, track the total cost or total refunded amount
                double discountAmount = (cost * (discountPercent / 100.0)) * quantity;
                totalRefundAmount += ((cost * quantity) - discountAmount);
                totalRefund++; // Increment totalRefund for "Refunded" status
            }
        }


        historytotal = new HistoryTotal(this);
        historytotal.setVisible(true);
        historytotal.TotalQuantity.setText(String.valueOf(totalQuantity));
        historytotal.TotalSold.setText("₱" + String.format("%,.2f", totalSales));
        historytotal.TotalRefund.setText("₱" + String.format("%,.2f", totalRefundAmount));

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   
   
   
   
   
   public static void closeQuietly(AutoCloseable... resources) {
    for (AutoCloseable res : resources) {
        if (res != null) {
            try { res.close(); } catch (Exception ignored) {}
        }
    }
}
   
   
   public void processlist(){
   String query = "SHOW PROCESSLIST;";
try {
    pst = con.prepareStatement(query);
    rs = pst.executeQuery(); // Execute the query

    // Loop through the result and print each process
    while (rs.next()) {
        int id = rs.getInt("Id");
        String user = rs.getString("User");
        String host = rs.getString("Host");
        String db = rs.getString("db");
        String command = rs.getString("Command");
        int time = rs.getInt("Time");
        String state = rs.getString("State");
        String info = rs.getString("Info");

        System.out.println("ID: " + id + ", User: " + user + ", Host: " + host +
                           ", DB: " + db + ", Command: " + command + ", Time: " + time +
                           ", State: " + state + ", Info: " + info);
    }

    rs.close();
    pst.close(); // Good practice to close your resources
} catch (SQLException ex) {
    ex.printStackTrace(); // Handle or log the exception
}
   }

 //System.out.println("SAMUEL"); 
        
}