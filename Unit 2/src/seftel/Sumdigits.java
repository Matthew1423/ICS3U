package seftel;
import java.util.Scanner;
/**
 * Sumdigits.java
 * Finds the sum of all the digits
 * @author Matthew Seftel
 *03/04/2017
 */
public class Sumdigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You there!");
		System.out.println("Enter a number with more than 2 digits");
		int x = scan.nextInt();
		System.out.println(sumDigits(x));
	}
	/**
	 * Finds the sum of all the digits
	 * @param x
	 * @return the sum 
	 */
	public static int sumDigits(int x)
	{
		int total= 0;
				while(x>0){
					total=total + x%10;
					x = x/10;
				}			
			return total;
		}
}
	


