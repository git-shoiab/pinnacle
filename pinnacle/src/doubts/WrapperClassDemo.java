package doubts;

public class WrapperClassDemo {
	public static void main(String[] args) {
		String s="hello";// this will give better performance
		String ss=new String("hello");//this representation will create 2 objects in memory-which is not good in many cases
		
		//All the below are wrapper classes but above string is not a wrapper class
		int i=10;// this will give better performance
		Integer ii=new Integer(10);//this representation will create 2 objects in memory-which is not good in many cases
		Integer iii=Integer.valueOf(10);// this will give better performance
		
		float f=12.4f;// this will give better performance
		Float ff=new Float(122.33f);//this representation will create 2 objects in memory-which is not good in many cases
		Float fff=Float.valueOf(122.3f);// this will give better performance
		
		//Simillarly we have wrapper classes for Boolean, Character, Short, Byte, Long
		
		//Let us explore some methods in Integer class
		
		System.out.println(Integer.min(10, 20));
		System.out.println(Integer.sum(300, 400));
		String num1=args[0];
		String num2=args[1];
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));//parseint converts strings to numbers
	}
}
