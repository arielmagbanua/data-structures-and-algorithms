package TreeSample;
import TreeSample.Node;

public class Tree {

	public Node root; //the only data field in Tree

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

	public void insert(int key, int data){

		Node newNode = new Node();
		newNode.key = key;
		newNode.data = data;

		if(root==null){

			root = newNode;

		} else {

			Node current = root;
			Node parent;

			while(true){

				parent = current;

				if(key < current.key){

					current = current.leftChild;

					if(current==null){
						parent.leftChild = newNode;
						return;
					}

				} else {
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public boolean delete(int key) {

 		Node current = root;
 		Node parent = root;
 		boolean isLeftChild = true;

 		while(current.key != key) {

 			parent = current;

 			if(key < current.key) {

 				isLeftChild = true;
 				current = current.leftChild;

 			} else {

 				isLeftChild = false;
 				current = current.rightChild;

 			}

 			if(current==null)
				return false;

 		}

		// found node to delete continues
		//if no children, simply delete it
		if(	current.leftChild==null &&
			current.rightChild==null) {

 			if(current == root)
				root = null;
			else if(isLeftChild)
				parent.leftChild = null;
			else
 				parent.rightChild = null;

		} else if(current.rightChild == null) {

			// if no right child, replace with left subtree
			if(current==root)
				root = current.leftChild;
			else if(isLeftChild)
				parent.leftChild=current.leftChild;
			else
				parent.rightChild=current.leftChild;

		} else if(current.leftChild == null){

			// if no left child, replace with right subtree
			if(current == root)
 				root = current.rightChild;
 			else if(isLeftChild)
				parent.leftChild=current.rightChild;
 			else
 				parent.rightChild=current.rightChild;

		} else {
			//two children, so replace with inorder successor
 			//get successor of node to delete(current);
 			Node successor = getSuccessor(current);

 			//connect parent of current to successor instead

	 		if (current == root)
	 			root = successor;
	 		else if(isLeftChild)
	 			parent.leftChild = successor;
			else
				parent.rightChild = successor;

	 		//connect successor to current’s left child
	 		successor.leftChild = current.leftChild;
		}

		return true;
	}

	public Node minimum() {

 		Node current = null;
 		Node last = null;
		current = root;

		while(current != null ) {
			last = current;
			current = current.leftChild;
 		}

 		return last;
	}

	public Node getSuccessor(Node delNode) {

		Node successorParent = delNode;
		Node successor = delNode ;
		Node current = delNode.rightChild ;

		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		if(successor != delNode.rightChild) {
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=delNode.rightChild;
		}

 		return successor;
	}

	//in order traversal
	public void showInOrder(){
		inOrder(root);
	}

	public void inOrder(Node localRoot){

		if(localRoot == null){
			return;
		}

		inOrder(localRoot.leftChild);
		localRoot.displayNode();
		inOrder(localRoot.rightChild);
	}

	//preorder traversal
	public void showPreOrder(){
		preOrder(root);
	}

	public void preOrder(Node localRoot){

		if(localRoot == null){
			 return;
		}

		localRoot.displayNode();

		preOrder(localRoot.leftChild);
  		preOrder(localRoot.rightChild);
	}

	//postorder traversal
	public void showPostOrder(){
		postOrder(root);
	}

	public void postOrder(Node localRoot){

		if(localRoot == null){
			 return;
		}

		postOrder(localRoot.leftChild);
  		postOrder(localRoot.rightChild);

  		localRoot.displayNode();
	}
}