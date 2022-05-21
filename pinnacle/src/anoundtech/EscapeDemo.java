package anoundtech;
//https://fluvid.com/videos/detail/-KRkYhqqxxtBpjBaR#.YnypwYcmA6E.link
public class EscapeDemo {
	public static void main(String[] args) {
		//System.out.println("hello \t\n\nworld\t\n\n\n\n anound");
		
		System.out.println("hello \r world");
		
		System.out.println("hello \f world");
		
		System.out.println("hello\bworld");
		int n=0;
//		while(true) {
//			System.out.print(n++ +"\r\r");
//		}
		
		//System.out.format("hello world %d and second world %s and third world %f",100,"india",300.23);
		String s=String.format("hello world %d and second world %s and third world %f",100,"india",300.23);
		System.out.println(s);
	}
}
