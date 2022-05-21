package anoundtech;

public class ArgumentsDemo {
	public static void main(String[] args) {
		String n1=args[0];
		
		System.out.println(n1);
		
		System.out.println(args[1]);
		
		int n=Integer.parseInt(args[2]);
		
		System.out.println(args[2]+100);
	}
}
