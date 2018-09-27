import java.util.Scanner;

public class PalindromeString {
	static void isPalindrome(String sentence) {
		String  resultedString = sentence.replaceAll("^A-Za-z0-9", "").toLowerCase();
		char[] charSentence = resultedString.toCharArray();
		boolean value = false;
		for(int i =0;i<((charSentence.length-1)/2);i++) {
			if(charSentence[i] == charSentence[charSentence.length-i-1]) {
				value = true;
			}
			
		}
		if(value) {
			System.out.print("Given input string is a palindrome");
		}
		else {
			System.out.print("Given input string is NOT a palindrome");
		}
		
	}

	public static void main(String[] args) {
		String inputString="";
		Scanner input = new Scanner(System.in);
		inputString = input.nextLine();
		isPalindrome(inputString);
		input.close();
	}

}
