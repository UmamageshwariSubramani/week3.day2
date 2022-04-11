package Week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare the input as Follow
		String test = "I am a software tester"; 
		
		//split the words and have it in an array		
		String[] sp = test.split("");
		
		//Traverse through each word (using loop)		
		for (int i=0;i<sp.length;i++) {
			
			
			//find the odd index within the loop (use mod operator)
			
			if(i % 2 !=0) {
				//string to char array
				char[] r=sp[i].toCharArray();
				String s="";
				//revere the string
				
				for(int j=r.length-1;j>=0;j--) {
					
				s+=r[j];
				}
				System.out.print(s);System.out.print("");
				}
			
				
			else {
				System.out.print(sp[i]);
				
			if(i!=sp.length-1) {
				System.out.print("");
			}
			}
			
			
			
		}
	}
}
			
			
			
			
		
	


		