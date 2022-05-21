package anoundtech;
//https://fluvid.com/videos/detail/gk_qEcggEpi96G9xP#.Ynta4mAGVVQ.link
public class Programming1 {
	public static void main(String[] args) {
		//ternary operator
		
		// ?
		String result=(4%2==0)?"Even Number ...":"Odd Number...";
		System.out.println(result);
		System.out.println((10<20)?"yes it will lesser than 20":"no it is not lesser than twenty");
		
		if(3%2==0) {
			System.out.println("Even number...");
		}
		else {
			System.out.println("Odd number....");
		}
		String name="joh";
		if(name.equals("rahim")) {
			System.out.println("my name is billa....");
		}
		else if(name.equals("ram")) {
			System.out.println("my name is gilli....");
		}
		else if(name.equals("john")) {
			System.out.println("amar akbar antony....");
		}
		else {
			System.out.println("allahuddin and 40 theifs....");
		}
	}
}
