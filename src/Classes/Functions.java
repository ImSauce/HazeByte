
package Classes;

import Frames.Main;
import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class Functions {
      
    //this shit will add background highlights to the menu buttons that is clicked
    public void MenuClicked(boolean HomeClicked, JPanel HomePN, boolean OptionClicked,JPanel OptionPN, boolean HistoryClicked, JPanel HistoryPN, boolean InfoClicked, JPanel InfoPN ){
        if(HomeClicked == true){
        HomePN.setBackground(new Color(38, 38, 38));
        }else{
        HomePN.setBackground(new Color(24,23,23));
        }

        if(OptionClicked == true){
        OptionPN.setBackground(new Color(38, 38, 38));
        }else{
        OptionPN.setBackground(new Color(24,23,23));
        }

        if(HistoryClicked == true){
        HistoryPN.setBackground(new Color(38, 38, 38));
        }else{
        HistoryPN.setBackground(new Color(24,23,23));
        }

        if(InfoClicked == true){
        InfoPN.setBackground(new Color(38, 38, 38));
        }else{
        InfoPN.setBackground(new Color(24,23,23));
        }
    }
    
    public void SettingsHoverIn(JPanel settings){
        settings.setBackground(new Color(38, 38, 38));
    }
    
    public void SettingsHoverOut(JPanel settings){
        settings.setBackground(new Color(24,23,23));
    }
 
    
    
    
    
    
    
    public void adjustFontSizeToFit(JLabel label, int maxFontSize, int minFontSize) {
    String originalText = label.getText();
    int labelWidth = label.getWidth();
    int labelHeight = label.getHeight();

    if (originalText == null || originalText.isEmpty() || labelWidth <= 0 || labelHeight <= 0) return;

    // Enable text wrapping with HTML
    label.setText("<html>" + wrapTextToFitHTML(originalText, label.getFontMetrics(label.getFont()), labelWidth) + "</html>");

    for (int fontSize = maxFontSize; fontSize >= minFontSize; fontSize--) {
        Font testFont = new Font("Arial Black", Font.PLAIN, fontSize);
        FontMetrics metrics = label.getFontMetrics(testFont);

        // Wrap text to fit the label width
        String htmlWrapped = wrapTextToFitHTML(originalText, metrics, labelWidth);
        int lineCount = htmlWrapped.split("<br>").length;
        int totalHeight = metrics.getHeight() * lineCount;

        if (totalHeight <= labelHeight) {
            label.setFont(testFont);
            label.setText("<html>" + htmlWrapped + "</html>");
            return;
        }
    }

    // Fallback font size if no fitting font is found
    Font fallback = new Font("Arial Black", Font.PLAIN, minFontSize);
    label.setFont(fallback);
    label.setText("<html>" + wrapTextToFitHTML(originalText, label.getFontMetrics(fallback), labelWidth) + "</html>");
}
    
    
    public String wrapTextToFitHTML(String text, FontMetrics metrics, int maxWidth) {
    StringBuilder wrapped = new StringBuilder();
    String[] words = text.split(" ");
    StringBuilder line = new StringBuilder();

    for (String word : words) {
        String testLine = line.length() > 0 ? line + " " + word : word;
        if (metrics.stringWidth(testLine) > maxWidth) {
            wrapped.append(line).append("<br>");
            line = new StringBuilder(word);  // Start new line with the current word
        } else {
            if (line.length() > 0) line.append(" ");
            line.append(word);
        }
    }

    if (line.length() > 0) {
        wrapped.append(line);
    }

    return wrapped.toString().trim();
}


    
}


       
