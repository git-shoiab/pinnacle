package threadpack;
//https://fluvid.com/videos/detail/-KRkYhGjVMuEzEgno#.Yh9ZUDv6dRs.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	public static void main(String[] args) {
		AdmissionHall hall=new AdmissionHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("ram");
				//synchronized(hall) {
				hall.table1();
				hall.table2();
				//}
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("mahim");
				//synchronized(hall) {
				hall.table1();
				hall.table2();
				//}
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("rahim");
				//synchronized(hall) {
					hall.water();
					hall.table1();
					hall.table2();
				//}
			}
		});
		es.shutdown();
	}
}
class AdmissionHall{
	synchronized public void table1() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the table1...");
		try {Thread.sleep(10000);}catch(Exception e) {		}
		System.out.println(name+" has completed the use of table1...");
	}
	synchronized public void table2() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the table2...");
		try {Thread.sleep(10000);}catch(Exception e) {		}
		System.out.println(name+" has completed the use of table2...");
	}
	public void water() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the water...");
		try {Thread.sleep(1000);}catch(Exception e) {		}
		System.out.println(name+" has completed drinking water...");
	}
}