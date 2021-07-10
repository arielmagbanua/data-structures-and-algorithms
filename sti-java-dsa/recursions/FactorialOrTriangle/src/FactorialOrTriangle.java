/**
 * @(#)FactorialOrTriangle.java
 *
 * FactorialOrTriangle application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/11
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialOrTriangle {

    public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputStr = "";
		boolean isTriangle = false;
		boolean isFactorial = false;

		//ask for user input
		while( !(isTriangle || isFactorial) ){

			System.out.print("Factorial or Triangle? - ");
			inputStr = br.readLine();

			isTriangle = inputStr.compareToIgnoreCase("triangle") == 0;
			isFactorial = inputStr.compareToIgnoreCase("factorial") == 0;

		}

		int input = -1;

		while(input<0){

			System.out.print("Enter a number: ");
			inputStr = br.readLine();

			//convert the string to integer
			try{

				input = Integer.parseInt(inputStr);

			} catch(NumberFormatException ex){
				//this means the given input is not an integer
				input = -1;
			}

		}

		if(isFactorial){

			int factorialResult = factorial(input);
			System.out.print("Factorial: "+factorialResult);

		} else if(isTriangle){

			int triangleResult = triangle(input);
			System.out.print("Triangle: "+triangleResult);

		}
    }

    public static int factorial(int n){

		System.out.println("Entering n: "+n);

    	if(n>0){

			int temp = n*factorial(n-1);
			System.out.println("Returning "+temp);

    		return temp;

    	} else {

    		return 1;

    	}

    }

    public static int triangle(int n){

		System.out.println("Entering n: "+n);

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
