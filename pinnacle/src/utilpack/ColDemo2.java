package utilpack;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
//https://fluvid.com/videos/detail/oKxdEh6Lg3tDjpL6x#.YkLliWSddyE.link
public class ColDemo2 {
	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add("d");
		vector.add("a");
		vector.add("f");
		vector.add("c");
		System.out.println(vector);
		
		Collections.shuffle(vector);
		
		System.out.println(vector);
		
		Collections.reverse(vector);
		
		System.out.println(vector);
		
		Collections.sort(vector);
		
		System.out.println(vector);
		
		Collections.sort(vector, new MyComparator());
		
		System.out.println(vector);
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}