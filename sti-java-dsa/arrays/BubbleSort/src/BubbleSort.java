/**
 * @(#)BubbleSort.java
 *
 * BubbleSort application
 *
 * In bubble sort, we basically traverse the array from first
 * to array_length - 1 position and compare the element with the next one.
 * Element is swapped with the next element if the next element is greater.
 *  Bubble sort steps are as follows.
 *
 *  1. Compare array[0] & array[1]
 *  2. If array[0] > array [1] swap it.
 *  3. Compare array[1] & array[2]
 *  4. If array[1] > array[2] swap it.
 *              	...
 *  5. Compare array[n-1] & array[n]
 *  6. if [n-1] > array[n] then swap it.
 *
 *  After this step we will have largest element at the last index.
 *  Repeat the same steps for array[1] to array[n-1]
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/11/28
 */

public class BubbleSort {

    public static void main(String[] args) {

    	int intArray[] = new int[]{8,4,1,9,7};

		System.out.print("ORIGINAL: ");
		//print the original array arrangements
		for(int i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}

		System.out.println();

		//sort the array
		intArray = bubbleSortAscending(intArray);

		System.out.print("\nUSING BUBBLE SORT: ");
		//print the sorted array
		for(int i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}
    }

    public static int[] bubbleSortAscending(int arr[]){

		int temp = 0; //temporary variable for swapping

		for(int i=0;i<arr.length;i++){

			for(int j=1;j<(arr.length);j++){

				if(arr[j-1]>arr[j]){
					//swap elements
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}

			}

		}

		return arr;
    }
}
