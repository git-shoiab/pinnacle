package pinnacle;

public class VariableDemo {
	public static void main(String[] args) {
		//1. Variable declaration
		//2. Variable initialization
		//3. Valid identifiers
		//4. Type casting
		//5. operators
		//6. Condition and Looping Constructs
		
		//valid identifier
		//A class name or a package name or a variable name should always start with either a valid character or _ or $
		int age;//valid
		int _age;//valid
		int $age;//valid
		
		int a2g_$e;//valid
		
		//int 2n;//invalid
		//int %n;//invalid
		//int for;//invalid - it is invalid because "for" is a keyword in java...
		
		//INITIALIZATION
		int n=100;//valid
		//int n=100.34;//invalid
		n=-2147483647; //-valid
		n=2147483647;//valid
		//n=2147483648;//invalid because out of range
		n=2_14_748_36_47;//valid - number value can contain underscores
		
		//short s=32_768;//invalid - out of range
	
		byte b=127;
		b=-128;

		float f=100;//valid
		//f=100.23;//invalid
		f=100.3f;//f is mandatory when declaring a float value with decimals

		double d=1000.345;//valid
		
		char c='a';//valid - char value should be in single quote or it can be a number
		c=127;
		
		boolean boo=true;
		boo=false;
		//boo=0;//invalid - boolean can either have true or false
		
		String str="hello world";//can contain set of characters..........
		
	}
}
