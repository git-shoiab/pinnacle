package pinnacle;

public class LoopingDemo {
	public static void main(String[] args) {
		//for or while or do-while
		
		//INFINITE LOOP
//		for(;;) {
//			System.out.println("this loop never stops....");
//		}
		
//		while(true) {
//			System.out.println("This while loop also never stops....");
//		}
		
//		do {
//			System.out.println("this do while loop also never stops...");
//		}while(true);
		int i=1;
		while(i>10) { //while loop checks the condition before 
			System.out.println("I value is...is..:"+i);
			i++;
		}
		
		do {
			System.out.println("this loop will run atleast once.........");
		}while(i>10);
		
		//for(initialization;condition;increment/decrement)
		
		for(int n=0;n<10;++n) {
			System.out.println(n);
		}
		
		for(int n=0,m=10;n<10 && m>0;n++,m--) {
			System.out.println(n+":"+m);
		}
		
		for(int n=10;n>0;n--) {//NESTED FOR LOOP
			for(int m=n;m>0;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
