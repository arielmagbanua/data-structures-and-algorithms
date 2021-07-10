package TreeSample;

public class Node {

	public int key; //key
	public int data; //data
	public Node leftChild; //node's left child
	public Node rightChild; //node's right child

	public void displayNode(){
		System.out.print(data+" ");
	}

	public String getDataString(){
		return data+" ";
	}
}
