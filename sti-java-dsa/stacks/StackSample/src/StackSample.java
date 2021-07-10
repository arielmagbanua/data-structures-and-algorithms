/**
 * @(#)StackSample.java
 *
 * StackSample application
 *
 * @author
 * @version 1.00 2015/1/4
 */

import java.util.Stack;

public class StackSample {

    public static void main(String[] args) {

    	int intArray[] = new int[] {1,2,3,4,5};
    	Stack stack = new Stack();


    	System.out.print("original: ");
    	for(int n=0;n<intArray.length;n++){
    		System.out.print(intArray[n] + " ");
    	}
    	System.out.println();

    	//reverse the order of the array
    	int stackSize = intArray.length;

    	//push each element to the stack
    	for(int j=0;j<intArray.length;j++){

    		int num = intArray[j];
    		stack.push(num);

    	}

    	String output = "";

    	System.out.print("reversed via stack: ");
    	while(!stack.isEmpty()){

    		int num = (Integer)stack.pop();
    		output = output + num + " ";

    	}

    	System.out.print(output);
    }
}
