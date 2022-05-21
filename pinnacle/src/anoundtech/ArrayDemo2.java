package anoundtech;
//https://fluvid.com/videos/detail/-KRkYhqqxxtBpjBaR#.YnypwYcmA6E.link
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr= {20,30,40,50,60};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		//Enhanced For Loop - JDK 5
		
		for(int n:arr) {
			System.out.print(n+"\t");
		}
		System.out.println("\n\n");
		int[][] twod= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		for(int i=0;i<twod.length;i++) {
			for(int j=0;j<twod[i].length;j++) {
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for(int n[]:twod) {
			for(int m:n) {
				System.out.print(m+"\t");
			}
			System.out.println();
		}
	}
}
