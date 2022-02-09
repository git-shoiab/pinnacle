package designpatterns;
//Intent - To ensure that only one object of the class is created at all times
//Problem - More than one object of the class should not be created..
//AntiPattern - Since you cannot create another object of the class, the changes made by one client
//				on the object will reflect to all the clients


public class SingleTonDemo {
	public static void main(String[] args) {
		DBConnection dbcon=DBConnection.newSingleInstance();
		dbcon.temp="hello world...";
		System.out.println(dbcon);
		DBConnection dbcon2=DBConnection.newSingleInstance();
		System.out.println(dbcon2);
		System.out.println("Dbcon2...:"+dbcon2.temp);
	}
}
//DBConnection class is singleton
class DBConnection{
	String temp;
	private DBConnection() {
		System.out.println("object created...");
	}
	private static DBConnection dbcon;
	synchronized public static DBConnection newSingleInstance() {
		if(dbcon==null) {
			dbcon= new DBConnection();
		}
		return dbcon;
	}
}