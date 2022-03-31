package stringpack;
//https://fluvid.com/videos/detail/-KRkYhGaLrCEzkjDj#.YkWR5jLiOJk.link
public class StringDemo {
	public static void main(String[] args) {
		String str=new String("hello world");
		
		String temp=str;
		
		str=str+"---second world";
		
		System.out.println(str);
		
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer("hello world");
		
		StringBuffer sb2=sb;
		
		sb.append("........second world.......");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuilder sbb=new StringBuilder("hello world");
		
		StringBuilder sbb2=sbb;
		
		sbb.append("........second world.......");
		
		System.out.println(sbb);
		System.out.println(sbb2);
	}
}
