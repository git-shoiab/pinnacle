package level1mod2;

public class ArgumentPassing2 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		
		ArgumentPassing2 obj=new ArgumentPassing2();
		
		System.out.println("Array value before passing...:"+a[1]);
		obj.acceptArray(a);
		
		System.out.println("Array value after passing...:"+a[1]);
		
		//arrays are by default pass by reference even though its a primitive type
		
		
	}
	
	void acceptArray(int arr[]) {
		arr[1]=999;
	}
}
