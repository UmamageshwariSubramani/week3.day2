package Week3.day1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		int count;
		
		
		List<String> s=new ArrayList<String>();	
		String[] st=text.split("");
		
	
		for(String val: st)
		s.add(val);
		
		LinkedHashSet<String> output=new LinkedHashSet<String>();
			
		for(int i =0; i<s.size(); i++) {
			output.add(s.get(i));
		}
		
		
	Iterator<String> i= output.iterator();
	while(i.hasNext()) {
		System.out.print(i.next());System.out.print("");
	}
		
	}

}
