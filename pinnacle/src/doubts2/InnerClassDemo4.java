package doubts2;
//https://fluvid.com/videos/detail/5Ad-5C1mMzhVjBzy6#.Yfu9CpcFVA0.link
public class InnerClassDemo4 {
	public static void main(String[] args) {
		Domino dominos=new ChennaiDomino();
		dominos.pizza();
		
		//Another way of implementing abstract class is through anonymous inner classes
		
		Domino dom=new Domino() {		
			@Override
			public void pizza() {
				System.out.println("pizza made by chennai domino...");
			}
		};
		
		dom.pizza();
	}
}


abstract class Domino{
	public abstract void pizza();
}

class ChennaiDomino extends Domino{
	@Override
	public void pizza() {
		System.out.println("pizza made by chennai domino...");
	}
}