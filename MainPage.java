import javax.swing.*;
import java.awt.*;

class MainPage {
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JTextField tf = new JTextField(12);
       JButton button = new JButton("Press");
       JPanel panel = new JPanel();
       Container pane = panel;
       pane.add(tf);
       pane.add(button); // Adds Button to content pane of frame
       
       frame.getContentPane().add(pane);
       frame.pack();
       frame.setVisible(true);
    }
}
