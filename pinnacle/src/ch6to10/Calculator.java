package ch6to10;
//https://fluvid.com/videos/detail/7Bk-3iOv84hRZZ-58#.Yocg-jV7HGY.link
public class Calculator {
	void add1(int i,int j) {
		int sum=i+j;
		System.out.println("the sum of "+i+"and "+j+"is..:"+sum);
	}
	
	int add2(int i,int j) {
		return i+j;
	}
	
	void add3(int i,int j) {
		display(i+j);
	}
	
	void display(int s) {
		System.out.println("The result is..:"+s);
	}
	
	void add4(int ...i) {
		int result=0;
		for(int n=0;n<i.length;n++) {
			result=result+i[n];
		}
		System.out.printf("The result is ...:%d", result);
	}
	
	void add5(int i[]) {
		int result=0;		
		for(int s:i) {
			result=result+s;
		}
		System.out.printf("The result is ...:%d", result);
	}
}
