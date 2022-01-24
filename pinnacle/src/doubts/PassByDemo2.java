package doubts;

//Arrays are always pass by reference....even though they are of primitive type
public class PassByDemo2 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		PassByDemo2 obj=new PassByDemo2();
		
		System.out.println("Before passing...:"+arr[1]);
		obj.acceptArray(arr);
		System.out.println("After passing...:"+arr[1]);
		arr[1]=20;
		int copyArray[]=new int[4];
		System.arraycopy(arr, 0, copyArray, 0, 4);
		
		System.out.println("Before passing...:"+arr[1]);
		obj.acceptArray(copyArray);
		System.out.println("After passing...:"+arr[1]);
		
	}
	
	public void acceptArray(int myarray[]) {
		myarray[1]=999;
	}
}
