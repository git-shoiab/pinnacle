package revision;

public class ConsDemo {
	public static void main(String[] args) {
		new Human();//anonymous object - nameless object
		new Human("pinnacle");
		new Human("pinnacle",100);
	}
}


class Human{
	public Human() {
		System.out.println("human object created...no params cons");
	}
	public Human(String str) {
		System.out.println("human object created with string param cons ...");
	}
	public Human(String str,int i) {
		System.out.println("human object created with string and int param cons");
	}
}