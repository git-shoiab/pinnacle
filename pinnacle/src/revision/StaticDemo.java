package revision;

public class StaticDemo {
	public static void main(String[] args) {
		//Static methods and static variables should always directly access via class name
		Country.ocean();
		Country.ocean();
		System.out.println(Country.temp);
		Country india=new Country();
		Country iraq=new Country();
		
		india.mountains();
		iraq.mountains();
	}
}
/*
static is a key word, you can apply static keyword on 
1. class
2. variables - both primitive(number,char,boolean,float) and complex(our custom class)
3. Methods

static class can only be inner class (we will cover later)
static variables and static methods are accessed directly with the class name
because their instance is created only once and shared by all the objects of that class

static variables and static methods are instantiated directly by java, without you creating
an object of the class

STATIC VARIABLES AND STATIC METHODS ARE CALLED- CLASS LEVEL VARIABLE AND CLASS LEVEL METHODS
*/

class Country{
	public static void ocean() {
		System.out.println("ocean shared...");
	}
	static public int temp;
	public void mountains() {
		
	}
}