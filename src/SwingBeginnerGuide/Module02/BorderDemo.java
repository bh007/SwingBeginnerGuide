package SwingBeginnerGuide.Module02;

import java.awt.*;  
import javax.swing.*;  
   
class BorderDemo {  
  
  BorderDemo() {  
  
    // Create a new JFrame container.  
    JFrame jfrm = new JFrame("Use Line and Etched Borders");  
  
    // Specify FlowLayout for the layout manager.  
    jfrm.getContentPane().setLayout(new FlowLayout());  
  
    // Give the frame an initial size.  
    jfrm.setSize(280, 90);  
  
    // Terminate the program when the user closes the application.  
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
    // Create a label and give it a line border. 
    JLabel jlab = new JLabel(" This uses a line border. ");  
    jlab.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
 
    // Create another label and give it an etched border. 
    JLabel jlab2 = new JLabel(" This uses an etched border. ");  
    jlab2.setBorder(BorderFactory.createEtchedBorder()); 
 
    // Add the labels to the content pane.  
    jfrm.getContentPane().add(jlab);  
    jfrm.getContentPane().add(jlab2);  
  
    // Display the frame.  
    jfrm.setVisible(true);  
  }  
  
  public static void main(String args[]) {  
    // Create the frame on the event dispatching thread.  
    SwingUtilities.invokeLater(new Runnable() {  
      public void run() {  
        new BorderDemo();  
      }  
    });  
  }  
}