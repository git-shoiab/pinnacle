package level1mod2;

public class Overriding {
	public static void main(String[] args) {
		Super superObj=new Sub();
		superObj.met();
	}
}

//INHERITANCE
//INHERITANCE IS A KIND OF RELATIONSHIP, WHERE THE CHILD CAN REPLACE THE PARENT
class Super{//PARENT CLASS
	void met() {
		System.out.println("super class met called....");
	}
}

class Sub extends Super{//CHILD CLASS
	void met() {
		System.out.println("sub class met called.............................");
	}
}