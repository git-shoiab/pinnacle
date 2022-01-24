package level1mod2;

public class ClassesAndMethods2 {
	public static void main(String[] args) {
		Milk avin=new Milk();
		//when u create an object of the class, the constructor gets called...
		
		
	}
}
//CONSTRUCTORS
class Milk{
	//the name of the method/constructor should be same as the name of the class
	//construcotrs are by default void, they don't have a return
	//When an object is created the contructor is called by default
	public Milk() {//CONSTRUCTOR
		System.out.println("constructor of milk is called....");
	}
}

/*
Constructor is a method which is always called before the object is fully ready
You can normally keep the initialization code in the constructor
*/