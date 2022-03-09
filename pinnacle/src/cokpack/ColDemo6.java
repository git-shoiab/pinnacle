package cokpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ColDemo6 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	
	hm.put("a4", "rahim");
	hm.put("a3", "ram");
	hm.put("a2", "mahim");
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
