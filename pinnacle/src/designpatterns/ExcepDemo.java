package designpatterns;
//https://fluvid.com/videos/detail/37jwQhOvGGsy14PAx#.YhN-4SIW0yQ.link
public class ExcepDemo {
	public static void main(String[] args) {
		System.out.println("before exception...............");
		try {
			int i=1/Integer.parseInt(args[0]);
		}
//		catch(ArithmeticException ae) {
//			System.out.println("********************************");
//		}
		catch(ArrayIndexOutOfBoundsException eee) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		}
		catch(NumberFormatException ne) {
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
//		catch(Exception e) {
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		}
		finally {
			System.out.println("finally block called.................");
		}
		
//			if(e instanceof ArithmeticException) {
//				System.out.println("please enter a number other than zero...");
//			}
		

		System.out.println("after exception...............");
	}
}
