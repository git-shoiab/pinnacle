package revision;

public class VariableDemo2 {
	public static void main(String[] args) {
		System.out.println("Training room. toilet.:"+TrainingRoom.toilet);
		
		TrainingRoom nehru=new TrainingRoom();
		TrainingRoom netaji=new TrainingRoom();
		
		System.out.println("Nehru room..:"+nehru.sanyo);
		System.out.println("netaji room..:"+netaji.sanyo);
		
		System.out.println("Nehru room.toilet.:"+nehru.toilet);
		System.out.println("Netaji room..toilet:"+netaji.toilet);
		
	}
}

class TrainingRoom{
	Projector sanyo=new Projector();
	static RestRoom toilet=new RestRoom();
	public TrainingRoom() {
		System.out.println("training room object created...");
	}
}

class Projector{
	public Projector() {
		System.out.println("projector object created...");
	}
}

class RestRoom{
	public RestRoom() {
		System.out.println("rest room object created..");
	}
}