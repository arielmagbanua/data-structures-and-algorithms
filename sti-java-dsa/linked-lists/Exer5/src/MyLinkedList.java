package Exer5;

class MyLinkedList {

	// reference to the head node.
    private Node head;
    private int listCount;

    // LinkedList constructor
    public MyLinkedList() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        head = new Node(null);
        listCount = 0;
    }

	// appends the specified element to the end of this list.
    public void add(Object data) {

        Node temp = new Node(data);
        Node current = head;
        // starting at the head node, crawl to the end of the list
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // the last node's "next" reference set to our new node
        current.setNext(temp);
        listCount++;// increment the number of elements variable
    }

	// inserts the specified element at the specified position in this list
    public void add(Object data, int index) {

        Node temp = new Node(data);
        Node current = head;
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        // set the new node's next-node reference to this node's next-node
        // reference
        temp.setNext(current.getNext());
        // now set this node's next-node reference to the new node
        current.setNext(temp);
        listCount++;// increment the number of elements variable
    }

	//returns the element at the specified position in this list.
    public Object get(int index) {

        Node currentNode = head.getNext();

        for (int i = 0; i < index; i++) {

            if (currentNode.getNext() == null)
                return null;

            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

 	// removes the element at the specified position in this list.
    public boolean remove(int index){

        // if the index is out of range, exit
        //if (index < 1 || index > size())
            //return false;

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode.getNext() == null)
                return false;

            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }

	public void deleteFirst(){

		Node currentNode = head;
		//set the old next
		currentNode.setNext(currentNode.getNext().getNext());
		listCount--; // decrement the number of elements variable
	}

	public void insertFirst(Object object){

		Node newNode = new Node(object);
		//get the old first node
		Node oldFirstNode = head.getNext();
		//set the old first node to the new node
		newNode.setNext(oldFirstNode);

		//set the new node to the head
		head.setNext(newNode);

		listCount++; // increment the number of elements variable
	}

 	// returns the number of elements in this list.
    public int size(){
        return listCount;
    }

    public String toString() {
		//get the first node
        Node currentNode = head.getNext();
        String output = "";

        while (currentNode != null) {
            output += "[" + currentNode.getData().toString() + "]";
            currentNode = currentNode.getNext();
        }
        return output;
    }

    public void displayEmployees() {
		//get the first node
        Node currentNode = head.getNext();

        while (currentNode != null) {

        	System.out.println(currentNode.getData().toString());
			currentNode = currentNode.getNext();
        }
    }
}
