import javax.swing.*;
import java.awt.*;

class MainPage {
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(300,300);
       JButton button = new JButton("Press");
       frame.getContentPane().add(BorderLayout.CENTER, button); // Adds Button to content pane of frame
       frame.pack();
       frame.setVisible(true);
    }
}
