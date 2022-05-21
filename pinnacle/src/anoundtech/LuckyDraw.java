package anoundtech;

import java.util.Random;

public class LuckyDraw {
	public static void main(String[] args) {
		int n=15;		
		int count=0;
		Random r=new Random();
		while(true) {
			
			int value=r.nextInt(n);
			System.out.print(value+"\r");
			count++;
			if(count<=15) {
				break;
			}
		}
	}
}
