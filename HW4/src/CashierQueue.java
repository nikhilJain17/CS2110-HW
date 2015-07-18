// The lines that people wait in

public class CashierQueue {

	private Node front;
	private Node back;
	private int length;
	
	
	// Constructor
	public CashierQueue() {
		front = null;
		back = null;
		length = 0;
	}
	
	
	// join the queue
	/*
	 * have the user enter the name?
	 */
	public void joinQueue(String name) {
		
		Node wantsToJoin = new Node(name);
		
		// if only person in queue
		if (length == 0) {
			front = wantsToJoin;
			back = wantsToJoin;
			front.setNext(back);
		}
		
		// others in queue
		else {
			back.setNext(wantsToJoin);
			back = back.getNext();
		}
		
		length++;
		
	}
	
	
	// leave the queue
	
	
	// "skip the queue"
	
	
	// Used to display all members of the queue
	public void displayQueueMembers() {

		for (QueueIterator i = new QueueIterator(front); !i.atEnd(); i.plusPlus()) {
			
			System.out.println(i.getCurrent().getName());
		}
		
		// dont forget about the back
		System.out.println(back.getName());
		
	}
	
	
	// Getters and setters
	public Node getFront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	public Node getBack() {
		return back;
	}
	public void setBack(Node back) {
		this.back = back;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	
}