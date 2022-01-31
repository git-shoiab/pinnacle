package revision2;

public class ConsDemo {
	public static void main(String[] args) {
		//first experiment- object creation
		
	Vehicle v=new Vehicle();//when a new object is created both static block and constructor is called
		v.met();
	//	new Vehicle();//eery time u use new keyword - constructor is called..
		
		Vehicle.metStatic();//when a static method is called directly with the classname
		
		//then the constructor will not be called..
		
		Vehicle.metStatic();//even u call the static method multiple times, the static block is called only once
		
		//We use static block to initialize some data or write initialization logic for static methods
	}
}
//Lifecycle hooks of a java class
class Vehicle{
	static {//is called only once - because it is class level
		System.out.println("static block....");
	}
	
	public Vehicle() {
		System.out.println("constructor....");
	}
	
	
	public void met() {
		System.out.println("met method called...");
	}
	
	public static void metStatic() {
		System.out.println("static met method called.....");
	}
}