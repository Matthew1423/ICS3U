package seftel;
import java.util.Scanner;
/**
 * Factorial.java
 * Finds the factorial of the given number
 * @author Matthew Seftel
 * 03/04/2017
 */
public class Factorial {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to determine its factorial");
		double x = scan.nextInt();
		System.out.println(factorial(x));
		}
	/**
	 * Finds the factorial of the given number and returns it
	 * @param x
	 * @return the factorial of the given number
	 */
	public static double factorial(double x){
		double product;
		if(x<0){
			return -1;
		}
		else if(x==0){
			return 1;
		}
		else{
			product = x;
		while(x>1){
			product = product *(x-1);
			x--;
		}
		return product;
		
		}
		}
	}
	


