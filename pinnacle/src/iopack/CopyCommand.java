package iopack;

import java.io.FileReader;
import java.io.FileWriter;
//https://fluvid.com/videos/detail/rx3dEsDorOfj7zdjz#.YiiSvzcDEcM.link
public class CopyCommand {
	public static void main(String[] args) {
		try(
			FileReader in=new FileReader("abc.txt");
			FileWriter out=new FileWriter("copy.txt")
				){			
			int n=0;
			char c[]=new char[4];
			while((n=in.read(c))!=-1) {
				out.write(c,0,n);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
