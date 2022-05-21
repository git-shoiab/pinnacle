package anoundtech;
//https://fluvid.com/videos/detail/2_nw1S44PphEXnw2j#.YntpXdpFKf8.link
public class Programming4 {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("for loop called...");
//		}
		
		for(int i=0;i<10;i++) {
			System.out.println("i value is...:"+i);
		}
		
		for(int i=10;i>0;i--) {
			System.out.println("i value is...:"+i);
		}
		
		for(int i=10,j=0;i>0&&j<10;i--,j++) {
			System.out.println(i+"..."+j);
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
