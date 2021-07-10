/**
 * @(#)Searching.java
 *
 * Searching application
 *
 * @author
 * @version 1.00 2014/11/28
 */

public class Searching {

    public static void main(String[] args) {

		String key = "santol";
		String [] fruitsArray = {"apple","orange","grape","mango","pineapple"};

		int foundIndex = search(fruitsArray,key);

		if(foundIndex==-1) {
			System.err.println("Didn't find key: "+key+" ...");
		} else {
			System.err.println("Found key: "+key+" at index "+foundIndex+" ...");
		}

    }

    public static int search(String [] fruitsArray, String key){

    	int index = -1;

    	//do the searching
    	for(int i=0;i<fruitsArray.length;i++){

    		if(key.compareTo(fruitsArray[i]) == 0){
    			//key is found!
    			//assign the i to the index of the element that has been searched
    			index = i;
    			break;
    		}
    	}

    	return index;
    }
}
