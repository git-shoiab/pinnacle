package doubts2;
//https://fluvid.com/videos/detail/5Ad-5C1mMzhVjBzy6#.Yfu9CpcFVA0.link
public class InnerClassDemo3 {
	public static void main(String[] args) {
		new Pepsi().makeCola();
	}
}


class Pepsi{
	public void makeCola() {
		//Local inner class - a class within a method is called local inner class
		//this class is by default private to the method
		//this class cannot be accessed by outside
		class CampaCola{
			public void makeCola(){
				System.out.println("cola made....");
			}
		}
		new CampaCola().makeCola();
	}
}