/**
 * @(#)InsertionSort.java
 *
 * InsertionSort application
 *
 * @author
 * @version 1.00 2014/12/3
 */

public class InsertionSort {

    public static void main(String[] args) {

		int intArray[] = new int[]{2,5,1,0,9};

		System.out.print("ORIGINAL: ");
		for(int i=0;i<intArray.length;i++){
    		System.out.print(intArray[i]+" ");
    	}

		int out, in;

		for(out=1;out<intArray.length;out++){

			int temp = intArray[out];
			in = out;

			while(in>0 && intArray[in-1] >= temp){
				intArray[in] = intArray[in-1];
				--in;
			}

			intArray[in] = temp;
		}

		System.out.print("\nUSING INSERTION SORT: ");
    	for(int i=0;i<intArray.length;i++){
    		System.out.print(intArray[i]+" ");
    	}
    }
}
