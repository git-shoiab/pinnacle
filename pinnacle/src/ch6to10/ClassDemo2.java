package ch6to10;

public class ClassDemo2 {
	public static void main(String[] args) {
		Test obj=new Test();//this is how we create a objet of a class
		obj.met();
		obj.met2();
	}
}

class Test{
	//Primitive types or simple types
	
	int i;//variables declared outside the methods are called INSTANCE VARIABLES - denotes state
	
	void met() { //- denotes behavior
		//INSTANCE VARIABLES are initialized by default but local variables are
		//not initialized by default
		int meti=10;//local variable
		System.out.println(i);
		System.out.println(meti);
	}
	void met2() {
		System.out.println(i);
	}
}