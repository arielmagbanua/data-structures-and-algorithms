/**
 * @(#)TowerOfHanoi.java
 *
 * TowerOfHanoi application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/12
 */

public class TowerOfHanoi {

    public static void main(String[] args) {

    	doTowers(3,'A','B','C');
    }

    public static void doTowers(int topN, char from, char inter, char to)  {

		 if(topN==1)
			 System.out.println("Disc 1 from " + from + " to " + to);
		 else {
		 		doTowers(topN-1, from, to, inter); // from-->inter
		 		System.out.println("Disc " +  topN + " from " + from + " to " + to);
		 		doTowers(topN-1, inter, from, to); // inter-->to
		 }
	}

}
