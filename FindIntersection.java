package Week3.day1;

import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
		//declare array
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		for(int val:array1) {
			set1.add(val);
		}
		
		for(int val:array2) {
			if(set1.contains(val)){
				System.out.print(val);
			 
				
				//pls change the code after clarification
		
	
		//for(int i=0; i<array1.length; i++) {
			//for(int j=0; j<array2.length; j++) {
				//if(array1==array2) {
					//System.out.println(array1[i]);
				}
			}
		}
	
		

	

}

