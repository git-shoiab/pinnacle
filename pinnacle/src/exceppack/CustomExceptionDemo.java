package exceppack;

public class CustomExceptionDemo {
	public static void main(String[] args) {//throws MyException {
		Driver driver=new Driver();
		try {
			driver.drive();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Driver{
	public void drive()throws MyException{//throws refers to conveying the caller of the method that this
		//method is capable of throwing a exception
		throw new MyException();//throw basically creates an exception object and throw to the caller
	}
}

class MyException extends Exception{
	
}