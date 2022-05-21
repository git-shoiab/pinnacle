package anoundtech;
//https://fluvid.com/videos/detail/37jwQh99Gwfe4YBn1#.YntCYYpREFw.link
public class OperatorsDemo {
	public static void main(String[] args) {
		//Arithmetic operators
		//+,-,*,%,/
		
		int n1=10;
		int n2=2;
		//Addition
		System.out.println(n1+n2);
		//Substraction
		System.out.println(n1-n2);
		//multiplication
		System.out.println(n1*n2);
		//division - quotient
		System.out.println(n1/n2);
		//mod - reminder
		System.out.println(n1%n2);
		
		//increment and decrement operators
		int i=n1++;//this will allocate and then increment
		i=++n1;//n1=n1+1; - it will increment and allocation
		System.out.println(i);//11
		
		int x=20;
		
		System.out.println(x++);//first it will print and then increment
		System.out.println(x);
		
		x=20;
		System.out.println(x--);//first it will print and then decrement
		System.out.println(x);
		
		x=20;
		
		System.out.println(++x);//first it will increment and then print
		System.out.println(x);
		
		x=20;
		System.out.println(--x);//first it will decrement and then print 
		System.out.println(x);
		
		x=20;
		//x=x+4;
		x+=4;
		System.out.println(x);
		
		x=20;
		//x=x-5;
		x-=5;
		System.out.println(x);
		
		x=20;
		//x=x*2;
		x*=2;
		System.out.println(x);
		
		x=20;
		//x=x/3;
		x/=3;
		System.out.println(x);
		
		x=20;
		//x=x%3;
		x%=3;
		System.out.println(x);
		
		
		//Relational Operators = ==, !=, <, >, <=, >=
		
		int num1=100;
		int num2=200;
		System.out.println(num1==num2);//false
		System.out.println(num1!=num2);//true
		System.out.println(num1<num2);//true
		System.out.println(num1>num2);//false
		System.out.println(num1<=num2);//either or - true
		System.out.println(num1>=num2);//false
		
		System.out.println(!(num1>=num2));//false
		
		//Logical operators = &&, ||, !
		
		System.out.println(num1<num2 || num1==101);//true because either or
		
		System.out.println(num1<num2 && num1==101);//false - will return true only if both the conditions are satisfied
	}
}
