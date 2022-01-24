package level1mod2;

public class ArgumementPassing {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		PBV pbv=new PBV();
		
		System.out.println("Size of Laddu..before passing.:"+laddu.size);
		
		pbv.accept(laddu.size);
		
		System.out.println("Suze of laddu...after passing...:"+laddu.size);
		//ALL PRIMITIVE TYPES ARE PASS BY VALUE -ALWAYS A COPY WILL BE CREATED AND SENT
		
		//Complex type passing is always Pass By Reference
		PBR pbr=new PBR();
		System.out.println("size of laddu...before pass by reference...:"+laddu.size);
		pbr.accept(laddu);
		
		System.out.println("Size of laddu..after pass by reference...:"+laddu.size);
		
	}
}

class Laddu{
	int size=10;
}

//CHINESE WHISPER
class PBV{
	public void accept(int size) {
		size=5;
	}
}

class PBR{
	
	public void accept(Laddu laddu) {
		laddu.size=5;
	}
}