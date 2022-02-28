package threadpack;
//https://fluvid.com/videos/detail/mv1dViwB-vf7xema-#.Yhyxin8A07M.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("first line............");
		
		//ExecutorService es=Executors.newFixedThreadPool(1);//thread creation
		//es.execute(new MyRunnable());//starting a thread with a job
		met();
		
		System.out.println("third line.............");
		//es.shutdown();
	}
	
	static void met() {
		try{Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("second line..............");
	}
}

//inside runnable u define the job for the thread...
class MyRunnable implements Runnable{
	@Override
	public void run() {
		ThreadDemo.met();
	}
}