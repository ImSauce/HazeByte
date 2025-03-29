
package Classes;
import Classes.UIcolors;
import Frames.Main;


public class Run {
    
     public static void main(String args[]) {
         
        UIcolors color = new UIcolors();
        color.UIcolor();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
            
            
        });
    }
    
}
