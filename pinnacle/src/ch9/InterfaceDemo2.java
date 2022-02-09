package ch9;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		MyInterface.met();
		MyInterfaceImpl obj=new MyInterfaceImpl();
		obj.met2();
		obj.met();
	}
}
interface MyInterface{
//	MyInterface(){
//		
//	}
	public static void met() {
		System.out.println("only static method called...");
	}
	
	default void met2() {
		System.out.println("only default method called...");
	}
}
interface MyInterface2{}
interface MyInterface3 extends MyInterface,MyInterface2{
	public void met();
}
class MyInterfaceImpl implements MyInterface3,MyInterface2{
	public void  met() {
		System.out.println("met method called...");
	}
}