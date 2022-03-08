package cokpack;
//https://fluvid.com/videos/detail/w6e8gcQzpVuny7PKY#.YiXxkq5RIkE.link
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollDemo2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(34);
		list.add(455);
		list.add(566);
		list.add(333);
		
		boolean isAvailable=list.contains(455);
		System.out.println(isAvailable);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer n1=(Integer)o1;
				Integer n2=(Integer)o2;
				return n2.compareTo(n1);
			}
		});
		System.out.println(list);
		
		List list2=new ArrayList();
		list2.add("rahim");
		list2.add("mahim");
		list2.add("george");
		list2.add("ram");
		System.out.println(list2);
		boolean isAvailable2=list.contains("george");
		System.out.println(isAvailable2);
		
		Collections.sort(list2);
		
		System.out.println(list2);
		
		Collections.sort(list2,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				String n1=(String)o1;
				String n2=(String)o2;
				return n2.compareTo(n1);
			}
		});
		System.out.println(list2);
		
		List list3=new ArrayList();
		list3.add(new Attendance("rahim"));
		list3.add(new Attendance("mahim"));
		list3.add(new Attendance("george"));
		list3.add(new Attendance("ram"));
		System.out.println(list3);
		boolean isAvailable3=list.contains(new Attendance("george"));
		System.out.println(isAvailable3);
		
		Collections.sort(list3);
		
		System.out.println(list3);
		
		Collections.sort(list3,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Attendance n1=(Attendance)o1;
				Attendance n2=(Attendance)o2;
				return n2.compareTo(n1);
			}
		});
		System.out.println(list3);
	}
}

class Attendance implements Comparable{
	String name;
	public Attendance(String name) {
		this.name=name;
	}
	public String getName() {
		return "Name...:"+this.name;
	}
	@Override
	public int compareTo(Object o) {
		Attendance att=(Attendance)o;
		return att.getName().compareTo(this.name);
		}
	
	@Override
	public String toString() {
		return "Name is...:"+this.name;
	}
}