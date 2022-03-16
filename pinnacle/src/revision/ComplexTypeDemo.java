package revision;
public class ComplexTypeDemo {
	String s="one value..";//simple type or primitive type
	int i=10;
	int arr[]=new int[] {10,20,30,45};
	MyType obj=new MyType();//complex type
	//but to use this complex type, you need to create an object
	void met() {
		System.out.println(obj.n);
		obj.n=100;
		System.out.println(obj.n);
		obj.str="hello world";
		System.out.println(obj.age);
	}
	public static void main(String[] args) {
		ComplexTypeDemo obj=new ComplexTypeDemo();
		obj.met();
	}
}
class MyType{
	int n=10;
	String str="world";
	float f=1.23f;
	String s[]=new String[4];
	int age=getAge("youthiiii");
	
	int getAge(String n) {
		if(n.equals("youth")) {
			return 20;
		}
		else{
			return 10;
		}
	}
}
