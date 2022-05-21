package anoundtech;
//https://fluvid.com/videos/detail/p35djuXXO1hakm-O5#.YnpYSxhpicQ.link
public class ArrayDemo {
	public static void main(String[] args) {
		int []a= {10,20,30,40};
		
		System.out.println(a[0]);
		System.out.println(a[2]);
		
		System.out.println("The length of array.COLUMNS.."+a.length);
		
		int[][] twod= {
				{20,40,60},
				{30,50,70},
				{1,3,5},
				{20,50,34}
		};
		
		System.out.println(twod[0][0]);
		
		System.out.println("No of rows..:"+twod.length);
		System.out.println("No of columns..:"+twod[0].length);
		
		int columns=5;
		int[] arr=new int[columns];//declaring a array of size(columns) 5
		System.out.println(arr.length);//this will print number of columns
		//By default the value zero will be assigned
		
		System.out.println(arr[1]);
		
		int rows=3;
		
		int[][] twodarr=new int[rows][columns];
		System.out.println(twodarr.length);//this will print number of rows
	}
}
