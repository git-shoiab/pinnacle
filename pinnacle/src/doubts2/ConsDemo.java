package doubts2;

public class ConsDemo {
	public static void main(String[] args) {
		/*
		 * Constructor - definiton
		 * A special method which gets called to initialize things which are needed for the survival of the object
		 */
		Whale blueWhale=new Whale();
		
		Human shoiab=new Human();
		
		new Whale();
		new Whale();
		new Whale();
		
		//Fan khaitan=new Fan("1hp");
	//	System.out.println(khaitan.getPower());
		
	//	Fan almonar=new Fan("10hp");
	//	System.out.println(almonar.getPower());
		
		System.out.println(Fan.getDetails());
		System.out.println(Fan.getDetails());
	}
}


class Whale{
	public Whale() {
		System.out.println("learns swimming...");
	}
}

class Human{
	public Human() {
		System.out.println("learns crying....");
	}
}

class Fan{
	String power;
	static String details;
	
	static {
		System.out.println("static block called..");
		details="this is fan fan fan fan....";
	}
	
	public Fan(String ph) {
		System.out.println("constructor called..");
		
		power=ph;
	}
	
	public String getPower() {
		return power;
	}
	
	public static String getDetails() {
		return details;
	}
}