package seftel;
import java.util.Scanner;
public class Sentencereverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String[] sentence = scan.nextLine().split(" ");
		for(int i=0; i<sentence.length; i++){
			for(int j = sentence[i].length()-1; j>=0; j--){
				System.out.print(sentence[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
