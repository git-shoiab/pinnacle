package revision;

public class VariableDemo {
	public static void main(String[] args) {
		Hall hall1=new Hall();
		Hall hall2=new Hall();
	}
}


//COMPLEX VARIABLES

class Man{
	public Man() {
		System.out.println("Man object created...");
	}
}

class Hall{
	public Hall() {
		System.out.println("Hall Object created...");
	}
	static Toilet toilet=new Toilet();//when static is given it is called class variable -only one instance of the variable will be created for that class
	Man man=new Man();//instance variable
}

class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
}