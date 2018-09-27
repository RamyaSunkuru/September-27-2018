/*
If you have a function that generates a random number between 1-
11, how would you use that function to generate a random number
between 1-13?
*/
public class RandomNumber {
	static double generateRandom()
	{
		double randomValue = Math.random() * 10 + 1;
		return randomValue;
	}
	}
	public static void main(String[] args) {
		
		double valueOne =  generateRandom();
	    double valueTwo = (valueOne-1 )*(1.2)+1; // multiplied by a factor of (13-1 / 11-1)
		System.out.println(valueOne);
		System.out.println(valueTwo);

	}

}
