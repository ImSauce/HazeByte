
package Classes;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;

public class UIcolors {
    
    public void UIcolor(){
        
        
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        UIManager.put("TitlePane.unifiedBackground", false);
        UIManager.getColor("Label.disabledForeground");
        
        UIManager.put("AccentColor", new Color(0,0,0));
        UIManager.put("Panel.background", new Color(44, 44, 44)); // Dark gray
        UIManager.put("Panel.foreground", Color.WHITE);

            
        UIManager.put("ComboBox.background", Color.BLACK); // Set background color to black
        UIManager.put("ComboBox.foreground", Color.WHITE); // Set text color to white
        UIManager.put("ComboBox.selectionBackground", new Color(80, 80, 80)); // Set selection background color to medium gray
        UIManager.put("ComboBox.selectionForeground", Color.WHITE); // Set selection text color to white
        UIManager.put("ComboBox.selectionArc", 20);
        UIManager.put("ComboBox.buttonBackground", new Color(20,20,20)); 

        UIManager.put("ToolBar.titleTextColor", Color.WHITE);
        UIManager.put("ToolBar.subtitleTextColor", Color.WHITE);
        UIManager.put("Table.selectionBackground", new Color(80, 80, 80)); // Medium gray
        UIManager.put("Table.selectionForeground", Color.WHITE);
        UIManager.put("Table.borderColor", Color.BLACK);

        UIManager.put("Button.borderColor", Color.WHITE); // Light blue
        UIManager.put("Button.arc", 0);
        UIManager.put("Button.hoverBackground", new Color(38, 38, 38)); // Dark gray
        UIManager.put("Button.hoverForeground", Color.WHITE);
        UIManager.put("Button.background", Color.BLACK); // Medium gray
        UIManager.put("Button.foreground", Color.WHITE); // Set foreground color to white

        UIManager.put("ScrollBar.thumbArc", 999);

        UIManager.put("ScrollBar.trackArc", 999);

        UIManager.put("Table.background", new ColorUIResource(24,23,23)); // Dark gray background
        UIManager.put("Table.foreground", new ColorUIResource(Color.WHITE)); // White foreground
        UIManager.put("Table.selectionBackground", new ColorUIResource(80, 80, 80)); // Medium gray selection background
        UIManager.put("Table.selectionForeground", new ColorUIResource(Color.WHITE)); // White selection foreground
        UIManager.put("Table.gridColor", new ColorUIResource(38,38,38)); // Dark gray grid lines
        UIManager.put("Table.focusCellForeground", new ColorUIResource(Color.WHITE)); // White focus cell foreground
        UIManager.put("Table.focusCellBackground", new ColorUIResource(Color.BLACK)); // Medium gray focus cell background

        UIManager.put("TableHeader.font", new Font("Calibiri",Font.PLAIN, 14));
        UIManager.put("TableHeader.background", new ColorUIResource(20,20,20)); // Dark gray background
        UIManager.put("TableHeader.foreground", new ColorUIResource(Color.WHITE)); // White foreground


        UIManager.put("Table.focusCellHighlightBorder", new BorderUIResource(BorderFactory.createLineBorder(Color.BLACK))); // Change border color to black


        UIManager.put("ScrollBar.thumb", new ColorUIResource(80, 80, 80)); // Thumb color
        UIManager.put("ScrollBar.thumbDarkShadow", new ColorUIResource(38, 38, 38)); // Thumb shadow color
        UIManager.put("ScrollBar.thumbHighlight", new ColorUIResource(80, 80, 80)); // Thumb highlight color
        UIManager.put("ScrollBar.thumbShadow", new ColorUIResource(38, 38, 38)); // Thumb shadow color
        UIManager.put("ScrollBar.track", new ColorUIResource(24,23,23)); // Track color
        UIManager.put("ScrollBar.trackHighlight", new ColorUIResource(24,23,23)); // Track highlight color
        UIManager.put("ScrollBar.width", 5); // Scrollbar width

        UIManager.put("ScrollBar.trackArc", 0);

    
    
    }
    
    
    
    public void UIcolor2(){
        
        
        UIManager.put("ScrollBar.thumb", new ColorUIResource(200,200,200)); // Thumb color
        UIManager.put("ScrollBar.thumbDarkShadow", new ColorUIResource(255,255,255)); // Thumb shadow color
        UIManager.put("ScrollBar.thumbHighlight", new ColorUIResource(255,255,255)); // Thumb highlight color
        UIManager.put("ScrollBar.thumbShadow", new ColorUIResource(255,255,255)); // Thumb shadow color
        UIManager.put("ScrollBar.track", new ColorUIResource(255,255,255)); // Track color
        UIManager.put("ScrollBar.trackHighlight", new ColorUIResource(255,255,255)); // Track highlight color
        UIManager.put("ScrollBar.width", 4); // Scrollbar width

        UIManager.put("ScrollBar.trackArc", 0);

    
    
    }
    
    
    
    
    
    
     
    
}
