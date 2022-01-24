package level1mod2.anotherpack;

import level1mod2.AccessDemo;

public class DifPackSubClass extends AccessDemo{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}


class DifPackNonSubClass {
	
	public void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}
/*
	Private is class scope
	no modifier is package scope
	protected is relation scope
	public is global scope
*/