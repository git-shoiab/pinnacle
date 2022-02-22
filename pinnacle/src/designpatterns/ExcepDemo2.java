package designpatterns;
//https://fluvid.com/videos/detail/5Ad-5C1_dGiVGO1QE#.YhTC18fa3tw.link
public class ExcepDemo2 {
	public static void main(String[] args) {//throws Exception {
		ExcepDemo2 obj=new ExcepDemo2();
		try {
			obj.met2(10);
		}catch(Exception e) {			
		}
	}
	void met(){
		try {
			wait();
		}catch(Exception e) {
			
		}
	}
	
	void met2(int i)throws Exception {
		if(i==0) {
			throw new Exception();
		}
	}
}
