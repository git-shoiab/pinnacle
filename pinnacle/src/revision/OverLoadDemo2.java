package revision;

public class OverLoadDemo2 {
	public static void main(String[] args) {
		//Help911 _911=new Help911();
		//_911.help("robbery");
		
		GoodHelp911 obj=new GoodHelp911();
		obj.help(new Robbery());
	}
}

class Help911{
	public void help(String reason) {
		if(reason.equals("fire")) {
			new Fire().action();
		}
		else if(reason.equals("robbery")) {
			new Robbery().action();
		}
	}
}

class GoodHelp911{
	public void help(Fire fire) {
		fire.action();
	}
	public void help(Robbery robbery) {
		robbery.action();
	}
}

class Fire{
	public void action() {
		System.out.println("fire engine sent...");
	}
}

class Robbery{
	public void action() {
		System.out.println("police sent...");
	}
}