package revision;

public class OverrideDemo {
	public static void main(String[] args) {
		Employee emp=new Admin();
		emp.work();
	}
}
class Employee{
	public void work() {
		System.out.println("general work behavior...");
	}
}
//programmer is a kind of employee
class Programmer extends Employee{
	
	public void work() {
		System.out.println("work specific to programmer...");
	}
}

class Admin extends Employee{
	public void work() {
		System.out.println("work specific to admin...");
	}
}