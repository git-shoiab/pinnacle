package level1mod2;

public class AccessDemo {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
//All the properties of the parent class, (fields and methods) are available to the child class except private
//SAME PACKAGE SUB CLASS
class Child extends AccessDemo{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
//SAME PACKAGE NON SUB CLASS
class NonChild {
	public void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}