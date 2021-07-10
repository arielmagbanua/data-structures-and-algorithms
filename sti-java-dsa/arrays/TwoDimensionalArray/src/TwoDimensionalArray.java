/**
 * @(#)TwoDimensionalArray.java
 *
 * TwoDimensionalArray application
 *
 * @author
 * @version 1.00 2014/11/20
 */

public class TwoDimensionalArray {

    private static int tableArray[][] = new int[3][4];

    public static void main(String[] args) {

		/*
    	int rows = 3, cols = 4;

    	for(int rowIndex = 0; rowIndex < rows; rowIndex++ ){
    		for(int colIndex = 0; colIndex<cols; colIndex++){
    			tableArray[rowIndex][colIndex] = rowIndex + colIndex + 1;
    		}
    	}
    	*/

    	fillArray(2,4);
    }

    private static void fillArray(int row, int col){

    	for(int i=0;i<col;i++){
    		tableArray[row][i]=i;
    	}

		//print the specific row
    	for(int i=0;i<col;i++){
    		System.out.print(tableArray[row][i]);
    	}

    	System.out.println();
    }
}
