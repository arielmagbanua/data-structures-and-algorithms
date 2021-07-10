package PriorityQueue;

/**
 * @(#)PriorityQueue.java
 *
 * PriorityQueue application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/1/26
 */

public class PriorityQueue {

    public static void main(String[] args) {

    	Queue theQueue = new Queue(5);

    	theQueue.insertPriority(50);
    	theQueue.insertPriority(2);
    	theQueue.insertPriority(15);

    	while(!theQueue.isEmpty()){
			int n = theQueue.remove();
			System.out.println(n+" ");
		}
    }
}
