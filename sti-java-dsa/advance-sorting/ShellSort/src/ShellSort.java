/**
 * @(#)ShellSort.java
 *
 * ShellSort application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/3/4
 */

public class ShellSort {

    public static void main(String[] args) {

		int theArray1[] = new int[] { 13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10 };
		shellSort(theArray1);

		// 5-sorted gap like in the example in the handouts
		//int theArray2[] = new int[] { 13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10 };
		//nSort(theArray2, 5);

		//int theArray3[] = new int[] { 13, 14, 94, 33, 82, 25, 59, 94};
		//shellSort(theArray3);
    }

    public static void shellSort(int [] theArray){

		int inner, outer;
		int temp;

		//the h is the interval or gap
		int h = 1;

		while (h <= theArray.length / 3)
			h = h * 3 + 1;

		while (h > 0) {

			for (outer = h; outer < theArray.length; outer++) {
				temp = theArray[outer];
				inner = outer;

				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}

				theArray[inner] = temp;
			}

			//reduce h
			h = (h - 1) / 3;
		}

		// print the sorted array
		for (int num : theArray) {
			System.out.print(num + " ");
		}

		System.out.println();
    }

    public static void nSort(int theArray[], int h) {

		int inner, outer;
		int temp;

		for (outer = h; outer < theArray.length; outer++) {

			temp = theArray[outer];
			inner = outer;

			while (inner > h - 1 && theArray[inner - h] >= temp) {
				theArray[inner] = theArray[inner - h];
				inner -= h;
			}

			theArray[inner] = temp;
		}

		// print the sorted array
		for (int num : theArray) {
			System.out.print(num + " ");
		}
    }
}
