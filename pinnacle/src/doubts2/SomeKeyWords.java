package doubts2;

public class SomeKeyWords {
	static {
		//this is static block
		//System.out.println(this);//- cannot use this in a static context
		//this - always represents the current object - the object which instantiates the static
		//is the JVM - java does not allow you to access JVM
	}
	public static void main(String[] args) {
		//System.out.println(this); //- cannot use this in a static context
		
		new SomeKeyWords().met("this is old value.....");
	}
	
	public void met(String value) {
		this.value=value;//using this keyword on variable will access the instance variable
		//System.out.println(this);// this keyword represents current  object - SomeKeyWords
		Test t=new Test();
		System.out.println("The value of value is...:"+value);
		//t.test(new SomeKeyWords());; - this way you will create one more object - which is not corrent
		t.test(this);
		System.out.println("Now the value is..:"+value);
	}
	
	String value;
}

//this - represents the current object
//this keyword cannot be used inside a static block or static method - rule


class Test{
	public void test(SomeKeyWords obj) {
		obj.value="this is value supplied by test...";
	}
}