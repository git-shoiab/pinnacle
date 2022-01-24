package pinnacle;

public class TypeCasting {
	public static void main(String[] args) {
		//TYPE CASTING
		
		long l=100;//64 bit and int is of 32 bit
		int n=(int)l;//invalid - because a smaller type cannot hold a larger type
		
		short s=(short)n;
		
		byte b=(byte)s;
		
		//be default auto conversion does not take place when you assign a larger type to a smaller type
		//but still it is possible to assign by type casting
		
		n=258;
		b=(byte)n;
		
		System.out.println(b);//when u cast a higher value above 128, then the number will be divided by 256 and the reminder will be assigned
		
		byte b1=2;
		byte b2=4;
		
		byte result=(byte)(b1*b2);//the result of a arithmetic operation is always int - we call this as type promotion also
		n=97;
		char c='a';
		c=97;
		n=c;//valid - because a character is by default a number
		
		//c=n;//this is invalid, because a number is not by default a character
		c=(char)n;
		
		System.out.println(c);
		
		float f=100;
		//n=f;//invalid
		f=n;//valid
		
		f=100.20f;
		n=(int)f;
		System.out.println(n);//it will trim the decimal values...
		
	}
}
