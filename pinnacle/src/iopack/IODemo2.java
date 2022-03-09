package iopack;

import java.io.FileOutputStream;
import java.io.FileWriter;
//https://fluvid.com/videos/detail/v_v8rS14Yni4gqex6#.YiiP79B96WQ.link
public class IODemo2 {
	public static void main(String[] args)throws Exception {
		//FileOutputStream fos=new FileOutputStream("copy.txt");
//		FileWriter fos=fos=new FileWriter("copy.txt");
//		try {					
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		}catch(Exception e) {
//			
//		}
//		finally {
//			fos.close();
//		}
		//TRY WITH RESOURCES
		try(FileWriter fos=new FileWriter("copy.txt")){
			fos.write(97);
			fos.write(98);
			fos.write(99);
			}catch(Exception e) {
				
			}
//			finally {
//				fos.close();
//			}
	}
}
