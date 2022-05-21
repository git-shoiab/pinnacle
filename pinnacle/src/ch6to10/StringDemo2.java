package ch6to10;
//https://fluvid.com/videos/detail/8EL-9T-66Ys5BBp1y#.Yod7jzWa-So.link
public class StringDemo2 {
	public static void main(String[] args) {
		String s="Hello World";
		
		System.out.println(s.charAt(1));//prints the character at that position
		
		System.out.println(s.indexOf('e'));//prints 1
		
		System.out.println(s.toUpperCase());
		
		String str=s.toLowerCase();
		
		System.out.println(str);
		
		char c[]=s.toCharArray();
		
		for(char cc:c) {
			System.out.print(cc+"\t");
		}
		
		str=s.substring(6);
		System.out.println();
		System.out.println(str);
		
		str=s.substring(2,8);
		System.out.println(str);//reads from 2nd character to 7th character
		
		str=str.concat("myworld");
		
		System.out.println(str);
		
		System.out.println(str.length());
	}
}
