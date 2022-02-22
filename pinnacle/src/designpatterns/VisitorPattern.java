package designpatterns;
//https://fluvid.com/videos/detail/ykZL6ck9jLiY9w2zo#.YhTNuPmWDig.link
import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) {
		
		Child baby=new Child();
		System.out.println("please input and enter to proceed....");
		Scanner scan=new Scanner(System.in);
		
		String n=scan.next();
		
		Dog tiger=new Dog();
		
		
		baby.playWithDog(tiger, n);
	}
}


class Dog{
	public void play(String item)throws DogExceptions {
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
		else if(item.equals("bone")) {
			throw new DogHappyException();
		}
	}
}

abstract class DogExceptions extends Exception{
	public abstract void visit();
}
class DogBiteException extends DogExceptions{
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
class DogBarkException extends DogExceptions{
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
class DogHappyException extends DogExceptions{
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
class Child{
	void playWithDog(Dog dog,String item) {
		try {
			dog.play(item);
		}catch(DogExceptions de){
			de.printStackTrace();
			de.visit();
		}
	}
}

class Handler911{
	public void handle(DogBiteException dbe) {
		System.out.println("dog has bitten, wait for the ambulance,,,,,,,,,,");
	}
	public void handle(DogBarkException dbr) {
		System.out.println("no worries  just ignore...................");
	}
	public void handle(DogHappyException dbr) {
		System.out.println("enjoy...................");
	}
}