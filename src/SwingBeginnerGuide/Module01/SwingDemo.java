package SwingBeginnerGuide.Module01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {

	SwingDemo() { 
	  
		// Create a new JFrame contain
		JFrame jfrm = new JFrame("A Simple Swing Program"); 
		 
		// Give the frame an initial size. 
		jfrm.setSize(275, 100); 
			 
		// Terminate the program when the user closes the application. 
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			 
		// Create a text-based label. 
		JLabel jlab = new JLabel(" Swing powers the modern Java GUI."); 
			 
		// Add the label to the content pane. 
		jfrm.getContentPane().add(jlab); 
			 
		// Display the frame. 
		jfrm.setVisible(true); 
	} 

	public static void main(String[] args) {
		// Create the frame on the event dispatching thread. 
	    SwingUtilities.invokeLater(new Runnable() { 
	      public void run() { 
	        new SwingDemo(); 
	      } 
	    });
	}
}
