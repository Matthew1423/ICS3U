package seftel;
/**
 * PythagoreanTherom.java
 * @author Matthew Seftel
 * Finds all possible perfect triangles
 *
 */
public class PythagoreanTherom {

	public static void main(String[] args) {
		
		for (int c = 1; c<100; c++){
			for (int b = 1; b<100; b++){
				int a = (int) (Math.pow(c, 2) + Math.pow(b, 2));
				if (perfectSquare(a)== true){
					System.out.println(c + " " + b + " " + (int)Math.sqrt(a) + "");
				}
			}
		}
	}
	/**
	 * Finds all possible perfect triangles
	 * @param x
	 * @returns true or false
	 */
	public static boolean perfectSquare (int x){
		int n = (int) Math.sqrt(x);
		double check = Math.pow(n, 2);
		if(check == x){
			return true;
		}
		return false;
	}
}







