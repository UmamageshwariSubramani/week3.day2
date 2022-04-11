package Week3.day1;

public class CharOccurence {

	public static void main(String[] args) {
	     //declare a string
		String str="Welcome to chennai";
		
		// initialize a variable count 
		int count=0;
		//convert the string into char array
		char[] a = str.toCharArray();
		//get the length of the array
		int length = str.length();
		// traverse from 0 till the array length 
		for(int i=0;i<a.length; i++) {
			
			if(a[i]=='n') {
						
				count++;
				
			}
			
		}
		System.out.println("The occurance of n ="+count);

	}

}
