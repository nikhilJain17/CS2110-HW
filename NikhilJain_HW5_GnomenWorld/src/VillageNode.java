import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


/***
 * This class contains the code to make a Village. Each Village is a node on a graph, and is a button 
 * that makes a popup with information about it. Each Village has an adjacency list, an array of roads, and 
 * and array of Gnomes.
 * 
 * @author Nikhil
 * 
 */

public class VillageNode extends JButton {
	
	int name; // each village is named from 1, 2, 3, ... incrementally
	// GnomeArray
	List<VillageNode> adjacencyList; // no need to make a custom linked list and die
	
	
	public VillageNode(int name, List<VillageNode> adjacencyList) {
		super();
		this.name = name;
		this.adjacencyList = adjacencyList;
		
		
	} // end of constructor

}
