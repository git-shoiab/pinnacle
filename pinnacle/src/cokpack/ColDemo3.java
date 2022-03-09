package cokpack;
//https://fluvid.com/videos/detail/w6e8gcQ4ggFnywPjM#.YiiQ_a5BCus.link
//https://fluvid.com/videos/detail/448axCdVxjSBR1DKE#.YiiRHBdqA0k.link
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ColDemo3 {
	public static void main(String[] args) {
		List list=new Vector();
		
		list.add("hello");
		list.add(455);
		list.add(new Object());
		list.add(new A());
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("...................................");
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println("....................................");
		Iterator iter =list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("...................................");
		ListIterator listiter=list.listIterator();
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		System.out.println("______________");
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		
		list.remove(0);
		System.out.println(list);
		list.add(0,"helonew one");
		System.out.println(list);
	}
}
