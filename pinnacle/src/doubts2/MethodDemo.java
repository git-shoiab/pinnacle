package doubts2;
/*
 * POLYMORPHISM - DATA CHANGES BEHAVIOR CHANGES
 * 
 * VMI - VIRTUAL METHOD INVOCATION OR DYNAMIC METHOD INVOCATION
 * 
 */
public class MethodDemo {
	public static void main(String[] args) {
		Legs legs=new Legs();
		
		legs.movement("this is some thing related to cycle");
		
		legs.movement("climbing...", 10);
		
		legs.movement("aaaaa","aaaaa");
	}
}

class Legs{
	//over loading
	public void movement(String cycle) {
		System.out.println("I am driving cycle.....peddling the cycle...");
	}
	
	public String movement(String water,String boat) {
		System.out.println("I am driving the boat......in a pond....");
		return "aaaa";
	}
	
	public void movement(String stairs,int floors) {
		System.out.println("i am climbing....");
	}
}