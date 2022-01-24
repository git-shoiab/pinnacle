package pinnacle;

public class ArrayDemo {
	public static void main(String[] args) {
		//declare an array
		
		// single dimensional array
		int a[]=new int[5];//this is declaring an array of size 5 - 5 represents number of columns
		a[0]=2022;
		a[1]=2032;
		a[2]=3045;
		a[3]=4344;
		a[4]=1000;
		
		int []arr=new int[5]; //valid
		
		int aa[]= {10,34,56,67};//you have declared as well as initialized an array
		
		//Two dimensional array
		
		int twod[][]=new int[4][5];//this is declaring a two dimensional array of 4 rows and 5 columns
		
		int [][]twodd=new int[3][2];
		
		int twoddd[][]= {
				{10,40,32,45},
				{45,23,67,78},
				{12,23,34,45}
		};
		
		//un even multidimensional array
		
		int twodue[][]=new int[3][];
		twodue[0]=new int[2];
		twodue[1]=new int[4];
		twodue[2]=new int[1];
		
		int twodddue[][]= {
				{10,40},
				{45,23,67,78},
				{12}
		};
		//for a single dimensional array.length will return number of columns
		//but for a double dimensional array.length will return number of rows
		System.out.println("The size of array is...:"+a.length);
		System.out.println(a[4]);
		//System.out.println(a[5]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int row=0;row<twoddd.length;row++) {//here twodue.length will return the number of rows
			for(int col=0;col<twoddd[row].length;col++) {
				System.out.println("array..:["+row+"]:["+col+"]"+"----"+twoddd[row][col]);
			}
		}
	}
}
