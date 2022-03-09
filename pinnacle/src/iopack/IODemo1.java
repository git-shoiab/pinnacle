package iopack;
//https://fluvid.com/videos/detail/mv1dViwzKmt7xZpLw#.YiiJptu41jo.link
import java.io.FileInputStream;

public class IODemo1 {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("abc.txt");
		
		System.out.println(fis.available());
		
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println(fis.read());
//		System.out.println(fis.available());
		
//		while(fis.available()>0) {
//			System.out.println((char)fis.read());
//		}
		int n=0;
//		while((n=fis.read())!=-1) {
//			System.out.println((char)n);
//		}
		
		byte b[]=new byte[4];
//		while(fis.read(b)!=-1) {
//			String s=new String(b);
//			System.out.println(s);
//		}
		
		while((n=fis.read(b))!=-1) {
			System.out.println(n);
			String s=new String(b,0,n);
			System.out.println(s);
		}
	}
}
