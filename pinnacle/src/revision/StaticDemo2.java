package revision;

public class StaticDemo2 {
	public StaticDemo2() {
		System.out.println("cons called..");
	}
	static {
		System.out.println("static blocked is called...-can be used for initialization..");
	}
	public static void main(String[] args) {
		//StaticDemo2 obj=new StaticDemo2();
		//obj.met();
		StaticDemo2.met();
		StaticDemo2.met2();
	}
	
	static void met() {
		System.out.println("static met is called...");
	}
	
	static void met2() {
		System.out.println("static met 2 is called...");
	}
}

