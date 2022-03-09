package cokpack;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo7 {
public static void main(String[] args) {
	TreeMap hm=new TreeMap(new Comparator() {
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1=(String)o1;
			String s2=(String)o2;
			return s2.compareTo(s1);
		}
	});
	
	hm.put("a4", "rahim");
	hm.put("a2", "sham");
	hm.put("a3", "mahim");
	hm.put("a1", "bahim");
	
	System.out.println(hm);
	
	System.out.println(hm.get("a2"));
	
	Set set=hm.entrySet();
	Iterator iter=set.iterator();
	
	while(iter.hasNext()) {
		//System.out.println(iter.next());
		Map.Entry me=(Map.Entry)iter.next();
		System.out.println("key...:"+me.getKey());
		System.out.println("value...:"+me.getValue());
	}
}
}
