/**
 * @(#)RecursiveBinarySearch.java
 *
 * RecursiveBinarySearch application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/11
 */

public class RecursiveBinarySearch {

    public static void main(String[] args) {

		int intArray [] = new int[] {2,5,8,9,11,12};

		int target = 11; // the item will be searching

		int targetIndex = binarySearch(intArray,target);

		String result = target+" not found!";

		if(targetIndex>0){ //target found!
			result = "found! at index "+targetIndex;
		}

		System.out.print(result);
    }

    public static int binarySearch(int[] a, int target) {

    	return binarySearch(a, 0, a.length-1, target);

	}

	public static int binarySearch(int[] a, int start, int end, int target) {

    	int middle = (start + end) / 2;

    	if(end < start) {
        	return -1;
    	}

    	if(target==a[middle]) {
        	return middle;
    	}

    	if(target<a[middle]){

        	return binarySearch(a, start, middle - 1, target);

   	 	} else {

        	return binarySearch(a, middle + 1, end, target);

    	}
	}
}
