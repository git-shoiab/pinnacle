package doubts2;
/*
 * final variable values cannot be changed
 * 
 * final methods cannot be overridden
 * 
 * final classes cannot be inherited
 * 
 * abstract class - when u have a abstract method then the class should be compulsorily declared as abstract
 */
public class SomeKeyWords3 {
	final static float pi=3.14f;//final can be used on variable to declare constants
	
	public static void main(String[] args) {
		School school=new GovernmentSchool();
		//SomeKeyWords3 obj=new SomeKeyWords3();
		//SomeKeyWords3.pi=343;//final variable cannot be changed
		System.out.println(SomeKeyWords3.pi);
		school.syllabus();
		school.appointTeachers();
		
		school=new PrivateSchool();
		school.syllabus();
		school.appointTeachers();
	}
}


abstract class School{
	final public void syllabus() {
		System.out.println("syllabus syllabus syllabus...");
	}
	
	abstract public void appointTeachers();//when u declare an abstract method, the class should also be declared abstract 
	
}

class GovernmentSchool extends School{

	@Override
	public void appointTeachers() {
		// TODO Auto-generated method stub
		System.out.println("teachers appointed by government school");
	}
//	public void syllabus() {
//		System.out.println("billa my name is billa....");
//	}
	
}

class PrivateSchool extends School{
//	public void syllabus() {
//		System.out.println("rocket science...");
//	}
	@Override
	public void appointTeachers() {
		// TODO Auto-generated method stub
		System.out.println("techers appointed by private school..");
	}
}

//final class Parent{
//	
//}
//class Child extends Parent{//final classes cannot be inherited...
//	
//}