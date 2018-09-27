/* Write a loop to find the sum of multiples of 7 between 1107 and
21000.
*/
public class MultiplesOfSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =1107;i<=21000;i++)
		{
			if(i%7 == 0) {
				count+=i;
			}
		}
		System.out.println("sum of multiples of seven between 1107 to 21000 is "+count);

	}

}
