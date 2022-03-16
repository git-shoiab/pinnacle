package revision;

public class PbvPBr {
	public static void main(String[] args) {
		Laddu tirupathiladdu=new Laddu();
		PbvPBr obj=new PbvPBr();
		System.out.println("laddu size...:"+tirupathiladdu.size);
		obj.met(tirupathiladdu);
		System.out.println("laddu size after passing..:"+tirupathiladdu.size);
		
		System.out.println("before passing size value..:"+tirupathiladdu.size);
		obj.met(tirupathiladdu.size);
		System.out.println("after passing size value..:"+tirupathiladdu.size);
	}
	void met(Laddu myladdu) {
		myladdu.size=5;
	}
	
	void met(int size) {
		size=20;
	}
}

class Laddu{
	int size;
}