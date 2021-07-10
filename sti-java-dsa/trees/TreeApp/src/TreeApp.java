/**
 * @(#)TreeApp.java
 *
 * TreeApp application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/2/12
 */

public class TreeApp {

    public static void main(String[] args) {

		Tree theTree = new Tree();
		theTree.insert(50,1.5);
		theTree.insert(25,1.2);
		theTree.insert(75,1.7);
		theTree.insert(12,1.5);
		theTree.insert(37,1.2);

		Node found = theTree.find(12);
		found.displayNode();
	}
}

class Node {

	public int key;
	public double data;
	public Node leftChild;
	public Node rightChild;

	public void displayNode(){
		System.out.println(""+data);
	}
}

class Tree {

	private Node root;

	public Tree(){
		root = null;
	}

	public Node find(int key){

		Node current = root;

		while(current.key != key){

			if(key < current.key){
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}

			if(current == null){
				return null;
			}
		}

		return current;
	}

	public void insert(int key, double data){

		Node newNode = new Node();
		newNode.key = key;
		newNode.data = data;

		if(root==null){
			root = newNode;
		} else {

			Node current = root;
			Node parent = current;

			if(key < current.key){

				current = current.leftChild;

				if(current==null){
					parent.leftChild = newNode;
					return;
				} else {
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						return;
					}
				}

				insert(key,data);
			}
		}
	}
}