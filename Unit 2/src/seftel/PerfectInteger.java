package seftel;
/**
 * PerfectInteger.java
 * @author Matthew Seftel
 * Determines if the integer is perfect
 * 20/04/2017
 */
public class PerfectInteger {

	public static void main(String[] args) {
		for (int x = 1; x<1000; x++){
			if(isperfect(x)){
				System.out.println(x);
				}
			}
		}
	/**
	 * Determines the perfect integers
	 * @param a
	 * @return perfect integers
	 */
		public static boolean isperfect(int a){
			int total  = 0;
			for (int n = 1; n < a; n++){
				if (isDivisible(a, n))
					total += n;
			}
			if (total == a){
				return true;
			}
			return false;
		}
		/**
		 * determines if number is divisible
		 * @param a
		 * @param b
		 * @return
		 */
		public static boolean isDivisible(int a, int b){
			if (a % b == 0){
				return true;
			}
			return false;
		} 

	}
