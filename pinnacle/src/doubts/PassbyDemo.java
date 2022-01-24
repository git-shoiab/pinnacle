package doubts;

public class PassbyDemo {
	public static void main(String[] args) {
		PassbyDemo pbd=new PassbyDemo();
		Laddu laddu=new Laddu();
		
		System.out.println("size of laddu before passing...:"+laddu.size);
		pbd.acceptSize(laddu.size);
		System.out.println("size of laddu after passing....:"+laddu.size);
		
		System.out.println("size of laddu before passing.reference..:"+laddu.size);
		pbd.acceptLaddu(laddu);
		System.out.println("size of laddu after passing..reference..:"+laddu.size);
			
	}
	public void acceptSize(int size) {
		size=size+10;
	}
	
	public void acceptLaddu(Laddu laddu) {
		laddu.size=5;
	}
}

class Laddu{
	int size=10;
}