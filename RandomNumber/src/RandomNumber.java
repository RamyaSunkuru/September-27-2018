
public class RandomNumber {
	static double generateRandom()
	{
		double randomValue = Math.random() * 10 + 1;
		return randomValue;
	}
//	static double generateRandomInteger(int min, int max) {
//		Random r = new Random();
//		return r. nextInt((max - min) + 1) + min;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int valueOne =  generateRandomInteger(1,11);
		//double valueTwo = (valueOne-1 )*(1.2)+1;
		double valueOne =  generateRandom();
	    double valueTwo = (valueOne-1 )*(1.2)+1; // multiplied by a factor of (13-1 / 11-1)
		System.out.println(valueOne);
		System.out.println(valueTwo);

	}

}
