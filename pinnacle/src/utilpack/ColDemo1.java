package utilpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ColDemo1 {
	public static void main(String[] args) {
		ArrayList alist=new ArrayList();
		
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
	}
}


class A{}