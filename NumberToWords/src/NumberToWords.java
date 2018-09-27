import java.util.Scanner;

public class NumberToWords {
	public static String[] unitDigit = {"", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
	public static String[] tensMultiple= {"", "", "Twenty", "Thirty", "Forty", "Fifty",   "Sixty", "Seventy", "Eighty", "Ninety"};
	
	static String covertNumToWords(int number) {
		
		if(number<0) {
			return "minus "  + covertNumToWords(-number);
		}
        if(number>0 && number<=99) {
			return lengthTwo(number);
		}
        if(number>=100 && number<=999) {
        	return lengthThree(number);
		} 
        if(number>=1000 && number<=9999) {
        	return lengthFour(number);
		}
         return "";
		
	}
	static String lengthTwo(int number) {
		if(number<20) {
			return unitDigit[number];
		}
		else {
			return tensMultiple[number/10] +  " "+unitDigit[number%10];
		}
		
	}
	static String lengthThree(int number) {
		return unitDigit[number/100] + " Hundred " + lengthTwo(number%100);
		
	}
	static String lengthFour(int number) {
		return unitDigit[number/1000] + " Thousand " + lengthThree(number%1000);
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Write a number less than 9999 to covert it to words");
		Scanner inputNumber = new Scanner(System.in);
		number = inputNumber.nextInt();
		String wordString = covertNumToWords(number);
		if(number==0) {
			System.out.println("Zero");
		}else
		{
		System.out.println(wordString);
		}
		inputNumber.close();
		
	}

}
