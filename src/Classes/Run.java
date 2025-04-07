
package Classes;
import Classes.UIcolors;
import Frames.Main;
import Splash.Login;


public class Run {
    
     public static void main(String args[]) {
         System.out.println("branch");
         
        UIcolors color = new UIcolors();
        color.UIcolor();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
            
            
        });
    }
    
}
