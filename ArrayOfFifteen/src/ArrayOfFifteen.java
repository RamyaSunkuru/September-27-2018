/*
ii.  x=99
You are given an array with 15 elements, you don’t know the
elements of the array. Write code to answer the following questions.
. Print all the numbers in the array
a. Find if a number ‘x’ is in the array or not.
b. Print the position of the number ‘x’
c. Print true/false for the following question - “does it contain any
duplicate elements?”
d. What would the output look like for you program for the following
array [12, 71, 92, 56, 121, 33, 89, 47, 25, 64, 100, 103, 2, 19, 96]
i.If x = 47
ii.  x=99
*/
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
