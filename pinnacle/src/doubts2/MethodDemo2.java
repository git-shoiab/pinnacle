package doubts2;

public class MethodDemo2 {
	public static void main(String[] args) {
		//Employee emp=new Employee();
		//Employee emp=new Programmer();
		
		//emp.work();
		
		Programmer pro=new Programmer();
		pro.work();
	}
}

class Employee{
	public Employee() {
		System.out.println("cons of employee called.....");
	}
	public void work() {
		System.out.println("work method of employee called....");
	}
}
//PROGRAMMER IS A KIND OF EMPLOYEE
class Programmer extends Employee{
	public Programmer() {
		System.out.println("cons of programmer called...");
	}
	public void work() {
		System.out.println("work method of programmer called....");
	}
}