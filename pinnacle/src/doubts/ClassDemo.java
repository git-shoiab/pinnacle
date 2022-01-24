package doubts;

public class ClassDemo {
	public static void main(String[] args) {
		Motor crompton=new Motor();
		crompton.rotate();
	}
}
/*
 * A class is a blue print and multiple objects of the class can be created...
 * A class contain properties and methods
 * A Class should be necessarily a NOUN
 * the behavior or the characteristics of the Noun become the methods or functions
 */
class Motor{
	int hp=4;
	boolean _3phase=true;
	
	public void rotate() {
		if(hp==2) {
				System.out.println("rotate medium speed....");	
		}
		else if(hp==4) {
			if(_3phase) {
				System.out.println("rotate high speed.....");
			}
		}
	}
}