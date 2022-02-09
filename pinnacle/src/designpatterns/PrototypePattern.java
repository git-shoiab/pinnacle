package designpatterns;
//VIDEO - https://fluvid.com/videos/detail/n8QdniK23dtX2w74d#.YgOsv2dV8PU.link
public class PrototypePattern {
	//CLONE - PROPERTIES ARE UNIQUE BUT RESOURCES ARE SHARED
	public static void main(String[] args) {
		//SINGLETON - ONE OBJECTED IS CREATED AND SHARED BY ALL
		School school1=School.newInstance();
		System.out.println(school1.desk+":"+school1.locker);
		school1.t.teacherName="my teacher...";
		school1.cr.className="my class..";
		System.out.println(school1.t.teacherName+":"+school1.cr.className);
	
		School school2=School.newInstance();
		System.out.println(school2.desk+":"+school2.locker);
		System.out.println(school2.t.teacherName+":"+school2.cr.className);
		school1.desk="shoaib desk";
		school1.locker="shoiab locker";
		
		System.out.println("PROVING PROPERTIES ARE UNIQUE BUT RESOURCES ARE SHARED...");
		//What to be proved - PROPERTIES ARE UNIQUE
		System.out.println("SCHOOL1 DESK AND LOCKER PROPERTIES ARE CHANGED...-PROPERTIES");
		System.out.println("SCHOOL1.............");
		System.out.println(school1.desk+":"+school1.locker);
		System.out.println("SCHOOL2...........");
		System.out.println(school2.desk+":"+school2.locker);
		System.out.println("THE ABOVE PROVES THAT PROPERTIES ARE UNIQUE OR NOT");
		
		//WHAT TO BE PROVED - RESOURCES ARE SHARED
		System.out.println("SCHOOL1 TEACHER AND CLASSROOM PROPERTIES ARE CHANGED...-RESOURCES");
		school1.t.teacherName="my teacher.CHANGES FOR SCHOOL1..";
		school1.cr.className="my class..CHANGES FOR SCHOOL1";
		System.out.println("FOR SCHOOL1........");
		System.out.println(school1.t.teacherName+":"+school1.cr.className);	
		System.out.println("FOR SCHOOL2........");
		System.out.println(school2.t.teacherName+":"+school2.cr.className);
		System.out.println("THE ABOVE PROVES THAT RESOURCES ARE SHARED OR NOT");
		
	}
	
//	public static void main(String[] args) {
//		//MULTITON - ONE SCHOOL, ONE TEACHER, ONE DESK AND ONE LOCKER FOR EVERY STUDENT
//		School school1=new School();//School.newInstance();
//		System.out.println(school1.desk+":"+school1.locker);
//		school1.t.teacherName="my teacher...";
//		school1.cr.className="my class..";
//		System.out.println(school1.t.teacherName+":"+school1.cr.className);		
//		
//		School school2=new School();//School.newInstance();
//		System.out.println(school2.desk+":"+school2.locker);
//		System.out.println(school2.t.teacherName+":"+school2.cr.className);
//	school1.desk="shoaib desk";
//	school1.locker="shoiab locker";
//	
//	System.out.println("PROVING PROPERTIES ARE UNIQUE BUT RESOURCES ARE SHARED...");
//	//What to be proved - PROPERTIES ARE UNIQUE
//	System.out.println("SCHOOL1 DESK AND LOCKER PROPERTIES ARE CHANGED...-PROPERTIES");
//	System.out.println("SCHOOL1.............");
//	System.out.println(school1.desk+":"+school1.locker);
//	System.out.println("SCHOOL2...........");
//	System.out.println(school2.desk+":"+school2.locker);
//	System.out.println("THE ABOVE PROVES THAT PROPERTIES ARE UNIQUE OR NOT");
//	
//	//WHAT TO BE PROVED - RESOURCES ARE SHARED
//	System.out.println("SCHOOL1 TEACHER AND CLASSROOM PROPERTIES ARE CHANGED...-RESOURCES");
//	school1.t.teacherName="my teacher.CHANGES FOR SCHOOL1..";
//	school1.cr.className="my class..CHANGES FOR SCHOOL1";
//	System.out.println("FOR SCHOOL1........");
//	System.out.println(school1.t.teacherName+":"+school1.cr.className);	
//	System.out.println("FOR SCHOOL2........");
//	System.out.println(school2.t.teacherName+":"+school2.cr.className);
//	System.out.println("THE ABOVE PROVES THAT RESOURCES ARE SHARED OR NOT");
//	}
//	
//	public static void main(String[] args) {
//		//PROTOTYPE - PROPERTIES ARE UNIQUE BUT RESOURCES ARE SHARED.
//		School school1=new School();//School.newInstance();
//		System.out.println(school1.desk+":"+school1.locker);
//		school1.t.teacherName="my teacher...";
//		school1.cr.className="my class..";
//		System.out.println(school1.t.teacherName+":"+school1.cr.className);		
//		
//		School school2=school1.getClone();//new School();//School.newInstance();
//		System.out.println(school2.desk+":"+school2.locker);
//		System.out.println(school2.t.teacherName+":"+school2.cr.className);
//		
//		school1.desk="shoaib desk";
//		school1.locker="shoiab locker";
//		
//		System.out.println("PROVING PROPERTIES ARE UNIQUE BUT RESOURCES ARE SHARED...");
//		//What to be proved - PROPERTIES ARE UNIQUE
//		System.out.println("SCHOOL1 DESK AND LOCKER PROPERTIES ARE CHANGED...-PROPERTIES");
//		System.out.println("SCHOOL1.............");
//		System.out.println(school1.desk+":"+school1.locker);
//		System.out.println("SCHOOL2...........");
//		System.out.println(school2.desk+":"+school2.locker);
//		System.out.println("THE ABOVE PROVES THAT PROPERTIES ARE UNIQUE OR NOT");
//		
//		//WHAT TO BE PROVED - RESOURCES ARE SHARED
//		System.out.println("SCHOOL1 TEACHER AND CLASSROOM PROPERTIES ARE CHANGED...-RESOURCES");
//		school1.t.teacherName="my teacher.CHANGES FOR SCHOOL1..";
//		school1.cr.className="my class..CHANGES FOR SCHOOL1";
//		System.out.println("FOR SCHOOL1........");
//		System.out.println(school1.t.teacherName+":"+school1.cr.className);	
//		System.out.println("FOR SCHOOL2........");
//		System.out.println(school2.t.teacherName+":"+school2.cr.className);
//		System.out.println("THE ABOVE PROVES THAT RESOURCES ARE SHARED OR NOT");
//		
//
//	}
}


class School implements Cloneable{
	String desk="study desk";
	String locker="mylocker";
	ClassRoom cr=new ClassRoom();
	Teacher t=new Teacher();
	
	private static School school;
	public School() {
		System.out.println("school object created...");
	}
	public static School newInstance() {
		if(school==null) {
			school=new School();
		}
		return school;
	}
	
	public School getClone() {
		try {
			return (School)super.clone();
		}catch(CloneNotSupportedException ce) {
			System.out.println(ce);
			return null;
		}
	}
}

class ClassRoom{
	String className;
	public ClassRoom() {
		System.out.println("NEW CLASS ROOM OBJECT CREATED..");
	}
}

class Teacher{
	String teacherName;
	public Teacher() {
		System.out.println("NEW TEACHER OBJECT IS CREATED....");
	}
}

