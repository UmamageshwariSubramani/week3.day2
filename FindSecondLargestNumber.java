package Week3.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		int size=0;
		int[] data = { 3, 2, 11, 4, 6, 7 };
		
		List<Integer> n = new ArrayList<Integer> ();
		
		for (int i=0;i<data.length;i++) {
			n.add(data[i]);
			
			//sorting Array list
			
			Collections.sort(n);
			size=n.size();
			size=size-2;	
			//pick the 2nd element from the last 
			System.out.println("The second largest number is" +n.get(size));
		}
		
	

	}

}
