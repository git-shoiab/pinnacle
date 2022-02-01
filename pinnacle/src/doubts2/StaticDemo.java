package doubts2;

public class StaticDemo {
	public static void main(String[] args) {
		Motor.met("ramu");//static methods are always called with class name
		
		/*
		 * How static methods are called by just class names ?
		 * Because the static methods are instantiated by the JVM
		 */
		Motor obj=new Motor();
		obj.met2("ramu");
		//obj.met2("somu");
		
		Motor obj2=new Motor();
		obj2.met2("somu");
		//obj.met(); - this is hightly discouraged
		
		Motor.met("somu");
	}
}

//REMEMBER - STATIC METHODS CAN ONLY ACCESS STATIC PROPERTIES
class Motor{
	static int amt=0;//CLASS LEVEL VARIABLE
	int amtamt=0;//INSTANCE VARIABLE
	public static void met(String name) {//CLASS LEVEL METHOD
		System.out.println("The amount is..:"+amt);
		if(name.equals("ramu")) {
			amt=10000;
		}
	}
	
	public void met2(String name) {//INSTANCE LEVEL METHOD
	System.out.println("The amount is..:"+amtamt);
		if(name.equals("ramu")) {
			amtamt=10000;
		}
	}
}