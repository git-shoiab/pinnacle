package doubts;

public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo obj=new MethodDemo();
		obj.met();
		int result=obj.met2();
		
		System.out.println("Result of met2..:"+result);
		
		System.out.println(obj.met3("Pinnacle",5));
		
		obj.met4(14,212,233,455,544);
	}
	
	//Methods are of two types 1. VOID AND 2. RETURNABLE METHOD
	
	public void met() {
		System.out.println("this method does not return any value...");
	}
	public int met2() {
		return 100;
	}
	
	public String met3(String coursename,int duration) {
		return "The name is..:"+coursename+":"+duration;
	}
	
	public void met4(int... num) {// VAR ARGS
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		//new latest for loop in java - enhanced for loop
		for(int i:num) {
			System.out.println(i);
		}
		
		
	}
}
