package doubts;

public class TriangleDemos {
	public static void main(String[] args) {
		int num=1;
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		num=65;
		for(int i=10;i>0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
		
		
	}
}
