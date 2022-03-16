package revision;

public class OverLoadDemo {
	public static void main(String[] args) {
		OverLoadDemo obj=new OverLoadDemo();
		//obj.met();
		obj.met(10);
		obj.met("10");
		obj.met(10,"hello");
	}
	void met() {
		System.out.println("met without param called....");
	}
	void met(int i) {
		System.out.println("met with param called..............:"+i);
	}
	void met(String s) {
		System.out.println("met with string param called...:"+s);
	}
	void met(String str,int i) {
		System.out.println("string and int called..:"+str+":"+i);
	}
	void met(int i,String str) {
		System.out.println("int and string called..:"+i+":"+str);
	}
}
