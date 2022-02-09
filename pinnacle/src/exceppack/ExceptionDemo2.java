package exceppack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionDemo2 {
	public static void main(String[] args) {// throws Exception {
		System.out.println("Before exception");
		
		try {
		URL url=new URL("www.aaa.com");
		
		System.out.println(url.getContent());
				
		}catch(MalformedURLException e) {
			System.out.println(e);
		}catch(Exception eee) {
			
		}finally {
			System.out.println("this will always get executed irrespective of whether an exception arises or not or handled or not");
		}
		
		System.out.println("after exception");
	}
}
