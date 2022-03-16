package revision;

public class ClassDemo1 {
	//class fundamentals
	//methods
	//constructors
	//this
	//object parameters
	//garbage collection
	public static void main(String[] args) {
	}
	void met() {
		System.out.println("dont return a value...");	
	}
	int met2() {
		return 20;	
	}
	int met3(int i) {
		if(i==1) {
			return 10;
		}
		else if(i==2) {
			return 20;
		}
		else {
			return 0;
		}
	}
	void met4(String s,int i) {
		
	}
	
	void met5(House h) {
		
	}
	House met6() {
		return new House();
	}
	int time=getTime("morning");
	
	int getTime(String s) {
		if(s.equals("morning")) {
			return 9;
		}
		else if(s.equals("evening")){
			return 10;
		}
		else {
			return 5;
		}
	}
}

class House{//complex type
	
}