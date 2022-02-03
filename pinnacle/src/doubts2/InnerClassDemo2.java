package doubts2;
//https://fluvid.com/videos/detail/5Ad-5C1mMzhVjBzy6#.Yfu9CpcFVA0.link
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Mahendra mahendra=new Mahendra();
		
		Mahendra.acquire();
		
		Mahendra.Satyam.sellOut();		
		Mahendra.Satyam ms=new Mahendra.Satyam();
		ms.sell();
		
		Mahendra.Satyam.Maytas.diwala();
		Mahendra.Satyam.Maytas msm=new Mahendra.Satyam.Maytas();
		msm.diwa();
	}
}
//Remembers only inner classes can be static, outer classes cannot be static..
class Mahendra{
	public static void acquire() {
		System.out.println("mahendra buying all..........");
	}
static class Satyam{
	public static void sellOut() {
		System.out.println("satyam sold out...");
	}
	public void sell() {
		System.out.println("sell sell sell....");
	}
	static class Maytas{
		public static void diwala() {
			System.out.println("diwala of maytas...");
		}
		public void diwa() {
			System.out.println("diwala diwala diwala...........");
		}
	}
}
}