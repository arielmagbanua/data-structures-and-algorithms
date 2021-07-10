/**
 * @(#)MultipleDataStack.java
 *
 * MultipleDataStack application
 *
 * @author
 * @version 1.00 2015/1/4
 */

import java.util.Stack;

public class MultipleDataStack {

    public static void main(String[] args) {

		//stack that will have elements that are string type.
		Stack<String> stringStack = new Stack<String>();

    	Stack stack = new Stack();
		stack.push("one");
		stack.push(2);
		stack.push("three");
		stack.push('a');

		String output = "";

		while(!stack.isEmpty()){

			Object poppedObj = stack.pop();

			if(poppedObj instanceof Integer){

				//meaning current item is integer
				output = output + (Integer)poppedObj + " ";

			} else if(poppedObj instanceof String){

				//meaning current item is integer
				output = output + (String)poppedObj + " ";

			} else if(poppedObj instanceof Character){

				//meaning current item is integer
				output = output + (Character)poppedObj + " ";

			}
		}

		System.out.print(output);
    }
}
