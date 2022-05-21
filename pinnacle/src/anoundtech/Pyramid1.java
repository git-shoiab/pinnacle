package anoundtech;

import java.util.Scanner;

public class Pyramid1 {
	
		   public static void main(String[] args) {
			   int d=1;
			   Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the num value:"); 
		        int num=sc.nextInt();
			   for(int i=1;i<=num;i++) {
				   for(int j=1; j <= i; j++) {
		            // print star
					   if(d<=num)
					   {					 				  
						   System.out.print(d+ " ");
						   d++;
					   }
				  
				   }		         
				   		System.out.println();			   
			   	}
			 
			  
		   }
		
}