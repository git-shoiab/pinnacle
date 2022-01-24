package doubts;

public class StringDemo {
	public static void main(String[] args) {
		String s="hello world";
		
		String s2=new String("hello world");
		
		System.out.println(s==s2);
		
		//how to compare two values of a string
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('e'));
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(2,4));
		
		System.out.println(s.endsWith("d"));
		
		String str1="a";//97
		String str2="b";//98
		
		System.out.println(str2.compareTo(str1));//97-98
	}
}
