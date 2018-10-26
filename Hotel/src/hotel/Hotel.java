
package hotel;

import Telas.Login;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hotel {
    
    
    public static void main(String[] args) {
        
        new Login().setVisible(true);
        JFrame frame = new JFrame("Hotel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
