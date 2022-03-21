package revision;
//https://fluvid.com/videos/detail/G6x-YcDA4Df5gpBAd#.YjhaV_acHoA.link
public class ConsOverrid {
	public static void main(String[] args) {
		//new Parent();
		Parent obj=new Child(10);
		
		System.out.println(obj.age);
		obj.met();
	}
}

abstract class Parent{
//	public Parent() {
//		System.out.println("parent cons called....");
//	}
	public Parent(int x) {
		System.out.println("parent parameteric cons called....");
	}
	int age=40;
	public void met() {
		System.out.println("parent met is called...");
	}
}

class Child extends Parent{
	public Child(int i) {
		super(1010);
		System.out.println("child cons called..."+i);//constructor also does not override
		
	}
	int age=500;//this does not override the parent age property
	public void met() {//this method met overrides the parent met method
		System.out.println("child met is called..");
	}
}