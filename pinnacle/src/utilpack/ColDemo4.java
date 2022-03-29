package utilpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {
	public static void main(String[] args) {
		Set hs=new TreeSet(new MyComparator());
		
		hs.add("b");
		hs.add("z");
		hs.add("e");
		hs.add("a");
		hs.add("f");
		hs.add("d");
		hs.add("z");
		
		System.out.println(hs);
		
		Iterator iter=hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println(hs.contains("z"));
	}
}
