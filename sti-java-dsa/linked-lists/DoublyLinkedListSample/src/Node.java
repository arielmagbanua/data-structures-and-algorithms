package DoublyLinkedListSample;

public class Node {

	public long mData;             // data item
   	public Node next;              // next node in list
   	public Node previous;          // previous node in list
	// -------------------------------------------------------------
   	public Node(long data) {          // constructor
    	mData = data;
    }
	// -------------------------------------------------------------
   	public void displayNode() {         // display this node
    	System.out.print(mData + " ");
    }
}