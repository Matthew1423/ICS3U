package seftel;
import java.util.Scanner;
/**
 * Isprim.java
 * Finds if the number is a prime number
 * @author Matthew Seftel
 *03/04/2017
 */
public class Isprime {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number to see if it is a prime number");
int x = scan.nextInt();
System.out.println(primeNum(x));

	}
	/**
	 * determines if the number is prime
	 * @param x
	 * @return true of false
	 */
	public static boolean primeNum(int x){
		if(x<=0){
			return false;
		}
		for(int i = x/2; i>1; i--){
			if(isDivisble(x,i)){
				return false;
			}
		}
			return true;
		}	
		/**
		 * checks to see if number is divisible
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

		
	
	
	
		

