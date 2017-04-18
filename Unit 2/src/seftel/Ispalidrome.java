package seftel;
import java.util.Scanner;
/**
 * Ispalindrome.java
 * Determnes if the word is a palindrome
 * @author Matthew seftel
 *18/04/2017
 */

public class Ispalidrome {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word to see if it is a palidrome");
	String word = scan.nextLine();
	System.out.print(Ispalindrome(word));
	}
	
	/**
	 * determines if the word is a palindrome 
	 * @param word
	 * @return true or false
	 */
	public static boolean Ispalindrome(String word){
		String s = "";
		for(int i = word.length()-1; i>=0; i--){
			s = s + word.charAt(i);
		}
		if(word.equals(s)){
			return true;
		}
		return false;
	}
	
}
