package level1mod2;

public class OverLoading {
	public static void main(String[] args) {
		//creating an object without allocating is called anonymous object
		
		Earth e=new Earth();//will call the default constructor
		e.met();
		e.met(10);//java believes in POLYMORPHISM - Virtual Method Invocation or Dynamic Method Invocation - parameter changes the method call changes
		new Earth("humans");//the string  cons is called
		new Earth("humans",2382938);//the string and int cons is called..
	}
}


class Earth{
	//Overloading of constructors
	public Earth() {
		System.out.println("the default no param cons is called..");
	}
	
	public Earth(String name) {
		System.out.println("The string param cons is called....:"+name);
	}
	public Earth(String name,int n) {
		System.out.println("The string and int param cons is called...:"+name+":"+n);
	}
	
	//METHOD OVERLOADING
	void met() {
		System.out.println("met is called.............");
	}
	
	void met(int n) {
		System.out.println("method with int param called...:"+n);
	}
	
	
}