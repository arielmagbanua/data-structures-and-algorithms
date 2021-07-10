/**
 * @(#)LinkedListSample.java
 *
 * LinkedListSample application
 *
 * @author ariel magbanua
 * @version 1.00 2015/1/12
 */

public class LinkedListSample {

    public static void main(String[] args) {

    	MyLinkedList ml = new MyLinkedList();

		//add or insert elements to LinkedList
        ml.add("1");
        ml.add("2");
        ml.add("3");

		//insert element in a particular index.
		ml.add("4",1);

		//print the object.
		//toString method of the object will be called.
		System.out.println("ml - print mylinkedlist: " + ml);
		System.out.println("ml.size() - print mylinkedlist size: " + ml.size());
		/*
		//delete node/link at index 2
		ml.remove(2);

		//print the object.
		//toString method of the object will be called.
		System.out.println("ml - print mylinkedlist: " + ml);
		System.out.println("ml.size() - print mylinkedlist size: " + ml.size());
		*/
		ml.insertFirst("9");
		//print the object.
		//toString method of the object will be called.
		System.out.println("ml - print mylinkedlist: " + ml);
		System.out.println("ml.size() - print mylinkedlist size: " + ml.size());

		ml.deleteFirst();
		//print the object.
		//toString method of the object will be called.
		System.out.println("ml - print mylinkedlist: " + ml);
		System.out.println("ml.size() - print mylinkedlist size: " + ml.size());

		System.out.println("ml.get(2) - index 2 : " + ml.get(2));

        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
        //System.out.println("ml - print linkedlist: " + ml);
        //System.out.println("ml.get(3) - get 3rd element: " + ml.get(3));
        //System.out.println("ml.remove(2) - remove 2nd element: " + ml.remove(2));
        //System.out.println("ml.get(3) - get 3rd element: " + ml.get(3));

    }

}

class MyLinkedList{

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

    private class Node {

        // reference to the next node in the chain,
        // or null if there isn't one.
        Node next;
        // data carried by this node.
        // could be of any type you need.
        Object data;

        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        // another Node constructor if we want to
        // specify the node to point to.
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}