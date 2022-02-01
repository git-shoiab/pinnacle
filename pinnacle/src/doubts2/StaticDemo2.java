package doubts2;

public class StaticDemo2 {
	public static void main(String[] args) {
		TrainingRoom nehru=new TrainingRoom();
		
		TrainingRoom gandhi=new TrainingRoom();
		
		System.out.println(nehru.sanyo);
		System.out.println(gandhi.sanyo);
		
		System.out.println(TrainingRoom.toilet);
		System.out.println(TrainingRoom.toilet);
		
		System.out.println(nehru.toilet);
		System.out.println(gandhi.toilet);
	}
}


class TrainingRoom{
	static Toilet toilet=new Toilet();//CLASS VARIABLE
	Projector sanyo=new Projector();//INSTANCE VARIABLE
}


class Toilet{
	
	
}

class Projector{
	
}