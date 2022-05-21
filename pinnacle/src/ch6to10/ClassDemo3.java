package ch6to10;

public class ClassDemo3 {

}

class Bank{
	
	boolean depositCash(int amt) {
		if(amt >1000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	long getMoney() {
		return (long)100l;
	}
	
	String getName() {
		return "ram";
	}
}
