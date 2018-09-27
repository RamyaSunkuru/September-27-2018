/*
Write a program to print all the unique characters in the the
following sentence - “I like working for Jyroo because I like the
problem they are solving. Good education lays a strong foundation
for a brighter tomorrow”
*/

public class UniqueCharacters {
	static void uniqueCharacters(String sentence) {
		String sent = sentence.replaceAll("\\s","");
		char[] sentenceArray = sent.toCharArray();
		String newString = "";


		 int duplicateValue;
		check: for (int i = 0; i < sent.length(); i++) {
			duplicateValue = 0; 
	        for(int j = 0; j < sentenceArray.length; j++) {
	            if(sent.charAt(i) == sentenceArray[j])
	                duplicateValue++;
	            if(duplicateValue == 2){
	            	duplicateValue = 0;
	                continue check;
	            }
	        }
	        newString = newString+ sent.charAt(i);
		}
		 System.out.println(newString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "I like working for Jyroo because I like the problem they are solving. Good education lays a strong foundation for a brighter tomorrow";
	    uniqueCharacters(sentence);
		
		
	}

}
