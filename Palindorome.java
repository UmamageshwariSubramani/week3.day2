package Week3.day1;

public class Palindorome {

	public static void main(String[] args) {
	
		
		//declare a string 
		String word ="madam";
		//declare empty string
		String rev="";
		
		
		//retrieve length
		int len=word.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev + word.charAt(i);
		}
	
		System.out.println(rev);
		
		if(word.equalsIgnoreCase(rev)) {
			System.out.println("it is palindrome");
		} 
		else {
			System.out.println("It is not palindrome");
		}
		
		
		//Using String buffer class:
		
		//StringBuffer s=new StringBuffer(word);
		//System.out.println(s.reverse());
		
 
	
		
		
		 
		
		
		
		
		
	}
}
			
       

