import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.BevelBorder;

/***
 * 
 * This class is the DisplayGraphGui.
 * 
 * It displays the main screen of the program, which has the graph as well as 2 buttons for adding
 * and deleting villages.
 * 
 * You can click on each village for more options.
 * 
 * @author Nick
 *
 */
public class DisplayGraphGui {
	
	JFrame frame; // main frame that holds everything
	
	/* All the components inside the graphPanel go here */
	JPanel graphPanel; // panel that only holds the graph
	
	
	
	/* All the components inside the actionPanel go here */
	JPanel actionPanel; // panel that holds buttons for adding and deleting villages
	
	
	
	
	public DisplayGraphGui() {
		
		// initialize all the JComponents
		frame = new JFrame();
		frame.setTitle("Nikhil's GnomenWorld Simulator");
//		frame.setBounds(0, 0, 1400, 1000);
		frame.setPreferredSize(new Dimension(1000, 1000));
		frame.setBackground(Color.yellow);
		
		// TODO Check if it displays properly
		graphPanel = new JPanel();
		graphPanel.setBounds(0, 0, 1000, 1000);
		graphPanel.setPreferredSize(new Dimension(800, 1000));
		graphPanel.setVisible(true);
		graphPanel.setBackground(Color.GREEN);
		
		
		actionPanel = new JPanel();
//		actionPanel.setBounds(1030, 10, 200, frame.getHeight() - 10);
		actionPanel.setPreferredSize(new Dimension(200, 1000));
		actionPanel.setVisible(true);
		actionPanel.setBackground(Color.WHITE);
		actionPanel.setBorder(BorderFactory.createTitledBorder("Options"));
		
		
		// see below for what it does
		packageComponents();
		
	} // end of constructor
	
	
	
	// Adds, displays, and sets everything visible
	private void packageComponents() {
		
		
		
		// Smooth resizing
		frame.add(graphPanel);
		frame.add(actionPanel, BorderLayout.EAST);
		
		
		frame.setVisible(true);
		frame.pack();
		
	} // end of packageComponents()
	

} // end of class
