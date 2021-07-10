/**
 * @(#)ArraysSample.java
 *
 * ArraysSample application
 *
 * @author
 * @version 1.00 2014/11/19
 */

public class ArraysSample {

    public static void main(String[] args) {

		int rows = 3, cols = 4;
		int tableArray[][] = new int[3][4];

		for(int rowIndex = 0; rowIndex < rows; rowIndex++ ){

    		for(int colIndex = 0; colIndex<cols; colIndex++){

    	 		tableArray[rowIndex][colIndex] = rowIndex + colIndex + 1;

    		}

		}

		//for printing
		for(int rowIndex = 0; rowIndex < rows; rowIndex++ ){

    		for(int colIndex = 0; colIndex<cols; colIndex++){

    	 			System.out.print(tableArray[rowIndex][colIndex]+" ");

    		}

			System.out.println();
		}



		/*
		int [] intArray = new int[3];

		for(int index=0;index<3;index++){
			intArray[index] = index+1;
			System.out.print(intArray[index]+" ");
		}

		System.out.println();

		int [] tempArray = new int[2];

		for(int index=0;index<tempArray.length; index++){
			tempArray[index] = intArray[index];
		}

		intArray = tempArray;

		for(int index=0;index<intArray.length;index++){
			System.out.print(intArray[index]+" ");
		}
		*/
    }
}
