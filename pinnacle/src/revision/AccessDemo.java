package revision;
//https://fluvid.com/videos/detail/Y5V24T8A25I9Ke7Vv#.YjMZYy-HZWQ.link
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

class SubAccessDemo extends AccessDemo{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class NonSubAccessDemo {
	public void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pri);
		//all the below are package or more than package scope
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}