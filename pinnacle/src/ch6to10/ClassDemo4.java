package ch6to10;

public class ClassDemo4 {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.met(20,30,"hello");
		
		int[] a=new int[] {10,20,30,40};
		obj.met2(a);//indirect
		
		obj.met2(new int[] {10,30,40,50});//direct
		
		
		obj.met3(120,34,56,67,78);//we are passing arguments
		
		int b[]=obj.met3(20,30,40);
		for(int i:b) {
			System.out.println("........."+i);
		}
	}
}

class Demo{
	void met(int i,int j,String s) {
		System.out.println(i+":"+j+":"+s);
	}
	
	void met2(int a[]) {//method is accepting parameters
		for(int i:a) {
			System.out.println(i);
		}
	}
	int[]  met3(int ...a) {//variable arguments (VARARGS)
		for(int i:a) {
			System.out.println(i);
		}
		return a;
	}
}