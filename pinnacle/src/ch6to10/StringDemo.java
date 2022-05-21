package ch6to10;
//https://fluvid.com/videos/detail/Y5V24TV6VAf4VV6Lv#.YodAHGdo7ws.link
//https://fluvid.com/videos/detail/G6x-YcgppRUxvvOXn#.YodzgNJKsBs.link
public class StringDemo {
	public static void main(String[] args) {
		String str=new String("hello");	//this will create two objects	
		String str2="hello";//this will create one object
		
		System.out.println(str==str2);//this will compare the objects not the value
		
		System.out.println(str.equals(str2));//equals method compares the values...
		
		if(str.equals(str2)) {
			System.out.println("both are equal...");
		}
		
		String v=String.format("My name is is ..:%s","Billa");
		
		System.out.println(v);
		
		v=String.format("My name is is ..:%d...%s and my age is..:%d",100,"Billa",70);
		
		System.out.println(v);
		
		v=String.format("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
		
		System.out.println(v);
		
		System.out.printf("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
		
		System.out.printf("\n %-4s %10s %20s", "Column1","Column2","Column3");
		
		System.out.printf("\n %-4s %10s %20s", "SNo","Name","Company");
		System.out.printf("\n %-4s %-20s %20s", "100","Ramu","Anound Technologies");
		
		System.out.printf("\n %-20s %-20s %-20s", "SNo","Name","Company");
		System.out.printf("\n %-20s %-20s %-20s", "100","Ramu","Anound Technologies");
		System.out.println();
		System.out.printf("%.2f",100.279f);
	}
}
