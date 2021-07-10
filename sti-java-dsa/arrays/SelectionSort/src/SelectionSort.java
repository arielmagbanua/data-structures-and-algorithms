/**
 * @(#)SelectionSort.java
 *
 * SelectionSort application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/1
 */

public class SelectionSort {

    public static void main(String[] args) {

    	int intArray [] = new int[]{2,2,3,9,5,6,9};

		System.out.print("ORIGINAL: ");
		for(int i=0;i<intArray.length;i++){
    		System.out.print(intArray[i]+" ");
    	}

    	int out, in, min;

    	for(out=0;out<intArray.length-1;out++){ //outer loop

    		min = out; //assume the min is the first element

    		//test against elements after out to find the smallest
    		for(in=out+1;in<intArray.length;in++){ //inner loop

    			//if this element is less, then it is the new minimum
    			if(intArray[in] < intArray[min]){ //if min is greater
    				min = in;// we have new min
    			}
    		}

			//swap them
			if(min!=out){

				int tempOut = intArray[out];
				intArray[out] = intArray[min];
				intArray[min] = tempOut;
			}
    	}

		System.out.print("\nUSING SELECTION SORT: ");
    	for(int i=0;i<intArray.length;i++){
    		System.out.print(intArray[i]+" ");
    	}
    }
}
