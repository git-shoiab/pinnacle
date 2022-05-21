package ch6to10;
//https://fluvid.com/videos/detail/Y5V24TV6VAf4VV6Lv#.YodAHGdo7ws.link
public class ForDemo {
	public static void main(String[] args) {
		int i[]= {10,20,30,40,343};
		
		//System.out.println(i[0]);
		//System.out.println(i[1]);
		
		//System.out.println(i[4]);
		
		//System.out.println(i[5]);
		System.out.println("The size of array is...:"+i.length);
		for(int n=0;n<i.length;n++) {
			int value=i[n];
			System.out.println(value);//this will print 0,1,2,3 //this will print 10,20,30,40,343//muthu-10,20,30,40,343
			System.out.println(i[0]);//this will print 10 //elavarasan-this will print 10 one time//muthu-10,10,10,10,10
		}
		
		//latest for loop for processing arrays is ENHANCED FOR LOOP
		for(int value:i) {//this is equivalent to line 13 and 14
			System.out.println(value);
		}
	}
}
