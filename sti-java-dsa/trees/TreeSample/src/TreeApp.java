package TreeSample;
/**
 * @(#)TreeSample.java
 *
 * TreeSample application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/1/30
 */

public class TreeApp {

    public static void main(String[] args) {

		Tree theTree = new Tree();

		theTree.insert(50,15);
		theTree.insert(25,17);
		theTree.insert(75,19);
		theTree.insert(20,99);
		theTree.insert(23,55);

		int keyToFind = 24;

		//find node using key
		Node found = theTree.find(keyToFind);

		if(found!=null){
			System.out.println("Found the node with key "+keyToFind+" with data: "+found.getDataString());
		} else {
			System.out.println("Could not find node with key "+keyToFind);
		}

		theTree.showInOrder();
		theTree.delete(20);
		System.out.println();
		theTree.showInOrder();
		//System.out.println();
		//theTree.showPreOrder();
		//System.out.println();
		//theTree.showPostOrder();
    }
}
