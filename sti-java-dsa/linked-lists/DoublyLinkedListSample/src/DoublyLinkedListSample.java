package DoublyLinkedListSample;
//import DoublyLinkedListSample.Node;
/**
 * @(#)DoublyLinkedListSample.java
 *
 * DoublyLinkedListSample application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/1/16
 */

public class DoublyLinkedListSample {

    public static void main(String[] args) {

    	DoublyLinkedList theList = new DoublyLinkedList();

      	theList.insertFirst(22);      // insert at front
      	theList.insertFirst(44);
      	theList.insertFirst(66);

      	theList.insertLast(11);       // insert at rear
      	theList.insertLast(33);
      	//theList.insertLast(55);

     	theList.displayForward();     // display list forward
      	//theList.displayBackward();    // display list backward

      	//theList.deleteFirst();        // delete first item
      	//theList.deleteLast();         // delete last item
      	theList.deleteKey(11);        // delete item with key 11

      	theList.displayForward();     // display list forward

      	theList.insertAfter(44, 77);  // insert 77 after 22
      	theList.insertAfter(33, 88);  // insert 88 after 33

      	theList.displayForward();     // display list forward
    }
}
