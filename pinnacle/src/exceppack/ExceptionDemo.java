package exceppack;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		
		int length=args.length;
		if(length>=1) {
			String value=args[0];
			boolean num=Character.isDigit(value.charAt(0));
			if(num) {
				int number=Integer.parseInt(value);
				if(number>0) {
					int div=1/number;
					System.out.println(div);
				}
				else {
					System.out.println("the number is zero...cannnot be used for division...");
				}
			}
			else {
				System.out.println("Please enter a number value...");
			}
			
		}
		else {
			System.out.println("The command line argument does not have a value..");
		}
		//int i=1/Integer.parseInt(args[0]);
		
		System.out.println("After Exception...");
	}
}
