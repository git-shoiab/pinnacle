package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("rahim");
				synchronized(central) {
					central.bookTicket(1000);
					central.giveChange();
				}
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("ram");
				synchronized(central) {
					central.bookTicket(500);
					central.giveChange();
				}
			}
		});		
		es.shutdown();
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amt=amt;
		System.out.println(name+" is booking the ticket...:"+amt);
		System.out.println("..................................");
		try {Thread.sleep(2000);}catch(Exception e) {}
	}
	
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is given change for the ticket...:"+(amt-100));
	}
}