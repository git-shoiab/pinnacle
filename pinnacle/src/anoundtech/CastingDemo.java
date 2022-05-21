package anoundtech;
//https://fluvid.com/videos/detail/AZX-wTOO7ZIpg1kLD#.YnyNk-7Me0A.link
public class CastingDemo {
	public static void main(String[] args) {
		byte b=100;
		int n=b;//auto type promotion
		
		//b=n;//illegal - because int is 32 bit and byte is 8 bit - they are incompatible
		
		//to solve this we can do explicit casting
		
		b=(byte)n;//32 bit variable will now be downcasted to 8 bit
		System.out.println(b);
		
		n=513;
		
		b=(byte)n;
		
		System.out.println(b);
		
		byte n1=2;
		byte n2=10;
		
		System.out.println(n1*n2);
		
		byte result=(byte)(n1*n2);//the result of an arithmetic operation will always be int
		
		float f=100.23f;
		n=(int)f;//float cannot be stored in int.
		System.out.println(n);
		f=n;//integer can be stored in float but not vice versa
		
		char c=97;
		n=c;
		//c=n;//you cannot store integer into a character
		
		System.out.println(c);
		System.out.println((char)n);
	}
}
