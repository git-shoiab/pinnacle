package cokpack;
//https://fluvid.com/videos/detail/w6e8gcQ4ggFnywPjM#.YiiQ_a5BCus.link
//https://fluvid.com/videos/detail/448axCdVxjSBR1DKE#.YiiRHBdqA0k.link
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {
	public static void main(String[] args) {
		Set set=new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				String s1=(String)o1;
				String s2=(String)o2;
				return s2.compareTo(s1);
			}
		});
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
