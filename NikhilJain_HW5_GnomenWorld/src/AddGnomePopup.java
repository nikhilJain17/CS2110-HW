//import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/***
 * 
 * 
 * Popup to add a gnome
 * 
 * @author Nick
 *
 */
public class AddGnomePopup {

	JDialog popup = new JDialog();
	
	// used to update the text in the villagepopup after a gnome is added
	VillageNode village;
	VillageDetailsPopup villageDetailsPopup;
	
	JLabel enterGnomeLabel = new JLabel("Enter name");
	
	JLabel busyLabel = new JLabel("Click to change status");
	
	JToggleButton busyButton; // gets input if gnome is busy or not
	boolean busyInput;
	
	JTextField enterGnomeName;
	String nameInput = "";
	
	JButton addGnomeButton; // add gnome to village
	
	public AddGnomePopup(VillageNode village, VillageDetailsPopup villageDetailsPopup) {
		
		this.villageDetailsPopup = villageDetailsPopup;
		this.village = village;
//		this.village = villageDetailsPopup.village;
		
		enterGnomeName = new JTextField();
		busyButton = new JToggleButton("Not Busy");
		addGnomeButton = new JButton("Add Gnome");
		
	} // end of constructor
	
	
	public void createAndShowGui() {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				// set up popup
				popup.setLayout(null);
				popup.setBounds(100, 100, 400, 400);
				popup.setPreferredSize(new Dimension(400, 400));
				popup.setTitle("Add a gnome to Village #" + village.getNamed());
				
				// set up enterGnomeName
				enterGnomeName.setBounds(165, 30, 200, 35);
				enterGnomeName.setPreferredSize(new Dimension(100, 35));
			
				// set up label
				enterGnomeLabel.setBounds(20, 30, 150, 35);
				
				// set up busyLabel
				busyLabel.setBounds(20, 80, 150, 35);
				
				// setup busy button
				busyButton.setBounds(165, 80, 200, 35);
			    busyButton.addChangeListener(new ChangeListener() {
			        @Override
			        public void stateChanged(ChangeEvent event) {
			            if (busyButton.isSelected()){
			            	busyButton.setText("Busy");
			            } else {
			            	busyButton.setText("Not Busy");
			            }
			        }
			    });
			    
			    // add the gnome with this button
			    addGnomeButton.setBounds(15, 130, 350, 35);
			    addGnomeButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// get the inputs from the forms
						nameInput = enterGnomeName.getText();
						busyInput = busyButton.isSelected();
						
						// add the gnome to the villageNode
						Gnome createdGnome = new Gnome(nameInput, busyInput, village);
						java.util.List<Gnome> gnomeList = village.getGnomeArray();
						gnomeList.add(createdGnome);
						
						// update the display on the villagepopup
						villageDetailsPopup.updateGnomeDisplay();
						
					}// end of actionPerformed
			    }); // end of action listener
			    
			    
				// pack and ship to screen
				popup.add(enterGnomeName);
				popup.add(enterGnomeLabel);
				popup.add(busyButton);
				popup.add(busyLabel);
				popup.add(addGnomeButton);
				popup.setVisible(true);
				popup.pack();
								
			} // end of run
			
			
		}); // end of runnable
		
	} // end of create and show gui
	
	
}
