package stringpack;
//https://fluvid.com/videos/detail/-KRkYhGaLrCEzkjDj#.YkWR5jLiOJk.link
public class LambdaDemo {
	public static void main(String[] args) {
		//MyInter myinter=new MyInterImpl();
		//myinter.sayHello();
		
		MyInter myinter=(n,a)->{System.out.println("say hello met called....lambda...."+n+":"+a);};
		
		myinter.sayHello("pinnacle",4);
	}
}


interface MyInter{
	public void sayHello(String name,int age);
	//public void sayHello2();
}

//if you want to use this interface using lambdas, then it is a must that this interface should be a 
//FUNCTIONAL INTERFACE
//Functional Interface - a interface with only one method...
class MyInterImpl implements MyInter{
	
	@Override
	public void sayHello(String name,int age){
		System.out.println("say hello met called.."+name+":"+age);
	}
//	public void sayHello2(){
//		System.out.println("say hello met called..");
//	}
}