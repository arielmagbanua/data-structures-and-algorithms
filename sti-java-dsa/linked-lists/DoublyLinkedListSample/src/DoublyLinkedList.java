package DoublyLinkedListSample;
import DoublyLinkedListSample.Node;

public class DoublyLinkedList {

	private Node first;         // ref to first item
   	private Node last;         	// ref to last item

	// -------------------------------------------------------------
   	public DoublyLinkedList() {     // constructor
    	first = null;               // no items on list yet
    	last = null;
   	}
	// -------------------------------------------------------------
   	public boolean isEmpty() {       // true if no links
    	return first==null;
   	}
	// -------------------------------------------------------------
   	public void insertFirst(long dd) { // insert at front of list

   		Node newLink = new Node(dd);   // make new link

      	if(isEmpty())                	// if empty list,
         	last = newLink;             // newLink <-- last
      	else
         	first.previous = newLink;   // newLink <-- old first

      	newLink.next = first;          // newLink --> old first
      	first = newLink;               // first --> newLink
    }
	// -------------------------------------------------------------
   	public void insertLast(long dd){   // insert at end of list

    	Node newLink = new Node(dd);   // make new link

      	if(isEmpty())                	// if empty list,
         	first = newLink;            // first --> newLink
      	else {
         	last.next = newLink;        // old last --> newLink
         	newLink.previous = last;    // old last <-- newLink
        }

      	last = newLink;                // newLink <-- last
    }
	// -------------------------------------------------------------
   	public Node deleteFirst() {        // delete first link
                                  	//(assumes non-empty list)
      	Node temp = first;

      	if(first.next == null)         // if only one item
         	last = null;                // null <-- last
      	else
         	first.next.previous = null; // null <-- old next

      first = first.next;            // first --> old next
      return temp;

    }
	// -------------------------------------------------------------
   	public Node deleteLast() {         // delete last link
                                    // (assumes non-empty list)
    	Node temp = last;

      	if(first.next == null)         // if only one item
         	first = null;               // first --> null
      	else
         	last.previous.next = null;  // old previous --> null

      	last = last.previous;          // old previous <-- last
      	return temp;
    }
	// -------------------------------------------------------------
                                     // insert dd just after key
   	public boolean insertAfter(long key, long dd) {
                                   // (assumes non-empty list)
      	Node current = first;          // start at beginning

      	while(current.mData != key) {   // until match is found,

         	current = current.next;     // move to next link
         	if(current == null)
            	return false;            // didn't find it
        }

      	Node newLink = new Node(dd);   // make new link

      	if(current==last) {             // if last link,

         	newLink.next = null;        // newLink --> null
         	last = newLink;             // newLink <-- last

        } else {                          // not last link,

        	newLink.next = current.next; // newLink --> old next
                                      // newLink <-- old next
        	current.next.previous = newLink;
        }

      	newLink.previous = current;    // old current <-- newLink
      	current.next = newLink;        // old current --> newLink
      	return true;                   // found it, did insertion
    }
	// -------------------------------------------------------------
   	public Node deleteKey(long key){   // delete item w/ given key
                                    // (assumes non-empty list)
      	Node current = first;          // start at beginning

      	while(current.mData != key){    // until match is found,

         	current = current.next;     // move to next link

         	if(current == null)
            	return null;             // didn't find it
        }

      	if(current==first)             // found it; first item?
         	first = current.next;       // first --> old next
      	else                           // not first
            current.previous.next = current.next; // old previous --> old next

      	if(current==last)              // last item?
        	last = current.previous;    // old previous <-- last
      	else                           // not last
            current.next.previous = current.previous; // old previous <-- old next

      	return current;                // return value
    }
	// -------------------------------------------------------------
   	public void displayForward() {

      	System.out.print("List (first-->last): ");
      	Node current = first;          // start at beginning

      	while(current != null) {        // until end of list,

         	current.displayNode();      // display data
         	current = current.next;     // move to next link
        }

      	System.out.println("");
   	}
	// -------------------------------------------------------------
   	public void displayBackward() {

      	System.out.print("List (last-->first): ");
      	Node current = last;           // start at end
    	while(current != null) {        // until start of list,

         	current.displayNode();      // display data
     		current = current.previous; // move to previous link
         }
      	System.out.println("");
	}
}
