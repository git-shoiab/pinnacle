package pinnacle;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("hello \"world\" titan");
		System.out.println("hello \'world\' titan");
		
		System.out.println("hello \nworld \ntitan");
		
		System.out.println("hello \tworld \ttitan");
		System.out.println("hello \n\tworld \n\t\ttitan");
		
		System.out.println("hello \fworld \ftitan");
		
		System.out.println("hello world titan");
		System.out.println("hello \bworld \btitan");
		int n=1;
		while(true) {
			System.out.print(++n+"\r");	
		}
	}
}
