package doubts2;

public class ReturnMethodDemo {
	public static void main(String[] args) {
		String result=new ReturnMethodDemo().met(2);
		
		System.out.println(result);
	}
	
	public String met(int i) {
		if(i==1) {
			return "hello";
		}
		else {
			return "hai";
		}
			
	}
}
