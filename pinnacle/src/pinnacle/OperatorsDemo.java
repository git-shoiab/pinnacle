package pinnacle;

public class OperatorsDemo {
	public static void main(String[] args) {
		int num1=20;
		int num2=3;
		
		int add=num1+num2;
		System.out.println("Addition..:"+add);
		
		int sub=num1-num2;
		System.out.println("Subtraction..:"+sub);
		
		int mul=num1*num2;
		System.out.println("multiplication...:"+mul);
		
		int div=num1/num2;
		System.out.println("division...:"+div);
		
		int mod=num1%num2;
		System.out.println("Mod-Reminder...:"+mod);
		
		int n=10;
		
		System.out.println(n++);//post increment equal to n=n+1, in post increment, the print will happen first and then increment will happen
		//so the above statement will print 10
		System.out.println(n);//this will print 11
		
		n=10;
		System.out.println(++n);//pre increment equal to n=n+1, in pre increment, the increment will happen first and then print will happen
		//so the above statement will print 11
		System.out.println(n);//this will print 11
		
		n=10;
		
		System.out.println(n--);//post decrement equal to n=n-1, in post decrement, the print will happen first and then decrement will happen
		//so the above statement will print 10
		System.out.println(n);//this will print 9
		
		n=10;
		System.out.println(--n);//pre decrement equal to n=n-1, in pre decrement, the decrement will happen first and then print will happen
		//so the above statement will print 9
		System.out.println(n);//this will print 9
		
		
		//how about adding or substracting values other than 1
		
		//n=n+5;
		
		n=10;
		n+=5;//equivalent to n=n+5; - 15
		System.out.println(n);
		
		n=10;
		n-=5;//equivalent to n=n-5;  - 5
		System.out.println(n);
		
		n=10;
		n*=2;//equivalent to n=n*2;  - 20
		System.out.println(n);
		
		n=10;
		n/=5;//equivalent to n=n/5;  - 2
		System.out.println(n);
		
		n=10;
		n%=4;//equivalent to n=n%4;  - 2
		System.out.println(n);
		
		
		//RELATIONAL OPERATORS
		
		//Relational operators always return true or false
		
		System.out.println(10==10);// = is assignment operator but == is comparison operator in java
		System.out.println(num1==num2);//false
		System.out.println(num1!=num2);//true
		
		System.out.println(num1<num2);//lesser than
		boolean b=num1>num2;//num1 is greater than num2
		System.out.println(b);
		
		b=num1>=num2;//num1 is greater than or equal to num2
		System.out.println(b);
		
		b=num1<=num2;//num1 is lesser than or equal to num2
		System.out.println(b);
		
		//LOGICAL OPERATORS
		
		// && - AND 
		// || - OR
		
		b=(num1==num2)&&(num1>num2);//if both the operations return true, then the boolean will be true
		System.out.println(b);
		
		b=(num1==num2)||(num1>num2);//even if of the operations return true, then the boolean will be true
		System.out.println(b);
		
		
		
	}
}
