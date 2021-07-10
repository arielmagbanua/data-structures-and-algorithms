/**
 * @(#)NumberMultiplesRecursion.java
 *
 * NumberMultiplesRecursion application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/15
 */

public class NumberMultiplesRecursion {

    public static void main(String[] args) {

    	int intArray[] = new int []{2,4,15,16,1};
		int m1 = 2;
		int m2 = 3;

    	int sum = sumOfMultiples(intArray,2,3);

    	System.out.print("Sum of Multiples of "+m1+" and "+m2+" is "+sum);
    }

    public static int sumOfMultiples(int a[], int m1, int m2){
    	return sumOfMultiples(a,a.length-1,m1,m2);
    }

    public static int sumOfMultiples(int a[],int curIndex, int m1, int m2){

		if(curIndex<0){
			return 0;
		}

		int cur = a[curIndex];
    	System.out.println("Current: "+cur);

		int sum = 0;

		if(cur%m1==0 || cur%m2==0){
			sum += cur;
		}

		return sum + sumOfMultiples(a,curIndex-1,m1,m2);
    }
}
