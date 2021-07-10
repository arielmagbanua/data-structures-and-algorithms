/**
 * @(#)TriangleApp.java
 *
 * TriangleApp application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/8
 */

 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.lang.NumberFormatException;

public class TriangleApp {

	//declare the BufferedReader global so that it can be accessed anywhere
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

    	// ask for user input
    	String inputStr = getInputString();
    	int inputInt = getInputInteger(inputStr);
    	// get the result of the triangle number
    	int result = triangle(inputInt);
    	//print the result
    	System.out.print("sum="+result);
    }

	//this meathod will used the BufferedReader to read input line from the buffer and return it.
    public static String getInputString() throws IOException{

    	System.out.print("Enter a number: ");
    	return br.readLine();
    }

    public static int getInputInteger(String inputStr) throws IOException{

		//convert the string to integer
		try{

			return Integer.parseInt(inputStr);

		} catch(NumberFormatException ex){
			//this means the given input is not an integer therefore
			//recursively ask user for another input
			return getInputInteger(getInputString());
		}
    }

    public static int triangle(int n) {

		System.out.println("Entering: n="+n);

 		if(n==1){
 			System.out.println("Returning 1");
    		return 1;
    	} else {
    		int temp = n+triangle(n-1);
    		System.out.println("Returning n="+temp);
    		return temp;
    	}
	}
}
