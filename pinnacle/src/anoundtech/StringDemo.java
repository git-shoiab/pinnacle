package anoundtech;
//https://fluvid.com/videos/detail/37jwQh9O2ZSe48jgX#.YnoRyPY322E.link
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class StringDemo {
	static Logger logger = Logger.getLogger(StringDemo.class);
	public static void main(String[] args) throws Exception{
		String str="hello world"; //this will create one object in stack alone
		String str2=new String("hello world");//this will create two objects
		
		char c=str.charAt(0);
		
		System.out.println(System.getProperty("user.dir"));
		
		//String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		Properties prop=new Properties();
		prop.load(new FileInputStream("log4j.properties"));
		PropertyConfigurator.configure(prop);
		logger.info("The value is..:"+c);
		
		String substr=str.substring(3);
		logger.error("The sub str is...:"+substr);
		
		String substr2=str.substring(3, 7);
		logger.warn("The value is..:"+substr2);
		
		int ind=str.indexOf('w');
		logger.info("The va...:"+ind);
		
		logger.info(str==str2);//== is comparison in java
		
		logger.info(str.equals(str2));
		
		String one="A";
		String two="C";
		logger.info((int)one.charAt(0));
		logger.info((int)two.charAt(0));
		logger.info(one.compareTo(two));
		logger.info(two.compareTo(one));
		
		
	}
}
