package cokpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColDemo5 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("cat");
		set.add("bat");
		set.add("zebra");
		
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	}
}
