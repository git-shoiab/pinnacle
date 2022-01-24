package pinnacle;

public class ConditionsDemo {
	public static void main(String[] args) {
		//? - ternary operator
		
		boolean b=10>20;
		System.out.println(b?"10 is lesser than 20":"10 is not lesser than 20");
		
		int n=11;
		b=(n%2==0);//the mod of n%2, if it is equal to 0 then it will return true
		
		String result=b?"Even number....":"Odd Number...";
		System.out.println(n+" is a...."+result);
		
		//IF-ELSE-IF LADDER
		
		if(b) {
			System.out.println("Even Number.....");
		}
		else {
			System.out.println("Odd Number........");
		}
		
		int age=9;
		
		if(age<=10) {
			System.out.println("You are a child....");
		}
		else if(age<=20) {
			System.out.println("you are a teen....");
		}
		else if(age<=30) {
			System.out.println("You are a youth...");
		}
		else if(age<=40) {
			System.out.println("you are telephone booth...");
		}
		else if(age<50) {
			System.out.println("you are bootham....");
		}
		else {
			System.out.println("where are you....");
		}
		
		String month="february";
		int day=11;

		if(month.equals("january")) {
			if(day<=10) {
				System.out.println("holidays.............");
			}
			else if(day>10) {
				System.out.println("new world..........");
			}
		}
		else if(month.equals("february")) {
			System.out.println("month of dreams come true....");
		}
	}
}
