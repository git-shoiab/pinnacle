package utilpack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
//https://fluvid.com/videos/detail/q_2d8Swp5nHg5pE6_#.YkLmiPriUkY.link
//https://fluvid.com/videos/detail/oKxdEh6Lg3tDjpL6x#.YkLliWSddyE.link
public class ColDemo1 {
	public static void main(String[] args) {
		Vector alist=new Vector();
		
		alist.add(100);
		alist.add(new String("aaa"));
		alist.add(new A());
		
		System.out.println(alist);
		
		alist.remove(2);
		
		System.out.println(alist);
		
		alist.add(1, new A());
		
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("...................................");
		for(Object o:alist) {
			System.out.println(o);
		}
		
		System.out.println("****************************");
		Iterator iter=alist.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ListIterator liter=alist.listIterator();
		
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
		Enumeration e=alist.elements();
		alist.add("aaaaaa");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		boolean b=alist.contains(1000);
		System.out.println(b);
		
		
	}
}


class A{}