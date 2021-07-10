/**
 * @(#)RecursionSample.java
 *
 * RecursionSample application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/8
 */

public class RecursionSample {

    public static void main(String[] args) {


		//direct(5);

		//indirectA(15);

		System.out.print(triangle(3));
    }

	//direct recursion
    public static int direct(int n) {

		if(n>=0){

			//print n
			System.out.println(n+"");
			return direct(n-1);

		} else {
			return 0;
		}
    }

    //indirect recursion
    public static int indirectA(int n){

		if(n>=0){

			//print n
			System.out.println(n+"");
			return indirectB(n-1);

		} else {
			return 0;
		}
    }

    public static int indirectB(int n){

		if(n>=0){

			//print n
			System.out.println(n+"");
			return indirectC(n-1);

		} else {
			return 0;
		}
    }

    public static int indirectC(int n){

		if(n>=0){

			//print n
			System.out.println(n+"");
			return indirectA(n-1);

		} else {
			return 0;
		}
    }

    //triangular number
    public static int triangle(int n){

    	if(n==1){
    		return 1;
    	} else {
    		return (n+triangle(n-1));
    	}

    }
}
