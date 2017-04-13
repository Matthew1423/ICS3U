package seftel;
import java.util.Scanner;
/**
 * LargestNumbers.java
 * Finds the largest number
 * @author Matthew Seftel
 * 03/04/2017
 */
public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want");
		int x = scan.nextInt();
		System.out.println("Enter your numbers with spaces between them");
		int[] nums = new int[x];
		for(int y = 0; y<x; y++){
			nums[y] = scan.nextInt();
		}
		System.out.println(Largestnum(nums));
	}
	/**
	 * Finds the largest number
	 * @param x
	 * @return the largest number
	 */
	public static int Largestnum(int[]x){
		int max = x[0];
		for(int i = 1; i<x.length; i++){
			if(x[i]>max){
				
				
				 
				max = x[i];
			}
		
	}

		return max;
	
	}
}