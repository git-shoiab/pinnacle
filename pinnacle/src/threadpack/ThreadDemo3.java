package threadpack;
//https://fluvid.com/videos/detail/e-KdETVdoxh5d23gG#.Yh4FY6L5Dio.linksa
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Kitchen kitchen=new Kitchen();
//		kitchen.cookRice();
//		kitchen.cutVeg();
//		kitchen.cutNonVeg();
//		kitchen.dum();
		
		ExecutorService es=Executors.newFixedThreadPool(4);
		es.execute(new Runnable() {			
			@Override
			public void run() {
				kitchen.cookRice();			
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				kitchen.cutVeg();	
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				kitchen.cutNonVeg();		
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				kitchen.dum();	
			}
		});
		
		es.shutdown();
		
	}
}

class Kitchen{
	public void cookRice() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name +" cleaning rice....");
		System.out.println(name+" kept the rice is kept on stove...job over..");
		try {Thread.sleep(8000);}catch(Exception e) {}
		System.out.println("rice is cooked....");
	}
	public void cutVeg() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name +" cutting vegetables....");
		System.out.println(name+" kept the veg is kept on stove...job over..");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("veg is cooked....");
	}
	public void cutNonVeg() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name +" cleaning mutton....");
		System.out.println(name+" kept the mutton is kept on stove...job over..");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("mutton is cooked....");
	}
	public void dum() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered kitchen....");
		System.out.println(name +" kept briyani kept on dum......");
		System.out.println("now all four cooks are free...take them");
		try {Thread.sleep(15000);}catch(Exception e) {}
		System.out.println("Briyani is cooked....");
	}
}