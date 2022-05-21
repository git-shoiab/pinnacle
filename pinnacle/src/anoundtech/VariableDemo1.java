package anoundtech;
//https://fluvid.com/videos/detail/j-mdETrd83F5qQdYZ#.YnifncBBOsE.link

//https://fluvid.com/videos/detail/ykZL6c7k9juEDKxey#.YniiScg3siI.link

//https://fluvid.com/videos/detail/AZX-wTOBy5ipg4e2Y#.Yniza-JXX1M.link

//https://fluvid.com/videos/detail/w6e8gckQXRfm_2mj9#.Yni8XsNyBNg.link

//https://fluvid.com/videos/detail/ODe_5CvmEpUxZX5-Q#.YnjrepoahaI.link
public class VariableDemo1 {
	public static void main(String[] args) {
		System.out.println("Welcome To Java....");
		//A package name gives you a unique name and a unique identification
		//declare variables
		
		String str;//READ - str is of type string
		
		str="hello world";//hello world value is allocated to variable str which is of type String
		
		System.out.println(str);
		
		String s=new String("hai hai hai");
		
		byte b=-128; //8 bit
		b=127;
		//b=-129;
		//b=128;
		
		short sh=-32768; //16 bit
		sh=32767;		
		//sh=32768;
		
		int in=-214_74_83_648;//32 bit 
		in=214_74_83_647; //underscore is permitted from jdk5
		
		long l=922337203_68547_75_807L; // 64 bit
		l=-922337203_68547_75_808L;
		
		float fl=123; //- this will take 32 bit
		//fl=123.45; - this is invalid - this is taking 64 bit
		fl=123.45f;// suffix with f - 32 bit
		
		double d=234; //64 bit
		d=234.56;//64 bit
		
		char c=97;
		//c=-97; - is invalid - cannot have negative value
		c='a';
		
		boolean boo=true;
		boo=false;
		//boo=0; - cannot have any other value other than true or false
		
		//qualified names
		//Name should always start with alphapet or underscore or dollar symbole
		//variable name should be always starting with lower case
		
		//valid identifiers
		int a;//valid
		int a2;//valid
		int _a;//valid
		int $a;//valid
		int _a$_2_a;//valid
		
		//int 2a;//invalid - cannot start with number
		//int %a;//invalid - cannot start with special characters
		
		//int default; - key words cannot be valid identifier
		
		//Applicable for variable names, method names, class names and package names
	}
}







