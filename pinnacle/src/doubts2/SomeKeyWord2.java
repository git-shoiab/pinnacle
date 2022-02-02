package doubts2;

public class SomeKeyWord2 {
	public static void main(String[] args) {
		Doctor doctor=new Surgeon();
		
		doctor.cure();
	}
}

class Doctor{
	int money=100;
	public Doctor(int amt) {
		System.out.println("donctor cons called....");
	}
	public void cure() {
		System.out.println("simple cure method of doctor called.....");
	}
}

class Surgeon extends Doctor{// surgeon is also a kind of doctor
	int money;
	public Surgeon() {
		super(10000);//call of parent constructor should be the first line in child/sub class
		System.out.println("surgeon cons called...");
	}
	public void cure() {
		super.cure();
		System.out.println(super.money);
		System.out.println(money);
		System.out.println("surgery method of surgeon called...");
	}
	
}