
package Classes;
import Classes.UIcolors;
import Frames.ChangePassword;
import Frames.Main;
import Splash.Login;


public class Run {
    
     public static void main(String args[]) {
        
        UIcolors color = new UIcolors();
        color.UIcolor();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
            
            
        });
    }
    
}
