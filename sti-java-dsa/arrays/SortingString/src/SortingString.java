/**
 * @(#)SortingString.java
 *
 * SortingString application
 *
 * @author
 * @version 1.00 2014/12/4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingString {

    public static void main(String[] args) throws IOException{

    	String names1 [] = new String [20];
    	String names2 [] = new String [20];
		int length = names1.length;

		//buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println("INPUT ALL NAMES TO BE SORTED!");
    	System.out.println();

		//ask for user input
    	for(int i=0;i<length;i++){

			System.out.print("names["+i+"] = ");
			names1[i] = br.readLine();

    	}

    	//copy it to names 2 for selection sort
    	names2 = names1;

    	//print the original array
    	System.out.println("-----------NAMES----------");
    	System.out.println();
    	for(int i=0;i<length;i++){
			System.out.println(names1[i]);
    	}

    	//do the bubble sort use the names1 array
		String temp = "";
		for(int i=0;i<length;i++){
			for(int j=1;j<length;j++){

				//compare the strings
				int compare = names1[j-1].compareToIgnoreCase(names1[j]);

				if(compare>0){
					//swap the elements here
					temp = names1[j-1];
					names1[j-1] = names1[j];
					names1[j] = temp;
				}
			}
		}

		//print the sorted strings
    	System.out.println("-----------NAMES (BUBBLE SORTED) ----------");
    	System.out.println();
    	for(int i=0;i<length;i++){
			System.out.println(names1[i]);
    	}

		System.out.println();

    	//do the selection sort use the names2 array
		int in, out, min;

		for(out = 0;out<(length-1);out++){

			min = out; //assume the min is the first element

			for(in=out+1;in<length;in++){

				//compare the strings
				int compare = names2[min].compareToIgnoreCase(names1[in]);

				if(compare>0){
					min = in; //we have new min
				}

			}

			//swap the values of min and out index
			String tempOut = names2[out];
			names2[out] = names2[min];
			names2[min] = tempOut;
		}

		//print the sorted strings
    	System.out.println("-----------NAMES (SELECTION SORTED) ----------");
    	System.out.println();
    	for(int i=0;i<length;i++){
			System.out.println(names2[i]);
    	}
    }
}
