/*
Write a loop to print the odd numbers between 904 and 1100. Also,
print the count. 
*/
public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =904;i<=1100;i++)
		{
			if(!(i%2 == 0)) {
				count+=i;
				System.out.println(i);
			}
		}
		System.out.println("sum of odd numbers between 904  to 1100 is" +count);

	}

}
