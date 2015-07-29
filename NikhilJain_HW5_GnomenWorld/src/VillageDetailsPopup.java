import java.awt.*;

import javax.swing.*;

/***
 * 
 * This class creates a popup message that displays details about each village
 * @author Nick
 *
 */

public class VillageDetailsPopup {
	
	JDialog dialogBox; // the actual pane that holds the goodies
	String title;
	VillageNode village; // which village this popup pertains to
	JLabel numberOfGnomes;
	
	public VillageDetailsPopup(VillageNode village) {
		
		this.village = village;
		
		dialogBox = new JDialog();
		title = "Village #" + village.getNamed();
		
		// set up the look of this dialog box
		createAndShowGui();
		
	} // end of constructor
	
	
	
	private void createAndShowGui() {
		
		/***
		 * 
		 * CONSIDER GETTING RID OF LAYOUT AND JUST HAVING A FRAME INSTEAD
		 * 
		 */
		
		// Set up the layout for inserting elements
		dialogBox.setLayout(new GridBagLayout());
		GridBagConstraints layoutSettings = new GridBagConstraints(); 
		
		// set up the numberOfGnomes JLabel
		numberOfGnomes = new JLabel("Number of Gnomes: ");
		numberOfGnomes.setPreferredSize(new Dimension(100, 25));
		layoutSettings.gridx = 0;
		layoutSettings.gridy = 1;
		layoutSettings.ipadx = 5;
		layoutSettings.ipady = 5;
		layoutSettings.fill = GridBagConstraints.HORIZONTAL;
		layoutSettings.gridheight = 1;
		layoutSettings.gridwidth = 5;
			// add the component with the previously set constraings
		dialogBox.add(numberOfGnomes, layoutSettings);
		
		// set up the dialog box
		dialogBox.setBounds(500, 500, 400, 400);
		dialogBox.setPreferredSize(new Dimension(400, 400));
		dialogBox.setTitle(title);
		dialogBox.setBackground(Color.YELLOW);
		
		
		
//		gridLayout.addLayoutComponent("numberOfGnomes", numberOfGnomes);
		
		dialogBox.setVisible(true);

		
	} // end of createAndShowGui

}