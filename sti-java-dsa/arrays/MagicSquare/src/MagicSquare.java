/**
 * @(#)MagicSquare.java
 *
 * MagicSquare application
 *
 * @author
 * @version 1.00 2014/11/27
 */

public class MagicSquare {

    public static void main(String[] args) {

		int size = 7;

		int square[][] = new int[size][size];

		//store 1 in the middle of the first row;
		square[0][(size-1)/2] = 1;
		//key contains the next value to store. (i,j) contains the current position (row,column) position
		int key = 2, i=0, j=(size-1)/2;

		while(key<=(size*size)){

			int k = i - 1; //look up.

			if(k<0){
				k += size;
			}

			int l = j - 1; //look to the left.

			if(l<0) {
				l += size;
			}

			if(square[k][l]!=0){

				i = (i+1) % size; //move down if square is occupied

			} else {
				i = k; //square [k][l] needs to be assigned.
				j = l;
			}

			square[i][j] = key; //assign value to square
			key++;
		}

		for(int c=0;c<size;c++){
			for(int d=0;d<size;d++){
				System.out.print(square[c][d] + " ");
			}
			System.out.println();
		}
    }
}
