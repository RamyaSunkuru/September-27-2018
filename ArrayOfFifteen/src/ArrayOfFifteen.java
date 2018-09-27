
public class ArrayOfFifteen {
	 static void arrayFunctions(int[]array ,int x) {
		 boolean isDuplicate = false;
		 boolean isPresent = false;
		 System.out.println("elements of array");
		 for (int i : array) {
			System.out.println(i);
		 }
		 for (int i=0 ; i<array.length;i++) {
			 if(array[i]== x) {
				 isPresent = true;
				 System.out.println("number "+x+" is in the array");
				 System.out.println("position of "+x+ " is " + (i+1));
			 }
		 }
		 if(!isPresent) {
			 System.out.println("number "+ x+ " is not available in the array");
		 }
		 for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if ((array[i] == array[j]) && (i != j))
	                {
	                   isDuplicate= true;
	                }
	            }
	        }
		 System.out.println(isDuplicate);
		
	}
	public static void main(String[] args) {
		int[] array = {12, 71, 92, 56, 121, 33, 89, 47, 25, 64, 100, 103, 2, 19, 96};
		
		arrayFunctions(array,47);
		arrayFunctions(array,99);
		
		
	}
	
}
