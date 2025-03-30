
package Classes;

import java.awt.Color;
import static java.awt.Color.BLACK;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Functions {
    
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
}
