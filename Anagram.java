package Week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		
		int len=text1.length();
		int length = text2.length();
		
		char[] charArray = text1.toCharArray();
		char[] charArray1=text2.toCharArray();
	
		//sort the array
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		System.out.println(charArray);
		System.out.println(charArray1);
		//compare both the array
		
		if(Arrays.equals(charArray, charArray1)) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is not Anagram");
		}
	}
	
	
	
	
	
	
}

	

