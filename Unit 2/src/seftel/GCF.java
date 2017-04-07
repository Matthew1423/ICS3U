package seftel;
import java.util.Scanner;
/**
 * GCF.java
 * Finds the greatest common factor
 * @author Matthew Seftel
 *03/04/2017
 */
public class GCF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("If you would like to determine the greatest common factor of 2 numbers. enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(gcf(a, b));
	

	}
	/**
	 * FInds the greatest common factor
	 * @param a
	 * @param b
	 * @return the greatest common factor
	 */
	public static int gcf(int a, int b){
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		for(int i = small; i>0; i--){
			if(isDivisble(big,i) && (isDivisble(small,i))) {
				return i;
			}
		}
		return 1;
	}

	/**
	 * checks to see if the number is divisible
	 * @param a
	 * @param b
	 * @return true or false
	 */
	public static boolean isDivisble(int a, int b){
	if(a%b==0){
		return true;
	}
	return false;
	}
}