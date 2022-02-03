package doubts2;
//https://fluvid.com/videos/detail/5Ad-5C1mMzhVjBzy6#.Yfu9CpcFVA0.link
public class InnerClassDemo {
	public static void main(String[] args) {
		Troy troy=new Troy();
		
		troy.party();
		
		//Troy.TrojanHorse trojonHorse=new Troy().new TrojanHorse();
		
		Troy.TrojanHorse trojonHorse=troy.new TrojanHorse();
		
		trojonHorse.move();
		
		//Troy.TrojanHorse.Soldiers soldiers=new Troy().new TrojanHorse().new Soldiers();
		
		Troy.TrojanHorse.Soldiers soldiers=troy.new TrojanHorse().new Soldiers();
		
		soldiers.attack();
	}
}

//OBJECTIVE OF INNER CLASS IS TO ACHIEVE ENCAPSULATION

class Troy{
	public void party() {
		System.out.println("Troy kingdom partying....");
	}
	//A CLASS WITHIN A CLASS IS CALLED INNER CLASS
	class TrojanHorse{
		
		public void move() {
			System.out.println("trojan horse moving...");
		}
		class Soldiers{
			public void attack() {
				System.out.println("soldiers attacking......");
			}
		}
	}
}