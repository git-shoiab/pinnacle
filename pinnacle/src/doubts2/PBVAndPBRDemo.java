package doubts2;

public class PBVAndPBRDemo {
	public static void main(String[] args) {
		PBVAndPBRDemo obj=new PBVAndPBRDemo();
		Laddu laddu=new Laddu();
		System.out.println("Before passing...:"+laddu.size);
		obj.accept(laddu.size);
		System.out.println("After passing...:"+laddu.size);
		
		System.out.println("Before passing...:"+laddu.size);
		obj.acceptLaddu(laddu);
		System.out.println("After passing...:"+laddu.size);
		
	}
	
	public void accept(int size) {
		size=size-5;
	}
	
	public void acceptLaddu(Laddu laddu) {
		laddu.size=laddu.size-5;
	}
}


class Laddu{
	int size=10;
}