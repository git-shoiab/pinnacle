package pinnacle;

public class BreakAndContinueDemo {
	public static void main(String[] args) {
		//continue statement will continue with the calling loop
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
