package level1mod2;

public class ClassesAndMethods {
	public static void main(String[] args) {
		//simple type
		int i=10;
		//complex type
		Integer ii=10;//this concept of allocating a simple number to an object is called boxing
		Integer in=i;//boxing
		int n=ii;//allocating a complex type to a simple type is called unboxing
		Integer iii=new Integer(10);//this got deprecated in jdk7
		Integer iiii=Integer.valueOf(10);//this is latest
		
		//We always go with simple types, because that occupies less memory and it works faster
		//we use Integer type only when we are forced to pass complex type
		
		//The other complex types are Float, Character, Short, Long, Byte, Boolean - these are also referred as wrapper classes
		
		//u can also define classes and create variables of that type
		
		Motor crompton;//Complex type - called Motor Type
		//What this crompton can accept - it can only accept an object of type Motor
		crompton=new Motor();//new key word creates an object in JAVA
		//What is crompton - crompton is the name of the object - which is of type Motor
		crompton.rotate();
		//another example
		System.out.println("Speed of Motor before setting is..:"+crompton.getSpeed());
		crompton.setSpeed(2000);
		System.out.println("Speed of Motor after setting is..:"+crompton.getSpeed());
		crompton.setDetails(4000, "This is crompton motor...");
		System.out.println("Details of Motor....:"+crompton.getDetailsOfMotor());
		Human shoiab=new Human();//shoiab is the name or reference or pointer for the object of type Human - shoiab is pointing to the Human Object.
		shoiab.cry();
	}
}

class Motor{//All nouns can be classes
	int speed=1000;String name;//variable declared outside the methods are called INSTANCE VARIABLES
	//INSTANCE VARIABLES ARE REFERED USIING THE KEYWORD - THIS
	void rotate() {//this is a method
		System.out.println("rotate method called.....");
	}
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int s) {
		speed=s;
	}
	void setDetails(int s,String name) {
		speed=s;
		this.name=name;
	}
	String getDetailsOfMotor() {
		return "Details...:"+this.name+":"+this.speed;
	}
}
class Human{
	void cry() {
		System.out.println("Human crying....");
	}
}