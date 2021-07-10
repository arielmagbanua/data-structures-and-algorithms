/**
 * @(#)ReverseString.java
 *
 * ReverseString application
 *
 * @author
 * @version 1.00 2015/1/15
 */

 import java.io.*;
 import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) throws IOException{

		Stack stack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String: ");
		String input = br.readLine();

		//push each character to the stack
		for(int i=0;i<input.length();i++){
			System.out.println("Push - "+input.charAt(i));
			stack.push(input.charAt(i));
		}

		System.out.println();

		//pop each character
		String output = "";
		while(!stack.isEmpty()){
			char c = (char)stack.pop();
			System.out.println("Pop - "+c);
			output += c + " ";
		}


		/*
		//peek and pop each character
		String output = "";
		while(!stack.isEmpty()){
			System.out.println("Pop - "+stack.peek());
			output += stack.pop() + " ";
		}
		*/
		System.out.print(output);
    }
}
