/**
 * @(#)ArrayApp.java
 *
 * ArrayApp application
 *
 * @author
 * @version 1.00 2014/11/19
 */

public class ArrayApp {

    public static void main(String[] args){

    	int[] arr;			 //reference
    	arr = new int[100];	 //make array
    	int nItems = 0;		 //number of items

    	int searchId;		 //key of item to search for

		//populate array
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nItems = 10;

		//print all
		for(int j=0;j<nItems;j++){
			System.out.print(arr[j]+" ");
		}

		//print new line
		System.out.println("");
		/*
		//searching through arrays
		searchId = 77;
		int searchedIndex; //index of searched item
		for(searchedIndex=0;searchedIndex<nItems;searchedIndex++){

			if(arr[searchedIndex] == searchId){
				break; //kill the loop when searched item is found
			}

		}

		if(searchedIndex==nItems){

			System.out.println("Can't find "+searchId);

		} else {

			System.out.println("Found "+searchId);

		}
		*/
		//deleting in arrays
		searchId = 55; //item to be deleted
		int deleteIndex; //index to be deleted.
		for(deleteIndex=0;deleteIndex<nItems;deleteIndex++){

			if(arr[deleteIndex]==searchId){
				break; //item to be deleted is
			}

		}

		//move higher ones down
		for(int i=deleteIndex;i<nItems;i++){

			arr[i] = arr[i+1];

		}

		nItems--; //decrement the size

		//print all
		for(int j=0;j<nItems;j++){
			System.out.print(arr[j]+" ");
		}

    }
}
