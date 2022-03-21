package revision;
//https://fluvid.com/videos/detail/ykZL6ckQqvsY9GyGM#.Yjhll1X7HpA.link
public class StaticDemo3 {
	public static void main(String[] args) {
		TrainingRoom1 gandhi=new TrainingRoom1();
		TrainingRoom1 nehru=new TrainingRoom1();
		
		
	}
}

class TrainingRoom1{
	Projector1 sanyo=new Projector1();//Instance Variable
	static Toilet1 toilet=new Toilet1();//Class Variable
}

class Projector1{
	public Projector1() {
		System.out.println("projector cons called...");
	}
}

class Toilet1{
	public Toilet1() {
		System.out.println("toilet cons called...");
	}
}