
package hotel;

import Telas.Login;
import javax.swing.JFrame;

public class Hotel {
    
    
    public static void main(String[] args) {
        
        new Login().setVisible(true);
        JFrame frame = new JFrame("Hotel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        
    }
    
}
